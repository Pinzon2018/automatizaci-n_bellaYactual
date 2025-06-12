package co.com.AutoProductos.userinterface;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaEliminacionProducto extends PageObject {

    public static Target BTN_ELIMINAR_PRODUCTO(String nombreProducto) {
        return Target.the("Boton de eliminar para el producto " + nombreProducto)
                .located(By.xpath("//tr[td[text()='" + nombreProducto + "']]//button[.//svg[@data-testid='DeleteIcon']]"));
    }

    public static final Target BTN_CONFIRMAR_ELIMINACION = Target.the("Boton para confirmar la eliminacion")
            .located(By.xpath("//button[text()='Sí, eliminar' and contains(@class, 'confirmar')]"));

}
