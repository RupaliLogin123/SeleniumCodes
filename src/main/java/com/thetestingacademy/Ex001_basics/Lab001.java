package com.thetestingacademy.Ex001_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Lab001 {
    @Test
    public void OpenVwo()
    {
        FirefoxDriver driver =new FirefoxDriver();
        driver.get("https://app.vwo.com");
        driver.quit();
    }
}
