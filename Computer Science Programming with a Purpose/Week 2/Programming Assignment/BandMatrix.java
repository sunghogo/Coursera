public class BandMatrix {
    public static void main(String[] args) {
        // Initialize inputs n and width
        int n = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Handle characters
                if (i == j) {
                    System.out.print("*");
                } else if ((i - width <= j && j <= i + width) ){
                    System.out.print("*");
                } else {
                    System.out.print("0");
                }

                // Handle white spaces and new lines
                if (j == n-1) {
                    System.out.println("");
                } else {
                    System.out.print(" ");
                }
            }
        }
    }
}
