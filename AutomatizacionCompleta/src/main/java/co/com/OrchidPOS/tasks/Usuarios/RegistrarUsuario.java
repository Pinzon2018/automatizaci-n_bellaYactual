package co.com.OrchidPOS.tasks.Usuarios;


import co.com.OrchidPOS.models.CredencialesUsuarios.CredencialesRegistroUsuario;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;


import java.util.List;

import static co.com.OrchidPOS.userinterface.Usuarios.registroUsuario.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class RegistrarUsuario implements Task {

    private List<CredencialesRegistroUsuario> datosUsuario;
    public  RegistrarUsuario(List<CredencialesRegistroUsuario> datosUsuario){
        this.datosUsuario = datosUsuario;
    }

    public static RegistrarUsuario aute(List<CredencialesRegistroUsuario> datosUsuario){
        return instrumented(RegistrarUsuario.class,datosUsuario);
    }



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_USUARIOS, isVisible()).forNoMoreThan(15).seconds(),
                Click.on(BTN_USUARIOS),
                WaitUntil.the(BTN_AGREGAR, isVisible()).forNoMoreThan(15).seconds(),
                Click.on(BTN_AGREGAR_USU),
                WaitUntil.the(INPUT_NOMBRE, isVisible()).forNoMoreThan(15).seconds(),
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
                SelectFromOptions.byVisibleText(datosUsuario.get(0).getRol()).from(INPUT_ROL)
        );

        actor.remember("nombreRegistrado", datosUsuario.get(0).getNombre());
        actor.remember("cedulaRegistro", datosUsuario.get(0).getCedula());
        actor.remember("emailRegistro", datosUsuario.get(0).getEmail());
            actor.remember("telefonoRemember", datosUsuario.get(0).getTelefono());
        actor.remember("fechaRegistro", datosUsuario.get(0).getFechaContrato());
        actor.remember("rolRegistro", datosUsuario.get(0).getRol());

        actor.attemptsTo(Click.on(BTN_REGISTRO));
    }
}
