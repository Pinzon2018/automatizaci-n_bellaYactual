package co.com.AutomatizacionOrchidPOS.tasks;


import co.com.AutomatizacionOrchidPOS.userinterface.InicioOrchidPOS;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirHomepage implements Task {

    InicioOrchidPOS inicioOrchidPOS;

    public static AbrirHomepage homepage () { return Tasks.instrumented(AbrirHomepage.class);}
    @Override
    public  <T extends Actor> void performAs(T actor){actor.attemptsTo(Open.browserOn(inicioOrchidPOS));
    }
}
