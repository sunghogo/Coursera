public class CMYKtoRGB {
    public static void main(String[] args) {
        // Initialize CMYK variables with passed double arguments
        double cyan = Double.parseDouble(args[0]);
        double magenta = Double.parseDouble(args[1]);
        double yellow = Double.parseDouble(args[2]);
        double black = Double.parseDouble(args[3]);

        // Compute rounded RGB conversion values
        double white = 1 - black;
        long red = Math.round(255.0 * white * (1 - cyan));
        long green = Math.round(255.0 * white * (1 - magenta));
        long blue = Math.round(255.0 * white * (1 - yellow));

        // Print RGB values
        System.out.println("red   = " + red);
        System.out.println("green = " + green);
        System.out.println("blue  = " + blue);
    }
}
