package upc.poo.entidades;

public class EstudianteOpcionDeGrado extends EntidadBase {

    private String idEstudiante;
    private String idOpcionDeGrado;

    public String getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(String idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getIdOpcionDeGrado() {
        return idOpcionDeGrado;
    }

    public void setIdOpcionDeGrado(String idOpcionDeGrado) {
        this.idOpcionDeGrado = idOpcionDeGrado;
    }
    
    @Override
    public String toString() {
        return super.toString() + ";"
                + idEstudiante + ";"
                + idOpcionDeGrado;
    }
}
