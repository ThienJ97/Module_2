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
        double r1 = (-this.b + Math.pow(getDiscriminant(),0.5)) / (2 * this.a);
        return r1;
    }
    public double getRoot2(){
        double r2 = (-this.b - Math.pow(getDiscriminant(),0.5)) / (2 * this.a);
        return r2;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    }
}


