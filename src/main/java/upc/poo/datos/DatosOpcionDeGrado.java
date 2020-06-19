package upc.poo.datos;

import java.time.LocalDateTime;
import upc.poo.entidades.Asesor;
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
        
        og.setNombre(d[0]);
        og.setDescripcionBreve(d[1]);
        og.setLineaDeInvestigacion(new DatosLineaDeInvestigacion().obtener(li -> li.getId().equals(d[2]), true).get(0));
        og.setSublineaDeInvestigacion(new DatosSublineaDeInvestigacion().obtener(sli -> sli.getId().equals(d[3]), true).get(0));
        og.setFechaYHoraDeRecepcion(LocalDateTime.parse(d[4]));
        og.setTiempoDeEjecucionEnMeses(Short.parseShort(d[5]));
        og.setIdDirector(d[6]);
        og.setDirector((Director)new DatosDirector().obtener(_d -> _d.getId().equals(og.getIdDirector()), true).get(0));
        og.setIdAsesor(d[7]);
        og.setAsesor((Asesor)new DatosAsesor().obtener(a -> a.getId().equals(og.getIdAsesor()), lazy).get(0));
        og.setEstado(d[8]);
        
        return og;
    }
    
    
}
