package com.thetestingacademy.EX005_SeleniumWaits;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ImplicitlyWait_Lab021 {
    @Test
    public void Implicitait()
    {
        WebDriver driver =new EdgeDriver();
        driver.get("https://app.vwo.com/#/login");
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);



        }
    }
