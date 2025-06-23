package co.com.OrchidPOS.runners.RunnerInicioSesion;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/ModuloInicioSesion/autenticacion_OrchidPOS.feature",
        glue = {"co.com.OrchidPOS.stepsdefinitions", "co.com.OrchidPOS.utils.hooks"},
        snippets = SnippetType.CAMELCASE)

public class AutenticacionRunner {
}