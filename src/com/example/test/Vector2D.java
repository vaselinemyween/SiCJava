package com.example.test;

import java.util.Locale;

public class Vector2D {
    public double X;
    public double Y;
    static int count;
    public Vector2D() {
        X = 1;
        Y = 1;
        count++;
    }
    public Vector2D(double vX, double vY) {
        X = vX;
        Y = vY;
        count++;
    }
    public Vector2D(Vector2D other) {
        //Vector2D result = new Vector2D();
        X = other.X;
        Y = other.Y;
        count++;
    }
    public void scale(double scaleFactor) {
        X *= scaleFactor;
        Y *= scaleFactor;
    }
    public void add(Vector2D other) {
        X += other.X;
        Y += other.Y;
    }
    public void sub(Vector2D other) {
        X -= other.X;
        Y -= other.Y;
    }
    public double length() {
        double len = Math.sqrt(Math.pow(this.X, 2) + Math.pow(this.Y, 2));
        return len;
    }
    public double dotProduct(Vector2D other) {
        return other.X + other.Y;
    }
    public double normalized() {
        this.X = 1;
        this.Y = 0;
        return 1;
    }
    public void print() {
        String x = (String.format(Locale.US,"%.2f", X));
        String y = (String.format(Locale.US,"%.2f", Y));
        System.out.println("(" + x + ", " + y + ")");
    }
}
