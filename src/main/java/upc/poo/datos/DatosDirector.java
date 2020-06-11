package upc.poo.datos;

import java.util.ArrayList;
import upc.poo.entidades.Director;
import upc.poo.entidades.OpcionDeGrado;

public class DatosDirector extends DatosPersona {
    
    public DatosDirector() {
        super("director.txt");
    }
    
    @Override
    public Director mapear(String dato, boolean lazy) {
        Director d = (Director)super.mapear(dato, lazy);
        
        if (!lazy) {
            ArrayList<OpcionDeGrado> og = new ArrayList<>();
            
            for (OpcionDeGrado _og: new DatosProyectoDeInvestigacionAplicada().obtener(pia -> pia.getIdDirector().equals(d.getId()), true)){
                og.add(_og);
            }
            
            for (OpcionDeGrado _og: new DatosPracticaEmpresarial().obtener(pia -> pia.getIdDirector().equals(d.getId()), true)){
                og.add(_og);
            }
            
            d.setOpcionesDeGrado(og);
        }
        
        return d;
    }
    
}
