package com.thetestingacademy.Ex002;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Lab008_Min_Max
{
    @Description("Open the URl")
    @Test
    public void get()
    {
        WebDriver driver = new EdgeDriver();
        driver.get("https://google.com");


        driver.getCurrentUrl();
        driver.getTitle();
        driver.getPageSource();

        driver.quit();


    }
}