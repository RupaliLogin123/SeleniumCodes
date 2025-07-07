package com.thetestingacademy.EX005_SeleniumWaits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class ExplicitWaitLab022 {
    @Test
    public void Explicit()
    {
        EdgeDriver driver=new EdgeDriver();
        driver.get("https://app.vwo.com/#/login");

        WebElement U_Name=driver.findElement(By.id("login-username"));
        U_Name.sendKeys("rupalipandagre25@gmail.com");
        WebElement P_word= driver.findElement(By.id("login-password"));
        P_word.sendKeys("ijuhygt");

        WebElement SignInButton= driver.findElement(By.xpath("//button[@data-qa=\"sibequkica\"]"));
        SignInButton.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("notification-box-description")));

        WebElement ErrText =driver.findElement(By.className("notification-box-description"));

        Assert.assertEquals(ErrText.getText(),"Your email, password, IP address or location did not match");







    }
}
