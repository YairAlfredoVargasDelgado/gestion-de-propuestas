package upc.poo.datos;

import java.time.LocalDateTime;
import upc.poo.entidades.Evaluador;
import upc.poo.entidades.Director;
import upc.poo.entidades.OpcionDeGrado;

public class DatosOpcionDeGrado extends Datos<OpcionDeGrado> {

    public DatosOpcionDeGrado(String ruta) {
        super(ruta);
    }

    @Override
    public OpcionDeGrado mapear(String dato, boolean lazy) {
        OpcionDeGrado og = new OpcionDeGrado();
        
        String[] d = dato.split(";");
        
        og.setId(d[0]);
        og.setNombre(d[1]);
        og.setDescripcionBreve(d[2]);
        og.setLineaDeInvestigacion(new DatosLineaDeInvestigacion().obtener(li -> li.getId().equals(d[3]), true).get(0));
        og.setSublineaDeInvestigacion(new DatosSublineaDeInvestigacion().obtener(sli -> sli.getId().equals(d[4]), true).get(0));
        og.setFechaYHoraDeRecepcion(LocalDateTime.parse(d[5]));
        og.setTiempoDeEjecucionEnMeses(Short.parseShort(d[6]));
        og.setIdDirector(d[7]);
        og.setDirector((Director)new DatosDirector().obtener(_d -> _d.getId().equals(og.getIdDirector()), true).get(0));
        og.setIdAsesor(d[8]);
        og.setAsesor((Evaluador)new DatosEvaluador().obtener(a -> a.getId().equals(og.getIdAsesor()), lazy).get(0));
        og.setEstado(d[9]);
        og.setTipo(d[10]);
        
        return og;
    }
    
    
}
