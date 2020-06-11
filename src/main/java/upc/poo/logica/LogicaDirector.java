package upc.poo.logica;

import upc.poo.datos.DatosDirector;
import upc.poo.entidades.Director;

public class LogicaDirector extends Logica<Director> {
    
    public LogicaDirector() {
        super(new DatosDirector());
    }
    
    
}
