package stepDefinitions;

import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;
import utils.WebDriverManager;


public class LoginStep {
    private WebDriver driver;
    private LoginPage loginPage;

    @Given("que estoy en la página de inicio de sesión")
    public void abrirPaginaInicioSesion() {
        driver = WebDriverManager.getDriver(); // Utiliza WebDriverManager para obtener el WebDriver
        driver.get("https://api-seguridad.sunat.gob.pe/v1/clientessol/4f3b88b3-d9d6-402a-b85d-6a0bc857746a/oauth2/loginMenuSol?originalUrl=https://e-menu.sunat.gob.pe/cl-ti-itmenu/AutenticaMenuInternet.htm&state=rO0ABXNyABFqYXZhLnV0aWwuSGFzaE1hcAUH2sHDFmDRAwACRgAKbG9hZEZhY3RvckkACXRocmVzaG9sZHhwP0AAAAAAAAx3CAAAABAAAAADdAAEZXhlY3B0AAZwYXJhbXN0AEsqJiomL2NsLXRpLWl0bWVudS9NZW51SW50ZXJuZXQuaHRtJmI2NGQyNmE4YjVhZjA5MTkyM2IyM2I2NDA3YTFjMWRiNDFlNzMzYTZ0AANleGV0AAVidXpvbng=");
        driver.manage().window().maximize();
        loginPage = new LoginPage(driver);
    }


    @When("selecciono ingreso por DNI")
    public void seleccionarIngreso() {
        loginPage.seleccionarIngreso();
    }

    @When("ingreso mi nombre de usuario {string} y mi contraseña {string}")
    public void ingresarCredenciales(String usuario, String contraseña) {
        loginPage.ingresarUsuarioYContraseña(usuario, contraseña);
        try { Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
        }
    }

    @When("hago clic en el botón de iniciar sesión")
    public void hacerClicEnIniciarSesion() {
        loginPage.hacerClicEnIniciarSesion();
    }

    @Then("debería iniciar sesión correctamente")
    public void verificarInicioSesionCorrecto() {
        // Agregar lógica para verificar que se ha iniciado sesión correctamente
        // Por ejemplo, verificar que se redirige a la página de inicio correcta
    }

    // Métodos para otros escenarios...

    public void cerrarNavegador() {
        WebDriverManager.quitDriver(); // Utiliza WebDriverManager para cerrar el WebDriver
    }

}
