package co.com.AutomatizacionOrchidPOS.tasks;

import co.com.AutomatizacionOrchidPOS.models.CredencialesLogIn;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ensure.Ensure;
import java.lang.annotation.Target;
import java.util.List;

import static co.com.AutomatizacionOrchidPOS.userinterface.LogInInterface.*;


public class LogIn implements Task{

    private  List<CredencialesLogIn> credencialesLogIn;

    public LogIn(List<CredencialesLogIn>credencialesLogIn) {this.credencialesLogIn = credencialesLogIn;}

    public static LogIn logIn(List<CredencialesLogIn>credencialesLogIn){
        return  Instrumented.instanceOf(LogIn.class).withProperties(credencialesLogIn);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(INPUT_CORREO),
                Enter.theValue((credencialesLogIn).get(0).getUsuario()).into(INPUT_CORREO),

                Click.on(INPUT_CONTRASEÑA),
                Enter.theValue((credencialesLogIn).get(0).getContraseña()).into(INPUT_CONTRASEÑA),

                Click.on(BOTON_LOGIN),

                Click.on(MSJ_LOGIN)







        );
    }




}
