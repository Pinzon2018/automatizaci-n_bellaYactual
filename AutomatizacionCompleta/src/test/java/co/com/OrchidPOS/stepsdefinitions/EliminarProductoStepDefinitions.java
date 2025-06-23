package co.com.OrchidPOS.stepsdefinitions;

import co.com.OrchidPOS.models.CredencialesLogin.CredencialesInicioSesion;
import co.com.OrchidPOS.questions.ValidacionInicioSesion.ValidacionLogin;
import co.com.OrchidPOS.questions.ValidacionProductos.ProductoRegistradoExitosamente;
import co.com.OrchidPOS.questions.ValidacionProductos.ProductoNoExisteEnLaLista;
import co.com.OrchidPOS.tasks.AbrirPaginas.AbrirPagina;
import co.com.OrchidPOS.tasks.Autenticacion.Autenticarse;
import co.com.OrchidPOS.tasks.Productos.EliminarProducto;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Click;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;



public class EliminarProductoStepDefinitions {
        @Cuando("^el usuario elimine el producto \"([^\"]*)\"$")
        public void elUsuarioElimineElProducto(String nombreProductoAEliminar) {

            theActorInTheSpotlight().attemptsTo(
                    EliminarProducto.llamado(nombreProductoAEliminar)
            );
        }


        @Entonces("^el producto \"([^\"]*)\" no debería aparecer en la lista$")
        public void elProductoNoDeberíaAparecerEnLaLista( String nombreProducto) {
            theActorInTheSpotlight().should(
                    seeThat(ProductoNoExisteEnLaLista.conElNombre(nombreProducto), is(true))
            );

     }
}



