package co.com.OrchidPOS.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class editarUsuario extends PageObject {
    public static Target BTN_USUARIOS = Target.the("Apartado Usuarios").located(By.xpath("//*[@id=\"root\"]/header/div/div/a[3]"));
    public static Target BTN_EDITAR = Target.the("Boton Editar").located(By.xpath("//*[@id=\"root\"]/div/div/table/tbody/tr[2]/td[8]/button"));

    public static Target INPUT_NOMBRE = Target.the("Nombre Usuario").located(By.xpath("//*[@id=\"root\"]/div/div/form/input[1]"));
    public static Target INPUT_CONTRASEÑA = Target.the("Contraseña Usuario").located(By.xpath("//*[@id=\"root\"]/div/div/form/input[2]"));
    public static Target INPUT_CEDULA = Target.the("Cedula Usuario").located(By.xpath("//*[@id=\"root\"]/div/div/form/input[3]"));
    public static Target INPUT_CORREO = Target.the("Correo Usuario").located(By.xpath("//*[@id=\"root\"]/div/div/form/input[4]"));
    public static Target INPUT_TELEFONO = Target.the("Telefono Usuario").located(By.xpath("//*[@id=\"root\"]/div/div/form/input[5]"));
    public static Target INPUT_FECHACONTRATO = Target.the("Fecha Contrato Usuario").located(By.xpath("//*[@id=\"root\"]/div/div/form/input[6]"));
    public static Target INPUT_ROL = Target.the("Rol Usuario").located(By.xpath("//*[@id=\"root\"]/div/div/form/select"));
    public static Target BTN_GUARDARCAMBIOS = Target.the("Guardar Cambios").located(By.xpath("//*[@id=\"root\"]/div/div/form/button"));
    public static final Target TEXT_ID = Target.the("ID").located(By.xpath("//*[@id=\"root\"]/div/div/table/thead/tr/th[1][text()='ID']"));
}
