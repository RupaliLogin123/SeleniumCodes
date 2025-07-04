package com.thetestingacademy.EX004;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Lab020 {
    @Description("Katalon")
    @Owner("Rupali")
    @Test
    public void Katalon()
    {
        EdgeOptions edgeOptions=new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver=new EdgeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/");

        driver.findElement(By.xpath("//a[@id='btn-make-appointment']")).click();
        driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("John Doe");
        driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("ThisIsNotAPassword");

        driver.findElement(By.xpath("//button[text()=\"Login\"]")).click();







    }
}
