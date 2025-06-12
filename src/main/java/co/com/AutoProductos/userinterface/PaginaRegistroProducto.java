package co.com.AutoProductos.userinterface;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.questions.targets.TargetText;
import net.serenitybdd.screenplay.targets.Target;



public class PaginaRegistroProducto extends PageObject {

    public static final Target BTN_REGISTAR_PROD = Target.the("Boton registrar nuevo producto")
            .located(By.xpath("//button[@class='boton-registro']"));

    public static final Target INPUT_NOMBRE_PROD = Target.the("Campo nombre del producto")
            .located(By.xpath("//label[text()='Nombre Producto:']/following-sibling::input"));

    public static final Target INPUT_MEDIDA_PROD = Target.the("Campo de medida del producto")
            .located(By.xpath("//label[text()='Medida Producto:']/following-sibling::input"));

    public static final Target INPUT_PRECIO_BRUTO_PROD = Target.the("Campo precio bruto del producto")
            .located(By.xpath("//label[text()='Precio Bruto:']/following-sibling::input"));

    public static final Target INPUT_IVA_PROD = Target.the("Campo del IVA del producto")
            .located(By.xpath("//label[text()='Iva:']/following-sibling::input"));

    public static final Target INPUT_PORCENTAJE_GANANCIA_PROD = Target.the("Campo del procentaje de ganancia")
            .located(By.xpath("//label[text()='Porcentaje Ganancia:']/following-sibling::input"));

    public static final Target INPUT_UNIDADES_TOTALES_PROD = Target.the("Campo de las unidades totales de producto")
            .located(By.xpath("//label[text()='Unidades Totales:']/following-sibling::input"));


    public static final Target INPUT_ESTADO_PROD = Target.the("CAmpo del estado del producto")
            .located(By.xpath("//label[text()='Estado:']/following-sibling::input"));

    public static final Target INPUT_MARCA_PROD = Target.the("Campo para la marca del producto")
            .located(By.xpath("//label[text()='Marca:']/following-sibling::input"));

    public static final Target INPUT_PROVEEDOR_PROD = Target.the("campo para el proveedor del producto")
            .located(By.xpath("//label[text()='Proveedor:']/following-sibling::input"));

    public static final Target INPUT_CATEGORIA_PROD = Target.the("Campo para la categoria del producto")
            .located(By.xpath("//label[text()='Categoria:']/following-sibling::input"));

    public static final Target BTN_REGISTRADO_PROD = Target.the("Boton para registrar el producto")
            .located(By.xpath("//button[@type='submit' and text()='Registrar']"));

    //public static final Target PRODUCTO_LISTADO = Target.the("Producto en la lista")
      //      .located(By.xpath("//table//td[text()='{0}']"));
    }
