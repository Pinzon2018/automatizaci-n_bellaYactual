package co.com.AutomatizacionOrchidPOS.tasks;

import co.com.AutomatizacionOrchidPOS.userinterface.RegistroUsuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirPuntoVenta implements Task {


    public static AbrirPuntoVenta puntoVenta() { return Tasks.instrumented(AbrirPuntoVenta.class);}
    @Override
    public  <T extends Actor> void performAs(T actor){actor.attemptsTo(Open.browserOn(registroUsuario));
    }
}

