package Exercise1;

public class Point {
    private int x, y;

    public Point() {

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        double distance = Math.sqrt((x - 0) * (x - 0) + (y - 0) * (y - 0));
        return distance;
    }

    public double distance(int x, int y) {
        double distance = Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
        return distance;
    }

    public double distance(Point newPoint) {
        double distance = Math.sqrt((x - newPoint.x) * (x - newPoint.x) + (y - newPoint.y) * (y - newPoint.y));
        return distance;
    }
}
