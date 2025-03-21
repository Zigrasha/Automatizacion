package stepDefinitions.conexionBase;

import configuracion.TestWebAutomationApplication;
import io.cucumber.java.en.Given;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pages.casoFacebook.CasuisticaFacebookPage;
import utilitario.BaseFacebook;
import utils.MyWebDriverManager;


@SpringBootTest(classes = TestWebAutomationApplication.class)
public class ConexionStep {
    @Autowired
    private MyWebDriverManager manager;

    @Given("Usuario se encuentra en la pagina de Atlantic")
    public void abroAtlantic() {
        manager.navigateTo("https://www.casinoatlanticcity.com/" );
    }

}
