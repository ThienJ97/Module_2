package BasicExercises;

public class Temperature {
    private double c;
    public void Temperature(double c){
        this.c = c;
    }

    public double getCoverToF(){
        double f = c * 1.8 + 32;
        return f;
    }
    public double getCoverToK(){
        double k = c + 273.15;
        return k;
    }

    public static void main(String[] args) {
        Temperature temperature = new Temperature();
        double k = temperature.getCoverToK();
        double f = temperature.getCoverToF();
        System.out.printf("Kavin : %s\n",k);
        System.out.printf("Độ F : %s\n",f);

    }
}
