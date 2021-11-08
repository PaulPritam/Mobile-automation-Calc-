package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;

public class Base {

    static WebDriver driver;

    @BeforeTest
    public void setup() throws InterruptedException, MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability("deviceName", "sdk_gphone_x86");
        cap.setCapability("udid", "emulator-5554");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "8.0.0");
        cap.setCapability("appPackage", "com.android.calculator2");
        cap.setCapability("appActivity", "com.android.calculator2.Calculator");

        Thread.sleep(6000);

        driver = new RemoteWebDriver(new URL("http://0.0.0.0:4723/wd/hub"), cap);

    }

    @AfterTest
    public void clearScreen()
    {
        driver.findElement(By.xpath("//android.widget.Button[@text='CLR']")).click();
    }
}
