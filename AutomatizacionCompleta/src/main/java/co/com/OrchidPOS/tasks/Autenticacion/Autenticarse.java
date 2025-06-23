package co.com.OrchidPOS.tasks.Autenticacion;

import co.com.OrchidPOS.models.CredencialesLogin.CredencialesInicioSesion;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.OrchidPOS.userinterface.AutenticacionUserInterface.autenticacion.*;

public class Autenticarse implements Task {

    private List<CredencialesInicioSesion> credenciales;

    public Autenticarse(List<CredencialesInicioSesion> credenciales) {
        this.credenciales = credenciales;
    }

    public static Autenticarse aute(List<CredencialesInicioSesion> credenciales) {
        return Instrumented.instanceOf(Autenticarse.class).withProperties(credenciales);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String correo = credenciales.get(0).getEmail();
        String clave = credenciales.get(0).getClave();

        actor.attemptsTo(
                Click.on(INPUT_CORREO),
                Enter.theValue(correo).into(INPUT_CORREO),
                Click.on(INPUT_CLAVE),
                Enter.theValue(clave).into(INPUT_CLAVE),
                Click.on(BTN_INICIOSESION)
        );

        actor.remember("usuarioLogueado", correo);
    }
}
