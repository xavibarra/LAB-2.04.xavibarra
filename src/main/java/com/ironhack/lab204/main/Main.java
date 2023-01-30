package com.ironhack.lab204.main;

import com.ironhack.lab204.clases.Person;


public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Person person = new Person(23, "Pedro", -10, "Buyer");
        System.out.println(person.getAge());
        System.out.println("Hello world2!");

    }
}