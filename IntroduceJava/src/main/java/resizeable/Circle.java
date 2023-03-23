package resizeable;

public class Circle extends Geometric{
    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    public Circle() {

    }

    // Chỗ này là sao               ???
    // Định nghĩa lại phương thức cha Geometric
    @Override
    public float getArea() {
        return (float) (Math.PI*this.radius*this.radius);
    }

    @Override
    public void resize(float percent) {
        this.radius = this.radius * percent;
    }
}
