package ru.geekbrains.example.junit.annotation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestJUnit5Test {

    //простой пример теста
    @Test
    void myFirstTest() {
        assertEquals(2, 1 + 1);
    }

}