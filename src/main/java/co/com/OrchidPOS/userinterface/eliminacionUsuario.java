package co.com.OrchidPOS.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.core.annotations.findby.By;



public class eliminacionUsuario extends PageObject {
    public static Target BTN_USUARIOS = Target.the("Apartado Usuarios").located(By.xpath("//*[@id=\"root\"]/header/div/div/a[3]"));
    public static Target BTN_ELIMINAR = Target.the("Boton eliminar Usuario").located(By.xpath("//*[@id=\"root\"]/div/div/table/tbody/tr[2]/td[9]/button"));
    public static Target ACEPTAR_ELIMINAR = Target.the("Boton de Aceptar").located(By.xpath("//*[@id=\"root\"]/div/div/div/div/button[1]"));

    public static final Target TEXT_ID = Target.the("ID").located(By.xpath("//*[@id=\"root\"]/div/div/table/thead/tr/th[1][text()='ID']"));
    public static final Target TEXT_NOMBRE = Target.the("Nombre").located(By.xpath("//*[@id=\"root\"]/div/div/table/thead/tr/th[2][text()='Nombre']"));
    public static final Target TEXT_CEDULA = Target.the("Cedula").located(By.xpath("//*[@id=\"root\"]/div/div/table/thead/tr/th[3][text()='Cédula']"));
    public static final Target TEXT_CORREO = Target.the("Correo").located(By.xpath("//*[@id=\"root\"]/div/div/table/thead/tr/th[4][text()='Correo']"));
    public static final Target TEXT_TELEFONO = Target.the("Telefono").located(By.xpath("//*[@id=\"root\"]/div/div/table/thead/tr/th[5][text()='Teléfono']"));
    public static final Target TEXT_FECHACONTRATO = Target.the("Fecha Contrato").located(By.xpath("//*[@id=\"root\"]/div/div/table/thead/tr/th[6][text()='Fecha Contrato']"));
    public static final Target TEXT_ROL = Target.the("Rol").located(By.xpath("//*[@id=\"root\"]/div/div/table/thead/tr/th[7][text()='Rol']"));
}
