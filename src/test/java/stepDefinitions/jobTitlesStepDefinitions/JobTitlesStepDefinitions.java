package stepDefinitions.jobTitlesStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import step.jobTitlesStep.JobTitlesStep;

public class JobTitlesStepDefinitions {
    @Autowired
    private JobTitlesStep jobTitlesStep = new JobTitlesStep();

    @When("el usuario navega a la sección Admin")
    public void navegaAdmin() { jobTitlesStep.navegaAdmin(); }

    @And("selecciona el botón Job")
    public void seleccionarBoton() { jobTitlesStep.seleccionarBoton(); }

    @And("selecciona la opción Job Titles")
    public void seleccionaJobtitles() { jobTitlesStep.seleccionaJobtitles(); }

    @And("presiona el botón + Add")
    public void presionarAdd() { jobTitlesStep.presionarAdd(); }

    @And("ingresar el titulo {string}")
    public void ingresaTitulo(String titulo) {
        jobTitlesStep.ingresaTitulo(titulo);
    }

    @And("hacer clic en el boton Save")
    public void clicBoton() { jobTitlesStep.clicBoton(); }

    @Then("titulo creado exitosamente")
    public void tituloExistoso() { jobTitlesStep.tituloExistoso(); }
}
