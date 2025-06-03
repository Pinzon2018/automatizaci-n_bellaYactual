package co.com.OrchidPOS.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.OrchidPOS.userinterface.autenticacion.TITULO_BIENVENIDA;

public class ValidacionLogin implements Question<Boolean> {

    public static ValidacionLogin validacionLogin() {
        return new ValidacionLogin();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String mensaje = Text.of(TITULO_BIENVENIDA).viewedBy(actor).asString();
        return mensaje.equals("Bienvenido a Bella & Actual");
    }
}
