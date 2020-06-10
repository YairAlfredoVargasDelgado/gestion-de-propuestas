package upc.poo.entidades;

import java.util.Collection;

public class LineaDeInvestigacion extends EntidadBase {
    
    private String nombre;
    
    private Collection<SublineaDeInvestigacion> sublineasDeInvestigacion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Collection<SublineaDeInvestigacion> getSublineasDeInvestigacion() {
        return sublineasDeInvestigacion;
    }

    public void setSublineasDeInvestigacion(Collection<SublineaDeInvestigacion> sublineasDeInvestigacion) {
        this.sublineasDeInvestigacion = sublineasDeInvestigacion;
    }
    
    @Override
    public String toString() {
        return super.toString() + ";"
                + nombre;
    }
    
}
