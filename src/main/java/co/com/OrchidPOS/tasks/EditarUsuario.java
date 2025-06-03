package co.com.OrchidPOS.tasks;


import co.com.OrchidPOS.models.CredencialesEditarUsuario;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;


import java.util.List;

import static co.com.OrchidPOS.userinterface.editarUsuario.*;

public class EditarUsuario implements Task {

    private List<CredencialesEditarUsuario> editardatosUsuario;


    public  EditarUsuario(List<CredencialesEditarUsuario> editardatosUsuario){
        this.editardatosUsuario = editardatosUsuario;
    }

    public static EditarUsuario aute(List<CredencialesEditarUsuario> editardatosUsuario){
        return Instrumented.instanceOf(EditarUsuario.class).withProperties(editardatosUsuario);
    }



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_USUARIOS),
                Click.on(BTN_EDITAR),
                Click.on(INPUT_NOMBRE),
                Enter.theValue(editardatosUsuario.get(0).getNombre()).into(INPUT_NOMBRE),
                Click.on(INPUT_CONTRASEÑA),
                Enter.theValue(editardatosUsuario.get(0).getContraseña()).into(INPUT_CONTRASEÑA),
                Click.on(INPUT_CEDULA),
                Enter.theValue(editardatosUsuario.get(0).getCedula()).into(INPUT_CEDULA),
                Click.on(INPUT_CORREO),
                Enter.theValue(editardatosUsuario.get(0).getEmail()).into(INPUT_CORREO),
                Click.on(INPUT_TELEFONO),
                Enter.theValue(editardatosUsuario.get(0).getTelefono()).into(INPUT_TELEFONO),
                Click.on(INPUT_FECHACONTRATO),
                Enter.theValue(editardatosUsuario.get(0).getFechaContrato()).into(INPUT_FECHACONTRATO),
                SelectFromOptions.byVisibleText(editardatosUsuario.get(0).getRol()).from(INPUT_ROL),
                Click.on(BTN_GUARDARCAMBIOS)
        );
    }
}
