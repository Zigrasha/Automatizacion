package pages;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pages.loginPage.LoginPage;
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

}
