package Fruit;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
            Fruit[] fruit = new Fruit[5];
            fruit[0] = new Fruit("Apple","Red");
            fruit[1] = new Fruit("Mangoes","Yellow");
            fruit[2] = new Fruit("Orange","Orange");
            fruit[3] = new Fruit("Grape","Purple");

            Arrays.sort(fruit);
           printArray(fruit);



    }
    public static void printArray(Fruit[] fruits) {
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i].toString());
        }
    }

}
