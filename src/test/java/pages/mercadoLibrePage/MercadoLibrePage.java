package pages.mercadoLibrePage;

import org.bouncycastle.jcajce.provider.asymmetric.X509;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.NoSuchElementException;

public class MercadoLibrePage {
    private WebDriver driver;

    public MercadoLibrePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this); // Importante para inicializar los elementos
    }

    @FindBy(xpath = "/html/body/nav/ul/li/a")
    protected List<WebElement> enlaces;

    @FindBy(id = "cb1-edit")
    protected WebElement barraFiltro;

    @FindBy(xpath = "/html/body/div[4]/div[1]/div/div[2]/button[1]")
    protected WebElement cookies;

    @FindBy(xpath = "/html/body/header/div/div[2]/form/button")
    protected WebElement lupa;

    @FindBy(xpath = "//*[@id=\"root-app\"]/div/div[2]/aside/section[2]/div[4]/ul/li/a/span")
    protected List<WebElement> condiciones;

    @FindBy(xpath = "//*[@id=\"root-app\"]/div/div[2]/aside/section[2]/div[8]/ul/li/a/span")
    protected List<WebElement> ciudades;

    @FindBy(id = ":R1b55ie:-display-values")
    protected WebElement ordenarPor;

    @FindBy(xpath = "//*[@id=':R1b55ie:-menu-list']/li/div/div/span")
    protected List<WebElement> listaOrdenar;

    @FindBy(xpath = "//*[@id=\"root-app\"]/div/div[2]/section/div[7]/ol/li/div/div/div/div[2]/h3/a")
    protected List<WebElement> productosLista;





    public void ingresaPais(String pais){

        System.out.println("A comparar con: " + pais);
        for (WebElement enlace : enlaces){
            System.out.println(enlace.getText());
            if(enlace.getText().trim().equals(pais)){
                enlace.click();
                break;
            }
        }

    }

    public void buscaFiltro(String filtro){
        time(2000);
        cookies.click();
        barraFiltro.sendKeys(filtro);
    }

    public void seleccionaBusqueda(){
        lupa.click();
    }

    public void buscaCondicion(String condicion){
        time(2000);
        System.out.println("A comparar con: " + condicion);
        for (WebElement enlace : condiciones){
            System.out.println("elemento: " + enlace.getText());
            if(enlace.getText().trim().contains(condicion)){
                enlace.click();
                break;
            }
        }
    }

        public void buscaCiudad(String ciudad){
            time(1000);
            System.out.println("A comparar con: " + ciudad);
            for (WebElement enlace : ciudades){
                System.out.println("elemento Ciudad: " + enlace.getText());
                if(enlace.getText().trim().contains(ciudad)){
                    enlace.click();
                    break;
                }
            }
        }

    public void ordenar(){
        time(2000);
        ordenarPor.click();
    }

    public void seleccionaOrden(String orden){
        time(2000);
        System.out.println("A comparar con: " + orden);
        for (WebElement enlace : listaOrdenar){
            System.out.println("elemento: " + enlace.getText());
            if(enlace.getText().trim().equals(orden)){
                enlace.click();
                break;
            }
        }
    }

    public void imprimeProductos(){
        time(2000);
       int aux = 0;
        for (WebElement enlace : productosLista){
            System.out.println(enlace.getText());
            aux++;
            if(aux==5){
                break;
            }
        }
    }

    public void time (int tiempo){
        try {
            Thread.sleep(tiempo);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



}
