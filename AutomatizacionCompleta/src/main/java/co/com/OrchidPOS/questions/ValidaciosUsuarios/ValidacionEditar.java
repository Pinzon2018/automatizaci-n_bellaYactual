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

    public class ValidacionEditar implements Question<Boolean> {

        private static final Logger logger = LoggerFactory.getLogger(ValidacionEditar.class);

        public static ValidacionEditar esCorrecta() {
            return new ValidacionEditar();
        }

        @Override
        public Boolean answeredBy(Actor actor) {
            String cedula = actor.recall("cedulaEditada");

            actor.attemptsTo(
                    WaitUntil.the(tablaUsuarios.celdaPorCampo(cedula, 2), isVisible()).forNoMoreThan(10).seconds()
            );

            String nombreEsperado = actor.recall("nombreEditado");
            String correoEsperado = actor.recall("correoEditado");
            String telefonoEsperado = actor.recall("telefonoEditado");
            String fechaEsperada = actor.recall("fechaContratoEditado");
            String rolEsperado = actor.recall("rolEditado");

            String nombreActual = Text.of(tablaUsuarios.celdaPorCampo(cedula, 2)).viewedBy(actor).asString().trim();
            String correoActual = Text.of(tablaUsuarios.celdaPorCampo(cedula, 4)).viewedBy(actor).asString().trim();
            String telefonoActual = Text.of(tablaUsuarios.celdaPorCampo(cedula, 5)).viewedBy(actor).asString().trim();
            String fechaActualRaw = Text.of(tablaUsuarios.celdaPorCampo(cedula, 6)).viewedBy(actor).asString().trim();
            String rolActual = Text.of(tablaUsuarios.celdaPorCampo(cedula, 7)).viewedBy(actor).asString().trim();

            String fechaActual;
            try {
                LocalDate fecha = LocalDate.parse(fechaActualRaw);
                fechaActual = fecha.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            } catch (Exception e) {
                logger.error("❌ Error al formatear la fecha: {}", fechaActualRaw, e);
                return false;
            }

            logger.info("🔍 Comparando valores en la tabla:");
            logger.info("Nombre esperado: {}, obtenido: {}", nombreEsperado, nombreActual);
            logger.info("Correo esperado: {}, obtenido: {}", correoEsperado, correoActual);
            logger.info("Teléfono esperado: {}, obtenido: {}", telefonoEsperado, telefonoActual);
            logger.info("Fecha esperada: {}, obtenida: {}", fechaEsperada, fechaActual);
            logger.info("Rol esperado: {}, obtenido: {}", rolEsperado, rolActual);

            boolean nombreActualizado = nombreEsperado.equals(nombreActual);
            boolean correoActualizado = correoEsperado.equals(correoActual);
            boolean telefonoActualizado = telefonoEsperado.equals(telefonoActual);
            boolean fechaActualizado = fechaEsperada.equals(fechaActual);
            boolean rolActualizado = rolEsperado.equals(rolActual);

            if (!nombreActualizado || !correoActualizado || !telefonoActualizado || !fechaActualizado || !rolActualizado) {
                logger.error("❌ Algunos datos no coinciden con la tabla.");
                return false;
            }

            logger.info("✅ Validación de edición en tabla correcta.");
            return true;
        }
    }
