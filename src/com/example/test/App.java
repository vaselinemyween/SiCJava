package com.example.test;

public class App {

    public static Animal randomAnimal() {
        int rand = (int) (Math.random() * 7);
        switch (rand) {
            //case 0: return new Animal();
            case 0:
                return new Bird();
            case 1:
                return new Fish();
            case 2:
                return new Pike();
            case 3:
                return new Carp();
            case 4:
                return new Eagle();
            case 5:
                return new Sparrow();
            default:
                return null;
        }
    }

    public static void main(String[] args) {
//        Animal a = new Animal() {
//            @Override
//            public String move() {
//                return "";
//            }
//        }
        Bird b = new Bird();
        Fish f = new Fish();
        Pike p = new Pike();
        Carp c = new Carp();
        Eagle e = new Eagle();
        Sparrow s = new Sparrow();
        //Animal[] animals = {a, b, f, p, c, e, s};
        Animal[] animals = new Animal[13];
        for (int i = 0; i < animals.length; i++) {
            animals[i] = randomAnimal();
        }
        for (Animal an : animals) {
            System.out.println(an.className());
        }
    }
}
