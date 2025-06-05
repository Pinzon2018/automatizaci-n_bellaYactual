package co.com.AutomatizacionOrchidPOS.stepsdefinitions;

import co.com.AutomatizacionOrchidPOS.models.CredencialesLogIn;
import co.com.AutomatizacionOrchidPOS.questions.LogIn.ValidacionLogIn;
import co.com.AutomatizacionOrchidPOS.tasks.AbrirHomepage;
import co.com.AutomatizacionOrchidPOS.tasks.LogIn;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;

import java.util.List;


import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.is;

public class LogInStepsDefinition {

    @Dado("^que el usuario se encuentra en la homepage de OrchidPOS$")
    public void queElUsuarioSeEncuentraEnLaHomepageDeOrchidPOS() {
          
        theActorInTheSpotlight().wasAbleTo(AbrirHomepage.homepage());

    }


    @Cuando("^ingrese las credenciales correctas \\(usuario y contrasena\\)$")
    public void ingreseLasCredencialesCorrectasUsuarioYContrasena(List<CredencialesLogIn> credencialesLogIn) {
        

        
        String usuario = credencialesLogIn.get(0).getUsuario(); 

        theActorInTheSpotlight().remember("usuarioLogueado", usuario);
        
        theActorInTheSpotlight().attemptsTo(LogIn.logIn(credencialesLogIn));

    }

    @Entonces("^se debe verificar que el usuario haya sido autenticado correctamente y redirigido al homepage de su cuenta$")
    public void seDebeVerificarQueElUsuarioHayaSidoAutenticadoCorrectamenteYRedirigidoAlHomepageDeSuCuenta() {

        theActorInTheSpotlight().should(seeThat(ValidacionLogIn.validacionLogIn(), is(true)));

    }
}
