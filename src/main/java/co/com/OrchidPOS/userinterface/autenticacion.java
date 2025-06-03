package co.com.OrchidPOS.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


public class autenticacion extends PageObject {
    public static Target INPUT_CORREO = Target.the(" Ingreso del Correo").located(By.xpath("//*[@id=\"root\"]/div/div/div/div[1]/input"));
    public static Target INPUT_CLAVE = Target.the("Ingreso del password").located(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/input"));
    public static Target BTN_INICIOSESION = Target.the("Boton inicio sesion").located(By.xpath("//*[@id=\"root\"]/div/div/div/button"));
    public static final Target TITULO_BIENVENIDA = Target.the("Título de bienvenida").located(By.xpath("//*[@id='root']/div/div/div/h1[text()='Bienvenido a Bella & Actual']"));
    public static final Target TEXTO_LISTO = Target.the("2do titulo").located(By.xpath("//*[@id=\"root\"]/div/div/div/h2"));
    public static final Target TEXTO_BELLA = Target.the("Bella y Actual").located(By.xpath("//*[@id=\"root\"]/header/div/h6"));

}
