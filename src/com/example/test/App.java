package com.example.test;
import java.sql.SQLOutput;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        NDrob frac1, frac2;
        frac1 = new NDrob();
        frac2 = new NDrob();
        frac1.setNumerator(in.nextInt());
        frac1.setDenominator(in.nextInt());
        frac2.setNumerator(in.nextInt());
        frac2.setDenominator(in.nextInt());
        NDrob result = frac1.minus(frac2);
        System.out.println(NDrob.counter);
        NDrob.soutCounter();
        //Math m = new Math(); can't create
    }
}
