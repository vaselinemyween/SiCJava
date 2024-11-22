package com.example.test;

public class InherritExample {
    int x;
    public InherritExample(int x){
        this.x = x;
    }

    @Override
    public String toString() {
        return "Number: " + x;
    }
}
// пример для наследования
class OtherClass extends InherritExample {
    public OtherClass(int x) {
        super(x);
    }
}