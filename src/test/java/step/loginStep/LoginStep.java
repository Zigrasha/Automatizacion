package step.loginStep;

import org.springframework.beans.factory.annotation.Autowired;
import pages.StepPages;

public class LoginStep {
    @Autowired
    private StepPages stepPages = new StepPages();

    public void ingresaNombre(String username){
        stepPages.loginPage().ingresaNombre(username);
    }

    public void ingresaPassword(String password){
        stepPages.loginPage().ingresaPassword(password);
    }

    public void seleccionarBoton(){
        stepPages.loginPage().seleccionarBoton();
    }

    public void ingresoExitoso(){
        stepPages.loginPage().ingresoExitoso();
    }

    public void ingresoNoExitoso(){
        stepPages.loginPage().ingresoNoExitoso();
    }

}
