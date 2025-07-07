package com.thetestingacademy.EX009;

import com.thetestingacademy.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Lab035_DragDrop extends CommonToAll {
    @Test
    public void dragDropMode()
    { driver = new EdgeDriver(); // or ChromeDriver
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
        driver.manage().window().maximize();

        WebElement Drag=driver.findElement(By.id("column-a"));
        WebElement Drop=driver.findElement(By.id("column-b"));

        Actions actions=new Actions(driver) ;
        actions.dragAndDrop(Drag,Drop).perform();


    }
}
