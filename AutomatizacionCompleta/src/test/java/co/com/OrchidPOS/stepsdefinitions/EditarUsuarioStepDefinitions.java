package co.com.OrchidPOS.stepsdefinitions;
import co.com.OrchidPOS.models.CredencialesUsuarios.CredencialesEditarUsuario;
import co.com.OrchidPOS.tasks.Usuarios.EditarUsuario;
import co.com.OrchidPOS.questions.ValidaciosUsuarios.ValidacionEditar;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class EditarUsuarioStepDefinitions {

    @Cuando("^accede a la página de usuarios luego al apartado de editar usuarios e ingrese los datos para actualizar usuario y haga click en \"([^\"]*)\"$")
    public void accedeALaPáginaDeUsuariosLuegoAlApartadoDeEditarUsuariosEIngreseLosDatosParaActualizarUsuarioYHagaClickEn(String boton, List<CredencialesEditarUsuario> editardatosUsuario) {
        theActorInTheSpotlight().attemptsTo(EditarUsuario.aute(editardatosUsuario));
    }

    @Entonces("^se debe verificar que el usuario haya sido actualizado correctamente$")
    public void seDebeVerificarQueElUsuarioHayaSidoActualizadoCorrectamente() {
        theActorInTheSpotlight().should(
                seeThat(ValidacionEditar.esCorrecta())
        );
    }
}