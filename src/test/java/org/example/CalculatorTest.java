package org.example;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CalculatorTest extends Base {

    @Test(priority = 1)
    public void add() throws InterruptedException {
        driver.findElement(By.xpath("//android.widget.Button[@index='1']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//android.widget.Button[@text='+']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//android.widget.Button[@index='7']")).click();
        Thread.sleep(2000);
        String result = driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.android.calculator2:id/result']")).getText();

        Assert.assertEquals(result,"10");
    }

    @Test(priority = 2)
    public void subtract() throws InterruptedException {
        driver.findElement(By.xpath("//android.widget.Button[@index='1']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//android.widget.Button[@text='−']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//android.widget.Button[@index='7']")).click();
        Thread.sleep(2000);

        String result = driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.android.calculator2:id/result']")).getText();

        Assert.assertEquals(result,"6");
    }

    @Test(priority = 3)
    public void multiply() throws InterruptedException {
        driver.findElement(By.xpath("//android.widget.Button[@index='1']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//android.widget.Button[@text='×']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//android.widget.Button[@index='7']")).click();
        Thread.sleep(2000);

        String result = driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.android.calculator2:id/result']")).getText();

        Assert.assertEquals(result,"16");
    }

    @AfterMethod
    public void clickEquals() throws InterruptedException {
        driver.findElement(By.xpath("//android.widget.Button[@text='=']")).click();
        Thread.sleep(2000);
    }

}
