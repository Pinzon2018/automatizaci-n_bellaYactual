package co.com.OrchidPOS.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class perfil extends PageObject {
    public static Target BTN_PERFIL = Target.the("Perfil").located(By.xpath("//*[@id=\"root\"]/header/div/div/a[2]"));

    public static final Target TEXT_PERFIL = Target.the("Perfil").located(By.xpath("//*[@id=\"root\"]/div/div/div/div/h1[text()='Perfil']"));

}
