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


  @DisplayName("Параметризованные тесты")
  @ParameterizedTest(name = "Переход на страницу {0}")
  @ValueSource (strings = {"Курсы","Вебинары","Форум","Блог","Тесты","Карьера"})
        void checkNavigation(String name) throws InterruptedException {

      driver.manage().window().maximize();
      driver.get("https://geekbrains.ru/career");

      //Курсы
        WebElement buttonCourses = driver.findElement(By.cssSelector("[class*=\"main-page-hidden\"] [href=\"/courses\"]"));
        buttonCourses.click();
        WebElement headerPageCourses = driver.findElement(By.cssSelector("[class=\"gb-header__title\"]"));
        Assertions.assertEquals(name, headerPageCourses.getText());
        driver.findElement(By.cssSelector("div button svg[class=\"svg-icon icon-popup-close-button \"]")).click();


        //Вебинары
        WebElement buttonEvents = driver.findElement(By.cssSelector("[class*=\"main-page-hidden\"] [href=\"/events\"]"));
        buttonEvents.click();
        WebElement headerPageEvents = driver.findElement(By.cssSelector("[class=\"gb-header__title\"]"));
        Assertions.assertEquals(name, headerPageEvents.getText());

        //Форум
        WebElement buttonTopics = driver.findElement(By.cssSelector("[class*=\"main-page-hidden\"] [href=\"/topics\"]"));
        buttonTopics.click();
        WebElement headerPageTopics = driver.findElement(By.cssSelector("[class=\"gb-header__title\"]"));
        Assertions.assertEquals(name, headerPageTopics.getText());

        //Блог
//        href="/posts"
        WebElement buttonPosts = driver.findElement(By.cssSelector("[class*=\"main-page-hidden\"] [href=\"/posts\"]"));
        buttonPosts.click();
        WebElement headerPagePosts = driver.findElement(By.cssSelector("[class=\"gb-header__title\"]"));
        Assertions.assertEquals(name, headerPagePosts.getText());

        //Тесты
//        href="/tests"
        WebElement buttonTests = driver.findElement(By.cssSelector("[class*=\"main-page-hidden\"] [href=\"/tests\"]"));
        buttonTests.click();
        WebElement headerPageTests = driver.findElement(By.cssSelector("[class=\"gb-header__title\"]"));
        Assertions.assertEquals(name, headerPageTests.getText());

        //Карьера
//        href="/career"
        WebElement buttonCareer = driver.findElement(By.cssSelector("[class*=\"main-page-hidden\"] [href=\"/career\"]"));
        buttonCareer.click();
        WebElement headerPageCareer = driver.findElement(By.cssSelector("[class=\"gb-header__title\"]"));
        Assertions.assertEquals(name, headerPageCareer.getText());

//
    }
}
