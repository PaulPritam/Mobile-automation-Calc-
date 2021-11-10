package com.bridgelabz.appium.test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.bridgelabz.appium.pages.Base;
import com.bridgelabz.appium.pages.PagesL;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class CalcTest extends Base {

    @Test(priority = 1)
    public void add() {
        ExtentTest test1 = extent.createTest("Addition Test",
                "Adds two numbers and matches the result");

        PagesL page = new PagesL(driver);

        test1.log(Status.INFO, "Addition Test started ");

        page.clickNumber2();
        page.clickPlus();
        page.clickNumber8();
        page.clickEquals();

        String actualResult = driver.findElement(By.id("result")).getText();
        String expectedResult = "10";

        test1.log(Status.PASS, "Addition Test passed ");

        Assert.assertEquals(expectedResult, actualResult);

        test1.log(Status.INFO, "Addition Test completed ");
    }

    @Test(priority = 2)
    public void subtract() throws InterruptedException {

        ExtentTest test1 = extent.createTest("Subtraction Test",
                "Subtracts two numbers and matches the result");

        PagesL page = new PagesL(driver);

        test1.log(Status.INFO, "Subtraction Test started ");

        Thread.sleep(3000);

        page.clickNumber8();
        page.clickMinus();
        page.clickNumber2();
        page.clickEquals();

        String actualResult = driver.findElement(By.id("result")).getText();
        String expectedResult = "6";

        test1.log(Status.PASS, "Subtraction Test passed ");

        Assert.assertEquals(expectedResult, actualResult);

        test1.log(Status.INFO, "Subtraction Test completed ");

    }

    @Test(priority = 3)
    public void multiply() throws InterruptedException {

        ExtentTest test1 = extent.createTest("Multiplication Test",
                "Multiplies two numbers and matches the result");

        PagesL page = new PagesL(driver);

        test1.log(Status.INFO, "Multiplication Test started ");

        Thread.sleep(3000);

        page.clickNumber2();
        page.clickMultiply();
        page.clickNumber8();
        page.clickEquals();

        String actualResult = driver.findElement(By.id("result")).getText();
        String expectedResult = "16";

        test1.log(Status.PASS, "Multiplication Test passed ");

        Assert.assertEquals(expectedResult, actualResult);

        test1.log(Status.INFO, "Multiplication Test completed ");

    }

    @AfterMethod
    public void pressCancel() {
        driver.findElement(By.id("clr")).click();
    }

}
