package co.com.AutoProductos.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.core.steps.Instrumented;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;


import static co.com.AutoProductos.userinterface.PaginaEliminacionProducto.BTN_ELIMINAR_PRODUCTO;
import static co.com.AutoProductos.userinterface.PaginaEliminacionProducto.BTN_CONFIRMAR_ELIMINACION;


public class EliminarProducto implements Task {

    private final String ProductoAEliminar;

    public EliminarProducto(String ProductoAEliminar) {
        this.ProductoAEliminar = ProductoAEliminar;
    }

    public static EliminarProducto llamado(String ProductoAEliminar) {
        return Instrumented.instanceOf(EliminarProducto.class)
                .withProperties(ProductoAEliminar);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(BTN_ELIMINAR_PRODUCTO(ProductoAEliminar), isClickable()).forNoMoreThan(25).seconds(),
        Click.on(BTN_ELIMINAR_PRODUCTO(ProductoAEliminar))
        );

        actor.attemptsTo(
                WaitUntil.the(BTN_CONFIRMAR_ELIMINACION, isVisible()).forNoMoreThan(15).seconds(),
                Click.on(BTN_CONFIRMAR_ELIMINACION)
        );
    }
}