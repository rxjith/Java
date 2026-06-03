public class Casting {
    public static void main(String[] args) {
        // Priority: byte > short > int > long > float > double

        // Implicit casting
        short a = 1;
        int b = a + 2;                                                      // Remember that a datatype can be INFLATED but not deflated.  
        System.out.println("Implicit Type Casting: " + b);

        // Explicit casting: similar types
        double c = 1.1;
        int d = (int) c + 2;                                                // Explicitly converting c from a short to an int.
        System.out.println("Explicit (similar) type casting: " + d);

        String x = "1";
        int y = Integer.parseInt(x) + 2;                                    // "Integer" is a wrapper class to wrap the string as an int if compatible
        System.out.println("Explicit type casting: " + y);
    }
}
