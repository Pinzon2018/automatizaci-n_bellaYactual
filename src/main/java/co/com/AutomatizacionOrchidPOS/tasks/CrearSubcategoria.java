package co.com.AutomatizacionOrchidPOS.tasks;

import co.com.AutomatizacionOrchidPOS.models.CredencialesSubcategoria;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;

import static co.com.AutomatizacionOrchidPOS.userinterface.Subcategorias.*;
import static co.com.AutomatizacionOrchidPOS.userinterface.InicioOrchidPOS.BOTON_SUBCATEGORIAS;



public class CrearSubcategoria implements Task {

    private List<CredencialesSubcategoria> credencialesSubcategoria;

    public CrearSubcategoria(List<CredencialesSubcategoria> credencialesSubcategoria) {
        this.credencialesSubcategoria= credencialesSubcategoria;
    }

    public static CrearSubcategoria  crearSubcategoria(List<CredencialesSubcategoria>credencialesSubcategoria) {
        return Instrumented.instanceOf(CrearSubcategoria.class).withProperties(credencialesSubcategoria);
    }

    @Override
    public <T extends Actor> void performAs(T actor){

        actor.attemptsTo(

                Click.on(BOTON_SUBCATEGORIAS),
                Click.on(BOTON_AGREGAR_SUBCATEGORIA),

                Click.on(INPUT_NOMBRE_SUBCATEGORIA),
                Enter.theValue(String.valueOf(credencialesSubcategoria.get(0).getNombreSubcategoria())).into(INPUT_NOMBRE_SUBCATEGORIA),

                Click.on(INPUT_DESCRIPCION_SUBCATEGORIA),
                Enter.theValue(String.valueOf(credencialesSubcategoria.get(0).getNombreSubcategoria())).into(INPUT_DESCRIPCION_SUBCATEGORIA),

                Click.on(SELECT_CATEGORIA),
                SelectFromOptions.byVisibleText("CABELLO").from(LISTA_CATEGORIAS),

                Click.on(BOTON_SUBMIT_SUBCATEGORIAS)




        );
    }



}
