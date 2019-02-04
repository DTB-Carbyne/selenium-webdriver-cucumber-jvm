package io.dtbcarbyne.signup.base;

import org.junit.After;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class BaseTestCase {

    public static WebDriver driver;
    protected static Logger logger;
    public static final String BASE_URL = "https://staging-web.farmdrop.com";

    @BeforeClass
    public void setUp() {
        String browserName = System.getenv("browserName");
        if (browserName.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.home") + "/chromedriver");
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("Firefox")) {
            // Add Firefox driver prop
        } else if (browserName.equalsIgnoreCase("IE")) {
            // Add Internet Explorer driver prop
        } else {
            logger.severe("Error: browser name unknown");
            System.exit(0);
        }
        driver.get(BASE_URL + "/signup");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
