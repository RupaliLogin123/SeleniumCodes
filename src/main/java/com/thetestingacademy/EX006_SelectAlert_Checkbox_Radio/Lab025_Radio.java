package com.thetestingacademy.EX006_SelectAlert_Checkbox_Radio;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Lab025_Radio {
    @Test
    public void Radio()
    {
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://awesomeqa.com/practice.html");

        driver.findElement(By.name("exp")).click();

        driver.findElement(By.id("sex-1")).click();
        driver.findElement(By.id("tool-1")).click();
    }
}
