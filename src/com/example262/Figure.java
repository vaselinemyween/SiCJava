package com.example262;
class Figure {
    double x;
    double y;
    public Figure() {
        x = 1;
        y = 1;
    }
    public Figure(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getArea(){
        double area;
        if (this.x == this.y) {
            area = Math.pow(x, 2);
        }
        else {
            area = x * y;
        }
        return area;
    }
    public double getPerimeter() {
        double perimeter;
        if (x == y) {
            perimeter = 4 * x;
        }
        else {
            perimeter = 2 * (x + y);
        }
        return perimeter;
        }
    public void move(double dx, double dy) {
        x += dx;
        y += dy;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

class Rectangle extends Figure {
    double height;
    double width;
    public Rectangle(double x, double y, double height, double width) {
        super(x, y);
        this.height = height;
        this.width = width;
    }
    public double getArea() {
        return height * width;
    }
    public double getPerimeter() {
        return 2 * (height + width);
    }
    public void resize(double koeff) {
        height *= koeff;
        width *= koeff;
    }


    public String toString() {
        String s = "Rectangle" + "\n" + "Center: " + "(" + (x + height / 2) + ", " + (y + width / 2) + ")" + "\n" + "Height: " + height + "\n" + "Width: " + width;
        return s;
    }
}


class Circle extends Figure {
    double r;
    public Circle(double x, double y, double r) {
        super(x, y);
        this.r = r;
    }
    public double getArea() {
        return 3.1415927 * Math.pow(r, 2);
    }
    public void resize(double koeff) {
        r *= koeff;
    }


    public String toString() {
        return "Circle" + "\n" + "Center: " + "(" + x + ", " + y + ")" + "\n" + "Radius: " + r;
    }
}

class Moveable extends Figure {
    public void move(double dx, double dy) {
        x += dx;
        y += dy;
    }
}