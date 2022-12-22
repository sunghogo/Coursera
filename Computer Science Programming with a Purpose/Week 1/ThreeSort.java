public class ThreeSort {
    public static void main(String[] args) {
        // Initialize variables for integer arguments
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);
        
        // Sorting Algorithm
        int minimum, mid, maximum, lastsort;
        minimum = Math.min(num1, num2);
        mid = Math.max(num1, num2);

        maximum = Math.max(mid, num3);
        mid = Math.min(mid, num3);

        lastsort = Math.max(minimum, mid);
        minimum = Math.min(minimum, mid);
        mid = lastsort;


        // Print in ascending order
        System.out.println(minimum);
        System.out.println(mid);
        System.out.println(maximum);
    }
}
