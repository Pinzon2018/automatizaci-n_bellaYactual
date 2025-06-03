package co.com.OrchidPOS.tasks;

import co.com.OrchidPOS.models.CredencialesInicioSesion;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


import java.util.List;

import static co.com.OrchidPOS.userinterface.autenticacion.*;

public class Autenticarse implements Task {

    private List<CredencialesInicioSesion> credenciales;


    public  Autenticarse(List<CredencialesInicioSesion> credenciales){
        this.credenciales = credenciales;
    }

    public static Autenticarse aute(List<CredencialesInicioSesion> credenciales){
        return Instrumented.instanceOf(Autenticarse.class).withProperties(credenciales);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(INPUT_CORREO),
                Enter.theValue(credenciales.get(0).getEmail()).into(INPUT_CORREO),
                Click.on(INPUT_CLAVE),
                Enter.theValue(credenciales.get(0).getClave()).into(INPUT_CLAVE),
                Click.on(BTN_INICIOSESION)
        );
    }
}