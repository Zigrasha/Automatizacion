package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features", // Ruta de los archivos .feature
        glue = {"stepDefinitions"}, // Paquete donde se encuentran los Step Definitions
        plugin = {"pretty", "html:target/cucumber-reports"}, // Plugins de reportes
        tags = "@LoginNoExitoso"
)
public class TestRunner {
    // Configuración para ejecutar los escenarios de prueba definidos en los archivos .feature
}
