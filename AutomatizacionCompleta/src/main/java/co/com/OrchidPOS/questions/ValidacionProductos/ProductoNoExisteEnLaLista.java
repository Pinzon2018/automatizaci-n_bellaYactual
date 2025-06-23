package co.com.OrchidPOS.questions.ValidacionProductos;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class ProductoNoExisteEnLaLista implements Question<Boolean> {

    private static final Logger logger = LoggerFactory.getLogger(ProductoNoExisteEnLaLista.class);

    private final String nombreProducto;

    public ProductoNoExisteEnLaLista(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public static ProductoNoExisteEnLaLista conElNombre(String nombreProducto) {
        return new ProductoNoExisteEnLaLista(nombreProducto);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        try {
            Target productoEncontrado = Target.the("el producto " + nombreProducto + " en la lista")
                    .located(By.xpath("//td[text()='" + nombreProducto + "']"));

             // Verificar si el producto fue completamente eliminado (no está en el DOM)
            boolean noExiste = productoEncontrado.resolveAllFor(actor).isEmpty();

            logger.info("¿El producto '{}' fue eliminado?: {}", nombreProducto, noExiste);
            return noExiste;

        } catch (Exception e){
            logger.error("Error al verificar el producto '{}' en la lista: {}", nombreProducto, e.getMessage());

            return false;
        }
    }
}