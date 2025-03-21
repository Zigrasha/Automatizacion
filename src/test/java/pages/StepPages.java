package pages;

import org.springframework.beans.factory.annotation.Autowired;
import pages.casoFacebook.CasuisticaFacebookPage;
import org.springframework.stereotype.Component;
import pages.casoPrueba.CasoPruebaPage;
import utils.MyWebDriverManager;


@Component
public class StepPages {

    @Autowired
    private MyWebDriverManager myWebDriverManager;

    public CasuisticaFacebookPage casuisticaFacebookPage() {
        return new CasuisticaFacebookPage(myWebDriverManager.getDriver());
    }

    public CasoPruebaPage casoPruebaPage() {
        return new CasoPruebaPage(myWebDriverManager.getDriver());
    }

}
