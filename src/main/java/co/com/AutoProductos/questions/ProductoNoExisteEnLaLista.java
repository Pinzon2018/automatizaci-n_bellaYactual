package co.com.AutoProductos.questions;

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

            // Verificar si el producto es visible
            boolean isProductoVisible = Visibility.of(productoEncontrado).viewedBy(actor).asBoolean();
            logger.info("Verificación de visibilidad del producto '{}': {}", nombreProducto, isProductoVisible);


            return !isProductoVisible;

        } catch (Exception e){ // Corregido 'Exeption' a 'Exception'
            logger.error("Error al verificar el producto '{}' en la lista: {}", nombreProducto, e.getMessage());

            return false;
        }
    }
}