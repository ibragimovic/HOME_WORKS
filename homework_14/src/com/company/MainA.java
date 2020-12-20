package com.company;

import org.w3c.dom.ls.LSOutput;

public class MainA {

    public static void main(String[] args) {
        //Task A
        Parrot parrot1 = new Parrot();
        parrot1.nickname = "Banucci";
        parrot1.isTalking = true;
        parrot1.species = "Eclectus";
        parrot1.age = 2;
        parrot1.color = "RED";
        System.out.println("Parrot # 1: \nnickname - " + parrot1.nickname +
                ",\nis it talking - " + parrot1.isTalking +
                ",\nspecies - " + parrot1.species +
                ",\nage - " + parrot1.age + ",\ncolor - " + parrot1.color);

        System.out.println();

        Parrot parrot2 = new Parrot();
        parrot2.nickname = "Teo";
        parrot2.isTalking = true;
        parrot2.species = "Sun Conure";
        parrot2.age = 3;
        parrot2.color = "Yellow";
        System.out.println("Parrot # 2: \nnickname - " + parrot2.nickname +
                ",\nis it talking - " + parrot2.isTalking +
                ",\nspecies - " + parrot2.species +
                ",\nage - " + parrot2.age + ",\ncolor - " + parrot2.color);
        System.out.println();

        Dog dog1 = new Dog();
        dog1.nickname = "Barbos";
        dog1.breed = "Airedale Terrier";
        dog1.age = 3;
        dog1.size = "Medium";
        dog1.haveFur = true;
        System.out.println("Dog #1:\nnickname - " + dog1.nickname +
                ",\nbreed - " + dog1.breed + ",\nage - " + dog1.age +
                ",\nsize - " + dog1.size + ",\ndoes it have fur - " + dog1.haveFur);

        System.out.println();

        Dog dog2 = new Dog();
        dog2.nickname = "Jolbors";
        dog2.breed = "Afador";
        dog2.age = 6;
        dog2.size = "Big";
        dog2.haveFur = true;
        System.out.println("Dog #2:\nnickname - " + dog2.nickname +
                ",\nbreed - " + dog2.breed + ",\nage - " + dog2.age +
                ",\nsize - " + dog2.size + ",\ndoes it have fur - " + dog2.haveFur);
        System.out.println();

        Cat cat1 = new Cat();
        cat1.nickname = "Musya";
        cat1.breed = "Abyssinian Cat";
        cat1.age = 2;
        cat1.color = "Yellow";
        cat1.haveFur = true;
        System.out.println("Cat #1:\nnickname - " + cat1.nickname + ",\nbreed - " + cat1.breed +
                ",\nage - " + cat1.age + ",\ncolor - " + cat1.color + "\ndoes it have fur - " + cat1.haveFur);

        System.out.println();

        Cat cat2 = new Cat();
        cat2.nickname = "Kisa";
        cat2.breed = "Burmese Cat";
        cat2.age = 4;
        cat2.color = "Black";
        cat2.haveFur = true;
        System.out.println("Cat #2:\nnickname - " + cat2.nickname + ",\nbreed - " + cat2.breed +
                ",\nage - " + cat2.age + ",\ncolor - " + cat2.color + "\ndoes it have fur - " + cat2.haveFur);

        System.out.println();

        Fish fish1 = new Fish();
        fish1.nickname = "Goldy";
        fish1.species = "Barramundy";
        fish1.age = 1;
        fish1.color = "Gold";
        fish1.isPredatory = false;
        System.out.println("Fish #1:\nnickname - " + fish1.nickname + ",\nspecies - " + fish1.species +
                ",\nage - " + fish1.age + ",\ncolor - " + fish1.color + ",\nis it predatory - " + fish1.isPredatory);

        System.out.println();

        Fish fish2 = new Fish();
        fish2.nickname = "Hunty";
        fish2.species = "Alligator Gar";
        fish2.age = 4;
        fish2.color = "Grey";
        fish2.isPredatory = true;
        System.out.println("Fish #2:\nnickname - " + fish2.nickname + ",\nspecies - " + fish2.species +
                ",\nage - " + fish2.age + ",\ncolor - " + fish2.color + ",\nis it predatory - " + fish2.isPredatory);

        //Task B





    }
}
