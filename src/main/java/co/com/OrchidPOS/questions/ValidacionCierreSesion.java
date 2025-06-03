package co.com.OrchidPOS.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

import static co.com.OrchidPOS.userinterface.cierreSesion.*;

public class ValidacionCierreSesion implements Question<Boolean> {

    public static ValidacionCierreSesion validacionCierreSesion() {
        return new ValidacionCierreSesion();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(INPUT_CORREO).viewedBy(actor).asBoolean() && Visibility.of(INPUT_CONRASENA).viewedBy(actor).asBoolean() && Visibility.of(BTN_LOGIN).viewedBy(actor).asBoolean();
    }
}
