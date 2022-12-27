public class RandomWalker {
    public static void main(String[] args) {
        // Initialize input r
        int r = Integer.parseInt(args[0]);
        
        // Initialize coordinates, steps, and print initial coordinates
        int x = 0;
        int y = 0;
        int steps = 0;
        System.out.println("(" + x + ", " + y + ")");

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

            // Print coordinates at every step and increment step count
            System.out.println("(" + x + ", " + y + ")");
            steps++;
        }

        System.out.println("steps = " + steps);
    }
}
