package co.com.OrchidPOS.questions.ValidacionCierre;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static co.com.OrchidPOS.userinterface.CierreSesionUserInterface.cierreSesion.*;

public class ValidacionCierreSesion implements Question<Boolean> {

    private static final Logger LOGGER = LoggerFactory.getLogger(ValidacionCierreSesion.class);

    public static ValidacionCierreSesion validacionCierreSesion() {
        return new ValidacionCierreSesion();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean correoVisible = Visibility.of(INPUT_CORREO).viewedBy(actor).asBoolean();
        boolean contrasenaVisible = Visibility.of(INPUT_CONRASENA).viewedBy(actor).asBoolean();
        boolean loginVisible = Visibility.of(BTN_LOGIN).viewedBy(actor).asBoolean();

        LOGGER.info("Visibilidad del campo correo: {}", correoVisible);
        LOGGER.info("Visibilidad del campo contraseña: {}", contrasenaVisible);
        LOGGER.info("Visibilidad del botón login: {}", loginVisible);

        boolean validacionExitosa = correoVisible && contrasenaVisible && loginVisible;

        if (validacionExitosa) {
            LOGGER.info("Validación de cierre de sesión exitosa. Todos los elementos están visibles.");
        } else {
            LOGGER.warn("Validación de cierre de sesión fallida. Al menos uno de los elementos no es visible.");
        }

        return validacionExitosa;
    }
}
