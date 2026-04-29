package Activities;

class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void print() {
        System.out.println("(" + x + "," + y + ")");
    }

    // Method to scale the point closer to (0,0) by half
    public void scale() {
        x = x / 2;
        y = y / 2;
    }
}
