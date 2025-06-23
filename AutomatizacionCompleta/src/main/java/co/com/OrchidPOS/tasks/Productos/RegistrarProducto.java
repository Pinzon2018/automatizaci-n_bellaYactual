package co.com.OrchidPOS.tasks.Productos;
import co.com.OrchidPOS.models.CredencialesProductos.CredencialesRegistroProd;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;

import static co.com.OrchidPOS.userinterface.Productos.registroProducto.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RegistrarProducto implements Task{
    private List<CredencialesRegistroProd> datosProducto;

    public  RegistrarProducto(List<CredencialesRegistroProd> datosProducto){
        this.datosProducto = datosProducto;
    }

    public static RegistrarProducto conLainformacion(List<CredencialesRegistroProd> datosProducto){
        return instrumented(RegistrarProducto.class, datosProducto);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_PRODUCTOS),
                Click.on(BTN_REGISTRO_PROD),
                Click.on(INPUT_NOMBRE_PROD),
                Enter.theValue(datosProducto.get(0).getNombreProd()).into(INPUT_NOMBRE_PROD),
                Click.on(INPUT_MEDIDA),
                Enter.theValue(datosProducto.get(0).getMedidaProd()).into(INPUT_MEDIDA),
                Click.on(INPUT_PRECIO_B),
                Enter.theValue(datosProducto.get(0).getPrecioBrutoProd()).into(INPUT_PRECIO_B),
                Click.on(INPUT_IVA),
                Enter.theValue(datosProducto.get(0).getIvaProd()).into(INPUT_IVA),
                Click.on(INPUT_PORCEN),
                Enter.theValue(datosProducto.get(0).getPorcentajeGanancia()).into(INPUT_PORCEN),
                Click.on(INPUT_UNID),
                Enter.theValue(datosProducto.get(0).getUnidadesTotalesProd()).into(INPUT_UNID),
                Click.on(INPUT_ESTADO),
                Enter.theValue(datosProducto.get(0).getEstadoProd()).into(INPUT_ESTADO),
                Click.on(INPUT_MARCA),
                Enter.theValue(datosProducto.get(0).getMarcaProd()).into(INPUT_MARCA),
                Click.on(INPUT_PROVEEDOR),
                Enter.theValue(datosProducto.get(0).getProveedor()).into(INPUT_PROVEEDOR),
                Click.on(INPUT_CATEGORIA),
                Enter.theValue(datosProducto.get(0).getCategoria()).into(INPUT_CATEGORIA),
                Click.on(BTN_GUARDAR)
        );
    }
}
