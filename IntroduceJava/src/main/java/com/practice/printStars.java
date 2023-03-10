package com.practice;

import java.util.Scanner;

public class printStars {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

///        printSquareStar();
// /       printTriangleStarTopLeft();
//  /      printTriangleStarTopRight();
            boolean checkActionMenu = false;
            do {
                System.out.println("Chọn chức năng cần in ra");
                System.out.println("Nhấn 1: In hình vuông sao");
                System.out.println("Nhấn 2: In tam giác sao trên - trái");
                System.out.println("Nhấn 3: In tam giác sao trên - phải");

                // Bài tập
                System.out.println("Nhấn 4: In tam giác sao dưới - trái");
                System.out.println("Nhấn 5: In tam giác sao dưới - phải");
                System.out.println("Nhấn 6: In ra 2 đường chéo");
                System.out.println("Nhấn 7: In ra viền ngoài hình vuông");
                int actionMenu = scanner.nextInt();

                switch (actionMenu) {
                    case 1:
                        printSquareStar();
                        break;
                    case 2:
                        printTriangleStarTopLeft();
                        break;
                    case 3:
                        printTriangleStarTopRight();
                        break;
                    case 4:
                        printTriangleStarBelowRight();
                        break;
                    case 5:
                        printTriangleStarBelowLeft();
                        break;
                    case 6:
                        printTriangleStarTwoDiagonals();
                        break;
                    case 7:
                        printBorderSquareStar();
                        break;
                }
                checkActionMenu  = true;
            }while (checkActionMenu);

        }

        public static int size = 5;
        private static void printTriangleStarTopRight() {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.printf("   ");
                }
                for (int j = i; j < size; j++) {
                    System.out.printf("*  ");
                }
                System.out.println();
            }
        }

        public static void printTriangleStarTopLeft() {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size - i; j++) {
                    System.out.print("*  ");
                }
                System.out.println();
            }
        }
        public static void printSquareStar() {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    System.out.print("*  ");
                }
                System.out.println();
            }
        }
        public static void printTriangleStarBelowRight(){
            for (int i = 0;i < size;i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.printf("*  ");
                }
                for (int j = i; j < size; j++) {
                    System.out.printf("  ");
                }
                System.out.println();
            }
        }
        public static void printTriangleStarBelowLeft() {
            for (int i = 1 ; i < size + 1;i++){
                for (int j = 0; j < size - i; j++){
                    System.out.printf("   ");
                }
                for (int j = size; j < size + i;j++){
                    System.out.printf("*  ");
                }
                System.out.println();
            }
        }
        public static void printTriangleStarTwoDiagonals(){
            for (int i = 0; i < size; i++) {
                for (int j = 0; j <= size; j++) {
                    int a = i + j;
                    if (i == j || a == (size - 1)) {
                        System.out.printf("*  ");
                    }else{
                        System.out.printf("   ");
                    }
                }
                System.out.println();
            }
        }
        public static void printBorderSquareStar(){
            for (int i = 0; i < size; i++){
                for (int j = 0; j < size; j++) {
                    if(i == 0 || j == 0 || i == (size -1) || j == (size -1 )){
                        System.out.printf("*  ");
                    }else {
                        System.out.printf("   ");
                    }

                }
                System.out.println();
            }
        }
}