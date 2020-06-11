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
        og.setLineaDeInvestigacion(new DatosLineaDeInvestigacion().obtener(li -> li.getId().equals(d[2]), false).get(0));
        og.setFechaYHoraDeRecepcion(LocalDateTime.parse(d[3]));
        og.setTiempoDeEjecucionEnMeses(Short.parseShort(d[4]));
        og.setIdDirector(d[5]);
        og.setDirector((Director)new DatosDirector().obtener(_d -> _d.getId().equals(og.getIdDirector()), true).get(0));
        og.setIdAsesor(d[6]);
        og.setAsesor((Asesor)new DatosAsesor().obtener(a -> a.getId().equals(og.getIdAsesor()), lazy).get(0));
        
        return og;
    }
    
    
}
