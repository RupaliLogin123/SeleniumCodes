package com.thetestingacademy.EX004.WebTable;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.util.List;
public class Dummy {


        @Description("WebTable2")
        @Owner("Rupali")
        @Test
        public void WebTable2() {
            WebDriver driver = new EdgeDriver();
            driver.get("https://awesomeqa.com/webtable.html");

            driver.findElement(By.xpath("//table\n"));
        }
}
