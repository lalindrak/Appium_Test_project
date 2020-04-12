package com.qa.mobile.functions;

import com.qa.mobile.pages.CalculatorMainPage;

public class CalculatorMain {
    CalculatorMainPage calculatorMainPage = new CalculatorMainPage();

    public void enterUserInputNumbers(int numbers) {
        calculatorMainPage.enterNumbers(numbers);
    }
    public void enterMathematicalOperation(char value){
        calculatorMainPage.enterMathematicalOperation(value);
    }
    public int verifyTheActualResults(){
        return Integer.parseInt(calculatorMainPage.getResultsFromTheTextArea());
    }
}
