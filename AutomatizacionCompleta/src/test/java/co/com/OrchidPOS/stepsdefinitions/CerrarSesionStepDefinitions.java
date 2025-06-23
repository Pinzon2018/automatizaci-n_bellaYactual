package co.com.OrchidPOS.stepsdefinitions;

import co.com.OrchidPOS.questions.ValidacionCierre.ValidacionCierreSesion;
import co.com.OrchidPOS.tasks.CierreSesionUsu.CierreSesion;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CerrarSesionStepDefinitions {
    @Cuando("^seleccione el botón de LogOut$")
    public void seleccioneElBotónDeLogOut() {
        theActorInTheSpotlight().attemptsTo(CierreSesion.aute());
    }

    @Entonces("^Debe mostrarse correctamente el cierre de sesion$")
    public void debeMostrarseCorrectamenteElCierreDeSesion() {
        theActorInTheSpotlight().should(seeThat(ValidacionCierreSesion.validacionCierreSesion()));
    }
}



