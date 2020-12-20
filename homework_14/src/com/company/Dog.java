package com.company;

public class Dog {
    String nickname;
    String breed;
    int age;
    String size;
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

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public boolean isHaveFur() {
        return haveFur;
    }

    public void setHaveFur(boolean haveFur) {
        this.haveFur = haveFur;
    }
}
