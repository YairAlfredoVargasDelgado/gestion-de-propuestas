package upc.poo.datos;

import java.util.ArrayList;
import upc.poo.entidades.Asesor;
import upc.poo.entidades.OpcionDeGrado;

public class AsesorDatos extends PersonaDatos {

    public AsesorDatos() {
        super("asesor.txt");
    }
    
    @Override
    public Asesor mapear(String dato, boolean lazy) {
        Asesor a = (Asesor)super.mapear(dato, lazy);
        
        if (!lazy) {
            ArrayList<OpcionDeGrado> og = new ArrayList<>();
            
            for (OpcionDeGrado _og: new ProyectoDeInvestigacionAplicadaDatos().obtener(pia -> pia.getIdAsesor().equals(a.getId()), true)){
                og.add(_og);
            }
            
            for (OpcionDeGrado _og: new PracticaEmpresarialDatos().obtener(pia -> pia.getIdAsesor().equals(a.getId()), true)){
                og.add(_og);
            }
            
            a.setOpcionesDeGrado(og);
        }
        
        return a;
    }
    
}
