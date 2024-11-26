package com.example.test;
interface Moveable {
    void resize(float koeff);
    void move(float dx, float dy);
}



public abstract class Figure implements Moveable{
        float x;
        float y;
        public Figure() {
            x = 1;
            y = 1;
        }
        public Figure(float x, float y) {
            this.x = x;
            this.y = y;
        }
        abstract float getArea();
        abstract float getPerimeter();


        public String toString() {
            return super.toString();
        }
    }

    class Rectangle extends Figure{
        float height;
        float width;
        public Rectangle(float x, float y, float height, float width) {
            super(x, y);
            this.height = height;
            this.width = width;
        }
        public float getArea() {
            return height * width;
        }
        public float getPerimeter() {
            return 2 * (height + width);
        }
        public void resize(float koeff) {
            height *= koeff;
            width *= koeff;
        }
        public void move(float dx, float dy) {
            x += dx;
            y += dy;
        }

        @Override
        public String toString() {
            String s = "Rectangle" + "\n" + "Center: " + "(" + (x + height / 2) + ", " + (y + width / 2) + ")" + "\n" + "Height: " + height + "\n" + "Width: " + width;
            return s;
        }
    }


    class Circle extends Figure {
        float r;
        public Circle(float x, float y, float r) {
            super(x, y);
            this.r = r;
        }
        public float getArea() {
            return (float)(Math.PI * (r * r));
        }

        @Override
        public float getPerimeter() {
            return 2 * (float)(Math.PI * (r * r));
        }

        public void resize(float koeff) {
            r *= koeff;
        }
        public void move(float dx, float dy) {
            x += dx;
            y += dy;
        }

        @Override
        public String toString() {
            return "Circle" + "\n" + "Center: " + "(" + x + ", " + y + ")" + "\n" + "Radius: " + r;
        }
    }
