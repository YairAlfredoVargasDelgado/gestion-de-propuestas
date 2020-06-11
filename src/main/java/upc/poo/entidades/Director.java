package upc.poo.entidades;

import java.util.Collection;

public class Director extends Persona {
    
    private LineaDeInvestigacion lineaDeInvestigacion;
    private Collection<OpcionDeGrado> opcionesDeGrado;

    public Collection<OpcionDeGrado> getOpcionesDeGrado() {
        return opcionesDeGrado;
    }

    public void setOpcionesDeGrado(Collection<OpcionDeGrado> opcionesDeGrado) {
        this.opcionesDeGrado = opcionesDeGrado;
    }

    public LineaDeInvestigacion getLineaDeInvestigacion() {
        return lineaDeInvestigacion;
    }

    public void setLineaDeInvestigacion(LineaDeInvestigacion lineaDeInvestigacion) {
        this.lineaDeInvestigacion = lineaDeInvestigacion;
    }
    
}
