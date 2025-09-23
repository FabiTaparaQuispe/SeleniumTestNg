package com.orange.utils;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {
        public WebDriver driver;
        @BeforeMethod
        public void setup() {
            System.out.println("9. Before Method");
            driver = new FirefoxDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().setSize(new Dimension(1200, 940));
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        }
        @AfterMethod
        public void tearDown() {
            if(driver != null) {
                driver.quit();
            }

        }
}
