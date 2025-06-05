package co.com.AutomatizacionOrchidPOS.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/venta.feature",
        glue = {"co.com.AutomatizacionOrchidPOS.stepsdefinitions", "co.com.AutomatizacionOrchidPOS.utils"},
        snippets = SnippetType.CAMELCASE)

public class OrchidPOSRunner {
}
