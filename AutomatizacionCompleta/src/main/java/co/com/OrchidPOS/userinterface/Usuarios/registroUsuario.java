package co.com.OrchidPOS.userinterface.Usuarios;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class registroUsuario extends PageObject {
    public static Target BTN_USUARIOS = Target.the("Apartado Usuarios").located(By.xpath("//*[@id=\"root\"]/header/div/div/a[3]"));
    public static Target BTN_AGREGAR_USU = Target.the("+").located(By.xpath("//*[@id=\"root\"]/div/div/div/button"));
    public static Target INPUT_NOMBRE = Target.the("Nombre").located(By.xpath("//*[@id=\"root\"]/div/div/form/div[1]/input"));
    public static Target INPUT_CONTRASEÑA = Target.the("Contraseña").located(By.xpath("//*[@id=\"root\"]/div/div/form/div[2]/input"));
    public static Target INPUT_CEDULA = Target.the("Cedula").located(By.xpath("//*[@id=\"root\"]/div/div/form/div[3]/input"));
    public static Target INPUT_EMAIL = Target.the("Email").located(By.xpath("//*[@id=\"root\"]/div/div/form/div[4]/input"));
    public static Target INPUT_TELEFONO = Target.the("Telefono").located(By.xpath("//*[@id=\"root\"]/div/div/form/div[5]/input"));
    public static Target INPUT_FECHACONTRATO = Target.the("Fecha contrato").located(By.xpath("//*[@id=\"root\"]/div/div/form/div[6]/input"));
    public static Target INPUT_ROL = Target.the("Rol").located(By.xpath("//*[@id=\"root\"]/div/div/form/div[7]/select"));
    public static Target BTN_REGISTRO = Target.the("Boton Registro").located(By.xpath("//*[@id=\"root\"]/div/div/form/button"));
    public static final Target BTN_EDITAR = Target.the("Editar").located(By.xpath("//*[@id=\"root\"]/div/div/table/tbody/tr[1]/td[8]/button"));
    public static final Target BTN_AGREGAR = Target.the("Boton agregar Usuario").located(By.xpath("//*[@id=\"root\"]/div/div/div/button"));
    public static final Target BTN_ELIMINAR = Target.the("Boton de eiminar usuario").located(By.xpath("//*[@id=\"root\"]/div/div/table/tbody/tr[1]/td[9]/button"));
}
