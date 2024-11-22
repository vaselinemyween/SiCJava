package com.example.test;

public class App {
    public static void main(String[] args) {
        OtherClass otherClass = new OtherClass(34);
        System.out.println(otherClass.x);
        // иллюстрация того, что наследник взял функцию у родителя.
        System.out.println(otherClass);
    }
}
