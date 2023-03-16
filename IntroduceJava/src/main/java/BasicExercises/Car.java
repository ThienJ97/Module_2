package BasicExercises;

public class Car {
    private String company;
    private String model;
    private int year;
    private String price;
    private Car(String company,String model,int year,String price){
        this.company = company;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String getCompany() {
        return company;
    }
    public  String getModel(){
        return  model;
    }
    public  int getYear(){
        return year;
    }
    public  String getPrice(){
        return  price;
    }

    public static void main(String[] args) {
        Car car = new Car("HonDa","CV",2015,"500 Triệu");
        System.out.println("Tên công ty : " + car.getCompany());
        System.out.println("Mẫu xe : " + car.getModel());
        System.out.println("Năm sản xuất : " + car.getYear());
        System.out.println("Giá : " + car.getPrice());
    }
}
