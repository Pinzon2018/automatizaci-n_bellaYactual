package co.com.OrchidPOS.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.Visibility;

import static co.com.OrchidPOS.userinterface.registroUsuario.*;


public class ValidacionRegistro implements Question<Boolean> {

    public static ValidacionRegistro validacionRegistro() {
        return new ValidacionRegistro();
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        return Visibility.of(BTN_EDITAR).viewedBy(actor).asBoolean() && Visibility.of(BTN_AGREGAR).viewedBy(actor).asBoolean() && Visibility.of(BTN_ELIMINAR).viewedBy(actor).asBoolean();
    }
}
