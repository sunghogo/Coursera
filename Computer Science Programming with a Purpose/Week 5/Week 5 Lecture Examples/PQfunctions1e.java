public class PQfunctions1e {
    public static int cube(int i) {
        return i * i * i;
    }

    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        for (int i = 0; i <= N; i++) {
            StdOut.println(i + " " + cube(i));
        }
    }
}
