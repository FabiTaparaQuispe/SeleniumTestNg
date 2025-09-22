package com.orange;

import org.testng.annotations.*;

public class TestNGTest {
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("1. Before Suite");

    }
    @BeforeTest
    public void beforeTest() {
        System.out.println("2. Before Test");
    }
    @BeforeClass
    public void beforeClass() {
        System.out.println("3. Before Class");
    }
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("4. Before Method");
    }

    @Test(dataProvider = "dp")
    public void f(Integer n, String s)
        {
            System.out.println("Number" + n +"letter" + s);
        }
    @DataProvider
    public Object[][] dp() {
        return new Object[][] {
                new Object[] {1, "a"},
                new Object[] {2, "b"}
        };
    }
    @AfterMethod
    public void afterMethod() {
        System.out.println("5. After Method");
    }


    @AfterClass
    public void afterClass() {
        System.out.println("6. After Class");
    }


    @AfterTest
    public void afterTest() {
        System.out.println("7. After Test");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("8. After Suite");
    }
}
