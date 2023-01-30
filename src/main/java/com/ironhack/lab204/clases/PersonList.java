package com.ironhack.lab204.clases;

import java.util.ArrayList;
import java.util.List;

public class PersonList {
    private List<Person> personList;
    public PersonList(){
        personList=new ArrayList<Person>();
    }
    public void addPerson(Person person) {
        personList.add(person);
    }

    public Person findByName(String name){
        Person find = null;
        if (name.contains("") || name.contains(".")|| name.contains("-")|| name.contains(",")){
         throw new IllegalArgumentException("Name must be in format firstname lastname");
        } else if (find==null) {
            throw new NullPointerException("Name doesn't found");
        } else{
            for (Person person : personList) {
                find = person.getName().equals(name) ? person : find;
            }
        }
        return find;
    }
    public Person clone(Person person){
        Person clon=new Person(person.getAge(),person.getName(), person.getOccupation());
        return clon;
    }



    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }
}
