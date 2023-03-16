package BasicExercises;

import java.util.Scanner;

public class Rectangle {
    private double width;
    private double height;
    public Rectangle(double width,double height){
        this.width = width;
        this.height = height;
    }
    public  double getArea(){
        double S = this.width * this.height;
        return S;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập chiều dài : ");
        double width = scanner.nextDouble();
        System.out.println("nhập chiều rộng : ");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width,height);
        System.out.println("Diện tích hình chữ nhật : " + rectangle.getArea());
    }
}
