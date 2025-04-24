package stepDefinitions.mercadoLibreStepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import step.mercadoLibreStep.MercadoLibreStep;

public class MercadoLibreStepDefinition {
    @Autowired
    private MercadoLibreStep mercadoLibreStep = new MercadoLibreStep();

    @When("ingresa el pais {string}")
    public void ingresaPais(String pais) {
        mercadoLibreStep.ingresaPais(pais);
    }

    @And("ingresa la busqueda de {string}")
    public void buscaFiltro(String filtro) {
        mercadoLibreStep.buscaFiltro(filtro);
    }

    @And("selecciona el boton de busqueda")
    public void seleccionaBusqueda() {
        mercadoLibreStep.seleccionaBusqueda();
    }

    @And("se filtra por condicion {string}")
    public void buscaCondicion(String condicion) {
        mercadoLibreStep.buscaCondicion(condicion);
    }

    @And("se filtra por ciudad {string}")
    public void buscaCiudad(String ciudad) {
        mercadoLibreStep.buscaCiudad(ciudad);
    }

    @And("usuario selecciona ordenar por")
    public void ordenar() {
        mercadoLibreStep.ordenar();
    }

    @And("selecciona por orden de {string}")
    public void seleccionaOrden(String orden) {
        mercadoLibreStep.seleccionaOrden(orden);
    }

    @Then("se imprime en consola los cinco primeros productos")
    public void imprimeProductos() {
        mercadoLibreStep.imprimeProductos();
    }


}
