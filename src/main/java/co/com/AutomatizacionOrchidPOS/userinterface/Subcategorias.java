package co.com.AutomatizacionOrchidPOS.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.actions.SelectFromOptions;


public class Subcategorias extends PageObject{

    public static Target BOTON_AGREGAR_SUBCATEGORIA = Target.the("Botón + para agregar subcategoria").located(By.xpath("//*[@id=\"root\"]/div/div/div/button"));
    public static Target INPUT_NOMBRE_SUBCATEGORIA = Target.the("campo nombre de subcategoria").located(By.xpath("//*[@id=\"root\"]/div/div/form/div[1]/input"));
    public static Target INPUT_DESCRIPCION_SUBCATEGORIA = Target.the("campo descripcion de subcategoria").located(By.xpath("//*[@id=\"root\"]/div/div/form/div[2]/input"));
    public static Target SELECT_CATEGORIA = Target.the("desprender lista de categorias").located(By.xpath("//*[@id=\"root\"]/div/div/form/div[3]/select"));
    public static Target LISTA_CATEGORIAS = Target.the("seleccionar categoria").located(By.xpath("//*[@id=\"root\"]/div/div/form/div[3]/select/option[2]"));
    public static Target BOTON_SUBMIT_SUBCATEGORIAS = Target.the("Botón para guardar subcategoria").located(By.xpath("///*[@id=\"root\"]/div/div/form/button"));

}
