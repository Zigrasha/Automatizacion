package pages.casoPrueba;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CasoPruebaPage {

    private WebDriver driver;

    public CasoPruebaPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this); // Importante para inicializar los elementos
    }


    @FindBy(xpath = "//*[@id=\"main-header\"]/div/div[2]/div/div/div[1]/div/button")
    protected WebElement ingresar;

    @FindBy(id = "user")
    protected WebElement user;

    @FindBy(id = "password")
    protected WebElement password;

    @FindBy(xpath = "//*[@id=\"menuSlideLogin\"]/form/button")
    protected WebElement bottonLogin;

    @FindBy(xpath = "//*[@id=\"main-header\"]/div[2]/div/div[1]/button")
    protected WebElement depositar;




    public void seleccionarBoton(){
        //dejamos que cargue la pagina
        waitExplicito();

        //selecciono el boton ingresar
        ingresar.click();
    }

    public void ingresaNombre(String usuario){
        //escribo el usuario
        waitExplicito();
        user.sendKeys(usuario);
    }

    public void ingresaPassword(String pass) {

        password.sendKeys(pass);
    }

    public void validarAcceso() {
        bottonLogin.click();
    }

    public void seleccionarBotonDeposito() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        depositar.click();
    }

    public void muestraFormulario() {
        driver.close();
        driver.quit();

    }


    public void waitExplicito() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
