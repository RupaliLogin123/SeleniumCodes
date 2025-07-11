package com.thetestingacademy.EX010_FileUpload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Lab036_FileUpload {

        @Test
        public void FileUpload() throws InterruptedException {
            WebDriver driver =new EdgeDriver();
            driver.get("https://awesomeqa.com/selenium/upload.html");
            WebElement uploadFileInput=driver.findElement(By.name("fileToUpload"));
            String dir= System.getProperty("user.dir");//C:\Users\Hp\IdeaProjects\Selenium_CodesC:\Users\Hp\IdeaProjects\Selenium_Codes

            String path_file = dir+"/src/test/java/com/thetestingacademy/Data.txt";


            uploadFileInput.sendKeys(path_file);
            driver.findElement(By.name("submit")).click();



        }
    }


