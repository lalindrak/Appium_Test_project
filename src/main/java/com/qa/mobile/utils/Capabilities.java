package com.qa.mobile.utils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

public class Capabilities {
    private static DefaultProperties runningConfig = new DefaultProperties();
    private static Properties prop =  runningConfig.envSetUp();

    public static DesiredCapabilities setCapabilities(){
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", prop.getProperty("deviceName"));
        cap.setCapability("udid", prop.getProperty("udid"));
        cap.setCapability("platformName", prop.getProperty("platformName"));
        cap.setCapability("platformVersion", prop.getProperty("platformVersion"));
        cap.setCapability("appPackage", prop.getProperty("appPackage"));
        cap.setCapability("appActivity", prop.getProperty("appActivity"));
        return cap;
    }

    public static URL setUrl() throws MalformedURLException {
        return new URL(prop.getProperty("url"));
    }
}
