package co.com.OrchidPOS.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.OrchidPOS.userinterface.editarUsuario.*;

public class ValidacionEditar implements Question<Boolean> {

    public static ValidacionEditar validacionEditar() {
        return new ValidacionEditar();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String mensaje_id = Text.of(TEXT_ID).viewedBy(actor).asString();
        String mensaje_nombre = Text.of(TEXT_NOMBRE).viewedBy(actor).asString();
        String mensaje_cedula = Text.of(TEXT_CEDULA).viewedBy(actor).asString();
        String mensaje_coreo = Text.of(TEXT_CORREO).viewedBy(actor).asString();
        String mensaje_telefono = Text.of(TEXT_TELEFONO).viewedBy(actor).asString();
        String mensaje_fechacontrato = Text.of(TEXT_FECHACONTRATO).viewedBy(actor).asString();
        String mensaje_rol = Text.of(TEXT_ROL).viewedBy(actor).asString();

        return mensaje_id.equals("ID") && mensaje_nombre.equals("Nombre") && mensaje_cedula.equals("Cédula") && mensaje_coreo.equals("Correo") && mensaje_telefono.equals("Teléfono") && mensaje_fechacontrato.equals("Fecha Contrato")&& mensaje_rol.equals("Rol");

    }
}
