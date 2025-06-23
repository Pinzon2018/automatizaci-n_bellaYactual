package co.com.OrchidPOS.models.CredencialesVentas;

public class CredencialesVenta {

    private Integer idProducto;

    private Integer cantidad;

    public CredencialesVenta(Integer idProducto, Integer cantidad){
        this.idProducto = idProducto;
        this.cantidad = cantidad;

    }

    public Integer getIdProducto(){return idProducto;}

    public void setIdProducto(Integer idProducto){this.idProducto=idProducto;}


    public Integer getCantidad(){return cantidad;}

    public void setCantidad(Integer cantidad){this.cantidad=cantidad;}
}
