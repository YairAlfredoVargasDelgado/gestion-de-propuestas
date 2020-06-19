package upc.poo.logica;

import upc.poo.datos.DatosEvaluador;
import upc.poo.entidades.Evaluador;

public class LogicaEvaluador extends Logica<Evaluador> {
    
    public LogicaEvaluador() {
        super(new DatosEvaluador());
    }
    
}
