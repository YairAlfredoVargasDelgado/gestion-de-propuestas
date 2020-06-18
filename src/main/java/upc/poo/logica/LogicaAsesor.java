package upc.poo.logica;

import upc.poo.datos.DatosAsesor;
import upc.poo.entidades.Asesor;

public class LogicaAsesor extends Logica<Asesor> {
    
    public LogicaAsesor() {
        super(new DatosAsesor());
    }
    
}
