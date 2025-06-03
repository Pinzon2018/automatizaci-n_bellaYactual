package co.com.OrchidPOS.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.OrchidPOS.userinterface.editarUsuario.TEXT_ID;

public class ValidacionEditar implements Question<Boolean> {

    public static ValidacionEditar validacionEditar() {
        return new ValidacionEditar();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String mensaje = Text.of(TEXT_ID).viewedBy(actor).asString();
        return mensaje.equals("ID");
    }
}
