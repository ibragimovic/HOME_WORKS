package com.company;

public class Cat {
    String nickname;
    String breed;
    int age;
    String color;
    boolean haveFur;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
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

    public boolean isHaveFur() {
        return haveFur;
    }

    public void setHaveFur(boolean haveFur) {
        this.haveFur = haveFur;
    }
}
