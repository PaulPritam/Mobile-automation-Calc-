package com.bridgelabz.appium.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PagesL extends Base{



//    public static AndroidDriver driver;

//    @AndroidFindBy(xpath = "//android.widget.Button[@text='+']")
//    public WebElement plusButton;


//
//
//    @AndroidFindBy(xpath = "//android.widget.Button[@text='=']")
//    public WebElement equalsButton;


//
//    @AndroidFindBy(xpath = "//android.widget.Button[@index='1']")
//    public WebElement number8;



    public PagesL(AndroidDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

//    By number = By.xpath("//android.widget.Button[@index='7']");



//    public void clickNumber8()
//    {
//        number8.click();
//    }
//
//    public void clickPlus()
//    {
//        plusButton.click();
//    }
//
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
        driver.findElement(By.xpath("//android.widget.Button[@text='=']")).click();
    }

    public void clickMultiply()
    {
        driver.findElement(By.xpath("//android.widget.Button[@text='×']")).click();
    }

    public void clickEquals()
    {
        driver.findElement(By.xpath("//android.widget.Button[@text='=']")).click();
    }
}
