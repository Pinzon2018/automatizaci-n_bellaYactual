package co.com.AutoProductos.models;

import org.apache.pdfbox.contentstream.operator.text.SetTextRise;

public class CredencialesInicioSesion {
    private String usuario;
    private String contraseña;

    public CredencialesInicioSesion(String usuario, String contraseña){
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public String getUsuario(){

        return usuario;
    }

    public String getContraseña(){
        return contraseña;
    }

}
