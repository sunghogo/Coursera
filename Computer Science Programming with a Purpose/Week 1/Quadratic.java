public class Quadratic {
    public static void main(String[] args) {
        // From algebra: the roots of x^2 + bx + c = (-b +- sqrt(b^2 - 4c)) / 2
        // Parse coefficients from command-line.
        double b = Double.parseDouble(args[0]);
        double c = Double.parseDouble(args[1]);

        // Calculate roots of x*x + b*x + c.
        double discriminant = b*b - 4.0*c; // Make sure 4 is a double literal and not an int
        double d = Math.sqrt(discriminant);
        double root1 = (-b + d) / 2.0;
        double root2 = (-b - d) / 2.0;

        // Print them out.
        System.out.println(root1);
        System.out.println(root2);
    }
}
