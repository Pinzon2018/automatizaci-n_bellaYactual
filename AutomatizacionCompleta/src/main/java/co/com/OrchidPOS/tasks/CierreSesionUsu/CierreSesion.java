package co.com.OrchidPOS.tasks.CierreSesionUsu;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.OrchidPOS.userinterface.CierreSesionUserInterface.cierreSesion.*;

public class CierreSesion implements Task {

    public static CierreSesion aute(){
        return Instrumented.instanceOf(CierreSesion.class).withProperties();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_LOGOUT)
        );
    }
}
