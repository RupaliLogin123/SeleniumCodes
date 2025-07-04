package com.thetestingacademy.EX003;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Lab018_PartialLinkText {
    @Description("Partial Link Text")
    @Owner("Rupali")
    @Test
    public void PartialLinkText()
    {
        EdgeOptions edgeOptions =new EdgeOptions();
        edgeOptions.addArguments("--start-maximixzed");
        WebDriver driver =new EdgeDriver(edgeOptions);

        driver.get("https://app.vwo.com");

       // driver.findElement(By.linkText("Start a free trial")).click();
        driver.findElement(By.partialLinkText("a free trial")).click();


    }
}
