package co.com.OrchidPOS.stepsdefinitions;

import co.com.OrchidPOS.questions.ValidacionEliminarUsuario;
import co.com.OrchidPOS.tasks.*;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class EliminarUsuarioStepDefinitions {
    @Cuando("^El usuario ingrese a la pagina usuario debera acceder al aparatado de eliminar usuario$")
    public void elUsuarioIngreseALaPaginaUsuarioDeberaAccederAlAparatadoDeEliminarUsuario() {
        theActorInTheSpotlight().attemptsTo(EliminarUsuario.aute());
    }
    @Entonces("^Debe mostrarse correctamente la eliminacion del usuario$")
    public void debeMostrarseCorrectamenteLaEliminacionDelUsuario() {
        theActorInTheSpotlight().should(seeThat((ValidacionEliminarUsuario.validacionEliminarUsuario())));
    }
}
