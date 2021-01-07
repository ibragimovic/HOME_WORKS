package com.company;

import java.time.LocalDate;

public class Human {
    String name;
    String surname;
    String patronymic;
    int dateOfBirth;
    String hobby;
    char gender;

    public Human (){}

    public Human (String name, String surname, String patronymic, int dateOfBirth, String hobby, char gender){
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
        this.hobby = hobby;
        this.gender = gender;
    }

    public Human (String name, String surname, String patronymic, int dateOfBirth, char gender){
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
    }

    public void printInfo(){

        if (hobby != null){
            System.out.println("My name is " + this.name + ", surname is " + this.surname + ", patronymic is " + this.patronymic
                    + ".\n I am " + (LocalDate.now().getYear() - dateOfBirth) + " years old." + " My hobby is " + this.hobby + " and I am " + this.gender + ".");
        }else {
            System.out.println("My name is " + this.name + ", surname is " + this.surname + ", patronymic is " + this.patronymic
                    + ".\n I am " + (LocalDate.now().getYear() - dateOfBirth) + " years old and I am " + this.gender + ".");
        }
    }



    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return  name;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public String getSurname(){
        return  surname;
    }

    public void setPatronymic(String patronymic){
        this.patronymic = patronymic;
    }

    public String getPatronymic(){
        return patronymic;
    }

    public void setDateOfBirth(int dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }

    public int getDateOfBirth(){
        return dateOfBirth;
    }

    public void setHobby(String hobby){
        this.hobby = hobby;
    }

    public String getHobby(){
        return hobby;
    }

    public void setGender(char gender){
        this.gender = gender;
    }

    public char getGender(){
        return gender;
    }

}
