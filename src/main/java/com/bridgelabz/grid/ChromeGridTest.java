package com.bridgelabz.grid;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
/***
 * @author  Sachin Barpete
 * @purpose To test selenium grid in local machine
 * @date 24/01/2020
 */
public class ChromeGridTest {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");
        capabilities.setPlatform(Platform.LINUX);

        ChromeOptions options = new ChromeOptions();
        options.merge(capabilities);

        String hubUrl = "http://192.168.57.1:4444/wd/hub";
        WebDriver driver = new RemoteWebDriver(new URL(hubUrl), options);
        driver.get("https://www.google.com/");
        System.out.println(driver.getTitle());

        Thread.sleep(4000);
        driver.quit();
    }
}
