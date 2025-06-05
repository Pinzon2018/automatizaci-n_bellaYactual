package co.com.AutomatizacionOrchidPOS.questions.Venta;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.AutomatizacionOrchidPOS.userinterface.PuntoVenta.ID_VENTA;
import static jxl.biff.FormatRecord.logger;

public class ValidacionIDVenta implements Question<Boolean>{

    private static int contadorID = 27;

    public static ValidacionIDVenta validacionVenta() {return new ValidacionIDVenta(); }

    @Override
    public Boolean answeredBy(Actor actor) {
        try {


            String idVenta = Text.of(ID_VENTA).viewedBy(actor).asString();
            String idEsperado = String.valueOf(contadorID);

            boolean comparacion = idEsperado.equals(idVenta);

            if (comparacion) {
                contadorID++;
                //logger.info("ID {} encontrado. Próximo ID a buscar: {}",  contadorID);
            }

            return comparacion;


        } catch
         (Exception e) {
            logger.info("No hay ventas registrada bajo el ID: {}");
            return false;
        }
    }

}
