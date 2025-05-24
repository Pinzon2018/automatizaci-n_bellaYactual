package co.com.AutomatizacionOrchidPOS.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import static jxl.biff.FormatRecord.logger;

public class ValidacionRegistro implements Question<Boolean> {

    public static ValidacionRegistro validacionLogin() {
        return new ValidacionRegistro();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        try {
            String texto = Text.of(MENSAJE_LOGIN).viewedBy(actor).asString();
            return "Logged In Successfully".equals(texto);
        } catch (Exception e) {
            logger.info(" No encontró el texto o hubo otro error");
            return false;
        }
    }
}
