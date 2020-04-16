package ru.geekbrains.example.junit.hamcrest.number;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class HamcrestTest {

//    Число больше 5
//    Число меньше или равно 7
    @Test
    public void givenNumber_whenConditions_thenCorrect() {
        Integer intVal = 6;
        assertThat(intVal, allOf(
                greaterThan(5),
                lessThanOrEqualTo(7))
        );
    }

//    Допустим, надо убедиться, что заданное число равно 7.7 с погрешностью 0.005.
    @Test
    public void givenDouble_whenCompare_thenCorrect() {
        Double doubleVal = 7.70001;
        assertThat(doubleVal, closeTo(7.7, 0.005));
    }
}