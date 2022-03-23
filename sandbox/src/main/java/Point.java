public class Point {

    public double p1;
    public double p2;

    public Point(double x, double y) {
        this.p1 = x;
        this.p2 = y;
    }

    public static double distance (Point p1, Point p2){
        return Math.sqrt((Math.pow((p2.p1 - p1.p1), 2) + Math.pow((p2.p2 - p1.p2), 2)));
    }

}
