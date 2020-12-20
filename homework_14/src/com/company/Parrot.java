package com.company;

public class Parrot {
    String nickname;
    boolean isTalking;
    String species;
    int age;
    String color;

    public Parrot(){}

    public Parrot(String nickname, boolean isTalking, String species, int age, String color){
        this.nickname = nickname;
        this.isTalking = isTalking;
        this.species = species;
        this.age = age;
        this.color = color;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public boolean isTalking() {
        return isTalking;
    }

    public void setTalking(boolean talking) {
        isTalking = talking;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (this.age > 0){
            this.age = age;
            return;
        }
        return;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
