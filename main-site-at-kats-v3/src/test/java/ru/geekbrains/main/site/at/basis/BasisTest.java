package ru.geekbrains.main.site.at.basis;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class BasisTest {
        protected static WebDriver driver;

        @BeforeEach
        void setUp() {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");


            ChromeOptions options  = new ChromeOptions();
            options.addArguments("--disable-popup-blocking");
            options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
            driver = new ChromeDriver(options);

            driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        }

        @AfterEach
        void tearDown() {
            driver.quit();
        }
}