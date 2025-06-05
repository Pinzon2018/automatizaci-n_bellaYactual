package co.com.AutomatizacionOrchidPOS.models;

public class CredencialesSubcategoria {

    private String nombreSubcategoria;
    private String descripcionSubcategoria;
    private String selectCategoria;

    public CredencialesSubcategoria(String nombreSubcategoria, String descripcionSubcategoria, String selectCategoria) {
        this.nombreSubcategoria = nombreSubcategoria;
        this.descripcionSubcategoria= descripcionSubcategoria;
        this.selectCategoria = selectCategoria;
    }

    public String getNombreSubcategoria() { return nombreSubcategoria; }
    public String getDescripcionSubcategoria() { return descripcionSubcategoria; }
    public String getSelectCategoria() { return selectCategoria; }



}
