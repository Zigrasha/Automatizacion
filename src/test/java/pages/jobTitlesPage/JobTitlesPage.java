package pages.jobTitlesPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;


public class JobTitlesPage {
    private WebDriver driver;

    public JobTitlesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this); // Importante para inicializar los elementos
    }

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")
    protected WebElement Admin;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]")
    protected WebElement boton;

    @FindBy(xpath = "//ul[contains(@class,'oxd-dropdown-menu')]/li")
    protected List<WebElement> job;

    @FindBy(xpath = "//button[contains(@class, 'oxd-button') and contains(., 'Add')]")
    protected WebElement Add;

    @FindBy(xpath = "//input[contains(@class, 'oxd-input') and contains(@class, 'oxd-input--active')]")
    protected WebElement title;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[5]/button[2]")
    protected WebElement save;

    @FindBy(xpath = "//*[@id=\"oxd-toaster_1\"]/div/div/div[2]/p")
    protected WebElement mensaje;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div[2]/div[2]/div/div/div[3]")
    protected List<WebElement> lista;

    @FindBy(xpath = "")
    protected WebElement bas;

    @FindBy(xpath = "")
    protected WebElement yes;

    @FindBy(xpath = "")
    protected WebElement vali;



    public void navegaAdmin() {
        Admin.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void seleccionarBoton() {
        boton.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void seleccionaJobtitles() {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (WebElement opcion : job) {

            System.out.println(opcion.getText());
            if (opcion.getText().trim().equals("Job Titles")){
                opcion.click();
                break;
            }
        }

    }

    public void presionarAdd() {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Add.click();
    }

    public void ingresaTitulo(String titulo) {

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        title.click();

        LocalDateTime ahora = LocalDateTime.now();

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        title.sendKeys( titulo + ahora.format(formato));

        }

    public void clicBoton() {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        save.click();

    }

    public void tituloExistoso() {

        String confirmacion = "Success";

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (confirmacion.equals(mensaje.getText())) {
            System.out.println("Se logra ver el mensaje: " + mensaje.getText());

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.quit();
        } else {
            driver.quit();
            throw new RuntimeException("No se logró validar el texto de success");
        }
    }

    public void clicTitulo(){

    }

    public void clicBorrar(){}

    public void tituloBorrado(){}
}
