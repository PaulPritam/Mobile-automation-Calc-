package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class TryWithTestNG {

    static WebDriver driver;

    @Test(priority = 1)
    public static void openCalculator() throws MalformedURLException, InterruptedException {
        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability("deviceName", "sdk_gphone_x86");
        cap.setCapability("udid", "emulator-5554");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "8.0.0");
        cap.setCapability("appPackage", "com.android.calculator2");
        cap.setCapability("appActivity", "com.android.calculator2.Calculator");
        cap.setCapability("automationName", "Uiautomator2");

        Thread.sleep(6000);

        driver = new RemoteWebDriver(new URL("http://0.0.0.0:4723/wd/hub"), cap);

        System.out.println("Application Started: ");
    }

    @Test(dependsOnMethods = "openCalculator")
    public void basicClick() throws InterruptedException {
        driver.findElement(By.xpath("//android.widget.Button[@index='1']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//android.widget.Button[@index='7']")).click();
        Thread.sleep(2000);
   }
}
