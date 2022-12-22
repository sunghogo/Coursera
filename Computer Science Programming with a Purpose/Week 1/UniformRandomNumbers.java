public class UniformRandomNumbers {
    public static void main(String[] args) {
        // Initalize size and print string statements
        String srn = "Random Nunmbers: ";
        String savg = "Average: ";
        String smin = "Minimum: ";
        String smax = "Maximum: ";

        // Generate random numbers
        double num1 = Math.random();
        double num2 = Math.random();
        double num3 = Math.random();
        double num4 = Math.random();
        double num5 = Math.random();

        // Compute max, min, avg of random numbers
        double maximum = Math.max(Math.max(Math.max(Math.max(num1, num2), num3), num4), num5);
        double minimum = Math.min(Math.min(Math.min(Math.min(num1, num2), num3), num4), num5);
        double average = (num1 + num2 + num3 + num4 + num5) / 5.0;

        // Concatenate values to string statements
        srn += num1 + ", " + num2 + ", "+ num3 + ", " + num4 + ", " + num5;
        smax += maximum;
        smin += minimum;
        savg += average;

        // Print string statments
        System.out.println(srn);
        System.out.println(smax);
        System.out.println(smin);
        System.out.println(savg);
    }
}
