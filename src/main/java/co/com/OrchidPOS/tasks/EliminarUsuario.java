package co.com.OrchidPOS.tasks;

import co.com.OrchidPOS.models.CredencialesEditarUsuario;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;

import static co.com.OrchidPOS.userinterface.eliminacionUsuario.*;

public class EliminarUsuario implements Task {

    public static EliminarUsuario aute(){
        return Instrumented.instanceOf(EliminarUsuario.class).withProperties();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_USUARIOS),
                Click.on(BTN_ELIMINAR),
                Click.on(ACEPTAR_ELIMINAR)
        );
    }
}
