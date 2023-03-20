package inheritance;

public class Circle extends Geometric {
    private double radius;

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
//        this.color = color;
//        this.filled = filled;
    }
    public double getArea() {
        return Math.PI*this.radius*this.radius;
    }
}
