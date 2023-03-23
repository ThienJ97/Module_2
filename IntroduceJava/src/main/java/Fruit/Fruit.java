package Fruit;
import java.util.Objects;
public class Fruit implements Comparable<Fruit>{
    private String name;
    private String color;
    public  Fruit(String name,String color){
        this.name = name;
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fruit(){

    }
    @Override
  public String toString(){
        return String.format("Name : %s,Color : %s ",this.name,this.color );
  }
  @Override
  public boolean equals(Object obj){
        if (this.name == obj){
            return true;
        }
        if (obj instanceof Fruit){
            Fruit o1 = (Fruit) obj;
            if (this.getName().equals(o1.getName()) && this.getColor().equals(o1.getColor())){
                return true;
            }
        }
        return false;
  }
    @Override
    public int hashCode() {
        return Objects.hash(this.color, this.name);
    }

    @Override
    public int compareTo(Fruit o) {
        return 0;
    }
}
