package co.com.OrchidPOS.tasks.Productos;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.core.steps.Instrumented;


import static co.com.OrchidPOS.userinterface.Productos.PaginaEliminacionProducto.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;


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

        System.out.println("DEBUG: Intentando encontrar y hacer clic en el botón de eliminar para: " + ProductoAEliminar);

        actor.attemptsTo(
                Click.on(PRODUCTOS),

                WaitUntil.the(BOTON_ELIMINAR_PRODUCTO_NOMBRE, isVisible()).forNoMoreThan(10).seconds(),
                WaitUntil.the(BOTON_ELIMINAR_PRODUCTO_NOMBRE, isClickable()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_ELIMINAR_PRODUCTO_NOMBRE.of(ProductoAEliminar)),


                WaitUntil.the(BTN_CONFIRMAR_ELIMINACION, isVisible()).forNoMoreThan(15).seconds(),
                Click.on(BTN_CONFIRMAR_ELIMINACION)
        );
        System.out.println("DEBUG: Clic estándar exitoso en el botón de eliminar.");


    }
}
