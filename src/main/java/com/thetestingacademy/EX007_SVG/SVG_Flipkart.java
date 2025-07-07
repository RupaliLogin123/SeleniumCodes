package com.thetestingacademy.EX007_SVG;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class SVG_Flipkart {
    EdgeDriver driver;
        @BeforeTest
        public void openBrowser () {
            EdgeOptions edgeOptions = new EdgeOptions();
            edgeOptions.addArguments("--guest");
            driver = new EdgeDriver(edgeOptions);
            driver.manage().window().maximize();

        }
    @Description("Verify that the on search with svg icon results are visible.")
    @Test
    public void test_Flipkart_Search_SVG_Icon() {
        String URL = "https://www.flipkart.com/search";
        driver.get(URL);

        // Step 1 - Enter the "macnmini" in the inputbox.
        driver.findElement(By.name("q")).sendKeys("macmini");

        // Step 2 - Click on the svg element.
        List<WebElement> svgElements = driver.findElements(By.xpath("//*[local-name()='svg']"));
        svgElements.get(0).click();

       // checkVisibility(driver,By.xpath("//div[contains(@data-id,'CPU')]/div/a[2]"));


        List<WebElement> titlesResults = driver.findElements(By.xpath("//div[contains(@data-id,'CPU')]/div/a[2]"));
        for (WebElement title :  titlesResults){
            System.out.println(title.getText());
        }

    }



    }

