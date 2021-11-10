package com.bridgelabz.appium.test;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class ExtentReportImplementation {

    public ExtentReporter htmlReporter;
    public ExtentReports extent;

    @BeforeSuite
    public void reportSetup() {
        htmlReporter = new ExtentHtmlReporter("extent.html");
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
    }

    @AfterSuite
    public void reportTearDown()
    {
        extent.flush();
    }
}