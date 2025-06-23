package co.com.OrchidPOS.stepsdefinitions;

import co.com.OrchidPOS.questions.ValidaciosUsuarios.ValidacionPerfil;
import co.com.OrchidPOS.tasks.Usuarios.Perfil;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PerfilStepDefinitions {
    @Cuando("^El usuario ingrese a la pagina de perfil$")
    public void elUsuarioIngreseALaPaginaDePerfil() {
        theActorInTheSpotlight().attemptsTo(Perfil.aute());
    }

    @Entonces("^Debera mostrarse los datos del usuario$")
    public void deberaMostrarseLosDatosDelUsuario() {
        theActorInTheSpotlight().should(seeThat((ValidacionPerfil.validacionPerfil())));
    }
}
