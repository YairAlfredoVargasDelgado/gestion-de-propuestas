package upc.poo.entidades;

public class NombreCompleto {
    
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }
    
    @Override
    public String toString() {
        return primerNombre + ";"
                + segundoNombre + ";"
                + primerApellido + ";"
                + segundoApellido;
    }

    public String toReadableString() {
        return primerNombre + " " + segundoNombre + " " + primerApellido + " " + segundoApellido;
    }
    
}
