package upc.poo.datos;

import java.util.ArrayList;
import upc.poo.entidades.Director;
import upc.poo.entidades.Estudiante;
import upc.poo.entidades.Evaluador;
import upc.poo.entidades.Persona;
import upc.poo.entidades.ProyectoDeInvestigacion;

public class DatosProyectoDeInvestigacionAplicada extends Datos<ProyectoDeInvestigacion> {

    public DatosProyectoDeInvestigacionAplicada() {
        super("proyectodeinvestigacionaplicada.txt");
    }

    @Override
    public ProyectoDeInvestigacion mapear(String dato, boolean lazy) {
        ProyectoDeInvestigacion pia = new ProyectoDeInvestigacion();
        
        String[] d = dato.split(";");
        
        pia.setId(d[0]);
        pia.setNombre(d[1]);
        
        ArrayList<Estudiante> es = new ArrayList<>();
        DatosEstudiante de = new DatosEstudiante();
        
        for (Persona p: de.obtenerTodas(lazy)) {
            if (p.getId().equals(d[2])) {
                es.add((Estudiante)p);
                break;
            }
        }
        
        pia.setEstudiantes(es);
        
        pia.setIdDirector(d[2]);
        pia.setDirector((Director)(new DatosDirector().obtener(d[2], true)));
        
        pia.setIdAsesor(d[3]);
        pia.setAsesor((Evaluador)(new DatosEvaluador().obtener(d[3], true)));
        
        pia.setDescripcionBreve(d[1]);
        
        DatosLineaDeInvestigacion lid = new DatosLineaDeInvestigacion();        
        pia.setLineaDeInvestigacion(lid.obtener(li -> li.getId().equals(d[2]), true).get(0));
        
        return pia;
    }
    
}
