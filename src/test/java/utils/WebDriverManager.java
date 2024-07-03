package utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverManager {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            // Obtener la ruta del chromedriver de manera dinámica
            String driverPath = System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver.exe";
            System.setProperty("webdriver.chrome.driver", driverPath);

            // Inicializar el WebDriver
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}