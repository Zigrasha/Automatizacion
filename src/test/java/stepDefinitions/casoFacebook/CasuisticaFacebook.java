package stepDefinitions.casoFacebook;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import step.casoFacebook.CasuisticaFacebookStep;

public class CasuisticaFacebook {

    @Autowired
    private CasuisticaFacebookStep casuisticaFacebookStep = new CasuisticaFacebookStep();

    @When("Se muestra la pantalla de inicio de sesion")
    public void validarPantalla() {
        casuisticaFacebookStep.validarPantalla();
    }

    @And("el usuario ingresa incorrectamente con {string} y {string}")
    public void credencialesIncorrectas(String correoIncorrecto, String passIncorrecto) {
        casuisticaFacebookStep.credencialesIncorrectas(correoIncorrecto,passIncorrecto);
    }

    @Then("se muestra un mensaje de error de autenticacion")
    public void mensajeError() {
        casuisticaFacebookStep.mensajeError();
    }

    @When("el usuario ingresa informacion correcta {string} y {string}")
    public void credencialesCorrectas(String correoCorrecto, String passCorrecto) {
        casuisticaFacebookStep.credencialesCorrectas(correoCorrecto,passCorrecto);
    }

    @Then("el usuario inicia sesión correctamente")
    public void sesionExistosa() {
        casuisticaFacebookStep.sesionExistosa();
    }

    @When("navega a la sección de Notificaciones")
    public void navegarNotificaciones() {
        casuisticaFacebookStep.navegarNotificaciones();
    }

    @And("realiza un scroll vertical")
    public void scrollVertical() {
        casuisticaFacebookStep.scrollVertical();
    }

    @And("selecciona una notificacion aleatoria")
    public void notificacionAleatoria() {
        casuisticaFacebookStep.notificacionAleatoria();
    }

    @Then("se carga el post de la notificacion seleccionada")
    public void notificacionSeleccionada() {
        casuisticaFacebookStep.notificacionSeleccionada();
    }

    @When("el usuario da Me gusta al post cargado")
    public void darLike() {
        casuisticaFacebookStep.darLike();
    }

    @Then("el post muestra que recibio el Me gusta correctamente")
    public void validoLike() {
        casuisticaFacebookStep.validoLike();
    }

}
