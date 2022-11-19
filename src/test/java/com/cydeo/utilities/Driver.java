package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    /* 1)
    Creating a private constructor, so we are closing access to the object of this class
    from outside of any classes
     */
    private Driver() {
    }


    /*2)
    Making our 'driver' instance private, so that it is not reachable from outside of any class
    We make it static, because we want it to run before anything else,
    also w will use it in static method
     */
    private static WebDriver driver;

    //3)
    //Teacher note: Create re-usable utility method which will return same driver instance when we call it
    // Now we are going to make method!!!!!!
    // Static because we want to call it with Driver class
    public static WebDriver getDriver() {

        //4)
        // now we are going to initialize statement
        // now implement getDriver() inside of this statement to make it reachable to line 17 driver

        // now we have to follow some rules to use driver
        if (driver == null) {     // if driver/ browser was never opened

            String browserType = ConfigurationReader.getProperty("browser");

             /*
             Depending on the browserType our switch statement will determine to open specific type of browser/driver
              */

            switch (browserType) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();

                   // Map<String, Object> chromePrefs = new HashMap<>();
                 //   chromePrefs.put("profile.default_content_setting_values.cookies", 2);
                 //   ChromeOptions chromeOptions = new ChromeOptions();
               //     driver = new ChromeDriver(chromeOptions);
               //     chromeOptions.setExperimentalOption("prefs", chromePrefs);

                    driver = new ChromeDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;

                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
            }
        }
        // Same driver instatnce will be returned every time we call Driver.getDriver() method
        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();   // this line will kill the session. Value will noy be null
            if (driver == null){
                System.out.println("driver is null");
            }

            driver = null;
        }


    }
}
