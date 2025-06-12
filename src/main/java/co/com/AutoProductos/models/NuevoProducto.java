package co.com.AutoProductos.models;


public class    NuevoProducto {
    private String nombreProd;
    private String medidaProd;
    private String precioBrutoProd;
    private String ivaProd;
    private String porcentajeGanancia; // Nuevo campo
    private String unidadesTotalesProd;
    private String estadoProd;
    private String marcaProd;

    private String proveedorProd;

    private String categoriaProd;

    public NuevoProducto(String nombreProd, String medidaProd, String precioBrutoProd, String ivaProd, String porcentajeGanancia, String unidadesTotalesProd, String estadoProd, String marcaProd, String proveedorProd, String categoriaProd){
        this.nombreProd = nombreProd;
        this.medidaProd = medidaProd;
        this.precioBrutoProd = precioBrutoProd;
        this.ivaProd = ivaProd;
        this.porcentajeGanancia = porcentajeGanancia;
        this.unidadesTotalesProd = unidadesTotalesProd;
        this.estadoProd = estadoProd;
        this.marcaProd = marcaProd;
        this.proveedorProd = proveedorProd;
        this. categoriaProd = categoriaProd;
    }

    // getters

    public String getNombreProd()
    { return nombreProd; }
    public String getMedidaProd()
    { return medidaProd; }
    public String getPrecioBrutoProd()
    { return precioBrutoProd; }
    public String getIvaProd()
    { return ivaProd; }
    public String getPorcentajeGanancia()
    { return porcentajeGanancia; }
    public String getUnidadesTotalesProd()
    { return unidadesTotalesProd; }
    public String getEstadoProd()
    { return estadoProd; }
    public String getMarcaProd()
    { return marcaProd; }

    public String getProveedorProd(){
        return  proveedorProd;
    }

    public String getCategoriaProd(){
        return categoriaProd;
    }

}