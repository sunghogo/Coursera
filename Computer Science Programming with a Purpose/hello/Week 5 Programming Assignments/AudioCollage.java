public class AudioCollage {
    // Returns a new array that rescales a[] by a multiplicative factor of alpha.
    public static double[] amplify(double[] a, double alpha) {
        double[] amp = new double[a.length];

        for (int i = 0; i < a.length; i++) {
            amp[i] = a[i] * alpha;
        }

        return amp;
    }

    // Returns a new array that is the reverse of a[].
    public static double[] reverse(double[] a) {
        double[] rev = new double[a.length];

        for (int i = 0; i < a.length; i++) {
            rev[i] = a[(a.length - 1) - i];
        }

        return rev;
    }

    // Returns a new array that is the concatenation of a[] and b[].
    public static double[] merge(double[] a, double[] b) {
        double[] merge = new double[a.length + b.length];

        int i;
        for (i = 0; i < a.length; i++) {
            merge[i] = a[i];
        }
        for (int j = 0; j < b.length; j++) {
            merge[i] = b[j];
            i++;
        }

        return merge;
    }

    // Returns a new array that is the sum of a[] and b[],
    // padding the shorter arrays with trailing 0s if necessary.
    public static double[] mix(double[] a, double[] b) {
        double[] mix;
        boolean agttb = false;
        if (a.length >= b.length) {
            mix = new double[a.length];
            agttb = true;
        }
        else {
            mix = new double[b.length];
        }

        if (agttb) {
            for (int i = 0; i < a.length; i++) {
                if (i >= b.length) {
                    mix[i] = a[i];
                }
                else {
                    mix[i] = a[i] + b[i];
                }
            }
        }
        else {
            for (int i = 0; i < b.length; i++) {
                if (i >= a.length) {
                    mix[i] = b[i];
                }
                else {
                    mix[i] = a[i] + b[i];
                }
            }

        }

        return mix;
    }

    // Returns a new array that changes the speed by the given factor.
    public static double[] changeSpeed(double[] a, double alpha) {
        int length = (int) (a.length / alpha);
        double[] change = new double[length];

        for (int i = 0; i < length; i++) {
            change[i] = a[(int) (i * alpha)];
        }
        return change;
    }

    // Creates an audio collage and plays it on standard audio.
    // See below for the requirements.
    public static void main(String[] args) {
        double[] beatbox = StdAudio.read("beatbox.wav");
        double[] scratch = StdAudio.read("scratch.wav");
        double[] silence = StdAudio.read("silence.wav");
        double[] piano = StdAudio.read("piano.wav");
        double[] singer = StdAudio.read("singer.wav");
        double[] collage;

        scratch = reverse(scratch);
        beatbox = amplify(beatbox, 1.25);
        silence = changeSpeed(silence, 2.0);
        double[] duo = merge(piano, singer);

        collage = merge(beatbox, scratch);
        collage = merge(collage, silence);
        collage = merge(collage, duo);

        StdAudio.play(collage);
    }
}
