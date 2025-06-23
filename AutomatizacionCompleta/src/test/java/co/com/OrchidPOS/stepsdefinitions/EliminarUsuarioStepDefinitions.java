package co.com.OrchidPOS.stepsdefinitions;

import co.com.OrchidPOS.questions.ValidaciosUsuarios.ValidacionEliminarUsuario;
import co.com.OrchidPOS.tasks.AbrirPaginas.AbiriUsuarios;
import co.com.OrchidPOS.tasks.Usuarios.EliminarUsuario;
import co.com.OrchidPOS.userinterface.Tablas.tablaUsuarios;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.is;



public class EliminarUsuarioStepDefinitions {

    private int cantidadInicial;
    @Cuando("^El usuario ingrese a la pagina usuario debera acceder al aparatado de eliminar usuario$")
    public void elUsuarioIngreseALaPaginaUsuarioDeberaAccederAlAparatadoDeEliminarUsuario() {
        Actor actor = theActorInTheSpotlight();

        actor.attemptsTo(AbiriUsuarios.navegar());

        cantidadInicial = tablaUsuarios.FILAS_TABLA.resolveAllFor(actor).size();

        actor.attemptsTo(EliminarUsuario.aute());
    }
    @Entonces("^Debe mostrarse correctamente la eliminacion del usuario$")
    public void debeMostrarseCorrectamenteLaEliminacionDelUsuario() {
        theActorInTheSpotlight().should(
                seeThat(ValidacionEliminarUsuario.conCantidadAnterior(cantidadInicial), is(true))
        );
    }
}
