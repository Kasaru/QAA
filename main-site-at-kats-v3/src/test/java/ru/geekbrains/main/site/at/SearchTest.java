package ru.geekbrains.main.site.at;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.support.PageFactory;
import ru.geekbrains.main.site.at.basis.BasisTest;

public class SearchTest extends BasisTest {

    @Test
    @ValueSource(strings = "java")
     void name(String input) throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://geekbrains.ru/career");

        PageFactory.initElements(driver, Block.class)
               .Waiting();



    }
}