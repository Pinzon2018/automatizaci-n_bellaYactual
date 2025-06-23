package co.com.OrchidPOS.runners.RunnerVenta;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/ModuloVentas/venta.feature",
        glue = {"co.com.OrchidPOS.stepsdefinitions", "co.com.OrchidPOS.utils"},
        snippets = SnippetType.CAMELCASE)


public class VentaRunner {
}
