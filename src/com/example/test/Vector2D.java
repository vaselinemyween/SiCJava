package com.example.test;

import java.util.Locale;

public class Vector2D {
    public double X;
    public double Y;
    public Vector2D() {
        X = 1;
        Y = 1;
    }
    public Vector2D(double vX, double vY) {
        X = vX;
        Y = vY;
    }
    public Vector2D(Vector2D other) {
        //Vector2D result = new Vector2D();
        X = other.X;
        Y = other.Y;
    }
    public void length(Vector2D other) {
        
    }
    public void print() {
        String x = (String.format(Locale.US,"%.2f", X));
        String y = (String.format(Locale.US,"%.2f", Y));
        System.out.println("(" + x + ", " + y + ")");
    }
}
