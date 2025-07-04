package com.thetestingacademy.EX003;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Lab017_Vwo {
    @Description("Verify the Login Button Error")
    @Test
    public void Error_Validation()
    {
        EdgeOptions edgeOptions=new EdgeOptions();
        WebDriver driver =new EdgeDriver(edgeOptions);

        driver.navigate().to("https://app.vwo.com/#/login");
        driver.findElement(By.id("login-username")).sendKeys("rupalipandagre25@gmail.com");
        driver.findElement(By.id("login-password")).sendKeys("hhbb");

        driver.findElement(By.id("js-login-btn")).click();
        String Actual = driver.findElement(By.className("notification-box-description")).getText();
        Assert.assertEquals(Actual,"Your email, password, IP address or location did not match");

    }
}
