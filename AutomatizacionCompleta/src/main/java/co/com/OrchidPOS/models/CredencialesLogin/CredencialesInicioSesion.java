package co.com.OrchidPOS.models.CredencialesLogin;

public class CredencialesInicioSesion {

    private String email;

    private String clave;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public CredencialesInicioSesion(String email, String clave) {
        this.email = email;
        this.clave = clave;
    }
}