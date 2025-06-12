package co.com.AutoProductos.tasks;

import co.com.AutoProductos.models.NuevoProducto;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import javax.xml.stream.events.EntityReference;
import java.util.List;

import static co.com.AutoProductos.userinterface.PaginaRegistroProducto.*;

public class LlenarFormularioProd implements Task {

    private List<NuevoProducto> datos;

    public LlenarFormularioProd(List<NuevoProducto> datos) {

        this.datos = datos;
    }

    public static LlenarFormularioProd con(List<NuevoProducto> datos) {
        return Instrumented.instanceOf(LlenarFormularioProd.class).withProperties(datos);
    }

    @Override

    public <T extends Actor> void performAs(T actor) {
        NuevoProducto producto = datos.get(0);

        actor.attemptsTo(
                Enter.theValue(producto.getNombreProd()).into(INPUT_NOMBRE_PROD),
                Enter.theValue(producto.getMedidaProd()).into(INPUT_MEDIDA_PROD),
                Enter.theValue(producto.getPrecioBrutoProd()).into(INPUT_PRECIO_BRUTO_PROD),
                Enter.theValue(producto.getIvaProd()).into(INPUT_IVA_PROD),
                Enter.theValue(producto.getPorcentajeGanancia()).into(INPUT_PORCENTAJE_GANANCIA_PROD),
                Enter.theValue(producto.getUnidadesTotalesProd()).into(INPUT_UNIDADES_TOTALES_PROD),
                Enter.theValue(producto.getEstadoProd()).into(INPUT_ESTADO_PROD),
                Enter.theValue(producto.getMarcaProd()).into(INPUT_MARCA_PROD),
                Enter.theValue(producto.getEstadoProd()).into(INPUT_PROVEEDOR_PROD),
                Enter.theValue(producto.getCategoriaProd()).into(INPUT_CATEGORIA_PROD),
                Click.on(BTN_REGISTRADO_PROD)
        );
    }
}