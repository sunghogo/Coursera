public class PQfunctions1c {
    public static int cube(int i) {
        int i = i * i * i;
        // This won't compile since need return statement
    }

    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        for (int i = 0; i <= N; i++) {
            StdOut.println(i + " " + cube(i));
        }
    }
}
