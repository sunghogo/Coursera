public class Divisors {
    // Returns the greatest common divisor of a and b.
    public static int gcd(int a, int b) {
        int gcd = 0;
        int x = a;
        int y = b;

        while (true) {
            if (x == 0) {
                gcd = Math.abs(y);
                break;
            }
            else if (y == 0) {
                gcd = Math.abs(x);
                break;
            }
            else if (Math.abs(x) > Math.abs(y)) {
                x = x % y;
                if (x == 0) {
                    gcd = Math.abs(y);
                    break;
                }
            }
            else {
                y = y % x;
                if (y == 0) {
                    gcd = Math.abs(x);
                    break;
                }
            }
        }

        return gcd;
    }

    // Returns the least common multiple of a and b.
    public static int lcm(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        return Math.abs(a) * (Math.abs(b) / gcd(a, b));
    }


    // Returns true if a and b are relatively prime; false otherwise.
    public static boolean areRelativelyPrime(int a, int b) {
        if (a == 0 && b == 0) {
            return false;
        }
        return !(gcd(a, b) > 1);
    }


    // Returns the number of integers between 1 and n that are
    // relatively prime with n.
    public static int totient(int n) {
        int relativelyPrime = 0;

        for (int i = 1; i < n + 1; i++) {
            if (areRelativelyPrime(n, i)) {
                relativelyPrime++;
            }
        }

        return relativelyPrime;
    }


    // Takes two integer command-line arguments a and b and prints
    // each function, evaluated in the format (and order) given below.
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        StdOut.println("gcd(" + a + ", " + b + ") = " + gcd(a, b));
        StdOut.println("lcm(" + a + ", " + b + ") = " + lcm(a, b));
        StdOut.println("areRelativelyPrime(" + a + ", " + b + ") = " + areRelativelyPrime(a, b));
        StdOut.println("totient(" + a + ") = " + totient(a));
        StdOut.println("totient(" + b + ") = " + totient(b));
    }
}
