package com.example.test;

public class Person {
    public int age;
    public String name;
    public Person() {
        age = 0;
        name = "";
    }
    public Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String work() {
        return "None";
    }
    @Override
    public String toString() {
        return "(" + name + ", " + age + ")";
    }
}


class Employee extends Person {
    String company;
    public Employee(String name, int age, String company) {
        super(name, age);
        this.company = company;
    }
    @Override
    public String toString() {
        return "(" + name + ", " + age + ", " + company;
    }
    public String work() {
        return "Manager";
    }
}
