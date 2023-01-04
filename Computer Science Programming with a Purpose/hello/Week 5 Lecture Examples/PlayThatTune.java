public class PlayThatTune {
    public static double[] avg(double[] a, double[] b, double awt, double bwt) {
        double[] c = new double[a.length];
        for (int i = 0; i < a.length; i++)
            c[i] = a[i] * awt + b[i] * bwt;
        return c;
    }

    public static double[] tone(double hz, double t) {
        int sps = 44100;
        int N = (int) (sps * t);
        double[] a = new double[N + 1];
        for (int i = 0; i <= N; i++)
            a[i] = Math.sin(2 * Math.PI * i * hz / sps);
        return a;
    }

    public static double[] note(int pitch, double t) {
        double hz = 440.0 * Math.pow(2, pitch / 12.0);
        double[] a = PlayThatNote.tone(hz, t);
        double[] hi = PlayThatNote.tone(2.0 * hz, t);
        double[] lo = PlayThatNote.tone(hz / 2.0, t);
        double[] h = avg(hi, lo, 0.5, 0.5);
        return avg(a, h, 0.5, 0.5);
    }

    public static void main(String[] args) {
        while (!StdIn.isEmpty()) {
            int pitch = StdIn.readInt();
            double duration = StdIn.readDouble();
            double[] a = note(pitch, duration);

            StdAudio.play(a);
        }
    }
}
