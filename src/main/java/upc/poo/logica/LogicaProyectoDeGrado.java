package upc.poo.logica;

import upc.poo.datos.Datos;
import upc.poo.entidades.Estudiante;
import upc.poo.entidades.EstudianteOpcionDeGrado;
import upc.poo.entidades.OpcionDeGrado;

public abstract class LogicaProyectoDeGrado extends Logica<OpcionDeGrado> {

    public LogicaProyectoDeGrado(Datos datos) {
        super(datos);
    }
    
    @Override
    public boolean registrar(OpcionDeGrado og) {
        LogicaEstudianteOpcionDeGrado leog = new LogicaEstudianteOpcionDeGrado();
        
        String id = String.valueOf(this.datos.count() + 1);
        
        for (Estudiante _e: og.getEstudiantes()) {
            EstudianteOpcionDeGrado eopg = new EstudianteOpcionDeGrado();
            
            eopg.setIdEstudiante(_e.getId());
            eopg.setIdOpcionDeGrado(id);
            eopg.setTipoOpcionDeGrado(og.getTipo());
            
            if (!leog.registrar(eopg))
                return false;
        }
        
        if (!super.registrar(og)) {
            return false;
        }
        
        return true;
    }
}
