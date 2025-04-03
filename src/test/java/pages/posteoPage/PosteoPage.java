package pages.posteoPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PosteoPage {
    private WebDriver driver;

    public PosteoPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this); // Importante para inicializar los elementos
    }

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[12]/a")
    protected WebElement Buzz;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div[2]/div/div/div/div/div/div/div[2]/form/div/textarea")
    protected WebElement come;

    @FindBy(xpath = "//button[contains(@class, 'oxd-button--main')]")
    protected WebElement boton;

    @FindBy(xpath = "//*[@id=\"oxd-toaster_1\"]/div/div/div[2]/p")
    protected WebElement toaster;



    public void navegarBuzz() {
        Buzz.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void ingresaComentario(String comentario) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        come.sendKeys(comentario);
    }

    public void seleccionarBoton() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        boton.click();
    }

    public void publicacionExitosa() {

        String confirmacion = "Success";

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (confirmacion.equals(toaster.getText())) {
            System.out.println("se logra ver el texto: " + confirmacion);

        } else {

            throw new RuntimeException("No se logró validar el texto de success");
        }

    }

}
