package co.com.AutoProductos.tasks;

import co.com.AutoProductos.models.NuevoProducto;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.AutoProductos.userinterface.PaginaRegistroProducto.BTN_REGISTAR_PROD;

import static co.com.AutoProductos.userinterface.PaginaPrincipal.MODULO_PRODUCTOS;


import java.util.List;

public class NavegarModuloProducto implements Task {

    public static NavegarModuloProducto paraRegistarProd() {

        return new NavegarModuloProducto();
    }

    @Override
    public <T extends  Actor> void performAs(T actor){
        actor.attemptsTo(
                Click.on(MODULO_PRODUCTOS), //nos lleva al apartado productos
                Click.on(BTN_REGISTAR_PROD)
        );
    }
}
