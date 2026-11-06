/* Create a custom exception named InvalidReservationException
   to handle cases where the reservation request is invalid
   (i.e., the number of slots is zero or negative).
   Implement a HotelRoom class to manage reservations and handle
   invalid reservation requests using the custom exception. */

package Tutorial12;

import java.util.Scanner;

class InvalidReservationException extends Exception {
    public InvalidReservationException(String message) {
        super(message);
    }
}

class HotelRoom {
    private int availableSlots;

    public HotelRoom(int initialSlots) {
        this.availableSlots = initialSlots;
    }

    public void reserveSlots(int slots) throws InvalidReservationException {
        // Check if slots are zero or negative
        if (slots <= 0) {
            throw new InvalidReservationException("InvalidReservationException: Number of slots cannot be zero or negative (" + slots + ").");
        }

        if (slots > availableSlots) {
            System.out.println("Sorry, only " + availableSlots + " slots are currently available.");
            return;
        }

        availableSlots -= slots;
        System.out.println("Successfully reserved " + slots + " slot(s)! Remaining available slots: " + availableSlots);
    }
}

// Main demo class
public class HotelReservationDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HotelRoom room = new HotelRoom(10); // Room initialized with 10 slots

        System.out.print("Enter number of slots you want to reserve: ");

        try {
            int slotsToBook = scanner.nextInt();
            room.reserveSlots(slotsToBook); // This may throw the custom exception

        } catch (InvalidReservationException e) {
            // Handle the custom exception
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            // Handle non-integer inputs
            System.out.println("Invalid input format. Please enter a valid integer.");
        } finally {
            scanner.close();
        }
    }
}
