package co.com.OrchidPOS.tasks;


import co.com.OrchidPOS.models.CredencialesRegistroUsuario;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import java.text.SimpleDateFormat;


import java.util.List;

import static co.com.OrchidPOS.userinterface.registroUsuario.*;

public class RegistrarUsuario implements Task {

    private List<CredencialesRegistroUsuario> datosUsuario;


    public  RegistrarUsuario(List<CredencialesRegistroUsuario> datosUsuario){
        this.datosUsuario = datosUsuario;
    }

    public static RegistrarUsuario aute(List<CredencialesRegistroUsuario> datosUsuario){
        return Instrumented.instanceOf(RegistrarUsuario.class).withProperties(datosUsuario);
    }



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_USUARIOS),
                Click.on(BTN_AGREGAR_USU),
                Click.on(INPUT_NOMBRE),
                Enter.theValue(datosUsuario.get(0).getNombre()).into(INPUT_NOMBRE),
                Click.on(INPUT_CONTRASEÑA),
                Enter.theValue(datosUsuario.get(0).getContraseña()).into(INPUT_CONTRASEÑA),
                Click.on(INPUT_CEDULA),
                Enter.theValue(datosUsuario.get(0).getCedula()).into(INPUT_CEDULA),
                Click.on(INPUT_EMAIL),
                Enter.theValue(datosUsuario.get(0).getEmail()).into(INPUT_EMAIL),
                Click.on(INPUT_TELEFONO),
                Enter.theValue(datosUsuario.get(0).getTelefono()).into(INPUT_TELEFONO),
                Click.on(INPUT_FECHACONTRATO),
                Enter.theValue(datosUsuario.get(0).getFechaContrato()).into(INPUT_FECHACONTRATO),
                SelectFromOptions.byVisibleText(datosUsuario.get(0).getRol()).from(INPUT_ROL),
                Click.on(BTN_REGISTRO)
        );
    }
}
