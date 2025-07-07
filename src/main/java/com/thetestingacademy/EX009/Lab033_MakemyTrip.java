package com.thetestingacademy.EX009;

import com.thetestingacademy.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.WeakHashMap;
import java.util.List;

public class Lab033_MakemyTrip {

    WebDriver driver;

    @Test
    public void mmt() throws InterruptedException {
        driver = new EdgeDriver(); // Initialize WebDriver
        driver.manage().window().maximize();
        driver.get("https://www.makemytrip.com/");

        Thread.sleep(3000); // wait for modal
        try {
            WebElement CloseModal = driver.findElement(By.xpath("//span[@data-cy='closeModal']"));
            CloseModal.click();
        } catch (Exception e) {
            System.out.println("Modal not present or already closed");
        }

        WebElement fromCity = driver.findElement(By.xpath("//input[@data-cy='fromCity']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(fromCity).click().sendKeys("IXC").build().perform();

        Thread.sleep(3000); // wait for suggestions to load

        try {
            List<WebElement> list_auto_complete = driver.findElements(By.xpath("//ul[@class='react-autosuggest__suggestions-list']/li"));
            for (WebElement e : list_auto_complete)
            {
                if (e.getText().contains("Chandigarh"))
                {
                    e.click();
                    break;
                }
            }
        } catch (StaleElementReferenceException e) {
            System.out.println("Ignore this stale element");
        }

        // Optionally, add more logic or driver.quit()
    }
}