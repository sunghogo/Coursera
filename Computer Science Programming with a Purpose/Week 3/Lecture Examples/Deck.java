import java.io.*;

public class Deck 
{
    public static void main(String[] args)
    {
        String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] suit = {"\u2663", "\u2666", "\u2665", "\u2660"};

        String[] deck = new String[52];
        for (int j = 0; j < suit.length; j++)
            for (int i = 0; i < rank.length; i++)
                deck[i + 13*j] = rank[i] + suit[j];
        
        for (int i = 0; i < 52; i ++)
            System.out.print(deck[i] + " ");
        System.out.println();
    }   
}
