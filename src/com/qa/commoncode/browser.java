package com.qa.commoncode;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class browser {
	@Test(groups="test1")
    public void executSessionOne(){
            //First session of WebDriver
            System.setProperty("webdriver.chrome.driver","C:/browser/chromedriver.exe");
            
            ChromeDriver driver = new ChromeDriver();
            //Goto guru99 site
            driver.get("http://demo.guru99.com/V4/");
            //find user name text box and fill it
            driver.findElement(By.name("uid")).sendKeys("Driver 1");
            
           
            
        }
}