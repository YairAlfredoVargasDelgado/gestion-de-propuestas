package upc.poo.logica;

import upc.poo.datos.DatosEstudiante;
import upc.poo.entidades.Estudiante;

public class LogicaEstudiante extends Logica<Estudiante> {
    
    public LogicaEstudiante() {
        super(new DatosEstudiante());
    }
    
}
