package ru.geekbrains.main.site.at;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.support.PageFactory;
import ru.geekbrains.main.site.at.basis.BasisTest;

public class SearchTest extends BasisTest {
    @DisplayName("Тест поиска")
    @ParameterizedTest
    @ValueSource(strings = "java")
     void checkSearch(String input){
        driver.manage().window().maximize();
        driver.get("https://geekbrains.ru/career");

        PageFactory.initElements(driver, Search.class)
               .inputSearch(input).getBlock().Waiting().QuantityAssert();



    }
}