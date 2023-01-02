public class Checkerboard {
    public static void main(String[] args) {
        // Take integer n
        double n = Double.parseDouble(args[0]);

        // Set canvas size n x n
        StdDraw.setScale(0.0, n);

        // Draw squares
        int color_bit = 1; // bit flip flop for color
        double nMod = n % 2.0;
        if (nMod == 0.0) {
            color_bit = 0;
        }
        for (double x = 0.0; x < n; x++) {
            if (nMod == 0.0) {
                color_bit ^= 1;
            }
            for (double y = 0.0; y < n; y++) {
                if (color_bit == 1) {
                    StdDraw.setPenColor(StdDraw.BLUE);
                }
                else {
                    StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
                }
                color_bit ^= 1;
                StdDraw.filledSquare(x + 0.5, y + 0.5, 0.5);
            }
        }
        StdDraw.show(20);
    }
}
