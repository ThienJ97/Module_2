package com.practice;
import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> b = new ArrayList<>();
        b.add(15);
        b.add(26);
        b.addAll(Arrays.asList(new Integer[]{2,5,7,}));
        b.add(3,5);

        System.out.println("Số lượng phan tử = " + b.size());

        b.forEach(v -> System.out.printf("%d\t",v));
    }
}
