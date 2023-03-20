package inheritance;

public class Rectangle extends Geometric{
    private double width;
    private double height;
    @Override
    public String getName() {
        return "Tôi là đối tượng Rectangle";
    }


    public Rectangle() {
        // Từ khóa super: có thể gọi đến hàm khởi tạo của lớp cha
//        super("Đỏ");
//        System.out.println("Chạy vào hàm khởi tạo Rectangle");


    }

    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
//        this.color = color;
//        this.filled = filled;
    }

    @Override
    public String getColor() {
        return "Color: "  + "Circle " + this.color;
    }

    @Override
    public String toString() {
        // Từ khóa super: dùng để gọi đến phương thức của lớp cha
        return "Rectangle " + super.toString();
    }

    public static void main(String[] args) {
//        Rectangle rectangle = new Rectangle();
//        System.out.println(rectangle.toString());

        // Sử dụng đa hình
//        Geometric g = new Rectangle();
//        System.out.println(g.toString());


        Geometric a = new Circle(1, "RED", false);      //
        displayGeometricObject(a);
//        displayGeometricObject(new Rectangle(4, 5, "BLUE", true));
    }

    public static void displayGeometricObject(Geometric geometric) {
        System.out.println("Create on: " + geometric.getDateCreated());
        System.out.println(geometric.getColor());

        if (geometric instanceof Circle) {
            System.out.println("Diện tích: " + ((Circle) geometric).getArea());
        }
        if (geometric instanceof Geometric) {
            System.out.println("Diện tích: " + ((Circle) geometric).getArea());
        }
    }
}
