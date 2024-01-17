package ru.stqa.swd.litecart.tests;

import org.openqa.selenium.remote.Browser;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import ru.stqa.swd.litecart.appmanager.ApplicationManager;

public class TestBase {

    protected static final ApplicationManager app = new ApplicationManager(Browser.FIREFOX);

    @BeforeSuite
    public void setUp () throws Exception {
        app.init();
    }

    @AfterSuite
    public void tearDown () {
        app.stop();
    }

}
