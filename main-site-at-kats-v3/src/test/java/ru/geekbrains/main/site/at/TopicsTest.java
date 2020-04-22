package ru.geekbrains.main.site.at;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ru.geekbrains.main.site.at.basis.BasisTest;

public class TopicsTest extends BasisTest {

    @ParameterizedTest(name = "Переход на страницу {0}")
    @ValueSource(strings = "Форум")
    void checkTopics(String name) throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://geekbrains.ru/career");

        //Форум
        WebElement buttonTopics = driver.findElement(By.cssSelector("[class*=\"main-page-hidden\"] [href=\"/topics\"]"));
        buttonTopics.click();
        WebElement headerPageTopics = driver.findElement(By.cssSelector("[class=\"gb-header__title\"]"));
        Assertions.assertEquals(name, headerPageTopics.getText());
        WebElement buttonLogin = driver.findElement(By.cssSelector("[id=\"top-menu\"] [href=\"/login\"]"));
        WebElement buttonRegister = driver.findElement(By.cssSelector("[id=\"top-menu\"] [href=\"/register\"]"));
        WebElement buttonSearch = driver.findElement(By.cssSelector("[id=\"top-menu\"] [class=\"show-search-form\"] svg"));
        WebElement headerSearch = driver.findElement(By.cssSelector("[class*=\"gb-header__content\"]"));

        WebElement footerSearch = driver.findElement(By.cssSelector("[class*=\"site-footer\"]"));
        WebElement buttonFacebook = driver.findElement(By.cssSelector("[class*=\"facebook\"]"));
        WebElement buttonVK = driver.findElement(By.cssSelector("[class*=\"vk\"]"));
        WebElement buttonInstagram = driver.findElement(By.cssSelector("[class*=\"instagram\"]"));
        WebElement buttonYouTube = driver.findElement(By.cssSelector("[class*=\"youtube\"]"));
        WebElement buttonTelegram = driver.findElement(By.cssSelector("[class*=\"telegram\"]"));
        WebElement buttonSk = driver.findElement(By.cssSelector("[class*=\"sk\"]"));
        WebElement linkFeedbacks = driver.findElement(By.cssSelector("[href*=\"feedbacks\"]"));
        WebElement linkHelp = driver.findElement(By.cssSelector("[href*=\"zendesk\"]"));
        WebElement linkCompany = driver.findElement(By.cssSelector("[href*=\"company\"]"));
        WebElement linkLicense = driver.findElement(By.cssSelector("[href*=\"license\"]"));
        WebElement linkCareer = driver.findElement(By.cssSelector("[href*=\"career/682\"]"));
        WebElement linkForBusiness= driver.findElement(By.cssSelector("[href*=\"forbusiness\"]"));
        WebElement linkPhoneNumber= driver.findElement(By.cssSelector("[href*=\"tel:\"]"));



    }
}
