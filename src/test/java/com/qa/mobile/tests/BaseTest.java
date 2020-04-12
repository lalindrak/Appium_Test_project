package com.qa.mobile.tests;
import com.qa.mobile.pages.BasePage;
import com.qa.mobile.utils.Capabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class BaseTest {
    protected static AppiumDriver<MobileElement> driver;
    protected static BasePage basePage;

    @BeforeSuite
    public void setUp() throws MalformedURLException {
        driver = new AppiumDriver<MobileElement>(Capabilities.setUrl(), Capabilities.setCapabilities());
        basePage = new BasePage();
        basePage.setDriver(driver);
    }

    @AfterSuite
    public void tearDown(){
        driver.quit();
    }
}
