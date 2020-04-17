package ru.geekbrains.main.site.at;

import org.hamcrest.Matcher;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.geekbrains.main.site.at.basis.BasisTest;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class SearchTest extends BasisTest {
//    Перейти на сайт https://geekbrains.ru/courses
//    Нажать на кнопку Поиск
//    В поле Поиск ввести текст: java
//    Проверить что отобразились блоки:
//            Профессии
//            Курсы
//            Вебинары
//            Блоги
//            Форум
//            Тесты
//            Проекты и компании

    @Test
    public void name() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://geekbrains.ru/career");

        WebElement buttonSearch = driver.findElement(By.cssSelector("[id=\"top-menu\"] [class=\"show-search-form\"] svg"));
        buttonSearch.click();

        WebElement inputSearch = driver.findElement(By.cssSelector("input[class=\"search-panel__search-field\"]"));
        inputSearch.sendKeys("java");


        WebElement textProfession = driver.findElement(By.xpath("//header/h2[text()='Профессии']"));
        String quantityProfession = driver.findElement(By.xpath("//div[@class=\"container\"]/ul/li/a[@data-tab=\"professions\"]/span[text()]")).getText();
        assertThat(Integer.parseInt(quantityProfession),greaterThanOrEqualTo(2));

        WebElement textCourses = driver.findElement(By.xpath("//header/h2[text()='Курсы']"));
        String quantityCourses = driver.findElement(By.xpath("//div[@class=\"container\"]/ul/li/a[@data-tab=\"courses\"]/span")).getText();
        assertThat(Integer.parseInt(quantityCourses),greaterThan(15));

        WebElement textWebinars = driver.findElement(By.xpath("//header/h2[text()='Вебинары']"));
        String quantityWebinars = driver.findElement(By.xpath("//div[@class=\"container\"]/ul/li/a[@data-tab=\"webinars\"]/span")).getText();
        assertThat(Integer.parseInt(quantityWebinars),allOf(greaterThan(180),lessThan(300)));

        WebElement textBlogs = driver.findElement(By.xpath("//header/h2[text()='Блоги']"));
        String quantityBlogs = driver.findElement(By.xpath("//div[@class=\"container\"]/ul/li/a[@data-tab=\"blogs\"]/span")).getText();
        assertThat(Integer.parseInt(quantityBlogs),greaterThan(300));

        WebElement textForum = driver.findElement(By.xpath("//header/h2[text()='Форум']"));
        String quantityForum = driver.findElement(By.xpath("//div[@class=\"container\"]/ul/li/a[@data-tab=\"forums\"]/span")).getText();
        assertThat(Integer.parseInt(quantityBlogs),not(equalTo(350)));

        WebElement textTests = driver.findElement(By.xpath("//header/h2[text()='Тесты']"));
        String quantityTests = driver.findElement(By.xpath("//div[@class=\"container\"]/ul/li/a[@data-tab=\"tests\"]/span")).getText();
        assertThat(Integer.parseInt(quantityTests),not(equalTo(0)));

        WebElement textProjectsAndCompanies = driver.findElement(By.xpath("//header/h2[text()='Проекты и компании']"));
        WebElement textGeekProjectsAndCompanies = driver.findElement(By.cssSelector("[class*=\"company-item\"] [href*=\"682\"]"));
        //assertThat(textGeekProjectsAndCompanies.getText(),containsStringIgnoringCase("GeekBrains"));

        WebDriverWait wait = new WebDriverWait(driver, 40);

        wait.until(ExpectedConditions.textToBePresentInElement(textProfession,"Профессии"));
        wait.until(ExpectedConditions.textToBePresentInElement(textCourses,"Курсы"));
        wait.until(ExpectedConditions.textToBePresentInElement(textWebinars,"Вебинары"));
        wait.until(ExpectedConditions.textToBePresentInElement(textBlogs,"Блоги"));
        wait.until(ExpectedConditions.textToBePresentInElement(textForum,"Форум"));
        wait.until(ExpectedConditions.textToBePresentInElement(textTests,"Тесты"));
        wait.until(ExpectedConditions.textToBePresentInElement(textProjectsAndCompanies,"Проекты и компании"));

    }
}