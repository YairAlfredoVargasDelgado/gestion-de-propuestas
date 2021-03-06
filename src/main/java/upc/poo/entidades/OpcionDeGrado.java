package upc.poo.entidades;

import java.time.LocalDateTime;
import java.util.Collection;

public class OpcionDeGrado extends EntidadBase {
    
    private String nombre;
    private String descripcionBreve;
    private String idLineaDeInvestigacion;
    private LineaDeInvestigacion lineaDeInvestigacion;
    private String idSublineaDeInvestigacion;
    private SublineaDeInvestigacion sublineaDeInvestigacion;
    private Collection<Estudiante> estudiantes;
    private LocalDateTime fechaYHoraDeRecepcion;
    private Short tiempoDeEjecucionEnMeses;
    private String idDirector;
    private Director director;
    private String idAsesor;
    private Evaluador asesor;
    private String estado = "0";
    private String tipo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcionBreve() {
        return descripcionBreve;
    }

    public void setDescripcionBreve(String descripcionBreve) {
        this.descripcionBreve = descripcionBreve;
    }

    public LineaDeInvestigacion getLineaDeInvestigacion() {
        return lineaDeInvestigacion;
    }

    public void setLineaDeInvestigacion(LineaDeInvestigacion lineaDeInvestigacion) {
        this.lineaDeInvestigacion = lineaDeInvestigacion;
    }

    public Collection<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(Collection<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public LocalDateTime getFechaYHoraDeRecepcion() {
        return fechaYHoraDeRecepcion;
    }

    public void setFechaYHoraDeRecepcion(LocalDateTime fechaYHoraDeRecepcion) {
        this.fechaYHoraDeRecepcion = fechaYHoraDeRecepcion;
    }

    public Short getTiempoDeEjecucionEnMeses() {
        return tiempoDeEjecucionEnMeses;
    }

    public void setTiempoDeEjecucionEnMeses(Short tiempoDeEjecucionEnMeses) {
        this.tiempoDeEjecucionEnMeses = tiempoDeEjecucionEnMeses;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public Evaluador getAsesor() {
        return asesor;
    }

    public void setAsesor(Evaluador asesor) {
        this.asesor = asesor;
    }

    public String getIdDirector() {
        return idDirector;
    }

    public void setIdDirector(String IdDirector) {
        this.idDirector = IdDirector;
    }

    public String getIdAsesor() {
        return idAsesor;
    }

    public void setIdAsesor(String IdAsesor) {
        this.idAsesor = IdAsesor;
    }
    
    @Override
    public String toString() {
        return super.toString() + ";"
                + getNombre() + ";"
                + getDescripcionBreve() + ";"
                + getIdLineaDeInvestigacion() + ";"
                + getIdSublineaDeInvestigacion() + ";"
                + getFechaYHoraDeRecepcion() + ";"
                + getTiempoDeEjecucionEnMeses() + ";"
                + getIdDirector() + ";"
                + getIdAsesor() + ";"
                + getEstado() + ";"
                + getTipo();
    }

    public String getIdLineaDeInvestigacion() {
        return idLineaDeInvestigacion;
    }

    public void setIdLineaDeInvestigacion(String idLineaDeInvestigacion) {
        this.idLineaDeInvestigacion = idLineaDeInvestigacion;
    }

    /**
     * @return the idSublineaDeInvestigacion
     */
    public String getIdSublineaDeInvestigacion() {
        return idSublineaDeInvestigacion;
    }

    /**
     * @param idSublineaDeInvestigacion the idSublineaDeInvestigacion to set
     */
    public void setIdSublineaDeInvestigacion(String idSublineaDeInvestigacion) {
        this.idSublineaDeInvestigacion = idSublineaDeInvestigacion;
    }

    /**
     * @return the sublineaDeInvestigacion
     */
    public SublineaDeInvestigacion getSublineaDeInvestigacion() {
        return sublineaDeInvestigacion;
    }

    /**
     * @param sublineaDeInvestigacion the sublineaDeInvestigacion to set
     */
    public void setSublineaDeInvestigacion(SublineaDeInvestigacion sublineaDeInvestigacion) {
        this.sublineaDeInvestigacion = sublineaDeInvestigacion;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
