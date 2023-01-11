public class Binary {
    public static String convert(int N) {
        if (N == 1) return "1";
        else if (N == 0) return "0";
        return convert(N / 2) + (N % 2);
    }

    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        StdOut.println(convert(N));
    }
}
