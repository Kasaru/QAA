package ru.geekbrains.main.site.at;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ru.geekbrains.main.site.at.basis.BasisTest;

import javax.swing.*;
import java.util.stream.Stream;

import static java.lang.Thread.sleep;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParametrizedTests extends BasisTest {

  static Stream<Arguments> stringProvider() {
    return Stream.of(
            Arguments.of("Курсы",0),
            Arguments.of("Вебинары",1),
            Arguments.of("Форум",2),
            Arguments.of("Блог",3),
            Arguments.of("Тесты",4),
            Arguments.of("Карьера",5));
  }

  @DisplayName("Параметризованные тесты")
  @ParameterizedTest(name = "Переход на страницу {0}")
  @MethodSource({"stringProvider"})
        void checkNavigation(String name, int numberButton) {

      driver.manage().window().maximize();
      driver.get("https://geekbrains.ru/career");
    String[] strings= {"[href=\"/courses\"]","[href=\"/events\"]","[href=\"/topics\"]","[href=\"/posts\"]","[href=\"/tests\"]", "[href=\"/career\"]"};
    WebElement buttonCourses = driver.findElement(By.cssSelector("[class*=\"main-page-hidden\"] "+strings[numberButton]));
    buttonCourses.click();
    WebElement headerPage = driver.findElement(By.cssSelector("[class=\"gb-header__title\"]"));
    Assertions.assertEquals(name, headerPage.getText());
        }
}
