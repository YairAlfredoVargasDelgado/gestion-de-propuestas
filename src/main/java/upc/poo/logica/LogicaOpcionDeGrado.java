package upc.poo.logica;

import upc.poo.datos.Datos;
import upc.poo.entidades.Estudiante;
import upc.poo.entidades.EstudianteOpcionDeGrado;
import upc.poo.entidades.OpcionDeGrado;

public abstract class LogicaOpcionDeGrado extends Logica<OpcionDeGrado> {

    public LogicaOpcionDeGrado(Datos datos) {
        super(datos);
    }
    
    @Override
    public boolean registrar(OpcionDeGrado og) {
        LogicaEstudianteOpcionDeGrado leog = new LogicaEstudianteOpcionDeGrado();
        
        for (Estudiante _e: og.getEstudiantes()) {
            EstudianteOpcionDeGrado eopg = new EstudianteOpcionDeGrado();
            
            eopg.setIdEstudiante(_e.getId());
            eopg.setIdOpcionDeGrado(og.getId());
            
            if (!leog.registrar(eopg))
                return false;
        }
        
        return true;
    }
}
