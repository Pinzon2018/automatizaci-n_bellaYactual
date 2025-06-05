package co.com.AutomatizacionOrchidPOS.questions.Venta;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static jxl.biff.FormatRecord.logger;

public class ValidacionMensajeVenta implements Question<Boolean> {

    public static ValidacionMensajeVenta validacionMensajeVenta() {return new ValidacionMensajeVenta();}

    @Override
    public Boolean answeredBy(Actor actor) {
        try {

            String mensajeObtenido = actor.recall("mensajeVenta");
            System.out.println(mensajeObtenido);
            return "Venta generada con éxito".equals(mensajeObtenido);


        } catch
        (Exception e) {
            logger.info("No ha sido encontrado el mensaje de bienvenida");
            return false;
        }
    }

}


