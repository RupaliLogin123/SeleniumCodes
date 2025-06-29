package com.thetestingacademy.Ex002;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.io.File;

public class Lab016_CRX {
    public static void main(String[] args) {
        EdgeOptions edgeOptions =new EdgeOptions();
        edgeOptions.addArguments("--window-size=1920,1020");
        edgeOptions.addExtensions(new File("src/main/java/com/thetestingacademy/Ex002/AdBlock-—-block-ads-across-the-web-Chrome-Web-Store.crx"));

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://www.youtube.com/watch?v=wAJLdqK0SmI");


        driver.manage().deleteAllCookies();
        driver.quit();

    }
}
