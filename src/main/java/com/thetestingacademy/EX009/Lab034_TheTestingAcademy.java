package com.thetestingacademy.EX009;

import com.thetestingacademy.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Lab034_TheTestingAcademy extends CommonToAll {
    @Test
    public void tta()
    {
        driver = new EdgeDriver(); // or ChromeDriver
        driver.manage().window().maximize();
        driver.get("https://thetestingacademy.com/");

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_UP).build().perform();

        driver.quit();
    }
}
