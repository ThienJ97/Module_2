package Cilinder;

public class Cylinder extends Circle{

        private float height;

        public Cylinder() {
            // ở đây mặc định là nó gọi đi đâu           //** nó sẽ gọi đến lớp cha Circle
//        super();
        }

        public Cylinder(float height, float radius, String color) {
            // Cách 1: super(radius, color) cái này để làm gì       //* nó sẽ tham chiếu đến radius và clor của lớp cha
            super(radius, color);


            // Cách 2:  Vì sao ở đây this.color và this.radius được    //* vì ở đây lớp con nó thừa hưởng được các thuộc tính
            // và phương thức của lớp cha nên no có thể tham chiếu đến phương thức và constructor.
//        this.color = color;
//        this.radius = radius;

            // Cách 3:     setColor(color);  vì sao gọi được        ???
//        setColor(color);    // có thể dùng: this.setColor(color);
//        setRadius(radius);

            // cách 4: super.setColor(color); vì sao gọi được       ???
//        super.setColor(color);
//        super.setRadius(radius);

            this.height = height;

        }

        // Tại sao phải ghi đè phương thức getArea()           //* vì mỗi hình sẽ có mỗi công thức tính khác nhau
        @Override
        public float getArea() {
//          Nếu lấy this.getArea(); //thì chuyện gì sẽ xảy ra       ???
            return super.getArea() * this.height;
        }

        @Override
        public String toString() {
            return String.format("Cylinder: %s, color: %s, Area: %s",
                    this.radius, color, this.getArea() );
        }

        public static void main(String[] args) {
            Circle circle = new Circle(5);
            System.out.println(circle);

            Cylinder cylinder = new Cylinder(3, 10, "RED");
            System.out.println(cylinder);

            // Ở đây sử dụng tính chất gì, nói ra                       //* ngầm định
            Circle c1 = new Cylinder(3, 10, "BLUE");

            // c1.getArea();            lấy phương của lớp nào để thực hình    //* lấy phương thức của lớp Cylinder
            float area = c1.getArea();
            System.out.println("Area c1: " + area);
        }
    }

