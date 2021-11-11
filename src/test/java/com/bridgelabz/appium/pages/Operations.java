package com.bridgelabz.appium.pages;

public class Operations extends Base {

    CalculatorPage page = new CalculatorPage();

    public void addition_Of_Two_Numbers_In_Calculator() throws InterruptedException {
        page.clickNumber2();
        page.clickPlus();
        page.clickNumber8();
        page.clickEquals();

        Thread.sleep(2000);
    }
    public void subtraction_Of_Two_Numbers_In_Calculator() throws InterruptedException {
        page.clickNumber8();
        page.clickMinus();
        page.clickNumber2();
        page.clickEquals();
        Thread.sleep(2000);
    }
    public void multiplication_Of_Two_Numbers_In_Calculator() throws InterruptedException {
        page.clickNumber2();
        page.clickMultiply();
        page.clickNumber8();
        page.clickEquals();

        Thread.sleep(2000);
    }

    public void division_Of_Two_Numbers_In_Calculator() throws InterruptedException {
        page.clickNumber2();
        page.clickDivide();
        page.clickNumber8();
        page.clickEquals();

        Thread.sleep(2000);
    }

}
