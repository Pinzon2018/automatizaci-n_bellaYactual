package co.com.AutoProductos.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static co.com.AutoProductos.userinterface.PaginaPrincipal.CONFIRMACION_DASHBOARD;

public class VerificarLoginExitoso implements Question<Boolean> {

    private static final Logger logger = LoggerFactory.getLogger(VerificarLoginExitoso.class);


    public static VerificarLoginExitoso esVisible(){
        return new VerificarLoginExitoso();
    }

    @Override
    public Boolean answeredBy (Actor actor){
        try {
            boolean isDashboardVisible = Visibility.of(CONFIRMACION_DASHBOARD).viewedBy(actor).asBoolean();
            logger.info("Verificacion de visibilidad del ashboard: {}", isDashboardVisible );
            return isDashboardVisible;
        } catch (Exception e){
            logger.error("Error al verificar la visibiliad del dashboard: {}", e.getMessage());
            return false;
        }
    }
}
