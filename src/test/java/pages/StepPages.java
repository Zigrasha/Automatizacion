package pages;

import org.springframework.beans.factory.annotation.Autowired;
import pages.casoFacebook.CasuisticaFacebookPage;
import org.springframework.stereotype.Component;
import utils.MyWebDriverManager;


@Component
public class StepPages {

    @Autowired
    private MyWebDriverManager myWebDriverManager;

    public CasuisticaFacebookPage casuisticaFacebookPage() {
        return new CasuisticaFacebookPage(myWebDriverManager.getDriver());
    }
}
