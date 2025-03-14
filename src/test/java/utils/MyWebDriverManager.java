package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.concurrent.TimeUnit;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MyWebDriverManager {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            // Configura WebDriverManager para gestionar el driver dinámicamente
            setupDriver();

            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-notifications");

            // Inicializar el WebDriver
            driver = new ChromeDriver(options);
            driver.manage().window().maximize();
            driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        }
        return driver;
    }

    public static void navigateTo(String URL) {
        driver = MyWebDriverManager.getDriver();
        driver.get(URL);
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    private static void setupDriver() {
        // WebDriverManager se encargará de descargar o usar el driver adecuado.
        WebDriverManager.chromedriver().setup();
    }
}
