package com.practice;
import java.sql.Date;
import java.util.Locale;
public class Test {
    public static void main(String[] args) {
        Date data = new Date(0);
        System.out.printf(Locale.GERMANY, "Ngày giờ hiện tại: %tc\n", data);
    }
}
