package co.com.AutoProductos.stepsdefinitions;

import co.com.AutoProductos.models.CredencialesInicioSesion;
import co.com.AutoProductos.questions.VerificarLoginExitoso;
import co.com.AutoProductos.questions.ProductoRegistradoExitosamente;
import co.com.AutoProductos.questions.ProductoNoExisteEnLaLista;
import co.com.AutoProductos.tasks.AbrirPagina;
import co.com.AutoProductos.tasks.LoginProductos;
import co.com.AutoProductos.tasks.NavegarModuloProducto;
import co.com.AutoProductos.tasks.EliminarProducto;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Click;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;
import static co.com.AutoProductos.userinterface.PaginaPrincipal.MODULO_PRODUCTOS;


public class EliminarProductoStepDefinitions {

    @Dado("que el producto \"([^\"]*)\" existe en la lista de productos")
    public void elProductoExisteEnLaListaDeProductos(String nombreProducto) {
        theActorInTheSpotlight().attemptsTo(
                Click.on(MODULO_PRODUCTOS) // Navega directamente a la lista de productos
        );

        theActorInTheSpotlight().should(seeThat(
                "el producto " + nombreProducto + " aparece en la lista (pre-eliminación)",
                ProductoRegistradoExitosamente.conElNombre(nombreProducto),
                is(true)
        ));
    }

    @Cuando("el usuario elimina el producto \"([^\"]*)\"")
    public void elUsuarioEliminaElProducto(String nombreProductoAEliminar) {
        theActorInTheSpotlight().attemptsTo(
                EliminarProducto.llamado(nombreProductoAEliminar)
        );
    }

    @Entonces("el producto \"([^\"]*)\" no deberia aparecer en la lista")
    public void elProductoNoDeberiaAparecerEnLaLista(String nombreProductoEliminado) {

        theActorInTheSpotlight().should(seeThat(
                "el producto " + nombreProductoEliminado + " no aparece en la lista (post-eliminación)",
                ProductoNoExisteEnLaLista.conElNombre(nombreProductoEliminado),
                is(true)
        ));
    }
}