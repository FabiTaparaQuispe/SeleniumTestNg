package com.orange.tests;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class BaseTest {
    public WebDriver driver;

    @Before
    public void setup() {
        System.out.println("9. Before Method");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().setSize(new Dimension(1200, 940));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

    }
    @After
    public void tearDown() {
        if(driver != null) {
            driver.quit();
        }

    }
}
