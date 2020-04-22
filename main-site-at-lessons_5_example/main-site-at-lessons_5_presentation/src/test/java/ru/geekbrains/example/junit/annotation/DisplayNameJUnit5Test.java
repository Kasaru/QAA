package ru.geekbrains.example.junit.annotation;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@DisplayName("Тестовый набор")
class DisplayNameJUnit5Test {

    @Test
    @DisplayName("Имя пользовательского теста, содержащее пробелы")
    void testWithDisplayNameContainingSpaces() {
    }

    @Test
    @DisplayName("╯°□°）╯")
    void testWithDisplayNameContainingSpecialCharacters() {
    }

    @Test
    @DisplayName("😱")
    void testWithDisplayNameContainingEmoji() {
    }


    //-------------------Пример с передачей 2х аргументов из метода
    @DisplayName("Отображение текста параметров")
    @ParameterizedTest(name = "{index} ==> {0} найдено в количестве:{1}")
    @MethodSource("stringAndIntProvider")
    void testWithMultiArgMethodSource(String type, int count) {
        assertNotNull(type);
        assertNotEquals(0, count);
    }

    static Stream<Arguments> stringAndIntProvider() {
        return Stream.of(Arguments.of("Курсов", 150), Arguments.of("Вебинаров", 290));
    }

}