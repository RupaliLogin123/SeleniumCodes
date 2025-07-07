package com.thetestingacademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import javax.swing.plaf.TableHeaderUI;
import java.time.Duration;

public class CommonToAll {

    public EdgeDriver driver;

    public void openBrowser(WebDriver driver,String url)
    {
        driver = new EdgeDriver();  // or ChromeDriver
        driver.manage().window().maximize();
    }

    public void closeBrowser(WebDriver driver)
    {
        driver.quit();
    }
    public void waitForJVM(int time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void waitForVisibility(WebDriver driver, int timeInSeconds,String xpath){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeInSeconds));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
    }
}