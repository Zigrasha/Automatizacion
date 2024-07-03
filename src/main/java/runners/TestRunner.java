package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/Login.feature", // Ruta de los archivos .feature
        glue = {"stepDefinitions"}, // Paquete donde se encuentran los Step Definitions
        plugin = {"pretty", "html:target/cucumber-reports"} // Plugins de reportes
)
public class TestRunner {
    // Configuración para ejecutar los escenarios de prueba definidos en los archivos .feature
}
