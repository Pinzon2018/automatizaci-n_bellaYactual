package co.com.OrchidPOS.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import static co.com.OrchidPOS.userinterface.cierreSesion.INPUT_CORREO;

public class ValidacionCierreSesion implements Question<Boolean> {

    public static ValidacionCierreSesion validacionCierreSesion() {
        return new ValidacionCierreSesion();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String mensaje = INPUT_CORREO.resolveFor(actor).getAttribute("placeholder");
        return mensaje.equals("Correo");
    }
}
