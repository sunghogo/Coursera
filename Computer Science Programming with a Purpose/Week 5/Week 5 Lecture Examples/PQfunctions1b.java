public class PQfunctions1b {
    public static int cube(int i) {
        int i = i * i * i;
        // This won't compile since argument variable i is already declared 
        // and initialized for function block so the name cannot be reused
        
        return i;
    }

    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        for (int i = 0; i <= N; i++) {
            StdOut.println(i + " " + cube(i));
        }
    }
}
