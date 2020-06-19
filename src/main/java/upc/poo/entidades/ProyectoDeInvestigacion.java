package upc.poo.entidades;

import java.util.Collection;

public class ProyectoDeInvestigacion extends OpcionDeGrado {
    
    private String objetivoGeneral;
    private String resumenDelPlanteamientoDelProblema;
    private String justificacion;
    private Collection<String> objetivosEspecificos;

    public String getObjetivoGeneral() {
        return objetivoGeneral;
    }

    public void setObjetivoGeneral(String objetivoGeneral) {
        this.objetivoGeneral = objetivoGeneral;
    }

    public String getResumenDelPlanteamientoDelProblema() {
        return resumenDelPlanteamientoDelProblema;
    }

    public void setResumenDelPlanteamientoDelProblema(String resumenDelPlanteamientoDelProblema) {
        this.resumenDelPlanteamientoDelProblema = resumenDelPlanteamientoDelProblema;
    }
    
    public String getJustificacion() {
        return justificacion;
    }

    public void setJustificacion(String justificacion) {
        this.justificacion = justificacion;
    }

    public Collection<String> getObjetivosEspecificos() {
        return objetivosEspecificos;
    }

    public void setObjetivosEspecificos(Collection<String> objetivosEspecificos) {
        this.objetivosEspecificos = objetivosEspecificos;
    }
    
    @Override
    public String toString() {
        return super.toString() + ";"
                + objetivoGeneral + ";"
                + resumenDelPlanteamientoDelProblema + ";"
                + this.getJustificacion() + ";"
                + String.join("|", objetivosEspecificos);
    }
    
}
