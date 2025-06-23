package co.com.OrchidPOS.userinterface.CierreSesionUserInterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.core.annotations.findby.By;

public class cierreSesion extends PageObject {

    public static Target BTN_LOGOUT = Target.the("Boton de cerrar Sesión").located(By.xpath("//*[@id=\"root\"]/header/div/div/button"));
    public static final Target INPUT_CORREO = Target.the("Input Correo").located(By.xpath("//*[@id=\"root\"]/div/div/div/div[1]/input"));
    public static final Target INPUT_CONRASENA = Target.the("Input Contraseña").located(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/input"));
    public static final Target BTN_LOGIN = Target.the("Boton Inicio Sesion").located(By.xpath("//*[@id=\"root\"]/div/div/div/button"));
}
