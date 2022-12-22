public class ThreeSort {
    public static void main(String[] args) {
        // Initialize variables for integer arguments
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);
        
        // Compute max, min, mid values
        int maximum = Math.max(num3, Math.max(num1, num2));
        int minimum = Math.min(num3, Math.min(num1, num2));
        int mid = Math.max(Math.min(num1, num2), Math.min(num2, num3));

        // Print in ascending order
        System.out.println(minimum);
        System.out.println(mid);
        System.out.println(maximum);
    }
}
