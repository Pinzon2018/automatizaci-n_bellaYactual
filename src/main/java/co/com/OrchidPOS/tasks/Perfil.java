package co.com.OrchidPOS.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.OrchidPOS.userinterface.perfil.*;

public class Perfil implements Task {

    public static Perfil aute(){
        return Instrumented.instanceOf(Perfil.class).withProperties();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_PERFIL)
        );
    }
}
