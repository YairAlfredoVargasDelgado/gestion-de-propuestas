package upc.poo.logica;

import upc.poo.datos.DatosAsesor;
import upc.poo.entidades.Asesor;

public class LogicaAsesores extends Logica<Asesor> {
    
    public LogicaAsesores() {
        super(new DatosAsesor());
    }
    
}
