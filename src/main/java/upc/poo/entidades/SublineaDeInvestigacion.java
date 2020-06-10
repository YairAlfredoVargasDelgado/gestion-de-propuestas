package upc.poo.entidades;

public class SublineaDeInvestigacion extends EntidadBase {
    
    private String nombre;
    private String idLineaDeInvestigacion;
    private LineaDeInvestigacion lineaDeInvestigacion;

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
                + nombre + ";"
                + idLineaDeInvestigacion;
    }
    
}
