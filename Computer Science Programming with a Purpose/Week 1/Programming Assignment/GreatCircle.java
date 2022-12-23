public class GreatCircle {
    public static void main(String[] args) {
        // Initialize points in radian with passed double arguments in degree and constant r
        double x1 = Math.toRadians(Double.parseDouble(args[0]));
        double y1 = Math.toRadians(Double.parseDouble(args[1]));
        double x2 = Math.toRadians(Double.parseDouble(args[2]));
        double y2 = Math.toRadians(Double.parseDouble(args[3]));
        double r = 6371.0;

        // Compute distance
        double distance = 2.0 * r * Math.asin(Math.sqrt(Math.pow(Math.sin((x2 - x1) / 2.0),2) + Math.cos(x1) * Math.cos(x2) * Math.pow(Math.sin((y2 - y1)/ 2.0), 2)));

        // Print distance
        System.out.println(distance + " kilometers");
    }
}
