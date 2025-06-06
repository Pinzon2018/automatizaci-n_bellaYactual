package co.com.AutomatizacionOrchidPOS.questions.Venta;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.AutomatizacionOrchidPOS.userinterface.PuntoVenta.ID_VENTA;
import static co.com.AutomatizacionOrchidPOS.userinterface.PuntoVenta.USUARIO;
import static jxl.biff.FormatRecord.logger;

public class ValidacionVenta implements Question<Boolean>{

    private static int contadorID = 27;

    public static ValidacionVenta validarVenta() {return new ValidacionVenta(); }

    @Override
    public Boolean answeredBy(Actor actor) {
        try {

            //VALIDACIÓN MENSAJE EMERGENTE

            String mensajeObtenido = actor.recall("mensajeVenta");
            System.out.println("Mensaje Obtenido: " + mensajeObtenido);
            boolean mensajeConfirmado = "Venta generada con éxito".equals(mensajeObtenido);

            //VALIDACION USUARIO VENTA

            String usuarioVenta = Text.of(USUARIO).viewedBy(actor).asString();
            String usuarioObtenido = actor.recall("usuarioLogueado");
            System.out.println("Usuario obtenido: " + usuarioObtenido);
            boolean usuarioConfirmado = usuarioObtenido.equals(usuarioVenta);


            //VALIDACIÓN ID VENTA

            String idVenta = Text.of(ID_VENTA).viewedBy(actor).asString();
            String idEsperado = String.valueOf(contadorID);
            System.out.println("ID obtenido: " + idVenta);

            boolean idConfirmado = idEsperado.equals(idVenta);

            if (idConfirmado) {
                contadorID++;

            }

            return mensajeConfirmado && usuarioConfirmado && idConfirmado;


        } catch
         (Exception e) {
            logger.info("Error en la validacion");
            return false;
        }
    }

}
