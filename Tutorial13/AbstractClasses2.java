package Tutorial13;

interface Displayable {
    void showDetails(int days);
}

abstract class Vehicle {
    protected int vehicleId;
    protected String vehicleName;
    protected double rentalPricePerDay;

    public Vehicle(int vehicleId, String vehicleName, double rentalPricePerDay) {
        this.vehicleId = vehicleId;
        this.vehicleName = vehicleName;
        this.rentalPricePerDay = rentalPricePerDay;
    }

    public abstract double calculateRentalAmount(int days);

    public void displayVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Vehicle Name: " + vehicleName);
        System.out.println("Rental Price/Day: " + rentalPricePerDay);
    }
}

class Car extends Vehicle implements Displayable {

    public Car(int vehicleId, String vehicleName, double rentalPricePerDay) {
        super(vehicleId, vehicleName, rentalPricePerDay);
    }

    @Override
    public double calculateRentalAmount(int days) {
        double amount = rentalPricePerDay * days;
        // 10% discount if rented for more than 5 days
        if (days > 5) {
            amount *= 0.90;
        }
        return amount;
    }

    @Override
    public void showDetails(int days) {
        System.out.println("--- Car Rental Summary ---");
        displayVehicleDetails(); // Reusing the concrete parent method
        System.out.println("Rental Days  : " + days);
        System.out.println("Total Amount : $" + calculateRentalAmount(days));
        System.out.println("--------------------------\n");
    }
}

class Bike extends Vehicle implements Displayable {

    public Bike(int vehicleId, String vehicleName, double rentalPricePerDay) {
        super(vehicleId, vehicleName, rentalPricePerDay);
    }

    @Override
    public double calculateRentalAmount(int days) {
        double amount = rentalPricePerDay * days;
        // 5% discount if rented for more than 3 days
        if (days > 3) {
            amount *= 0.95;
        }
        return amount;
    }

    @Override
    public void showDetails(int days) {
        System.out.println("--- Bike Rental Summary ---");
        displayVehicleDetails(); // Reusing the concrete parent method
        System.out.println("Rental Days  : " + days);
        System.out.println("Total Amount : $" + calculateRentalAmount(days));
        System.out.println("---------------------------\n");
    }
}

public class AbstractClasses2 {
    public static void main(String[] args) {
        Displayable car = new Car(101, "Honda Civic", 50.0);
        Displayable bike = new Bike(201, "Yamaha R15", 25.0);

        // Testing with days that trigger discounts
        car.showDetails(6);  // > 5 days, gets 10% discount
        bike.showDetails(4); // > 3 days, gets 5% discount
    }
}
