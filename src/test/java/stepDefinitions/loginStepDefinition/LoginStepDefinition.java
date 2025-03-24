package stepDefinitions.loginStepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import step.loginStep.LoginStep;

public class LoginStepDefinition {
    @Autowired
    private LoginStep loginStep = new LoginStep();

    @When("ingresa el username {string}")
    public void ingresaNombre(String username) {
        loginStep.ingresaNombre(username);
    }

    @And("ingresa la contrasena {string}")
    public void ingresaPassword(String password) {
        loginStep.ingresaPassword(password);
    }

    @And("selecciona el boton login")
    public void seleccionarBoton() {
        loginStep.seleccionarBoton();
    }

    @Then("usuario ingresa exitosamente")
    public void ingresoExitoso() {
        loginStep.ingresoExitoso();
    }

    @Then("usuario no ingresa")
    public void ingresoNoExitoso() {
        loginStep.ingresoNoExitoso();
    }
}
