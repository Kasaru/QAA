package ru.geekbrains.example.junit.annotation;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static java.lang.Thread.sleep;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TimeoutTest {

    @Timeout(1)
    @Test()
    void myFirstTest() throws InterruptedException {
        sleep(1000);
        assertEquals(2, 1 + 1);
    }
}
