package pages.loginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this); // Importante para inicializar los elementos
    }


    @FindBy(name = "username")
    protected WebElement user;

    @FindBy(name = "password")
    protected WebElement pass;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
    protected WebElement boton;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[1]/a/div[2]/img")
    protected WebElement imagen;

    @FindBy(xpath = "//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p")
    protected WebElement invalid;


    public void ingresaNombre(String username){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        user.sendKeys(username);
    }

    public void ingresaPassword(String password){
        pass.sendKeys(password);
    }

    public void seleccionarBoton(){
        boton.click();

    }

    public void ingresoExitoso(){

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (imagen.isDisplayed()) {
            driver.quit();
        } else {
            driver.quit();
            throw new RuntimeException("No se logró validar el ingreso exitoso al localizar la imagen.");

        }

    }


    public void ingresoNoExitoso(){

        String textoValidador = "Invalid credentials";

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (textoValidador.equals(invalid.getText())) {
            driver.quit();
        } else {
            driver.quit();
            throw new RuntimeException("No se logró validar el texto de credenciales invalidas");
        }



    }

    public void logroIngreso(){

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (imagen.isDisplayed()) {
            System.out.println("se logro ver la imagen");
        } else {
            driver.quit();
            throw new RuntimeException("No se logró validar el ingreso exitoso al localizar la imagen.");

        }

    }

}
