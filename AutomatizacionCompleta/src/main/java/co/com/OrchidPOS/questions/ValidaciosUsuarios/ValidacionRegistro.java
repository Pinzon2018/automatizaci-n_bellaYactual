package co.com.OrchidPOS.questions.ValidaciosUsuarios;

import co.com.OrchidPOS.userinterface.Tablas.tablaUsuarios;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class ValidacionRegistro implements Question<Boolean> {

    private static final Logger logger = LoggerFactory.getLogger(ValidacionRegistro.class);

    public static ValidacionRegistro validacionCorrecta() {
        return new ValidacionRegistro();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String cedula = actor.recall("cedulaRegistro");

        actor.attemptsTo(
                WaitUntil.the(tablaUsuarios.celdaPorCampo(cedula, 2), isVisible()).forNoMoreThan(10).seconds()
        );

        String nombreEsperado = actor.recall("nombreRegistrado");
        String emailEsperado = actor.recall("emailRegistro");
        String telefonoEsperado = actor.recall("telefonoRemember");
        String fechaEsperado = actor.recall("fechaRegistro");
        String rolEsperado = actor.recall("rolRegistro");

        String nombreTabla = Text.of(tablaUsuarios.celdaPorCampo(cedula, 2)).viewedBy(actor).asString().trim();
        String emailTabla = Text.of(tablaUsuarios.celdaPorCampo(cedula, 4)).viewedBy(actor).asString().trim();
        String telefonoTabla = Text.of(tablaUsuarios.celdaPorCampo(cedula, 5)).viewedBy(actor).asString().trim();
        String fechaTabla = Text.of(tablaUsuarios.celdaPorCampo(cedula, 6)).viewedBy(actor).asString().trim();
        String rolTabla = Text.of(tablaUsuarios.celdaPorCampo(cedula, 7)).viewedBy(actor).asString().trim();

        String fechaRegistrada;
        try {
            LocalDate fecha = LocalDate.parse(fechaTabla);
            fechaRegistrada = fecha.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        } catch (Exception e) {
            logger.error("❌ Error al formatear la fecha: {}", fechaTabla, e);
            return false;
        }

        logger.info("Comparando valores en la tabla: ");
        logger.info("Nombre esperado: {}, obtenido: {}", nombreEsperado, nombreTabla);
        logger.info("Correo esperado: {}, obtenido: {}", emailEsperado, emailTabla);
        logger.info("Teléfono esperado: {}, obtenido: {}", telefonoEsperado, telefonoTabla);
        logger.info("Fecha esperada: {}, obtenida: {}", fechaEsperado, fechaRegistrada);
        logger.info("Rol esperado: {}, obtenido: {}", rolEsperado, rolTabla);

        boolean nombreEnTabla = nombreEsperado.equals(nombreTabla);
        boolean emailEnTabla = emailEsperado.equals(emailTabla);
        boolean telefonoEnTabla = telefonoEsperado.equals(telefonoTabla);
        boolean fechaEnTabla = fechaEsperado.equals(fechaRegistrada);
        boolean rolEnTabla = rolEsperado.equals(rolTabla);

        if (!nombreEnTabla || !emailEnTabla || !telefonoEnTabla || !fechaEnTabla || !rolEnTabla) {
            logger.error("❌ Algunos datos no coinciden con la tabla.");
            return false;
        }

        logger.info("✅ Validación de edición en tabla correcta.");
        return true;
    }


}
