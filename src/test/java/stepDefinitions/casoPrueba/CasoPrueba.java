package stepDefinitions.casoPrueba;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import step.casoPrueba.CasoPruebaStep;

public class CasoPrueba {

    @Autowired
    private CasoPruebaStep casoPruebaStep = new CasoPruebaStep();

    @When("el usuario selecciona la opción para iniciar sesion")
    public void seleccionarBoton() {
        casoPruebaStep.seleccionarBoton();
    }

    @And("ingresa el usuario {string}")
    public void ingresaNombre(String usuario) {
        casoPruebaStep.ingresaNombre(usuario);
    }

    @And("ingresa la contrasena {string}")
    public void ingresaPassword(String pass) {
        casoPruebaStep.ingresaPassword(pass);
    }

    @Then("accede exitosamente a su cuenta")
    public void validarAcceso() {
        casoPruebaStep.validarAcceso();
    }

    @When("selecciona el boton de deposito")
    public void seleccionarBotonDeposito() {
        casoPruebaStep.seleccionarBotonDeposito();
    }

    @Then("se muestra correctamente el formulario de deposito")
    public void muestraFormulario() {
        casoPruebaStep.muestraFormulario();
    }


}
