public class DealCards 
{
    public static void main(String[] args)
    {
        // Get hand size
        int N = Integer.parseInt(args[0]);

        // Declare and initialize arrays with possible card ranks and suits
        String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] suit = {"\u2663", "\u2666", "\u2665", "\u2660"};

        // Declare and initialize deck
        String[] deck = new String[52];
        for (int i = 0; i < rank.length; i++)
            for (int j = 0; j < suit.length; j++)
                deck[i + 13*j] = rank[i] + suit[j];

        // Shuffle deck
        for (int i = 0; i < 52; i++)
        {
            int r = i + (int) (Math.random() * (52 - i));
            String t = deck[r];
            deck[r] = deck[i];
            deck[i] = t;
        }

        // Print deck
        for (int i = 0; i < N; i++)
            System.out.print(deck[i] + " ");
        System.out.println();
    }
}
