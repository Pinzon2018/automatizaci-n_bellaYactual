package co.com.OrchidPOS.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.OrchidPOS.userinterface.autenticacion.*;

public class ValidacionLogin implements Question<Boolean> {

    public static ValidacionLogin validacionLogin() {
        return new ValidacionLogin();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String mensaje_bienvenida = Text.of(TITULO_BIENVENIDA).viewedBy(actor).asString();
        String mensaje_bienvenida2 = Text.of(TEXTO_LISTO).viewedBy(actor).asString();
        String mensaje_bella = Text.of(TEXTO_BELLA).viewedBy(actor).asString();
        return mensaje_bienvenida.equals("Bienvenido a Bella & Actual") && mensaje_bienvenida2.equals("¿Estás listo para comenzar a gestionar?") && mensaje_bella.equals("Bella & Actual");
    }
}
