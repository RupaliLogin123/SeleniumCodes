package com.thetestingacademy.Ex002;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Lab011_ChangeDriver {
    public static void main(String[] args) {
       // Not Possible
        //ChromeDriver driver=new ChromeDriver();
       // driver =new FirefoxDriver();

        WebDriver driver=new ChromeDriver();
        driver=new EdgeDriver();



    }
}
