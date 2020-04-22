package ru.geekbrains.example.junit.assertion;

import org.junit.jupiter.api.Test;

import static java.lang.Thread.sleep;
import static java.time.Duration.*;
import static org.junit.jupiter.api.Assertions.*;

class AssertionsTest {

    @Test
    void standardAssertions() {
        assertEquals(2, 2);
        assertEquals(4, 4, "числа не равны");
    }

    @Test
    void groupedAssertions() {
        //В сгруппированной проверке все проверки выполняются, а любые сбои ошибки сообщаться вместе.
        assertAll("Пользователь",
                () -> assertEquals("Иван", "Петр"),
                () -> assertEquals("Иванов", "Васильев")
        );
    }

//    @Test
//    void dependentAssertions() {
//        // Within a code block, if an assertion fails the
//        // subsequent code in the same block will be skipped.
//        assertAll("properties",
//                () -> {
//                    String firstName = person.getFirstName();
//                    assertNotNull(firstName);
//
//                    // Executed only if the previous assertion is valid.
//                    assertAll("first name",
//                            () -> assertTrue(firstName.startsWith("J")),
//                            () -> assertTrue(firstName.endsWith("n"))
//                    );
//                },
//                () -> {
//                    // Grouped assertion, so processed independently
//                    // of results of first name assertions.
//                    String lastName = person.getLastName();
//                    assertNotNull(lastName);
//
//                    // Executed only if the previous assertion is valid.
//                    assertAll("last name",
//                            () -> assertTrue(lastName.startsWith("D")),
//                            () -> assertTrue(lastName.endsWith("e"))
//                    );
//                }
//        );
//    }

    @Test
    void exceptionTesting() {
        //проверка сообщения exception
        Throwable exception = new IllegalArgumentException("a message");
        assertEquals("a message", exception.getMessage());
    }

    @Test
    void timeoutNotExceeded() {
        // проверка времени выполнения теста
        assertTimeout(ofSeconds(1), () -> {
           sleep(3500);


        });
    }

    @Test
    void timeoutNotExceededWithResult() {
        // The following assertion succeeds, and returns the supplied object.
        String actualResult = assertTimeout(ofMinutes(2), () -> {
            return "a result";
        });
        assertEquals("a result", actualResult);
    }

    @Test
    void timeoutNotExceededWithMethod() {
        // The following assertion invokes a method reference and returns an object.
        String actualGreeting = assertTimeout(ofMinutes(2), AssertionsTest::greeting);
        assertEquals("hello world!", actualGreeting);
    }

    @Test
    void timeoutExceeded() {
        // The following assertion fails with an error message similar to:
        // execution exceeded timeout of 10 ms by 91 ms
        assertTimeout(ofMillis(10), () -> {
            // Simulate task that takes more than 10 ms.
            sleep(100);
        });
    }

    @Test
    void timeoutExceededWithPreemptiveTermination() {
        // The following assertion fails with an error message similar to:
        // execution timed out after 10 ms
        assertTimeoutPreemptively(ofMillis(10), () -> {
            // Simulate task that takes more than 10 ms.
            sleep(100);
        });
    }

    private static String greeting() {
        return "hello world!";
    }

}
