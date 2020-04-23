package ru.geekbrains.main.site.at;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class Search {

    @FindBy(xpath = "//div[@class=\"container\"]/ul/li/a[@data-tab=\"professions\"]/span[text()]")
    private WebElement quantityProfession;
    @FindBy(xpath = "//div[@class=\"container\"]/ul/li/a[@data-tab=\"professions\"]/span[text()]")
    private WebElement quantityCourses;
    @FindBy(xpath = "//div[@class=\"container\"]/ul/li/a[@data-tab=\"professions\"]/span[text()]")
    private WebElement quantityWebinars;
    @FindBy(xpath = "//div[@class=\"container\"]/ul/li/a[@data-tab=\"professions\"]/span[text()]")
    private WebElement quantityBlogs;
    @FindBy(xpath = "//div[@class=\"container\"]/ul/li/a[@data-tab=\"professions\"]/span[text()]")
    private WebElement quantityForums;
    @FindBy(xpath = "//div[@class=\"container\"]/ul/li/a[@data-tab=\"professions\"]/span[text()]")
    private WebElement quantityTests;

    public void QuantityAssert() {
    assertThat(Integer.parseInt(quantityProfession.getText()), greaterThanOrEqualTo(2));
    assertThat(Integer.parseInt(quantityCourses.getText()), greaterThan(15));
    assertThat(Integer.parseInt(quantityWebinars.getText()), allOf(greaterThan(180), lessThan(300)));
    assertThat(Integer.parseInt(quantityBlogs.getText()), greaterThan(300));
    assertThat(Integer.parseInt(quantityForums.getText()), not(equalTo(350)));
    assertThat(Integer.parseInt(quantityTests.getText()), not(equalTo(0)));
    }

}

