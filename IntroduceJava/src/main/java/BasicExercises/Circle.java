package BasicExercises;

import java.util.Scanner;

public class Circle {
    private double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    public void setCircle(double radius){
        this.radius = radius;
    }
    public double getCircle(){
        return radius;
    }
    public double getArea(){
        double area = Math.PI * radius * radius;
        return area;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập bán kính đường tròn :");
        double radius = scanner.nextDouble();

        Circle circle = new Circle(radius);
        System.out.println("Diện tích hình tròn là :" + circle.getArea());


    }
}

