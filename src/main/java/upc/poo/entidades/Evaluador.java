package upc.poo.entidades;

import java.util.Collection;

public class Evaluador extends Profesor {
    
    private Collection<OpcionDeGrado> opcionesDeGrado;

    public Collection<OpcionDeGrado> getOpcionesDeGrado() {
        return opcionesDeGrado;
    }

    public void setOpcionesDeGrado(Collection<OpcionDeGrado> opcionesDeGrado) {
        this.opcionesDeGrado = opcionesDeGrado;
    }
    
}
