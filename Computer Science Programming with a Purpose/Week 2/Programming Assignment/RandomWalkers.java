public class RandomWalkers {
    public static void main(String[] args) {
        // Initialize inputs r and trials
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);         
        
        // Intialize running sum of all trial steps 
        double stepsaverage = 0.0;

        // Iterate numebr of trials
        for (int i = 0; i < trials; i++) {
            // Initialize coordinates, steps, and print initial coordinates
            int x = 0;
            int y = 0;
            int steps = 0;

            // Compute random walk until manhattan distance: |x| + |y| = r
            while ( Math.abs(x) + Math.abs(y) != r) {
                // Generate random probability 0 - 100
                int prob = (int) Math.round(Math.random() * 100);
                // Regenerate probability if 100
                if (prob == 100) {
                    while (prob == 100) {
                        prob = (int) Math.round(Math.random() * 100);
                    }
                }
                // Random step
                if (prob < 25) {
                    x++; 
                } else if (prob < 50) {
                    y++; 
                } else if (prob < 75) {
                    x--; 
                } else {
                    y--; 
                }
                // Increment step count
                steps++;
            }
            // Add total number of steps to running sum
            stepsaverage += steps;
        }

        // Calculate average and print
        stepsaverage /= trials;

        System.out.println("average number of steps = " + stepsaverage);
    }
}
