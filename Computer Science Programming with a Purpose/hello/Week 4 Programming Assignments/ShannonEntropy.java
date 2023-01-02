public class ShannonEntropy {
    public static void main(String[] args) {
        // Read from 1 to m integers from StdIn
        int m = Integer.parseInt(args[0]);
        double counter = 0.0;
        int[] p = new int[m + 1];

        // Read integers from StdIn and fill in tracking array
        while (!StdIn.isEmpty()) {
            int x = StdIn.readInt();
            if (x < m + 1) {
                p[x]++;
            }
            // Increment Counter
            counter++;
        }
        // Calculate and print Shannon Entropy
        double SE = 0.0;
        for (int i = 0; i < m + 1; i++) {
            if (p[i] != 0) {
                double pi = p[i] / counter;
                SE += (-pi * (Math.log(pi) / Math.log(2)));
            }
        }
        StdOut.printf("%.4f", SE);
        StdOut.println();
    }
}
