package com.thetestingacademy.Ex002;

import org.openqa.selenium.edge.EdgeDriver;

public class Lab013_NoHttp {
    public static void main(String[] args) {
        EdgeDriver driver = new EdgeDriver();
//        driver.get("bing.com"); // HTTPs is important.
        driver.get("https://bing.com"); // HTTPs is important.

        driver.quit();
    }
}
