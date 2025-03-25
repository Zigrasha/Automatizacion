package step.posteoStep;

import org.springframework.beans.factory.annotation.Autowired;
import pages.StepPages;

public class PosteoStep {
    @Autowired
    private StepPages stepPages = new StepPages();

    public void navegarBuzz() { stepPages.posteoPage().navegarBuzz(); }

    public void ingresaComentario(String comentario) { stepPages.posteoPage().ingresaComentario(comentario); }

    public void seleccionarBoton(){ stepPages.posteoPage().seleccionarBoton(); }

    public void publicacionExitosa(){ stepPages.posteoPage().publicacionExitosa(); }


}
