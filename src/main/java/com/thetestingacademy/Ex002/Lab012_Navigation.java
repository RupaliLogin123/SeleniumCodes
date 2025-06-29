package com.thetestingacademy.Ex002;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Lab012_Navigation {
    @Description("Open the URl")
    @Test
    public void Navigate()
    {
        WebDriver driver =new EdgeDriver();
        driver.get("https://google.com");

        //  //  Use Navigation Commands
            // driver.get("url") -> Navigate to a URL

        driver.navigate().to("https://bing.com");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();






}
}
