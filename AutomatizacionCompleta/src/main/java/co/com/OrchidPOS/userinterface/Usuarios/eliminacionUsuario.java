package co.com.OrchidPOS.userinterface.Usuarios;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.core.annotations.findby.By;



public class eliminacionUsuario extends PageObject {
    public static Target BTN_USUARIOS = Target.the("Apartado Usuarios").located(By.xpath("//*[@id=\"root\"]/header/div/div/a[3]"));
    public static Target BTN_ELIMINAR = Target.the("Boton eliminar Usuario").located(By.xpath("//*[@id=\"root\"]/div/div/table/tbody/tr[2]/td[9]/button"));
    public static Target ACEPTAR_ELIMINAR = Target.the("Boton de Aceptar").located(By.xpath("//*[@id=\"root\"]/div/div/div/div/button[1]"));
    public static final Target FILAS_TABLA = Target.the("filas de la tabla").located(By.xpath("//table/tbody/tr"));
}
