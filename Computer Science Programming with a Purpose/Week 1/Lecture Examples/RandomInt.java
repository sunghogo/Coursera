public class RandomInt {
    // Problem: Given N, generate a pseudo-random integer between 0 and N-1.
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]); // String to int (system methods)
        double r = Math.random(); // Returns a pseudo-random double value in [0,1)
        int t = (int) // double to int (cast) 
        (r * N); // double to int (cast) and int to double (automatic

        System.out.println(t);
    }
}