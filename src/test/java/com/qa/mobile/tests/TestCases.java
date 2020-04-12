package com.qa.mobile.tests;

import com.qa.mobile.functions.CalculatorMain;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCases extends BaseTest{

    CalculatorMain calculatorMain = new CalculatorMain();

    @Test(description = "Checks the addition of two numbers")
    public void verifySimpleAdditionFunctionality(){
        calculatorMain.enterUserInputNumbers(350);
        calculatorMain.enterMathematicalOperation('+');
        calculatorMain.enterUserInputNumbers(250);
        calculatorMain.enterMathematicalOperation('=');
        Assert.assertEquals(calculatorMain.verifyTheActualResults(),600);
    }

    @Test(description = "Checks the subtraction of two numbers")
    public void verifySimpleSubtractionFunctionality(){
        calculatorMain.enterUserInputNumbers(5455);
        calculatorMain.enterMathematicalOperation('-');
        calculatorMain.enterUserInputNumbers(455);
        calculatorMain.enterMathematicalOperation('=');
        Assert.assertEquals(calculatorMain.verifyTheActualResults(),5000);
    }

    @Test(description = "Checks the multiplication of two numbers")
    public void verifySimpleMultiplicationFunctionality(){
        calculatorMain.enterUserInputNumbers(250);
        calculatorMain.enterMathematicalOperation('x');
        calculatorMain.enterUserInputNumbers(30);
        calculatorMain.enterMathematicalOperation('=');
        Assert.assertEquals(calculatorMain.verifyTheActualResults(),7500);
    }

    @Test(description = "Checks the division of two numbers")
    public void verifySimpleDivisionFunctionality(){
        calculatorMain.enterUserInputNumbers(1200);
        calculatorMain.enterMathematicalOperation('/');
        calculatorMain.enterUserInputNumbers(12);
        calculatorMain.enterMathematicalOperation('=');
        Assert.assertEquals(calculatorMain.verifyTheActualResults(),100);
    }
}
