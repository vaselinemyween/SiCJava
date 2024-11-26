package com.example263;

public class Pet {
    public String name;
    public void say() {System.out.println("a");}
    public void move() {}}

class Dog extends Pet {
    public void say() {}
    public void walk() {}
}


class Time {
    int hour, min;
    public Time() {hour = 0; min = 0;}
    public Time(int min) {
        for (int i = 0; i < min; i++) {
            this.min += 1;
            if (this.min == 60) {
                this.min -= 60;
                this.hour += 1;
            }
        }
    }
    public String toString() {
        return hour + ":" + min;
    }
}



class Point {
    float x, y;
    Point(float x, float y) {
        this.x = x;
        this.y = y;
    }
}

class GraphPoint extends Point {
    public GraphPoint(float x, float y) {
        super(x, y);
    }
    void draw() {
        /*....*/
    }
}
class Polygon {
    float[] x, y;
    public Polygon(float[] x, float[] y) {/*...*/}
    public Polygon(Polygon other) {
        x = other.x;
        y = other.y;
    }
    public void draw() {/*...*/}
    public void rotate(float deg) {/*...*/}
}
