package co.com.AutomatizacionOrchidPOS.userinterface;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl(value = "http://localhost:5173/")

public class InicioOrchidPOS extends PageObject{
    public static Target BOTON_POS = Target.the("Botón Point of sales").located(By.cssSelector("#root > header > div > div > a:nth-child(8)"));
    public static Target BOTON_SUBCATEGORIAS = Target.the("Botón para ir a subcategorias").located(By.xpath("//*[@id=\"root\"]/header/div/div/a[6]"));

}
