package ru.stqa.swd.litecart.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class OpenPageTests {
    private WebDriver wd;

    @BeforeMethod
    public void setUp() throws Exception {
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    public void testOpenPage() throws Exception {
        wd.get("http://localhost/litecart/admin/login.php");
    }

    @AfterMethod
    public void tearDown () {
        wd.quit();
    }

}
