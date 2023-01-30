package com.ironhack.lab204.clases;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    Person person1;
    @BeforeEach
    void init(){
        person1 = new Person(2343, "xavi", 23, "student");
    }

    @Test
    @DisplayName("Comprobar que la edad funciona")
    void setAge_isCorrect() {
        person1.setAge(10);
        assertEquals(10,person1.getAge());
    }

    @Test
    @DisplayName("Comprobar que la edad no es menor de 0")
    void setAge_moreThan0(){
        assertThrows(IllegalArgumentException.class, ()-> person1.setAge(-1));
    }

}