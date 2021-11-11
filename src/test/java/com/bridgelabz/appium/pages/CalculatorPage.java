package com.bridgelabz.appium.pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;

public class CalculatorPage extends Base{

    public CalculatorPage(){};

    public CalculatorPage(AndroidDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    public void clickNumber2()
    {
        driver.findElement(By.xpath("//android.widget.Button[@index='7']")).click();
    }

    public void clickNumber8()
    {
        driver.findElement(By.xpath("//android.widget.Button[@index='1']")).click();
    }

    public void clickPlus()
    {
        driver.findElement(By.xpath("//android.widget.Button[@text='+']")).click();
    }

    public void clickMinus()
    {
        driver.findElement(By.xpath("//android.widget.Button[@text='−']")).click();
    }

    public void clickMultiply()
    {
        driver.findElement(By.xpath("//android.widget.Button[@text='×']")).click();
    }

    public void clickDivide()
    {
        driver.findElement(By.xpath("//android.widget.Button[@text='÷']")).click();
    }

    public void clickEquals()
    {
        driver.findElement(By.xpath("//android.widget.Button[@text='=']")).click();
    }

    public void pressClearScreen() {
        driver.findElement(By.id("clr")).click();
    }
}
