package resizeable;

public class Rectangle extends Geometric {
    private float width;
    private float height;

    public Rectangle(float w, float h) {
        this.width = w;
        this.height = h;
    }

    @Override
    public float getArea() {
        return this.height*this.width;
    }

    @Override
    public void resize(float percent) {
        this.width = (float) (this.width*Math.sqrt(percent));
        this.height = (float) (this.height * Math.sqrt(percent));
    }
}
