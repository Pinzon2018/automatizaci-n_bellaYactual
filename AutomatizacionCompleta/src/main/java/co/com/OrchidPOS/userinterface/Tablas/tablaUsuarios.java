package co.com.OrchidPOS.userinterface.Tablas;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class tablaUsuarios {

    public static Target celdaPorCampo(String cedula, int columna) {
        return Target.the("Celda por valor en cédula").located(By.xpath(
                "//table/tbody/tr[td[3][text()='" + cedula + "']]/td[" + columna + "]"
        ));
    }

    public static final Target FILAS_TABLA = Target.the("filas de la tabla")
            .located(By.xpath("//table/tbody/tr"));
}
