public class DrawCards 
{
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);

        String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] suit = {"\u2663", "\u2666", "\u2665", "\u2660"};

        String[] deck = new String[52];
        for (int i = 0; i < rank.length; i++)
            for (int j = 0; j < suit.length; j++)
                deck[i + 13*j] = rank[i] + suit[j];

        for (int i = 0; i < N; i++)
        {
            int r = (int) (Math.random() * 52);
            System.out.print(deck[r] + " ");
        }
        System.out.println();
    }    
}
