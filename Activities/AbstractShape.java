package Activities;

public abstract class AbstractShape implements Shape {
    protected String color;
    protected double length;
    protected double width;

    // Constructor
    public AbstractShape(String color, double length, double width) {
        this.color = color;
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    public String getColor() {
        return color;
    }
}
