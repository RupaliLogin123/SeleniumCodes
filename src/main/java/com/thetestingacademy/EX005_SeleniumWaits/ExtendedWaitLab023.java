package com.thetestingacademy.EX005_SeleniumWaits;

import com.thetestingacademy.CommonToAll;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class ExtendedWaitLab023 extends CommonToAll {
    @Description("Verify  makemytrip opens with modal")
    @Test
    public void testCloseModal() {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--incognito");
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.navigate().to("https://www.makemytrip.com/");
        System.out.println(driver.getTitle());

       waitForVisibility(driver,5,"//span[@data-cy='closeModal']");
        WebElement closeModel = driver.findElement(By.xpath("//span[@data-cy=\"closeModal\"]"));
        closeModel.click();

        closeBrowser(driver);
    }


}