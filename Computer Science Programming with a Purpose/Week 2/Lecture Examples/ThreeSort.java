public class ThreeSort 
{
    public static void main(String[] args)
    {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        if (b < a)
        { int t = a; a = b; b = t; } // makes a smaller than b
        if (c < a)
        { int t = a; a = c; c = t; } // makes a smaller than both b and c
        if ( c < b)
        { int t = b; b = c; c = t; } // makes b smaller than c
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
