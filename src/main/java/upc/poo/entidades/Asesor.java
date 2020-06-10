package upc.poo.entidades;

import java.util.Collection;

public class Asesor extends Persona {
    
    private Collection<OpcionDeGrado> opcionesDeGrado;

    public Collection<OpcionDeGrado> getOpcionesDeGrado() {
        return opcionesDeGrado;
    }

    public void setOpcionesDeGrado(Collection<OpcionDeGrado> opcionesDeGrado) {
        this.opcionesDeGrado = opcionesDeGrado;
    }
    
}
