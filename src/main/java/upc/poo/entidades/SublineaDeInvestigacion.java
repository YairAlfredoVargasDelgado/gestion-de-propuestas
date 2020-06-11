package upc.poo.entidades;

import java.util.Collection;

public class SublineaDeInvestigacion extends EntidadBase {
    
    private String nombre;
    private String idLineaDeInvestigacion;
    private LineaDeInvestigacion lineaDeInvestigacion;
    private Collection<Estudiante> estudiantes;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdLineaDeInvestigacion() {
        return idLineaDeInvestigacion;
    }

    public void setIdLineaDeInvestigacion(String idLineaDeInvestigacion) {
        this.idLineaDeInvestigacion = idLineaDeInvestigacion;
    }

    public LineaDeInvestigacion getLineaDeInvestigacion() {
        return lineaDeInvestigacion;
    }

    public void setLineaDeInvestigacion(LineaDeInvestigacion lineaDeInvestigacion) {
        this.lineaDeInvestigacion = lineaDeInvestigacion;
    }
    
    @Override
    public String toString() {
        return super.toString() + ";"
                + getNombre() + ";"
                + getIdLineaDeInvestigacion();
    }

    public Collection<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(Collection<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
    
}
