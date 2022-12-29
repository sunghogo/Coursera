public class DiscreteDistribution {
    public static void main(String[] args)
    {
        // Initialize M trials and running sum of a1, ..., an
        int M = Integer.parseInt(args[0]);
        int runningSum = 0;
        for (int i = 1; i < args.length; i++) {
            runningSum += Integer.parseInt(args[i]);
        }

        // For M trials, randomly generate number within range of Sn - 1 and find corresponding index/n
        for (int i = 1; i < M+1; i++) {
            double prob = Math.round(Math.random() * (runningSum - 1));
            int index = -1;
            for (int j = 1; j < args.length; j++) {
                prob -= Integer.parseInt(args[j]);
                if (prob < 0) {
                    index = j;
                    break;
                }
            }

            // Handle new lines and white spaces
            System.out.print(index);
            if (i % 25 == 0) {
                System.out.println();
            } else {
                System.out.print(" ");
            }
        }
    }
}
