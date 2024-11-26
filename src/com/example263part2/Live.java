package com.example263part2;

abstract class Live {
    public String name;
    public final void feed() {}
    public abstract void reproduction();
}

class Animal extends Live {
    @Override
    public void reproduction() {}
    public void move() {};
}

abstract class Vegetable {
    public String name;
    public final void cultivate() {}
    public abstract void harvest();
}

class Potato {
    public void harvest() {}
    public void debug() {}

}
