package ru.geekbrains.main.site.at;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.equalTo;

public class Block {
    @FindBy(xpath = "//header/h2[text()='Профессии']")
     WebElement textProfession;

    @FindBy(xpath = "//header/h2[text()='Курсы']")
    WebElement textCourses;

    @FindBy(xpath = "//header/h2[text()='Вебинары']")
    WebElement textWebinars;

    @FindBy(xpath = "//header/h2[text()='Блоги']")
    WebElement textBlogs;

    @FindBy(xpath = "//header/h2[text()='Форум']")
    WebElement textForum;

    @FindBy(xpath = "//header/h2[text()='Тесты']")
    WebElement textTests;

    @FindBy(xpath = "//header/h2[text()='Проекты и компании']")
    WebElement textProjectsAndCompanies;

    @FindBy(css = "[class*=\"company-item\"] [href*=\"682\"]")
    WebElement textGeekProjectsAndCompanies;


    private WebDriver driver;
    public Block(WebDriver driver) {
        this.driver = driver;
    }

    public Search Waiting() {
        WebDriverWait wait = new WebDriverWait(driver, 40);
        wait.until(ExpectedConditions.textToBePresentInElement(textProfession, "Профессии"));
        wait.until(ExpectedConditions.textToBePresentInElement(textCourses, "Курсы"));
        wait.until(ExpectedConditions.textToBePresentInElement(textWebinars, "Вебинары"));
        wait.until(ExpectedConditions.textToBePresentInElement(textBlogs, "Блоги"));
        wait.until(ExpectedConditions.textToBePresentInElement(textForum, "Форум"));
        wait.until(ExpectedConditions.textToBePresentInElement(textTests, "Тесты"));
        wait.until(ExpectedConditions.textToBePresentInElement(textProjectsAndCompanies, "Проекты и компании"));
        return PageFactory.initElements(driver, Search.class);
    }


}
