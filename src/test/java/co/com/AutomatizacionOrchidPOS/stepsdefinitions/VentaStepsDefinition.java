package co.com.AutomatizacionOrchidPOS.stepsdefinitions;

import co.com.AutomatizacionOrchidPOS.models.CredencialesVenta;
import co.com.AutomatizacionOrchidPOS.questions.Venta.ValidacionVenta;
import co.com.AutomatizacionOrchidPOS.tasks.HacerVenta;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import java.util.List;


import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.is;


public class VentaStepsDefinition {

    @Cuando("^ingrese datos validos en \\(Id Producto y Cantidad\\)$")
    public void ingreseDatosValidosEnIdProductoYCantidad(List<CredencialesVenta>credencialesVenta) {

        theActorInTheSpotlight().attemptsTo(HacerVenta.hacerVenta(credencialesVenta));

    }


    @Entonces("^se deben visualizar los detalles de la venta y el registro de esta en el historial de ventas$")
    public void seDebenVisualizarLosDetallesDeLaVentaYElRegistroDeEstaEnElHistorialDeVentas() {


        theActorInTheSpotlight().should(seeThat(ValidacionVenta.validarVenta(), is(true)));

    }



}
