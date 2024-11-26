package com.example.test;

interface Liveable{
    String breath();
    String feed();
}
public abstract class Animal implements Liveable{
    public String className() {
        return "Animal";
    }
        public abstract String move();
}
class Fish extends Animal implements Liveable{
    @Override
    public String className() {return "Fish";}


    @Override
    public String move() {
        return "Swimming";
    }

    @Override
    public String breath() {
        return "Dissolved oxygen";
    }

    @Override
    public String feed() {
        return "Plancton";
    }
}
class Bird extends Animal {
    @Override
    public String className() {return "Bird";}

    @Override
    public String move() {
        return "Flying";
    }

    @Override
    public String breath() {
        return "Oxygen";
    }

    @Override
    public String feed() {
        return "Insects";
    }
}
class Carp extends Fish {
    @Override
    public String className() {return "Carp";}
}
class Pike extends Fish {
    @Override
    public String className() {return "Pike";}
}
class Eagle extends Bird {
    @Override
    public String className() {return "Eagle";}
}
class Sparrow extends Bird {
    //@Override
    //public String className() {return "Sparrow";}
}


interface Life