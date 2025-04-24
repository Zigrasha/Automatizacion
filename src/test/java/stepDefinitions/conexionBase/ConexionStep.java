package stepDefinitions.conexionBase;

import configuracion.TestWebAutomationApplication;
import io.cucumber.java.en.Given;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import utils.MyWebDriverManager;


@SpringBootTest(classes = TestWebAutomationApplication.class)
public class ConexionStep {
    @Autowired
    private MyWebDriverManager manager;

    @Given("Usuario se encuentra en la pagina de OrangeHRM")
    public void abroAtlantic() {
        manager.navigateTo("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login" );
    }

    @Given("Usuario se encuentra en la pagina de Mercado Libre")
    public void abroMercadoLibre() {
        manager.navigateTo("https://www.mercadolibre.com" );
    }

}
