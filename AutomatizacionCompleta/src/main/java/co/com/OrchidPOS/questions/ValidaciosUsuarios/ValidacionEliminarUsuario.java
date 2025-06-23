package co.com.OrchidPOS.questions.ValidaciosUsuarios;

import co.com.OrchidPOS.userinterface.Tablas.tablaUsuarios;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.List;

public class ValidacionEliminarUsuario implements Question<Boolean> {

    private final int cantidadAntes;

    public ValidacionEliminarUsuario(int cantidadAntes) {
        this.cantidadAntes = cantidadAntes;
    }

    public static ValidacionEliminarUsuario conCantidadAnterior(int cantidadAntes) {
        return new ValidacionEliminarUsuario(cantidadAntes);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        List<WebElementFacade> filasActuales = tablaUsuarios.FILAS_TABLA.resolveAllFor(actor);

        System.out.println("Cantidad antes: " + cantidadAntes);
        System.out.println("Cantidad después: " + filasActuales.size());

        return filasActuales.size() < cantidadAntes;
    }
}
