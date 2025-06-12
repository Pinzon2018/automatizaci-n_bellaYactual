package co.com.AutoProductos.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class PaginaPrincipal extends PageObject {

    public static final Target CONFIRMACION_DASHBOARD = Target.the("COnfirmacion del dashboard")
            .located(By.xpath("//div[@class='welcomeMessage']"));

    public static final Target MODULO_PRODUCTOS = Target.the("Modulo productos")
            .located(By.xpath("//a[@href='/productos']"));
}
