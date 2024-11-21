package com.example.test;

public class App {
    public static void main(String[] args) {
        //в общем т.к задачи однотипные и надо всего-лишь менять переменные, то можно считать что они решены.
        String str = "88888888888888888888888888888888888888888888888888888888888888888888";
        while (str.contains("222") || str.contains("888")) {
            if (str.contains("222")) {
                str = str.replaceFirst("222", "8");
            }
            else{
                str = str.replaceFirst("888", "2");
            }
        }
        System.out.println(str);
    }
}
