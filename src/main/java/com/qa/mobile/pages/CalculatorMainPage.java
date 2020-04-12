package com.qa.mobile.pages;

import io.appium.java_client.MobileElement;
import org.apache.commons.lang3.ArrayUtils;
import org.openqa.selenium.By;

public class CalculatorMainPage extends BasePage {


    public void enterMathematicalOperation(char symbol) {
        String value = null;

        switch (symbol) {
            case 'x':
                value = "multiply";
                break;
            case '/':
                value = "divide";
                break;
            case '+':
                value = "plus";
                break;
            case '-':
                value = "minus";
                break;
            case '=':
                value = "equals";
        }
        MobileElement mathematicalOperations = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"" + value + "\"]"));
        mathematicalOperations.click();
    }

    public void enterNumbers(int number){

        int numberLength = Integer.toString(number).length();
        int[] intArray = new int[numberLength];
        for (int index = 0; index < numberLength; index++) {
            intArray[index] = number % 10;
            number /= 10;
        }
        ArrayUtils.reverse(intArray);
        for (int value : intArray) {
            MobileElement userInputNumber = driver.findElement(By.id("com.android.calculator2:id/digit_" + value + ""));
            userInputNumber.click();
        }
    }

    public String getResultsFromTheTextArea() {
        return driver.findElement(By.id("com.android.calculator2:id/result")).getText().replaceAll(",","");

    }


}
