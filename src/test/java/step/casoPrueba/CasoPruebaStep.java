package step.casoPrueba;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import pages.StepPages;

public class CasoPruebaStep {

    @Autowired
    private StepPages stepPages = new StepPages();

    public void seleccionarBoton() {

        stepPages.casoPruebaPage().seleccionarBoton();
    }

    public void ingresaNombre(String usuario) {

        stepPages.casoPruebaPage().ingresaNombre(usuario);
    }

    public void ingresaPassword(String pass) {
        stepPages.casoPruebaPage().ingresaPassword(pass);
    }

    public void validarAcceso() {
        stepPages.casoPruebaPage().validarAcceso();
    }

    public void seleccionarBotonDeposito() {
        stepPages.casoPruebaPage().seleccionarBotonDeposito();
    }

    public void muestraFormulario() {
        stepPages.casoPruebaPage().muestraFormulario();
    }

}
