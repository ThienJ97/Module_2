package com.practice;

import java.util.Scanner;

public class QuadraticEquation {
    private double a,b,c;
    public QuadraticEquation(double a,double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getDiscriminant(){
        double delta = ( this.b * this.b ) - ( 4 * this.a * this.c );
        return delta;
    }
    public double getRoot(){
        double r = b / (2 * a);
        return r;
    }
    public double getRoot1(){
        double r1 = (-this.b + Math.sqrt(getDiscriminant())) / (2 * this.a);
        return r1;
    }
    public double getRoot2(){
        double r2 = (-this.b - Math.sqrt(getDiscriminant())) / (2 * this.a);
        return r2;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter c: ");
        double c = scanner.nextDouble();

       QuadraticEquation equation = new QuadraticEquation(a,b,c);
       double delta = equation.getDiscriminant();
        if (delta > 0){
            double root1 = equation.getRoot1();
            double root2 = equation.getRoot2();
            System.out.println("Phương trình có 2 nghiệm : " + root1 + " và " + root2);
        }else if (delta == 0){
            double root = equation.getRoot();
            System.out.println("Phương trình có 1 nghiệm : " + root);
        }else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}


