package com.thetestingacademy.EX011_WindowHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class Lab037 {
    @Test
    public void Window()
    {
        WebDriver driver =new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/windows");
        String Parent =driver.getWindowHandle();

        WebElement ClickHere= driver.findElement(By.xpath("//a[text()=\"Click Here\"]"));
        ClickHere.click();

        Set<String> AllWindow= driver.getWindowHandles();
        System.out.println(AllWindow);

        for (String Handle: AllWindow)
        {
                driver.switchTo().window(Handle);
                if(driver.getPageSource().contains("New Window"));
            System.out.println("TC Passed");


        }

     driver.switchTo().window(Parent);









    }

}
