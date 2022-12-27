public class GeneralizedHarmonic {
    public static void main(String[] args) {
        // Initialize inputs n and r
        int n = Integer.parseInt(args[0]);
        int r = Integer.parseInt(args[1]);

        // Intialize variables for iteration
        n++;
        double sum = 0.0;

        // Compute Generalized harmonic numbers: // 1/1^r + 1/2^r + ... 1/n^r
        for (int i = 1; i < n; i++){
            sum += 1 / Math.pow(i, r);
        }

        // Print sum
        System.out.println(sum);
    }
}
