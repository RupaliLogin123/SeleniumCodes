package com.thetestingacademy.EX004.WebTable;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.util.List;

public class SecondWebTable {
    @Description("WebTable2")
    @Owner("Rupali")
    @Test
    public void WebTable2() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://awesomeqa.com/webtable1.html");
        driver.manage().window().maximize();

        WebElement table = driver.findElement(By.xpath("//table[@summary='Sample Table']"));

        List<WebElement> Row = table.findElements(By.tagName("tr"));
        for (int i = 0; i < Row.size(); i++) {
            List<WebElement> col = Row.get(i).findElements(By.tagName("td"));
            for (WebElement c : col) {
                System.out.println(c.getText());


            }

        }
    }
}