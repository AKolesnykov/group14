package com.cybertek.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BitrixUtilities {

    public  static void helpDeskloginToBitrix(WebDriver driver){
        //3. Enter username:
        WebElement usernameInput = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        usernameInput.sendKeys("helpdesk14@cybertekschool.com");
        //4. Enter password:
        WebElement passwordInput = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        passwordInput.sendKeys("UserUser");
        //5. Click to Login button
        WebElement loginButton = driver.findElement(By.xpath("//input[@class='login-btn']"));
        loginButton.click();
    }

}
