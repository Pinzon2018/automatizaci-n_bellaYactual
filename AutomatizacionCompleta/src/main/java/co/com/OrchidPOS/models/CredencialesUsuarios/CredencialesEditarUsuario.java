package co.com.OrchidPOS.models.CredencialesUsuarios;



public class CredencialesEditarUsuario {
    private String nombre;
    private String contraseña;
    private String cedula;
    private String email;
    private String telefono;
    private String fechaContrato;
    private String rol;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFechaContrato() {
        return fechaContrato;
    }

    public void setFechaContrato(String fechaContrato) {
        this.fechaContrato = fechaContrato;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public CredencialesEditarUsuario(String nombre, String contraseña, String cedula, String email, String telefono, String fechaContrato, String rol) {
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.cedula = cedula;
        this.email = email;
        this.telefono = telefono;
        this.fechaContrato = fechaContrato;
        this.rol = rol;
    }
}
