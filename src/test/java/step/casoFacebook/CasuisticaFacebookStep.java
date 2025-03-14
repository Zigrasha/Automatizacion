package step.casoFacebook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pages.StepPages;

@Component
public class CasuisticaFacebookStep {

    @Autowired
    private StepPages stepPages = new StepPages();

    public void validarPantalla() {
        stepPages.casuisticaFacebookPage().validarPantalla();
    }

    public void credencialesIncorrectas(String correoIncorrecto, String passIncorrecto) {
        stepPages.casuisticaFacebookPage().credencialesIncorrectas(correoIncorrecto,passIncorrecto);
    }

    public void mensajeError() {
        stepPages.casuisticaFacebookPage().mensajeError();
    }

    public void credencialesCorrectas(String correoCorrecto, String passCorrecto) {
        stepPages.casuisticaFacebookPage().credencialesCorrectas(correoCorrecto,passCorrecto);
    }

    public void sesionExistosa() {
        stepPages.casuisticaFacebookPage().sesionExistosa();
    }

    public void navegarNotificaciones() {
        stepPages.casuisticaFacebookPage().navegarNotificaciones();
    }

    public void scrollVertical() {
        stepPages.casuisticaFacebookPage().scrollVertical();
    }

    public void notificacionAleatoria() {
        stepPages.casuisticaFacebookPage().notificacionAleatoria();
    }

    public void notificacionSeleccionada() {
        stepPages.casuisticaFacebookPage().notificacionSeleccionada();
    }

    public void darLike() {
        stepPages.casuisticaFacebookPage().darLike();
    }

    public void validoLike() {
        stepPages.casuisticaFacebookPage().validoLike();
    }

}
