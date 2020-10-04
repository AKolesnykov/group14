package com.cybertek.tests;


import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class smartBear1 {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        loginToSmartBear();

    }

    @AfterMethod
    public void tearDownMethod() throws InterruptedException{
        Thread.sleep(2000);
        driver.close();
    }

    @Test
    public void isLoggedIn(){

        String expectedTitle = "Web Orders";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(expectedTitle, actualTitle , "You successfully logged in");
    }

    @Test
    public void smartBear_links(){
        List links = driver.findElements(By.tagName("a"));

        driver.findElements(By.tagName("a"));
        System.out.println("Number of links = " + links.size());



        System.out.println(links.toString());

    }

    public void loginToSmartBear(){
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']")).sendKeys("Tester");
        driver.findElement(By.xpath("//input[@id='ctl00_MainContent_password']")).sendKeys("test");
        driver.findElement(By.xpath("//input[@id='ctl00_MainContent_login_button']")).click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
}
