package co.com.OrchidPOS.stepsdefinitions;

import co.com.OrchidPOS.models.CredencialesUsuarios.CredencialesRegistroUsuario;
import co.com.OrchidPOS.questions.ValidaciosUsuarios.ValidacionRegistro;
import co.com.OrchidPOS.tasks.Usuarios.RegistrarUsuario;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RegistroUsuarioStepDefinitions {

    @Cuando("^acceda a la página de usuarios e ingrese al apartado de registrar usuario e ingrese los datos de usuario y haga click en \"([^\"]*)\"$")
    public void accedaALaPáginaDeUsuariosEIngreseAlApartadoDeRegistrarUsuarioEIngreseLosDatosDeUsuarioYHagaClickEn(String boton, List<CredencialesRegistroUsuario> datosUsuario) {
        theActorInTheSpotlight().attemptsTo(RegistrarUsuario.aute(datosUsuario));
    }
    @Entonces("^se debe verificar que el usuario haya sido registrado correctamente$")
    public void seDebeVerificarQueElUsuarioHayaSidoRegistradoCorrectamente() {
        theActorInTheSpotlight().should(seeThat((ValidacionRegistro.validacionCorrecta())));
    }
}