package com.thetestingacademy.EX004.WebTable;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class FirstWebtable {
    @Description("Webtable")
    @Owner("Rupali")
    @Test
    public void WebTabl2()
    {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");
        edgeOptions.addArguments("--incognito");
        WebDriver driver = new EdgeDriver(edgeOptions);

         driver.get("https://awesomeqa.com/webtable.html");
        //table[@id="customers"]/tbody/tr[3]/td[3]

        String FirstPart="//table[@id=\"customers\"]/tbody/tr[";
        String SecondPart="]/td[";
        String ThirdPart="]";

        int Row =driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();
        int Col= driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr[2]/td")).size();
        for (int i=2 ;i< Row ;i++ )
        {
            for (int j=1; j<Col ; j++)
            {
                String DynamicPath=FirstPart+i+SecondPart+j+ThirdPart;
                String data=driver.findElement(By.xpath(DynamicPath)).getText();

                System.out.println(data);
                if (data.contains("Helen Bennett"))
                {
                    String Country_Path= DynamicPath +"/following-sibling::td";
                    String Country_Text= driver.findElement(By.xpath(Country_Path)).getText();
                    System.out.println("Helen Bennett is in "+ Country_Text );
                }

            }

        }


    }

}
