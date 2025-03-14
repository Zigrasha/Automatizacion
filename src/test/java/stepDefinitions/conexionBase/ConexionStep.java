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

/**
 * @author Edgardo Fernandez
*/

@SpringBootTest(classes = TestWebAutomationApplication.class)
public class ConexionStep {
    @Autowired
    private MyWebDriverManager manager;

    @Autowired
    private BaseFacebook baseFacebook;

    private static final Logger logger = LoggerFactory.getLogger(CasuisticaFacebookPage.class);

    @Given("Usuario se encuentra en la pagina de facebook")
    public void abroCanalPrincipal() {
        logger.info("URL:" + baseFacebook.baseFacebook   );
         manager.navigateTo( baseFacebook.baseFacebook );

    }

}
