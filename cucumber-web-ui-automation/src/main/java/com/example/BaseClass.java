package com.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseClass {

    public static WebDriver driver;

    public static void setDriver(){
//        System.setProperty("webdriver.chrome.driver","target/classes/chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    public static void navigateToHome(){
        driver.get("http://dbankdemo.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    }

    public static void closeDriver(){
        driver.quit();
    }


}
