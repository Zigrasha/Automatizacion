package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.MyWebDriverManager;

public class Hooks {

    @Before
    public void setUp() {
        MyWebDriverManager.startDriver();
    }

    @After
    public void tearDown() {
        MyWebDriverManager.quitDriver();
    }
}
