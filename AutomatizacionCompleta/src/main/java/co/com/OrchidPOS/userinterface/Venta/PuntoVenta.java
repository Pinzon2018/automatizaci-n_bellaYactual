package co.com.OrchidPOS.userinterface.Venta;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PuntoVenta extends PageObject{

    public static  Target BOTON_POS = Target.the("Boton de POS").located(By.xpath("//*[@id=\"root\"]/header/div/div/a[5]"));
    public static Target INPUT_IDPRODUCTO = Target.the("Campo ID Producto").located(By.xpath("//*[@id=\"root\"]/div/div/form/div[1]/select"));
    public static Target INPUT_CANTIDAD = Target.the("Campo Cantidad de unidades").located(By.xpath("//*[@id=\"root\"]/div/div/form/div[2]/input"));

    public static Target BOTON_AGREGAR_PRODUCTO = Target.the("Botón para agregar productos ").located(By.xpath("//*[@id=\"root\"]/div/div/form/button[1]"));

    public static Target BOTON_HISTORIAL_VENTAS = Target.the("Botón historial ventas ").located(By.xpath("//*[@id=\"root\"]/header/div/div/a[6]"));

    public static Target BOTON_FINALIZAR_VENTA = Target.the("Botón para concluir venta ").located(By.xpath("//*[@id=\"root\"]/div/div/form/button[2]"));

    public static Target ID_VENTA = Target.the("ID de la última venta realizada").located(By.xpath("//table//tbody//tr[last()]//td[1]"));

    public static Target USUARIO = Target.the("Username").located(By.xpath("//*[@id=\"root\"]/div/div/table/tbody/tr[1]/td[3]"));

}
