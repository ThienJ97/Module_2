package inheritance;

public class Bird extends Animal{

    @Override
    public void move() {
//        super.move();
        System.out.println("Con chim đang bay");
    }

    public String toString(){
        return "Chim của này ko lông";
    }

    public static void main(String[] args) {
        Bird bird = new Bird();             //0x32hh
        bird.move();
//        bird.name = "DaDa";


        System.out.println(bird.toString());
    }
}
