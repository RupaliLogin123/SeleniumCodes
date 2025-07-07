package com.thetestingacademy.EX009;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Lab031_Sendkeys {
    @Test
    public void testsendkeys()
    {
        WebDriver driver = new EdgeDriver();
        String URL = "https://awesomeqa.com/practice.html";
        driver.get(URL);
        driver.manage().window().maximize();
        WebElement Firstname= driver.findElement(By.name("firstname"));

        Actions action =new Actions(driver);
        action.moveToElement(Firstname);

        action.keyDown(Keys.SHIFT).sendKeys(Firstname,"Rupali").keyUp(Keys.SHIFT).build().perform();


    }
}
