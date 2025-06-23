package co.com.OrchidPOS.userinterface.Productos;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class registroProducto extends PageObject{
    public static Target BTN_PRODUCTOS = Target.the("Boton de productos").located(By.xpath("//*[@id=\"root\"]/header/div/div/a[4]"));
    public static Target BTN_REGISTRO_PROD = Target.the("Boton de registro").located(By.xpath("//*[@id=\"root\"]/div/div/div/button"));
    public static Target INPUT_NOMBRE_PROD = Target.the("Nombre Producto").located(By.xpath("//*[@id=\"root\"]/div/div/form/div[1]/input"));
    public static Target INPUT_MEDIDA = Target.the("Medida Producto").located(By.xpath("//*[@id=\"root\"]/div/div/form/div[2]/input"));
    public static Target INPUT_PRECIO_B = Target.the("Precio Bruto").located(By.xpath("//*[@id=\"root\"]/div/div/form/div[3]/input"));
    public static Target INPUT_IVA = Target.the("IVA").located(By.xpath("//*[@id=\"root\"]/div/div/form/div[4]/input"));
    public static Target INPUT_PORCEN = Target.the("Porcentaje Ganancia").located(By.xpath("//*[@id=\"root\"]/div/div/form/div[5]/input"));
    public static Target INPUT_UNID = Target.the("Unidades Totales").located(By.xpath("//*[@id=\"root\"]/div/div/form/div[6]/input"));
    public static Target INPUT_ESTADO = Target.the("Estado").located(By.xpath("//*[@id=\"root\"]/div/div/form/div[7]/input"));
    public static Target INPUT_MARCA = Target.the("Marca").located(By.xpath("//*[@id=\"root\"]/div/div/form/div[8]/input"));
    public static Target INPUT_PROVEEDOR = Target.the("Proveedor").located(By.xpath("//*[@id=\"root\"]/div/div/form/div[9]/input"));
    public static Target INPUT_CATEGORIA = Target.the("Categoria").located(By.xpath("//*[@id=\"root\"]/div/div/form/div[10]/input"));
    public static Target BTN_GUARDAR = Target.the("Boton de Registrar Producto").located(By.xpath("//*[@id=\"root\"]/div/div/form/button"));
}
