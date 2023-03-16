package BasicExercises;
public class Student {
   private String name;
   private int age;
   private int point;
   public Student(String name,int age,int point){
       this.name = name;
       this.age = age;
       this.point = point;
   }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public int getPoint() {
        return point;
    }

    public static void main(String[] args) {
       Student student = new Student("Nguyễn Văn A",15,  9);
        student.setName("Nguyen Van B");
        student.setAge(20);
        student.setPoint(5);
        System.out.println("Tên : " + student.getName());
        System.out.println("Tuôi : " + student.getAge());
        System.out.println("Điểm : " + student.getPoint());

    }
}
