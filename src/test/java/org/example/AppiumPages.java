package org.example;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AppiumPages extends Base{

    public static WebDriver driver;

//    @AndroidFindBy(xpath = "//android.widget.Button[@text='+']")
//    private WebElement plusButton;


//    @AndroidFindBy(xpath = "//android.widget.Button[@text='=']")
//    private WebElement equalsButton;

//    @AndroidFindBy(xpath = "//android.widget.Button[@index='1']")
//    private WebElement number8;


    @FindBy(xpath = "//android.widget.Button[@index='7']")
    private WebElement number2;

    public AppiumPages(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

//    public void clickNumber8()
//    {
//        number8.click();
//    }

//    public void clickPlus()
//    {
//        plusButton.click();
//    }

    public void clickNumber2()
    {
        number2.click();
    }

//    public void clickEqualsButton()
//    {
//        equalsButton.click();
//    }


}
