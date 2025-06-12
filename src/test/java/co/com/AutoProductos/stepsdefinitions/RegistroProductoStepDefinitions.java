package co.com.AutoProductos.stepsdefinitions;

import co.com.AutoProductos.models.CredencialesInicioSesion;
import co.com.AutoProductos.models.NuevoProducto;
import co.com.AutoProductos.questions.VerificarLoginExitoso;
import co.com.AutoProductos.questions.ProductoRegistradoExitosamente;
import co.com.AutoProductos.tasks.AbrirPagina;
import co.com.AutoProductos.tasks.LoginProductos;
import co.com.AutoProductos.tasks.NavegarModuloProducto;
import co.com.AutoProductos.tasks.LlenarFormularioProd;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;
import cucumber.api.DataTable;

public class RegistroProductoStepDefinitions {

    @Dado("^que el usuario se encuentra en la pagina de inicio de sesion$")
    public void queElUsuarioSeEncuentraEnLaPaginaDeInicioDeSesion() {
        theActorInTheSpotlight().wasAbleTo(AbrirPagina.lapagina());
    }

    @Cuando("^el usuario ingrese las credenciales de inicio de sesion$")
    public void elUsuarioIngreseLasCredencialesDeInicioDeSesion(List<CredencialesInicioSesion> credenciales) {
        theActorInTheSpotlight().attemptsTo(LoginProductos.conCredenciales(credenciales));
    }


    @Entonces("^se deberia mostrar la pagina de inicio$")
    public void seDeberiaMostrarLaPaginaDeInicio() {
        theActorInTheSpotlight().should(
                seeThat("el login fue exitoso y el dashboard es visible", VerificarLoginExitoso.esVisible(), is(true))
        );
    }

    @Cuando("^navega al modulo de productos y selecciona la opcion para registrar un producto$")
    public void navegaAlModuloDeProductosYSeleccionaLaOpcionParaRegistrarUnProducto() {
        theActorInTheSpotlight().attemptsTo(
                NavegarModuloProducto.paraRegistarProd()
        );
    }

    @Cuando("^completa el formulario de nuevo producto con los siguientes datos$")
    public void completaElFormularioDeNuevoProductoConLosSiguientesDatos(List<NuevoProducto> datos) {
        theActorInTheSpotlight().attemptsTo(
                LlenarFormularioProd.con(datos)
        );
    }

    @Entonces("^el nuevo producto \"([^\"]*)\" deberia ser registrado exitosamente$")
    public void elNuevoProductoDeberiaSerRegistradoExitosamente(String nombreProducto) {
        theActorInTheSpotlight().should(
                seeThat("el producto " + nombreProducto + " aparece en la lista",
                        ProductoRegistradoExitosamente.conElNombre(nombreProducto), is(true))
        );
    }
}