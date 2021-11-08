package org.example;

import org.openqa.selenium.By;
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

    }

    @Test(priority = 2)
    public void subtract() throws InterruptedException {
        driver.findElement(By.xpath("//android.widget.Button[@index='1']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//android.widget.Button[@text='−']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//android.widget.Button[@index='7']")).click();
        Thread.sleep(2000);
    }

    @Test(priority = 3)
    public void multiply() throws InterruptedException {
        driver.findElement(By.xpath("//android.widget.Button[@index='1']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//android.widget.Button[@text='×']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//android.widget.Button[@index='7']")).click();
        Thread.sleep(2000);
    }

    @AfterMethod
    public void clickEquals() throws InterruptedException {
        driver.findElement(By.xpath("//android.widget.Button[@text='=']")).click();
        Thread.sleep(2000);
    }
}
