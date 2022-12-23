public class RightTriangle {
    public static void main(String[] args) {
        // Intialize variables with passed integer arguments
        double num1 = Double.parseDouble(args[0]);
        double num2 = Double.parseDouble(args[1]);
        double num3 = Double.parseDouble(args[2]);
        
        
        // Sort arguments into ascending order a, b, c
        double a, b, c, lastsort;
        a = Math.min(num1, num2);
        b = Math.max(num1, num2);

        c = Math.max(b, num3);
        b = Math.min(b, num3);

        lastsort = Math.max(a, b);
        a = Math.min(a, b);
        b = lastsort;
        
        // Check Condition 1: Each integer must be positive 
        boolean cond1 = num1 > 0 && num2 > 0 && num3 > 0;

        // Check Condition 2: The sum of squares of two of the integers must equal the square of third integer
        boolean cond2 = Math.hypot(a, b) == c;

        // Print whether both conditions are true
        System.out.println(cond1 && cond2);
    }
}