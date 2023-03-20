package inheritance;

import java.util.Date;

public class Geometric {
    protected String color;
    private Date dateCreated;       // null
    protected boolean filled;

    public String getName() {
        return "Tôi là đối tượng Geometric";
    }

    public Geometric() {
//        System.out.println("Chạy vào hàm khởi tạo Geometric");
        dateCreated = new Date();
    }

    public Geometric(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        dateCreated = new Date();
    }
    @Override
    public String toString() {
        return "Geometric color: " + this.color;
    }

    public Geometric(String color) {
        this.color = color;
    }
    public Date getDateCreated() {
        return this.dateCreated;
    }
    public String getColor() {
        return "Geometric "  + this.color;
    }


}
