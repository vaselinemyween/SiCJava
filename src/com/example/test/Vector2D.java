package com.example.test;

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
    public Vector2D Vector2D(Vector2D other) {
        Vector2D result = new Vector2D();
        result.X = other.X;
        result.Y = other.Y;
        return result;
    }
    
}
