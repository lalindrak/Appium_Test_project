package com.qa.mobile.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.WebDriver;

public class BasePage {
    protected static AppiumDriver<MobileElement> driver;
    public void setDriver(AppiumDriver<MobileElement> driver) {
        BasePage.driver = driver;
    }

}
