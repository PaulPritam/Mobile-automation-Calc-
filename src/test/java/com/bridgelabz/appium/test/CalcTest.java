package com.bridgelabz.appium.test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.bridgelabz.appium.pages.Base;
import com.bridgelabz.appium.pages.CalculatorPage;
import com.bridgelabz.appium.pages.Operations;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class CalcTest extends Base {

    Operations operation = new Operations();
    ExtentTest test1;

    private static final Logger LOGGER = LogManager.getLogger(CalcTest.class);

    @Test(priority = 1)
    public void perform_Addition_Operation_In_Calc() throws InterruptedException {

        LOGGER.info(" This is a basic info message ");

        test1 = extent.createTest("Addition Test",
                "Adds two numbers and matches the result");

        test1.log(Status.INFO, "Addition Test started ");
        operation.addition_Of_Two_Numbers_In_Calculator();
        String actualResult = driver.findElement(By.id("result")).getText();
        test1.log(Status.PASS, "Addition Test passed ");
        Assert.assertEquals(actualResult, "10");

        test1.log(Status.INFO, "Addition Test completed ");
    }

    @Test(priority = 2)
    public void perform_Subtraction_Operation_In_Calc() throws InterruptedException {

        LOGGER.warn(" This is to check warning message ");

        test1 = extent.createTest("Subtraction Test",
                "Subtracts two numbers and matches the result");

        test1.log(Status.INFO, "Subtraction Test started ");
        operation.subtraction_Of_Two_Numbers_In_Calculator();
        String actualResult = driver.findElement(By.id("result")).getText();
        test1.log(Status.PASS, "Subtraction Test passed ");
        Assert.assertEquals(actualResult, "6");

        test1.log(Status.INFO, "Subtraction Test completed ");
    }

    @Test(priority = 3)
    public void perform_Multiplication_Operation_In_Calc() throws InterruptedException {

        LOGGER.fatal(" This is a FATAL error message ");

        test1 = extent.createTest("Multiplication Test",
                "Multiplies two numbers and matches the result");

        test1.log(Status.INFO, "Multiplication Test started ");
        operation.multiplication_Of_Two_Numbers_In_Calculator();
        String actualResult = driver.findElement(By.id("result")).getText();
        test1.log(Status.PASS, "Multiplication Test passed ");
        Assert.assertEquals(actualResult, "16");

        test1.log(Status.INFO, "Multiplication Test completed ");
    }

    @Test(priority = 4)
    public void perform_Division_Operation_In_Calc() throws InterruptedException {

        LOGGER.error(" This is an ERROR message ");

        test1 = extent.createTest("Multiplication Test",
                "Multiplies two numbers and matches the result");

        test1.log(Status.INFO, "Multiplication Test started ");
        operation.division_Of_Two_Numbers_In_Calculator();
        String actualResult = driver.findElement(By.id("result")).getText();
        test1.log(Status.PASS, "Multiplication Test passed ");
        Assert.assertEquals(actualResult, "0.25");

        test1.log(Status.INFO, "Multiplication Test completed ");
    }

    @AfterMethod
    public void clearScreen() {
        CalculatorPage page = new CalculatorPage();
        page.pressClearScreen();
    }

    @AfterTest
    public void takeScreenshot_Of_DeviceScreen() throws IOException {

        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("C:\\Users\\Pritam Paul\\Downloads\\" +
                "demo1\\AppiumIntro\\screenshots\\targetScreenshot.jpg"));
    }
}
