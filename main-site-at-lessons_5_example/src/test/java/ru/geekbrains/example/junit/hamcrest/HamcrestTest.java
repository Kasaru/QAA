package ru.geekbrains.example.junit.hamcrest;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class HamcrestTest {

    @Test
    public void givenString_whenConditions_thenCorrect() {
        String string = "Вебинары";
        assertThat(string, anyOf(containsString("ин"), endsWith("ры")));
    }

    @Test
    public void givenNumber_whenConditions_thenCorrect() {
        Integer intVal = 7;
        assertThat(intVal, allOf(greaterThan(5), lessThanOrEqualTo(7), not(equalTo(6))));
    }

    @Test
    public void whenNotNull_thenCorrect() {
        String str = new String();
        assertThat(str, notNullValue());
    }

    @Test
    public void whenSameObject_thenCorrect() {
        Object object = new String();
        assertThat(object, sameInstance(object));
    }
}