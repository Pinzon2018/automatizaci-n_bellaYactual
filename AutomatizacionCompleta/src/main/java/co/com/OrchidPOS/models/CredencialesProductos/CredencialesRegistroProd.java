package co.com.OrchidPOS.models.CredencialesProductos;



public class CredencialesRegistroProd {
    private String nombreProd;
    private String medidaProd;
    private String precioBrutoProd;
    private String ivaProd;
    private String porcentajeGanancia;
    private String unidadesTotalesProd;
    private String estadoProd;
    private String marcaProd;
    private String proveedor;
    private String categoria;

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNombreProd() {
        return nombreProd;
    }

    public void setNombreProd(String nombreProd) {
        this.nombreProd = nombreProd;
    }

    public String getMedidaProd() {
        return medidaProd;
    }

    public void setMedidaProd(String medidaProd) {
        this.medidaProd = medidaProd;
    }

    public String getPrecioBrutoProd() {
        return precioBrutoProd;
    }

    public void setPrecioBrutoProd(String precioBrutoProd) {
        this.precioBrutoProd = precioBrutoProd;
    }

    public String getIvaProd() {
        return ivaProd;
    }

    public void setIvaProd(String ivaProd) {
        this.ivaProd = ivaProd;
    }

    public String getPorcentajeGanancia() {
        return porcentajeGanancia;
    }

    public void setPorcentajeGanancia(String porcentajeGanancia) {
        this.porcentajeGanancia = porcentajeGanancia;
    }

    public String getUnidadesTotalesProd() {
        return unidadesTotalesProd;
    }

    public void setUnidadesTotalesProd(String unidadesTotalesProd) {
        this.unidadesTotalesProd = unidadesTotalesProd;
    }

    public String getEstadoProd() {
        return estadoProd;
    }

    public void setEstadoProd(String estadoProd) {
        this.estadoProd = estadoProd;
    }

    public String getMarcaProd() {
        return marcaProd;
    }

    public void setMarcaProd(String marcaProd) {
        this.marcaProd = marcaProd;
    }

    public CredencialesRegistroProd(String nombreProd, String medidaProd, String precioBrutoProd, String ivaProd, String porcentajeGanancia, String unidadesTotalesProd, String estadoProd, String marcaProd, String proveedor, String categoria) {
        this.nombreProd = nombreProd;
        this.medidaProd = medidaProd;
        this.precioBrutoProd = precioBrutoProd;
        this.ivaProd = ivaProd;
        this.porcentajeGanancia = porcentajeGanancia;
        this.unidadesTotalesProd = unidadesTotalesProd;
        this.estadoProd = estadoProd;
        this.marcaProd = marcaProd;
        this.proveedor = proveedor;
        this.categoria = categoria;
    }
}
