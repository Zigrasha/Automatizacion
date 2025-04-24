package step.mercadoLibreStep;

import org.springframework.beans.factory.annotation.Autowired;
import pages.StepPages;

public class MercadoLibreStep {

    @Autowired
    private StepPages stepPages = new StepPages();

    public void ingresaPais(String pais){
        stepPages.mercadoLibrePage().ingresaPais(pais);
    }

    public void buscaFiltro(String filtro){
        stepPages.mercadoLibrePage().buscaFiltro(filtro);
    }

    public void seleccionaBusqueda(){
        stepPages.mercadoLibrePage().seleccionaBusqueda();
    }

    public void buscaCondicion(String condicion){
        stepPages.mercadoLibrePage().buscaCondicion(condicion);
    }

    public void buscaCiudad(String ciudad){
        stepPages.mercadoLibrePage().buscaCiudad(ciudad);
    }

    public void ordenar(){
        stepPages.mercadoLibrePage().ordenar();
    }

    public void seleccionaOrden(String orden){
        stepPages.mercadoLibrePage().seleccionaOrden(orden);
    }

    public void imprimeProductos(){
        stepPages.mercadoLibrePage().imprimeProductos();
    }
}
