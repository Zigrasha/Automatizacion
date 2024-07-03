package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By usernameInput = By.id("txtDni");
    private By passwordInput = By.id("txtContrasena");
    private By loginButton = By.id("btnAceptar");
    private By dniButton = By.xpath("//button[@id='btnPorDni']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void seleccionarIngreso() {
        driver.findElement(dniButton).click();
    }

    public void ingresarUsuarioYContraseña(String usuario, String contraseña) {
        driver.findElement(usernameInput).sendKeys(usuario);
        driver.findElement(passwordInput).sendKeys(contraseña);
    }

    public void hacerClicEnIniciarSesion() {
        driver.findElement(loginButton).click();
    }
}
