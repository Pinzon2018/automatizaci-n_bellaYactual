package co.com.OrchidPOS.questions.ValidacionInicioSesion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static co.com.OrchidPOS.userinterface.AutenticacionUserInterface.autenticacion.*;

public class ValidacionLogin implements Question<Boolean> {

    private static final Logger LOGGER = LoggerFactory.getLogger(ValidacionLogin.class);

    public static ValidacionLogin validacionLogin() {
        return new ValidacionLogin();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String mensajeBienvenida = Text.of(TITULO_BIENVENIDA).viewedBy(actor).asString();
        String mensajeListo = Text.of(TEXTO_LISTO).viewedBy(actor).asString();
        String mensajeBella = Text.of(TEXTO_BELLA).viewedBy(actor).asString();

        LOGGER.info("Mensaje de bienvenida encontrado: '{}'", mensajeBienvenida);
        LOGGER.info("Mensaje de '¿Listo para comenzar?' encontrado: '{}'", mensajeListo);
        LOGGER.info("Mensaje de Bella & Actual encontrado: '{}'", mensajeBella);

        boolean validacionExitosa = mensajeBienvenida.equals("Bienvenido a Bella & Actual")
                && mensajeListo.equals("¿Estás listo para comenzar a gestionar?")
                && mensajeBella.equals("Bella & Actual");

        if (validacionExitosa) {
            LOGGER.info("Validación de login exitosa.");
        } else {
            LOGGER.warn("Validación de login fallida. Verifique los textos mostrados.");
        }

        return validacionExitosa;
    }
}
