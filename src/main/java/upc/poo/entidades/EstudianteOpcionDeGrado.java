package upc.poo.entidades;

public class EstudianteOpcionDeGrado extends EntidadBase {

    private String idEstudiante;
    private String idOpcionDeGrado;
    private String tipoOpcionDeGrado;

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
                + getIdEstudiante() + ";"
                + getIdOpcionDeGrado() + ";"
                + getTipoOpcionDeGrado();
    }

    /**
     * @return the tipoOpcionDeGrado
     */
    public String getTipoOpcionDeGrado() {
        return tipoOpcionDeGrado;
    }

    /**
     * @param tipoOpcionDeGrado the tipoOpcionDeGrado to set
     */
    public void setTipoOpcionDeGrado(String tipoOpcionDeGrado) {
        this.tipoOpcionDeGrado = tipoOpcionDeGrado;
    }
}
