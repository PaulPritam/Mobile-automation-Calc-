package com.bridgelabz.appium.test;

import com.bridgelabz.appium.pages.Base;
import com.bridgelabz.appium.pages.PagesL;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalcTest extends Base {

    @Test(priority = 1)
    public void add()
    {
        PagesL page = new PagesL(driver);
        page.clickNumber2();
        page.clickPlus();
        page.clickNumber8();
        page.clickEquals();

        String actualResult = driver.findElement(By.id("result")).getText();
        String expectedResult = "10";

        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test(priority = 2)
    public void subtract()
    {
        PagesL page = new PagesL(driver);
        page.clickNumber8();
        page.clickMinus();
        page.clickNumber2();
        page.clickEquals();

        String actualResult = driver.findElement(By.id("result")).getText();
        String expectedResult = "6";

        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test(priority = 3)
    public void multiply()
    {
        PagesL page = new PagesL(driver);
        page.clickNumber2();
        page.clickMultiply();
        page.clickNumber8();
        page.clickEquals();

        String actualResult = driver.findElement(By.id("result")).getText();
        String expectedResult = "16";

        Assert.assertEquals(expectedResult,actualResult);
    }

}
