package com.example.test;

public class NDrob {
    // поля (свойства) класса
    int numerator;
    int denominator;
    static int counter = 0; // static field
    // методы класса
    // конструктор
    public static void soutCounter() {
        System.out.println("Всего создано " + counter + " дробей");
    }
    /*static { // это static блок
        counter = 4; при первом срабатывании NDrob он используется, а после не используется
    }*/

    public NDrob(){
        numerator = 1;
        denominator = 1;
        counter++;
    }
    // cеттеры и гетеры

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        if (denominator != 0) {
            this.denominator = denominator;
        }
        else {
            System.out.println("неверный denominator");
            this.denominator = 1;
        }
    }
    public int ghost(int denominator, int numerator) {
        while (denominator != numerator) {
            if (denominator > numerator) {
                denominator -= numerator;
            }
            else
                numerator -= denominator;
        }
        return denominator;
    }
    public int reduction(int denominator, int numerator) {
        return denominator * numerator / ghost(denominator, numerator);
    }
    public int minnumden(int numerator, int denominator) {
        int j = 0;
        for (int i = 1; i < numerator && numerator > denominator || i < denominator && denominator > numerator; i++) {
            if (numerator % i == 0 && denominator % i == 0) {
                j = i;
            }
        }
        return j;
    }


    public void multydigit(int num){
        numerator *= num;
        int j = minnumden(numerator, denominator);
        numerator /= j;
        denominator /= j;
    }
    public NDrob multy(NDrob other){
        NDrob result = new NDrob();
        result.numerator = this.numerator * other.numerator;
        result.denominator = this.denominator * other.denominator;
        int j = minnumden(result.numerator, result.denominator);
        result.numerator /= j;
        result.denominator /= j;
        return result;
    }
    public NDrob division(NDrob other) {
        NDrob result = new NDrob();
        result.numerator = this.numerator * other.denominator;
        result.denominator = this.denominator * other.numerator;
        int i = minnumden(result.numerator, result.denominator);
        result.numerator /= i;
        result.denominator /= i;
        return result;
    }
    public NDrob minus(NDrob other) {
        NDrob result = new NDrob();
        if (this.denominator == other.denominator) {
            result.numerator = this.numerator + other.numerator;
            result.denominator = this.denominator;
        } else {
            int resden = reduction(this.denominator, other.denominator);
            int resgo = resden / other.denominator;
            int resgo2 = resden / this.denominator;
            if (this.denominator == resden) {
                other.denominator *= resgo;
                other.numerator *= resgo;
            } else {
                this.denominator *= resgo2;
                this.numerator *= resgo2;
            }
            int a = minnumden(this.numerator - other.numerator, resden);
            result.numerator = (this.numerator - other.numerator) / a;
            result.denominator = resden / a;
        }
        return result;
    }



    public NDrob plus(NDrob other){
        NDrob result = new NDrob();
        if (this.denominator == other.denominator) {
            result.numerator = this.numerator + other.numerator;
            result.denominator = this.denominator;
        }
        else {
            int resden = reduction(this.denominator, other.denominator);
            int resgo = resden / other.denominator;
            int resgo2 = resden / this.denominator;
            if (this.denominator == resden) {
                other.denominator *= resgo;
                other.numerator *= resgo;
            }
            else {
                this.denominator *= resgo2;
                this.numerator *= resgo2;
            }
            int a = minnumden(this.numerator + other.numerator, resden);
            result.numerator = (this.numerator + other.numerator) / a;
            result.denominator = resden / a;
        }
        return result;
    }
    @Override
    public String toString() {
        return numerator + "\n-\n" + denominator;
    }
}
