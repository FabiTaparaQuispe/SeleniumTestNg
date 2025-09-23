package com.orange.tests;

import com.orange.utils.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginDPTest extends BaseTest {
    @Test (dataProvider = "dataLogin")

    public void doLogin(String user, String password, String message){
        driver.findElement(By.name("username")).sendKeys(user);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).submit();

        //assertion
        WebElement lblDash = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6")));
        Assert.assertEquals(lblDash.getText(), "Dashboard");
    }
    @DataProvider
    public Object[][] dataLogin() {
        return new Object[][] {
                new Object[] {"Admin", "admin123", "Dashboard"},
                new Object[] {"Admin", "admin321", "Invalid Credentials"},
                new Object[] {"Admin2", "admin321", "Invalid Credentials" },
        };
    }
}
