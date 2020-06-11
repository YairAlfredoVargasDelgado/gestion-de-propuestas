package upc.poo.datos;

import java.util.ArrayList;
import upc.poo.entidades.Asesor;
import upc.poo.entidades.OpcionDeGrado;

public class DatosAsesor extends DatosPersona {

    public DatosAsesor() {
        super("asesor.txt");
    }
    
    @Override
    public Asesor mapear(String dato, boolean lazy) {
        Asesor a = (Asesor)super.mapear(dato, lazy);
        
        if (!lazy) {
            ArrayList<OpcionDeGrado> og = new ArrayList<>();
            
            for (OpcionDeGrado _og: new DatosProyectoDeInvestigacionAplicada().obtener(pia -> pia.getIdAsesor().equals(a.getId()), true)){
                og.add(_og);
            }
            
            for (OpcionDeGrado _og: new DatosPracticaEmpresarial().obtener(pia -> pia.getIdAsesor().equals(a.getId()), true)){
                og.add(_og);
            }
            
            a.setOpcionesDeGrado(og);
        }
        
        return a;
    }
    
}
