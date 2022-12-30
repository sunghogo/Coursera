public class ThueMorse {
    public static void main(String[] args) {
        // Initialize N size 2D array
        int N = Integer.parseInt(args[0]);
        String[][] arr = new String[N][N];

        // Generate Thue-Morse Sequence
        int[] TM = new int[N];
        int twopower = 2;
        for (int i = 0; i < N; i++) {
            if (i == 0 ) {
                TM[0] = 0;
            } else if (i == 1) {
                TM[1] = 1;
            } else if (i % twopower == 0) {
                for (int j = i; j < N; j++) {
                    TM[j] = TM[j-twopower] ^ 1;
                }
                twopower = twopower << 1;
            }
        }

        // Initialize + and - in arr and print
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (TM[i] == TM[j]) {
                    arr[i][j] = "+";
                    System.out.print(arr[i][j]);
                } else {
                    arr[i][j] = "-";
                    System.out.print(arr[i][j]);
                }

                // Handle whitespaces and new lines
                if (j + 1 == N) {
                    System.out.println();
                } else {
                    System.out.print("  ");
                }
            }
        }
    }    
}
