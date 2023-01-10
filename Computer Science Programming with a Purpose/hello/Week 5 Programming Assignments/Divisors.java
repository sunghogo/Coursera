public class Divisors {
    // Returns the greatest common divisor of a and b.
    public static int gcd(int a, int b) {
        int gcd = 0;
        int x = a;
        int y = b;

        while (true) {
            if (x > y) {
                y = y % x;
                gcd = x;
            }
            else {
                x = x % y;
                gcd = y;
            }
            if (x == 0 || y == 0) {
                break;
            }
        }

        return gcd;
    }

    // Returns the least common multiple of a and b.
    public static int lcm(int a, int b) {

    }


    // Returns true if a and b are relatively prime; false otherwise.
    public static boolean areRelativelyPrime(int a, int b) {

    }


    // Returns the number of integers between 1 and n that are
    // relatively prime with n.
    public static int totient(int n) {

    }


    // Takes two integer command-line arguments a and b and prints
    // each function, evaluated in the format (and order) given below.
    public static void main(String[] args) {

    }

}
