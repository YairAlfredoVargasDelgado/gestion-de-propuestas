package upc.poo.entidades;

import java.time.LocalDate;
import upc.poo.entidades.enums.Genero;

public class Persona extends EntidadBase {
    
    private NombreCompleto nombre;
    private Identificacion identificacion;
    private LocalDate fechaNacimiento;
    private Genero genero;
    private Contacto contacto;

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public NombreCompleto getNombre() {
        return nombre;
    }

    public void setNombre(NombreCompleto nombre) {
        this.nombre = nombre;
    }

    public Identificacion getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(Identificacion identificacion) {
        this.identificacion = identificacion;
    }

    public Contacto getContacto() {
        return contacto;
    }

    public void setContacto(Contacto contacto) {
        this.contacto = contacto;
    }
    
    @Override
    public String toString() {
        return super.toString() + ";" + nombre.toString() + ";"
                + identificacion.toString() + ";"
                + fechaNacimiento + ";"
                + genero + ";"
                + contacto.toString();
    }
    
}
