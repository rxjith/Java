public class MathOperations {
    public static void main(String[] args) {
        // Rounding
        int a = Math.round(1.1F);
        System.out.println("Rounding " + "1.1: " + a);

        // Flooring
        int b = (int) Math.floor(1.1F);
        System.out.println("Floor of " + "1.1: " + b);

        // Ceil-ing
        int c = (int) Math.ceil(1.1F);
        System.out.println("Ceiling of " + "1.1: " + c);

        // Max
        int d = Math.max(1, 2);
        System.out.println("Maximum between 1 & 2: " + d);

        // Min
        int e = Math.min(1, 2);
        System.out.println("Minimum between 1 & 2: " + e);

        // Random: by default gives a double between 0 and 1
        double f = Math.random();
        System.out.println("A random double between 0 & 1: " + f);

        // Random integer implementation between a range (0-100):
        int g = (int) (Math.random() * 100);
        System.out.println("A random int between 0 & 100: " + g);

        // Random: double implementation between a range (0-100):
        double h = Math.random() * 100;
        System.out.println("A random number between 0 & 100: " + h);
    }
}
