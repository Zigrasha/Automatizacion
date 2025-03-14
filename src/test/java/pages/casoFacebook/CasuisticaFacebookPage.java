package pages.casoFacebook;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

import java.util.List;

public class CasuisticaFacebookPage {


    private static final Logger logger = LoggerFactory.getLogger(CasuisticaFacebookPage.class);


    private WebDriver driver;
/*
    @Autowired
    private WebDriverWait wait = new WebDriverWait(driver, 10); // Tiempo en segundos
*/

    @FindBy(name = "email")
    protected WebElement correoInput;

    @FindBy(name = "pass")
    protected WebElement contrasenaInput;

    @FindBy(name = "login")
    protected WebElement continueButton;

    @FindBy(css = "div._9ay7")
    protected WebElement errorMessageLabel;

    @FindBy(css = "div.xds687c.x17qophe.xixxii4.x13vifvy.x1vjfegm")
    protected WebElement sessionSuccellLabel;

    // Locator para el enlace "Notificaciones"
    @FindBy(xpath = "//*[starts-with(@id, 'mount_0_0')]/div/div/div[1]/div/div[2]/div[5]/div[1]/div[3]/span/span/div/a")
    protected WebElement notificacionLabel;

    // Contenedor de notificaciones
    @FindBy(css = "div[aria-label='Notificaciones'][role='grid']")
    protected WebElement notificacionesContainer;

    // Filas dentro del contenedor de notificaciones
    @FindBy(css = "div.x1n2onr6[role='row']")
    protected List<WebElement> rowsNoti;

    // Modal de validación
    @FindBy(xpath = "//*[starts-with(@id, 'mount_0_0')]//div[1]/div/div[5]/div/div/div[2]/div/div/div/div")
    protected WebElement validNotifyLabel;

    /*
    // Botón "Me gusta" dentro del modal
    @FindBy(css = "div[aria-label='Me gusta'][role='button']")
    protected WebElement likeLabel;

    // Botón "Eliminar Me gusta" dentro del modal
    @FindBy(css = "div[aria-label='Eliminar Me gusta'][role='button']")
    protected WebElement disLikeLabel;
*/


    public CasuisticaFacebookPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this); // Importante para inicializar los elementos
    }

    public void validarPantalla() {

    }

    public void credencialesIncorrectas(String correoIncorrecto, String passIncorrecto) {
        correoInput.sendKeys(correoIncorrecto);
        contrasenaInput.sendKeys(passIncorrecto);
        //damos una pausar para saltar el repcatcha
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            logger.error("Error al pausar el hilo: {}" + e);
            e.printStackTrace();
        }
        continueButton.click();
    }

    public void mensajeError() {
        if(isElementVisible(errorMessageLabel)){
            logger.info("Elemento visible");
        }else{
            logger.info("Elemento no visible");
        }
    }

    public void credencialesCorrectas(String correoCorrecto, String passCorrecto) {
        correoInput.clear();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            logger.error("Error al pausar el hilo: {}" + e);
            e.printStackTrace();
        }
        correoInput.sendKeys(correoCorrecto);
        contrasenaInput.sendKeys(passCorrecto);
        //damos una pausar para saltar el repcatcha
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            logger.error("Error al pausar el hilo: {}" + e);
            e.printStackTrace();
        }
        continueButton.click();
    }

    public void sesionExistosa() {
       /*
        try {
            wait.until(ExpectedConditions.visibilityOf(sessionSuccellLabel));
        } catch (TimeoutException e) {
            logger.error("Error al obtener pagina principal: {}" + e);
            e.printStackTrace();
        }*/
    }

    public void navegarNotificaciones() {

        try {
            Thread.sleep(5000);
        } catch (TimeoutException | InterruptedException e) {
            logger.error("Error el boton de notificacion: {}" + e);
            e.printStackTrace();
        }

        notificacionLabel.click();
    }

    public void scrollVertical() {

    }

    public void notificacionAleatoria() {
        logger.info("Inicio del proceso de selección de notificación.");
            try {
              /*  wait.until(ExpectedConditions.visibilityOf(notificacionesContainer));*/

                logger.info("El contenedor de notificaciones está visible");

                try {
                    Thread.sleep(4000);
                } catch (TimeoutException | InterruptedException e) {
                    logger.error("Error el boton de notificacion: {}" + e);
                    e.printStackTrace();
                }

                int rowCount = rowsNoti.size();
                logger.info("Se encontraron"+ rowCount + "filas en las notificaciones.");
                if (rowCount > 0) {
                    Random random = new Random();
                    int randomIndex = random.nextInt(rowCount);
                    logger.info("Seleccionando fila en el índice aleatorio:"+ randomIndex);
                    WebElement randomRow = rowsNoti.get(randomIndex);
                    randomRow.click();
                    logger.info("Interacción con una fila aleatoria exitosa.");

                } else {
                        logger.info("No se encontraron filas para interactuar.");
                    }
                } catch (Exception e) {
                    System.err.println("Error al seleccionar la notificación: " + e.getMessage());
                }
    }

    public void notificacionSeleccionada() {
        try {
           /* wait.until(ExpectedConditions.visibilityOf(validNotifyLabel));*/
        } catch (TimeoutException e) {
            logger.error("Error validar el modal de notificacion: {}" + e);
            e.printStackTrace();
        }
    }

    public void darLike() {
        try {
            Thread.sleep(4000);
        } catch (TimeoutException | InterruptedException e) {
            logger.error("Error el boton de notificacion: {}" + e);
            e.printStackTrace();
        }

        validNotifyLabel.findElement(By.cssSelector("div[aria-label='Me gusta'][role='button']")).click();
    }

    public void validoLike() {
        try {
            Thread.sleep(4000);
        } catch (TimeoutException | InterruptedException e) {
            logger.error("Error el boton de notificacion: {}" + e);
            e.printStackTrace();
        }

        try {
          /*  wait.until(ExpectedConditions.visibilityOf(disLikeLabel));*/
            validNotifyLabel.findElement(By.cssSelector("div[aria-label='Eliminar Me gusta'][role='button']")).click();
            driver.quit();
        } catch (TimeoutException e) {
            logger.error("Error validar el modal de notificacion: {}" + e);
            e.printStackTrace();
            driver.quit();
        }
    }


    //------ esta funcion va en una clase de tipo util, pero por tiempo lo pongo acá

    public static boolean isElementVisible(WebElement element) {
        try {
            return element.isDisplayed();
        } catch (Exception e) {
            // Si el elemento no es encontrado o no está visible, retornamos false
            e.printStackTrace();
            return false;

        }
    }

    public void scrollToElement(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }






}
