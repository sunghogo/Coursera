public class Birthday {
    public static void main(String[] args) {
        // Initialize n and trials
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);

        // Initialize fraction of people with same birthday and person counter
        double fraction = 0.0;
        int i = 1;
        double tempRunningSum = 0.0;
        double runningSum = 0.0;

        // Iterate through i number of person and generate fraction until fraction >= 0.5,
        while (fraction < 0.5) {
            // Initialize count of matching birthdays, exact count of matching person being the ith person, and birthday array
           tempRunningSum = runningSum;
            int exactCount = 0;
            long[] birthdays = new long[i];

            for (int t = 0; t < trials; t++) {
                // Iterate through each person, generate random birthday, and compare birthday
                personIterate:
                for (int j = 0; j < i; j++) {
                    birthdays[j] = (long) (Math.random() * n);
                    for (int k = j-1; k >= 0; k--) {
                        if (birthdays[j] == birthdays[k]) {
                            if (j == i-1) {
                                exactCount++;
                            }
                            break personIterate;
                        }
                    }
                }        
            }
            tempRunningSum += exactCount;

            // Calculate fraction and make sure it is monotone nondecreasing
            double tempFraction = (tempRunningSum/trials);
            if (tempFraction <= fraction || tempFraction > 1.0) {
                if (i != 1) {
                    continue;
                }
            }
            runningSum = tempRunningSum;
            fraction = (runningSum/trials);


            // Print and increment person count
            System.out.println(i + " " + exactCount + " " + fraction);
            i++;
        }
    }
}