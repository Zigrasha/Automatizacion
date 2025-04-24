package pages;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pages.jobTitlesPage.JobTitlesPage;
import pages.loginPage.LoginPage;
import pages.mercadoLibrePage.MercadoLibrePage;
import pages.posteoPage.PosteoPage;
import utils.MyWebDriverManager;


@Component
public class StepPages {

    @Autowired
    private MyWebDriverManager myWebDriverManager;

    public LoginPage loginPage() {
        return new LoginPage(myWebDriverManager.getDriver());
    }

    public PosteoPage posteoPage() {
        return new PosteoPage(myWebDriverManager.getDriver());
    }

    public JobTitlesPage jobTitlesPage() {
        return new JobTitlesPage(myWebDriverManager.getDriver());
    }

    public MercadoLibrePage mercadoLibrePage(){ return new MercadoLibrePage(myWebDriverManager.getDriver());}

}
