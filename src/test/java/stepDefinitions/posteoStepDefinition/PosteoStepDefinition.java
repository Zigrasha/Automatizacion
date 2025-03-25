package stepDefinitions.posteoStepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import step.posteoStep.PosteoStep;

public class PosteoStepDefinition {
    @Autowired
    private PosteoStep posteoStep = new PosteoStep();

    @When("el usuario navega a la seccion Buzz")
    public void navegarBuzz() { posteoStep.navegarBuzz(); }

    @And("ingresa comentario {string}")
    public void ingresaComentario(String comentario) {
        posteoStep.ingresaComentario(comentario);
    }

    @And("hace clic en el boton Post")
    public void seleccionarBoton() {
        posteoStep.seleccionarBoton();
    }

    @Then("la publicacion es exitosa")
    public void publicacionExitosa() { posteoStep.publicacionExitosa(); }
}
