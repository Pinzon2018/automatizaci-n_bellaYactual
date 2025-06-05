package co.com.AutomatizacionOrchidPOS.tasks;

import co.com.AutomatizacionOrchidPOS.models.CredencialesVenta;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;



import java.util.List;

import static co.com.AutomatizacionOrchidPOS.userinterface.InicioOrchidPOS.BOTON_POS;
import static co.com.AutomatizacionOrchidPOS.userinterface.PuntoVenta.*;


public class HacerVenta implements Task {

    private List<CredencialesVenta> credencialesVenta;

    public HacerVenta(List<CredencialesVenta> credencialesVenta) {
        this.credencialesVenta = credencialesVenta;
    }

    public static HacerVenta hacerVenta(List<CredencialesVenta> credencialesVenta) {
        return Instrumented.instanceOf(HacerVenta.class).withProperties(credencialesVenta);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(


                Click.on(BOTON_POS),

                Click.on(INPUT_IDPRODUCTO),
                Enter.theValue(String.valueOf(credencialesVenta.get(0).getIdProducto())).into(INPUT_IDPRODUCTO),

                Click.on(INPUT_CANTIDAD),
                Enter.theValue(String.valueOf(credencialesVenta.get(0).getCantidad())).into(INPUT_CANTIDAD),

                Click.on(BOTON_AGREGAR_PRODUCTO),

                Click.on(INPUT_IDPRODUCTO),
                Enter.theValue(String.valueOf(credencialesVenta.get(0).getIdProducto())).into(INPUT_IDPRODUCTO),

                Click.on(INPUT_CANTIDAD),
                Enter.theValue(String.valueOf(credencialesVenta.get(0).getCantidad())).into(INPUT_CANTIDAD),

                Scroll.to(BOTON_FINALIZAR_VENTA),

                Click.on(BOTON_FINALIZAR_VENTA)


        );


        try {

            WebDriver driver = BrowseTheWeb.as(actor).getDriver();

            WebDriverWait wait  = new WebDriverWait(driver,15);
            wait.until(ExpectedConditions.alertIsPresent());


            Alert alert = driver.switchTo().alert();
            String textAlert = alert.getText();
            actor.remember("mensajeVenta", textAlert);
            alert.accept();

            actor.attemptsTo(
                    Click.on(BOTON_HISTORIAL_VENTAS),
                    Scroll.to(ID_VENTA),
                    Click.on(ID_VENTA)
            );



        } catch (NoAlertPresentException e) {
            System.out.println("No había ninguna alerta para aceptar.");
        }




    }
}
