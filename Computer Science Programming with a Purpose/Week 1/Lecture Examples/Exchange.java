public class Exchange {
    public static void main(String[] args) {
        /*
        // First Demonstration
        int a = 1234;
        int b = 99;

        // This code exchanges the values of a and b
        int t = a;
        a = b;
        b = t;
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(t);
        */

        // Second Demonstration
        // Reads two integers from the command line, then prints them out in the opposite order
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int t = a;
        a = b;
        b = t;

        // java automatically converts int values to String for output
        System.out.println(a); 
        System.out.println(b);
    }
}
