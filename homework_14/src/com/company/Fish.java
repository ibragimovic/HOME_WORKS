package com.company;

public class Fish {
    String nickname;
    String species;
    int age;
    String color;
    boolean isPredatory;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
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

    public boolean isPredatory() {
        return isPredatory;
    }

    public void setPredatory(boolean predatory) {
        isPredatory = predatory;
    }
}
