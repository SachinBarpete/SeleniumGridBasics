package com.bridgelabz.grid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

/***
 * @author  Sachin Barpete
 * @purpose To test script on Mac os Safari browser using browserstack
 * @date 24/01/2020
 */
public class JavaSample {

    public static final String USERNAME = "";
    public static final String AUTOMATE_KEY = "";
    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

    public static void main(String[] args) throws Exception {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("browser", "Safari");
        caps.setCapability("browser_version", "11.0");
        caps.setCapability("os", "OS X");
        caps.setCapability("os_version", "High Sierra");
        caps.setCapability("resolution", "1024x768");
        caps.setCapability("name", "Bstack-[Java] Sample Test");

        WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
        driver.get("http://www.google.com");
        WebElement element = driver.findElement(By.name("q"));

        element.sendKeys("Selenium");
        element.submit();

        System.out.println(driver.getTitle());
        driver.quit();

    }
}