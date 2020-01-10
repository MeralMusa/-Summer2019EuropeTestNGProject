package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClassLocatorTest {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //navigate to website
        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement homeLink= driver.findElement(By.className("nav-link"));

        homeLink.click();

        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement Titelm= driver.findElement(By.className("h3"));

        String Titl =Titelm.getText();

        System.out.println(Titl);

    }
}