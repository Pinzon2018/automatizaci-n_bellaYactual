package co.com.AutomatizacionOrchidPOS.questions.LogIn;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.AutomatizacionOrchidPOS.userinterface.LogInInterface.MSJ_LOGIN;
import static jxl.biff.FormatRecord.logger;

public class ValidacionLogIn implements Question<Boolean> {

    public static ValidacionLogIn validacionLogIn() {
        return new ValidacionLogIn();
    }

    @Override
    public Boolean answeredBy(Actor actor) {


        try {
            String mensajeLogIn = Text.of(MSJ_LOGIN).viewedBy(actor).asString();
            return "Bienvenido a Bella & Actual".equals(mensajeLogIn);

        }catch
         (Exception e) {
            logger.info("Mensaje no encontrado");
            return false;
        }
    }
}
