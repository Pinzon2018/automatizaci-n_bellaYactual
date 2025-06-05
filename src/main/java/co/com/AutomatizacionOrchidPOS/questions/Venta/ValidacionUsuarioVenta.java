package co.com.AutomatizacionOrchidPOS.questions.Venta;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.AutomatizacionOrchidPOS.userinterface.PuntoVenta.ID_VENTA;
import static co.com.AutomatizacionOrchidPOS.userinterface.PuntoVenta.USUARIO;
import static jxl.biff.FormatRecord.logger;

public class ValidacionUsuarioVenta implements Question <Boolean>{


    public static ValidacionUsuarioVenta validacionUsuarioVenta() {return new ValidacionUsuarioVenta();}

    @Override
    public Boolean answeredBy(Actor actor){
        try {

            String usuarioVenta = Text.of(USUARIO).viewedBy(actor).asString();
            String usuarioObtenido = actor.recall("usuarioLogueado");

            System.out.println(usuarioObtenido);

            return usuarioObtenido.equals(usuarioVenta);


        }catch
        (Exception e) {
            logger.info("El usuario no fue encontrado");
            return false;
        }

    }
}
