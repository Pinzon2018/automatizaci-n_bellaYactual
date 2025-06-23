package co.com.OrchidPOS.questions.ValidacionProductos;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.questions.Visibility;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class    ProductoRegistradoExitosamente implements Question<Boolean> {

    private static final Logger logger = LoggerFactory.getLogger(ProductoRegistradoExitosamente.class);

    private String nombreProducto; // variable para guardar el nombre del producto que se va a verificar

    public ProductoRegistradoExitosamente(String nombreProducto){
        this.nombreProducto = nombreProducto;
    }

    public static ProductoRegistradoExitosamente conElNombre(String nombreProducto){
        return new ProductoRegistradoExitosamente(nombreProducto);
    }

    @Override
    public Boolean answeredBy (Actor actor){
        try{
            Target productoEncontrado = Target.the("el producto '"+ nombreProducto + "' en la lista")
                    .locatedBy("//td[text()='" + nombreProducto + "']");

            boolean isProductoVisible = Visibility.of(productoEncontrado).viewedBy(actor).asBoolean();
            logger.info("verificacion de visibilidad del producto '{}': {}", nombreProducto, isProductoVisible);
            return isProductoVisible;

        } catch (Exception e){
            logger.error("Error al verificar el producto '{}' en la lista : {}", nombreProducto, e.getMessage());
            return false;
        }
    }
}
