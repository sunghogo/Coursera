public class Minesweeper {
    public static void main(String[] args) {
        // Initialize vars m x n grid, k mines
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);

        // Initialize grid to element IDs
        int[][] grid = new int[m][n];
        int id = 1;
        for (int x = 0; x < m; x++) {
            for (int y = 0; y < n; y++) {
                grid[x][y] = id;
                id++;
            }
        }

        // Reservoir sampling for mines
        int[] reservoir = new int[k];
        for (int i = 0; i < k; i++) {
            reservoir[i] = i+1;
        }
        for (int i = k; i < m*n; i++) {
            long prob = (long) (Math.random() * (i+1));
            for (int j = 0; j < k; j++) {
                if (prob == reservoir[j]) {
                    reservoir[j] = i+1;
                    break;
                }
            }
        }

        // Print reservoir
        for (int i = 0; i < k; i++) {
            System.out.print(reservoir[i] + " ");
        }
        System.out.println();

        // Reset rest of the grid elements to 0
        for (int x = 0; x < m; x++) {
            for (int y = 0; y < n; y++) {
                grid[x][y] = 0;
            }
        }

        // Generate mines as element value -1 and increment surrounding areas
        for (int i = 0; i < k; i++) {
            int row = (reservoir[i]-1) / m;
            int column = (reservoir[i]-1) % m;
            System.out.println(row + " " + column);
            grid[row][column] = -1;
            if (row-1 >= 0) { if (grid[row-1][column] != -1) grid[row-1][column] += 1;}
            if (row+1 < m) { if (grid[row+1][column] != -1) grid[row+1][column] += 1;}
            if (column-1 >= 0) { if (grid[row][column-1] != -1) grid[row][column-1] += 1;}
            if (column+1 < n) { if (grid[row][column+1] != -1) grid[row][column+1] += 1;}
            if (row-1 >= 0 && column-1 >= 0) { if (grid[row-1][column-1] != -1) grid[row-1][column-1] += 1;}
            if (row+1 < m && column-1 >= 0) { if (grid[row+1][column-1] != -1) grid[row+1][column-1] += 1;}
            if (row-1 >= 0 && column+1 < n) { if (grid[row-1][column+1] != -1) grid[row-1][column+1] += 1;}
            if (row+1 < m && column+1 < n) { if (grid[row+1][column+1] != -1) grid[row+1][column+1] += 1;}
        }

        // Print grid
        for (int x = 0; x < m; x++) {
            for (int y = 0; y < n; y++) {
                if (grid[x][y] == -1) {
                    System.out.print("*");
                } else {
                    System.out.print(grid[x][y]);
                }

                // Handle White Spaces
                if (y+1 == n) {
                    System.out.println();
                } else {
                    System.out.print("  ");
                }
            }
        }
    }
}
