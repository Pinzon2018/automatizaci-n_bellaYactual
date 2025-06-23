package co.com.OrchidPOS.tasks.AbrirPaginas;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static co.com.OrchidPOS.userinterface.Usuarios.eliminacionUsuario.BTN_USUARIOS;

public class AbiriUsuarios implements Task {

    public static AbiriUsuarios navegar() {
        return Instrumented.instanceOf(AbiriUsuarios.class).withProperties();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_USUARIOS)
        );
    }
}
