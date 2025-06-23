package co.com.OrchidPOS.stepsdefinitions;

import co.com.OrchidPOS.models.CredencialesVentas.CredencialesVenta;
import co.com.OrchidPOS.questions.ValidacionVentas.ValidacionVenta;
import co.com.OrchidPOS.tasks.Venta.HacerVenta;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.is;


public class VentaStepsDefinition {

    @Cuando("^ingrese datos válidos en el formulario de venta \\(Id Producto y Cantidad\\)$")
    public void ingreseDatosVálidosEnElFormularioDeVentaIdProductoYCantidad(List<CredencialesVenta>credencialesVenta) {
        theActorInTheSpotlight().attemptsTo(HacerVenta.hacerVenta(credencialesVenta));
    }


    @Entonces("^se deben visualizar los detalles de la venta y el registro correspondiente en el historial$")
    public void seDebenVisualizarLosDetallesDeLaVentaYElRegistroCorrespondienteEnElHistorial() {
        theActorInTheSpotlight().should(seeThat(ValidacionVenta.validarVenta(), is(true)));
    }



}
