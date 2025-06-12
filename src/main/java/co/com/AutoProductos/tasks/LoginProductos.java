package co.com.AutoProductos.tasks;

import co.com.AutoProductos.models.CredencialesInicioSesion;

import static co.com.AutoProductos.userinterface.PaginaInicioSesion.CAMPO_USUARIO;
import static co.com.AutoProductos.userinterface.PaginaInicioSesion.CAMPO_CONTRASEÑA;
import static co.com.AutoProductos.userinterface.PaginaInicioSesion.BTN_INICIAR_SESION;

import jdk.internal.net.http.common.Log;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Click;
import java.util.List;


public class LoginProductos  implements  Task{

    private List<CredencialesInicioSesion> credenciales;

    public LoginProductos(List<CredencialesInicioSesion> credenciales){
        this.credenciales = credenciales;
    }

    public static LoginProductos conCredenciales(List<CredencialesInicioSesion> credenciales){
        return Instrumented.instanceOf(LoginProductos.class).withProperties(credenciales);

    }

    @Override
    public <T extends Actor> void performAs(T actor){
        CredencialesInicioSesion cred = credenciales.get(0);

        actor.attemptsTo(
                Enter.theValue(cred.getUsuario()).into(CAMPO_USUARIO),
                Enter.theValue(cred.getContraseña()).into(CAMPO_CONTRASEÑA),
                Click.on(BTN_INICIAR_SESION)

        );
    }

}
