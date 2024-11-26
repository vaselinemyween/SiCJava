package com.example.test;

import java.awt.*;

public class PointToPlane {
    double x, y;
    public PointToPlane() {
        x = 0;
        y = 0;
    }
    public PointToPlane(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double pointdistopoint(PointToPlane other) {
        double result = 0;
        if (this.x > other.x && this.y > other.y) {
            result = Math.sqrt((Math.pow(this.x, 2) - Math.pow(other.x, 2)) + (Math.pow(this.y, 2) - Math.pow(other.y, 2)));
        }
        else if (other.x > this.x && other.y > this.y) {
            result = Math.sqrt((Math.pow(other.x, 2) - Math.pow(this.x, 2)) + (Math.pow(other.y, 2) - Math.pow(this.y, 2)));
        }
        else if (this.x > other.x && this.y < other.y) {
            result = Math.sqrt((Math.pow(this.x, 2) - Math.pow(other.x, 2)) + (Math.pow(other.y, 2) - Math.pow(this.y, 2)));
        }
        else if (other.x > this.x && this.y > other.y) {
            result = Math.sqrt((Math.pow(other.x, 2) - Math.pow(this.x, 2)) + (Math.pow(this.y, 2) - Math.pow(other.y, 2)));
        }
        return result;
    }
    public void move(double dx, double dy) {
        x = dx;
        y = dy;
    }
    public boolean equivalence(PointToPlane other) {
        return this.x == other.x && this.y == other.y;
    }
    public void add(PointToPlane other) {
        x += other.x;
        y += other.y;
    }
    public void minus(PointToPlane other) {
        x -= other.x;
        y -= other.x;
    }
    public void rotate(double angle) {
        double rad = Math.toRadians(angle);
        x = x * Math.cos(rad) - y * Math.sin(rad);
        y = x * Math.sin(rad) + y * Math.cos(rad);
    }
    public void multyscale(double scale) {
        x *= scale;
        y *= scale;
    }
    public double isOnLine(double a, double b, double c) {
        if (a * x + b * y + c == 0)
            return 1;
        else
            return 0;
    }
    public PointToPlane midpoint(PointToPlane other) {
        PointToPlane result = new PointToPlane();
        result.x = (this.x + other.x) / 2;
        result.y = (this.y + other.y) / 2;
        return result;
    }
    public void reflectx() {
        x *= -1;
    }
    public void reflecty() {
        y *= -1;
    }
    public void reflectxy() {
        x *= -1;
        y *= -1;
    }
    public void divscale(double scale) {
        x /= scale;
        y /= scale;
    }
    public double lenpointfrombegin() {
        return Math.sqrt(Math.pow((x + y), 2));
    }
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
