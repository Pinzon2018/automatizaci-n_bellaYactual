package co.com.AutomatizacionOrchidPOS.models;

public class CredencialesLogIn {

    private String usuario;

    private String contraseña;

    public CredencialesLogIn (String usuario, String contraseña){
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public String getUsuario(){return usuario;}
    public void setUsuario(String usuario){this.usuario = usuario;}

    public String getContraseña(){return contraseña;}
    public void setContraseña(String contraseña){this.contraseña = contraseña;}
}
