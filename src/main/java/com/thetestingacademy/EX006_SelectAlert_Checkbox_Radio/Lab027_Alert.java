package com.thetestingacademy.EX006_SelectAlert_Checkbox_Radio;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Lab027_Alert {
    @Test
    public void Alerts()
    {
        EdgeDriver driver =new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();

        WebElement JsAlert= driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        JsAlert.click();


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();

        System.out.println("Alert text: " + alert.getText());
        alert.accept();  // or alert.dismiss();

        driver.quit();
    }
}














