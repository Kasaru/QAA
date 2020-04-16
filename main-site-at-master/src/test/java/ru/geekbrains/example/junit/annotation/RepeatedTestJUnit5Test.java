package ru.geekbrains.example.junit.annotation;

import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RepeatedTestJUnit5Test {

    //количество повторений
    @RepeatedTest(10)
    void myFirstTest() {
        assertEquals(2, 1 + 1);
    }

}