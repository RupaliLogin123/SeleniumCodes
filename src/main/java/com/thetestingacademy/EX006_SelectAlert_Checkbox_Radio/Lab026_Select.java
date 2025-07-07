package com.thetestingacademy.EX006_SelectAlert_Checkbox_Radio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Lab026_Select {
    @Test
            public void Select() {
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");


        WebElement Dropdown= driver.findElement(By.xpath("//select[@id=\"dropdown\"]"));
        Select select=new Select(Dropdown);

        select.selectByIndex(1);
        System.out.println("Selected by index: " + select.getFirstSelectedOption().getText());

        // 2. Select by value
        select.selectByValue("1");
        System.out.println("Selected by value: " + select.getFirstSelectedOption().getText());

        // 3. Select by visible text
        select.selectByVisibleText("Option 1");
        System.out.println("Selected by visible text: " + select.getFirstSelectedOption().getText());

    }
}
