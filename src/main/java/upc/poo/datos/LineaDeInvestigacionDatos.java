package upc.poo.datos;

import java.util.ArrayList;
import upc.poo.entidades.LineaDeInvestigacion;

public class LineaDeInvestigacionDatos extends Datos<LineaDeInvestigacion> {

    public LineaDeInvestigacionDatos() {
        super("lineadeinvestigacion.txt");
    }

    @Override
    public LineaDeInvestigacion mapear(String dato, boolean lazy) {
        LineaDeInvestigacion li = new LineaDeInvestigacion();
        
        String[] d = dato.split(";");
        
        li.setId(d[0]);
        li.setNombre(d[1]);
        
        li.setSublineasDeInvestigacion(new ArrayList<>());
        
        if (!lazy) {
            SublineaDeInvestigacionDatos lid = new SublineaDeInvestigacionDatos();
            
            li.setSublineasDeInvestigacion(lid.obtener(sli -> sli.getIdLineaDeInvestigacion().equals(d[0]), true));
        }
        
        return li;
    }
    
}
