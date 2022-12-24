public class Sqrt 
{
    public static void main(String[] args)
    {
        double EPS = 1E-15; // error tolerance (15 places)
        double c = Double.parseDouble(args[0]);
        double t = c;
        while  (Math.abs(t - c/t) > t *EPS) // if t = c/t then t^2 = c
            t = (c/t + t) / 2.0;
        System.out.println(t);
    }    
}
