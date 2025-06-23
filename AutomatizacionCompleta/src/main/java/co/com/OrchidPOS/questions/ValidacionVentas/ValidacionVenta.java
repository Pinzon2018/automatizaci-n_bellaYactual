package co.com.OrchidPOS.questions.ValidacionVentas;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.questions.Text;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static co.com.OrchidPOS.userinterface.Venta.PuntoVenta.ID_VENTA;
import static co.com.OrchidPOS.userinterface.Venta.PuntoVenta.USUARIO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ValidacionVenta implements Question<Boolean> {

    private static int contadorID =11;

    private static final Logger LOGGER = LoggerFactory.getLogger(ValidacionVenta.class);

    public static ValidacionVenta validarVenta() {
        return new ValidacionVenta();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        try {
            // Esperar a que se muestre el ID de venta en el historial
            actor.attemptsTo(
                    WaitUntil.the(ID_VENTA, isVisible()).forNoMoreThan(10).seconds()
            );

            // VALIDACIÓN: Mensaje emergente
            String mensajeObtenido = actor.recall("mensajeVenta");
            LOGGER.info("Mensaje obtenido: {}", mensajeObtenido);
            boolean mensajeConfirmado = "Venta generada con éxito".equalsIgnoreCase(mensajeObtenido);

            // VALIDACIÓN: Usuario de la venta
            String usuarioVenta = Text.of(USUARIO).viewedBy(actor).asString();
            String usuarioObtenido = actor.recall("usuarioLogueado");

            LOGGER.info("Usuario venta: {}", usuarioVenta);
            LOGGER.info("Usuario obtenido: {}", usuarioObtenido);

            boolean usuarioConfirmado = usuarioObtenido != null && usuarioObtenido.equals(usuarioVenta);

            // VALIDACIÓN: ID venta
            String idVenta = Text.of(ID_VENTA).viewedBy(actor).asString();
            String idEsperado = String.valueOf(contadorID);
            LOGGER.info("ID de venta obtenido: {}", idVenta);

            boolean idConfirmado = idEsperado.equals(idVenta);

            if (idConfirmado) {
                contadorID++;
            }

            return mensajeConfirmado  && usuarioConfirmado && idConfirmado;

        } catch (Exception e) {
            LOGGER.error("Error durante la validación de la venta", e);
            return false;
        }
    }
}
