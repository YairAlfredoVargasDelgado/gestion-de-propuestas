package upc.poo.datos;

import upc.poo.entidades.EstudianteOpcionDeGrado;

public class DatosEstudianteOpcionDeGrado extends Datos<EstudianteOpcionDeGrado> {

    public DatosEstudianteOpcionDeGrado() {
        super("estudianteopciondegrado.txt");
    }

    @Override
    public EstudianteOpcionDeGrado mapear(String dato, boolean lazy) {
        EstudianteOpcionDeGrado eog = new EstudianteOpcionDeGrado();
        
        String[] d = dato.split(";");
        
        eog.setId(d[0]);
        eog.setIdEstudiante(d[1]);
        eog.setIdOpcionDeGrado(d[2]);
        eog.setTipoOpcionDeGrado(d[3]);
        
        return eog;
    }
    
}
