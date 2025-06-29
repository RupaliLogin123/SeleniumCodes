package com.thetestingacademy.Ex002;

import io.qameta.allure.Description;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Lab003 {
    @Description("Get Title")
    @Test
    public void GetTitle()
    {
        EdgeDriver driver=new EdgeDriver();
        driver.get("https://google.com");
    }

}
