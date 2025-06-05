package co.com.AutomatizacionOrchidPOS.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;



public class LogInInterface extends PageObject {

    public static Target INPUT_CORREO = Target.the("campo usuario").located(By.xpath("//*[@id=\"root\"]/div/div/div/div[1]/input"));

    public static Target INPUT_CONTRASEÑA = Target.the("campo contraseña").located(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/input"));

    public static Target BOTON_LOGIN = Target.the("botón log in").located(org.openqa.selenium.By.xpath("//*[@id=\"root\"]/div/div/div/button"));

    public static Target  MSJ_LOGIN= Target.the("Mensaje log in exitoso").located(By.cssSelector("#root > div > div > div > h1"));
}
