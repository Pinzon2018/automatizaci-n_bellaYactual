package co.com.OrchidPOS.userinterface.Productos;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaEliminacionProducto extends PageObject {

    public static Target PRODUCTOS =  Target.the("Boton de eliminar para el producto ")
                .located(By.xpath("//*[@id=\"root\"]/header/div/div/a[4]"));



    public static Target BOTON_ELIMINAR_PRODUCTO_NOMBRE = Target.the("Botón eliminar del producto")
            .locatedBy("//*[@id=\"root\"]/div/div/table/tbody/tr[2]/td[13]/button");



    public static final Target BTN_CONFIRMAR_ELIMINACION = Target.the("Boton para confirmar la eliminacion")
            .located(By.xpath("//*[@id=\"root\"]/div/div/div/div/button[1]"));

}
