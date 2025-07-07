package com.thetestingacademy.EX009;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Lab032_Spicejet {
    @Test
    public void spice()
    {
        WebDriver driver = new EdgeDriver();
        String URL = "https://www.spicejet.com/";
        driver.get(URL);
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement source = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//div[@data-testid='to-testID-origin']//input")));
        Actions actions = new Actions(driver);
        // move to Element

        actions.moveToElement(source).click().sendKeys("BLR").build().perform();
    }
}
