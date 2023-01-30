package com.ironhack.lab204.clases;

public class Person {
    private double id;
    private String name, occupation;
    private int age;


    public Person(double id, String name, int age, String occupation) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.occupation = occupation;
    }

    public Person(int age, String name, String occupation) {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<0){
            System.err.println("La edad no puede ser inferior a 0");
            throw new IllegalArgumentException();
        }else{
            this.age=age;
        }
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;

    }


}

