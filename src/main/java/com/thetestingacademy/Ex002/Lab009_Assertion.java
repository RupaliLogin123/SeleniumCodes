package com.thetestingacademy.Ex002;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class Lab009_Assertion {
    @Description("Assert Classes")
    @Test
    public void Assert()
    {
        WebDriver driver =new EdgeDriver();
        driver.get("https://www.google.com");

        Assert.assertEquals(driver.getCurrentUrl(),"https://www.google.com/");

        assertThat(driver.getCurrentUrl()).isNotBlank().isNotNull().isEqualTo("https://www.google.com/");

    }
}
