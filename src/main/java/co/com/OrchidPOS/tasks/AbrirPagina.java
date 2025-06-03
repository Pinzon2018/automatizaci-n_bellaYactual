package co.com.OrchidPOS.tasks;

import co.com.OrchidPOS.userinterface.InicioOrchidPOS;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirPagina implements Task {

    InicioOrchidPOS inicioOrchidPOS;

    public static AbrirPagina lapagina(){ return Tasks.instrumented(AbrirPagina.class);}
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Open.browserOn(inicioOrchidPOS));
    }
}