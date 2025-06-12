package co.com.AutoProductos.userinterface;

import net.thucydides.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaInicioSesion  extends  PageObject{

    public static final Target CAMPO_USUARIO = Target.the("Campo de usuario")
            .located(By.xpath("//input[@type='email' and @placeholder='Correo']"));

    public static final Target CAMPO_CONTRASEÑA = Target. the("Campo de contraseña")
            .located(By.xpath("//input[@type='password' and @placeholder='Contraseña']"));

    public static final Target BTN_INICIAR_SESION = Target.the("Boton inicio de sesion")
            .located(By.xpath("//button[text()='Login']"));

}
