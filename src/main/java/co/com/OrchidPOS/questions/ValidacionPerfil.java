package co.com.OrchidPOS.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.OrchidPOS.userinterface.perfil.TEXT_PERFIL;


public class ValidacionPerfil implements Question<Boolean> {

    public static ValidacionPerfil validacionPerfil() {
        return new ValidacionPerfil();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String mensaje = Text.of(TEXT_PERFIL).viewedBy(actor).asString();
        return mensaje.equals("Perfil");
    }
}
