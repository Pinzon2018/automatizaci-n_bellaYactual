package co.com.OrchidPOS.stepsdefinitions;

import co.com.OrchidPOS.models.CredencialesLogin.CredencialesInicioSesion;
import co.com.OrchidPOS.tasks.AbrirPaginas.AbrirPagina;
import co.com.OrchidPOS.tasks.Autenticacion.Autenticarse;
import co.com.OrchidPOS.questions.ValidacionInicioSesion.ValidacionLogin;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class AutenticacionStepDefinitions {
    @Dado("^que el usuario se encuentra en la pagina de inicio de sesion de OrchidPOS$")
    public void queElUsuarioSeEncuentraEnLaPaginaDeInicioDeSesionDeOrchidPOS() {
        theActorInTheSpotlight().wasAbleTo(AbrirPagina.lapagina());
    }


    @Cuando("^ingrese las credenciales correctas \\(usuario y contrasena\\)$")
    public void ingreseLasCredencialesCorrectasUsuarioYContrasena(List<CredencialesInicioSesion> credenciales) {
        theActorInTheSpotlight().attemptsTo(Autenticarse.aute(credenciales));
    }

    @Entonces("^se debe verificar que el usuario haya sido autenticado correctamente y redirigido a su pagina de inicio de OrchidPOS$")
    public void seDebeVerificarQueElUsuarioHayaSidoAutenticadoCorrectamenteYRedirigidoASuPaginaDeInicioDeOrchidPOS() {
        theActorInTheSpotlight().should(seeThat(ValidacionLogin.validacionLogin()));
    }
}
