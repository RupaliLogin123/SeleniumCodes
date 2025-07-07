package com.thetestingacademy.EX014_Shadow;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Shadow {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new EdgeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void Shadow() throws InterruptedException {
        driver.get("https://selectorshub.com/xpath-practice-page/");

        WebElement div_to_Scroll = driver.findElement(By.xpath("//div[@id='userName']"));

        Thread.sleep(3000); // You can replace this with WebDriverWait if needed

        JavascriptExecutor js = (JavascriptExecutor) driver;

       // WebElement inputboxPizza = (WebElement) js.executeScript("return document.querySelector(\"div#userName\").shadowRoot.querySelector('div#app2').shadowRoot.querySelector('#pizza');");
        WebElement inputboxPizza = (WebElement) js.executeScript(
                "return document.querySelector('#userName')?.shadowRoot" +
                        "?.querySelector('#app2')?.shadowRoot?.querySelector('#pizza');");

       inputboxPizza.sendKeys("Farmhouse");

    }


}
