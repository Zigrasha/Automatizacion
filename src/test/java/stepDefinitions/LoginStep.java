package stepDefinitions;

import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;
import java.util.concurrent.TimeUnit;
import utils.WebDriverManager;


public class LoginStep {
    private WebDriver driver;
    private LoginPage loginPage;

    @Given("que estoy en la página de inicio de sesión")
    public void abrirPaginaInicioSesion() {
        driver = WebDriverManager.getDriver(); // Utiliza WebDriverManager para obtener el WebDriver
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");


        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        loginPage = new LoginPage(driver);

    }

    @When("ingreso mi nombre de usuario {string} y mi contraseña {string}")
    public void ingresarCredenciales(String usuario, String contrasena) {
        loginPage.ingresarUsuarioYContraseña(usuario, contrasena);

    }

    @When("hago clic en el botón de iniciar sesión")
    public void hacerClicEnIniciarSesion() {
        loginPage.hacerClicEnIniciarSesion();


    }

    @Then("debería iniciar sesión correctamente")
    public void verificarInicioSesionCorrecto() {
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        // Agregar lógica para verificar que se ha iniciado sesión correctamente
        // Por ejemplo, verificar que se redirige a la página de inicio correcta
    }


}
