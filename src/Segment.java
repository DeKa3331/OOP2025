public class Segment {

    public Point punkt1;
    public Point punkt2;


    public Segment(Point punkt1, Point punkt2) {
        this.punkt1 = punkt1;
        this.punkt2 = punkt2;
    }


    public double length() {
        double dx = punkt2.x - punkt1.x;
        double dy = punkt2.y - punkt1.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}
