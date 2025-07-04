package com.thetestingacademy.EX003;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Lab019Tag {
    @Description("Partial Link Text")
    @Owner("Rupali")
    @Test
    public void PartialLinkText() throws InterruptedException {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximixzed");
        WebDriver driver = new EdgeDriver(edgeOptions);

        driver.get("https://app.vwo.com");

        driver.findElement(By.partialLinkText("trial")).click();
        System.out.println(driver.getCurrentUrl());
        Assert.assertTrue(driver.getCurrentUrl().contains("free-trial"));

        WebElement email = driver.findElement(By.id("page-v1-step1-email"));
        email.sendKeys("abc");

        WebElement checkbox_policy = driver.findElement(By.name("gdpr_consent_checkbox"));
        checkbox_policy.click();

        WebElement button = driver.findElement(By.tagName("button"));
        button.click();



        Thread.sleep(5000);
        WebElement error_msg = driver.findElement(By.className("invalid-reason"));
        Assert.assertEquals(error_msg.getText(),"The email address you entered is incorrect.");


        driver.quit();




    }
}
