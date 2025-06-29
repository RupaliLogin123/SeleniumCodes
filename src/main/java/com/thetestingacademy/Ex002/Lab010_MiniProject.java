package com.thetestingacademy.Ex002;

import com.thetestingacademy.CommonToAll;
import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Lab010_MiniProject extends CommonToAll {
    @Description("MiniProject")
    @Test
    public void MiniProject()
    {
        WebDriver driver =new EdgeDriver();
        openBrowser(driver,"https://katalon-demo-cura.herokuapp.com/");

        if (driver.getPageSource().contains("CURA Healthcare Service"))
        {
            System.out.println("Test Passed");
        }
        else
        {
            System.out.println("Test Failed");
        }
        driver.quit();

    }

}
