package co.com.OrchidPOS.stepsdefinitions;



import co.com.OrchidPOS.models.CredencialesProductos.CredencialesRegistroProd;
import co.com.OrchidPOS.tasks.Productos.RegistrarProducto;
import co.com.OrchidPOS.questions.ValidacionProductos.ProductoRegistradoExitosamente;


import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;


public class RegistroProductoStepDefinitions {
    @Cuando("^el usuario acceda al modulo de productos e ingrese los datos del producto y haga click en Registrar$")
    public void elUsuarioAccedaAlModuloDeProductosEIngreseLosDatosDelProductoYHagaClickEnRegistrar(List<CredencialesRegistroProd> datosProducto) {
        theActorInTheSpotlight().attemptsTo(RegistrarProducto.conLainformacion(datosProducto));
    }


    @Entonces("^se debe verificar que el producto \"([^\"]*)\" haya sido registrado correctamente$")
    public void seDebeVerificarQueElProductoHayaSidoRegistradoCorrectamente(String nombreProducto) {
        theActorInTheSpotlight().should(seeThat((ProductoRegistradoExitosamente.conElNombre(nombreProducto))));
    }
}