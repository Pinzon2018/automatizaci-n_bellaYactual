package co.com.AutoProductos.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/registro_producto.feature",
        glue = {"co.com.AutoProductos.stepsdefinitions", "co.com.AutoProductos.utils.hooks"},
        snippets = SnippetType.CAMELCASE

)
public class AutenticacionRunner {
}