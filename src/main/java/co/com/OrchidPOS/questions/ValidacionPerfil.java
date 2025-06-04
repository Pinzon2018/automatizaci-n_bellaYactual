package co.com.OrchidPOS.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.OrchidPOS.userinterface.perfil.*;


public class ValidacionPerfil implements Question<Boolean> {

    public static ValidacionPerfil validacionPerfil() {
        return new ValidacionPerfil();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String mensaje_perfil = Text.of(TEXT_PERFIL).viewedBy(actor).asString();
        String mensaje_nombre = Text.of(TEXT_NOMBRE).viewedBy(actor).asString();
        String mensaje_rol = Text.of(TEXT_ROL).viewedBy(actor).asString();
        return mensaje_perfil.equals("Perfil") && mensaje_nombre.startsWith("Nombres: ") && mensaje_rol.startsWith("Rol: ");
    }
}
