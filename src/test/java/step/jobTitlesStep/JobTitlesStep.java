package step.jobTitlesStep;

import org.springframework.beans.factory.annotation.Autowired;
import pages.StepPages;

public class JobTitlesStep {
    @Autowired
    private StepPages stepPages = new StepPages();

    public void navegaAdmin() { stepPages.jobTitlesPage().navegaAdmin(); }

    public void seleccionarBoton(){ stepPages.jobTitlesPage().seleccionarBoton(); }

    public void seleccionaJobtitles(){ stepPages.jobTitlesPage().seleccionaJobtitles(); }

    public void presionarAdd(){ stepPages.jobTitlesPage().presionarAdd(); }

    public void ingresaTitulo(String titulo) { stepPages.jobTitlesPage().ingresaTitulo(titulo); }

    public void clicBoton(){ stepPages.jobTitlesPage().clicBoton(); }

    public void tituloExistoso(){ stepPages.jobTitlesPage().tituloExistoso(); }
}
