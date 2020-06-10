package upc.poo.entidades;

public class Contacto {
    
    private String telefonoFijo;
    private String telefonoCelular;
    private String direccion;
    private String correoElectronico;

    public String getTelefonoFijo() {
        return telefonoFijo;
    }

    public void setTelefonoFijo(String telefonoFijo) {
        this.telefonoFijo = telefonoFijo;
    }

    public String getTelefonoCelular() {
        return telefonoCelular;
    }

    public void setTelefonoCelular(String telefonoCelular) {
        this.telefonoCelular = telefonoCelular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    
    public String toString() {
        return telefonoFijo + ";"
               + telefonoCelular + ";"
               + direccion + ";"
                + correoElectronico;
    }
    
}
