package co.com.OrchidPOS.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.OrchidPOS.userinterface.eliminacionUsuario.*;

public class ValidacionEliminarUsuario implements Question<Boolean> {

    public static ValidacionEliminarUsuario validacionEliminarUsuario() {
        return new ValidacionEliminarUsuario();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String mensajeId = Text.of(TEXT_ID).viewedBy(actor).asString();
        String mensajeNombre = Text.of(TEXT_NOMBRE).viewedBy(actor).asString();
        String mensajeCedula = Text.of(TEXT_CEDULA).viewedBy(actor).asString();
        String mensajeCorreo = Text.of(TEXT_CORREO).viewedBy(actor).asString();
        String mensajeTelefono = Text.of(TEXT_TELEFONO).viewedBy(actor).asString();
        String mensajeFechaContrato = Text.of(TEXT_FECHACONTRATO).viewedBy(actor).asString();
        String mensajeRol = Text.of(TEXT_ROL).viewedBy(actor).asString();

        return mensajeId.equals("ID") && mensajeNombre.equals("Nombre") && mensajeCedula.equals("Cédula") && mensajeCorreo.equals("Correo") && mensajeTelefono.equals("Teléfono") && mensajeFechaContrato.equals("Fecha Contrato")&& mensajeRol.equals("Rol");
    }
}
