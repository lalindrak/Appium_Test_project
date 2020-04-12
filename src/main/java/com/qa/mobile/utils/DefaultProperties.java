package com.qa.mobile.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class DefaultProperties {

        public Properties envSetUp()
        {
            File file = new File("src/main/java/com/qa/mobile/caps.properties");

            FileInputStream fileInput = null;
            try {
                fileInput = new FileInputStream(file);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            Properties prop = new Properties();

            //load properties file
            try {
                prop.load(fileInput);
            } catch (IOException e) {
                e.printStackTrace();
            }

            return prop;
        }

}
