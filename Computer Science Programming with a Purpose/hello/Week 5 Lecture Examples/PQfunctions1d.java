public class PQfunctions1d {
    public static int cube(int i) {
        i = i * i * i;
        // Works but changing values of function arguments is confusing and bad style
        return i;
    }

    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        for (int i = 0; i <= N; i++) {
            StdOut.println(i + " " + cube(i));
        }
    }
}
