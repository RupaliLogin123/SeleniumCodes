package com.thetestingacademy.Ex001_basics;

import io.qameta.allure.Description;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Lab002 {
    @Description("Login Vwo.com")
    @Test
    public void Vwo(){
        EdgeDriver driver =new EdgeDriver() ;
        driver.get("https://app.vwo.com/login");
        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");
        driver.quit();
    }
}
