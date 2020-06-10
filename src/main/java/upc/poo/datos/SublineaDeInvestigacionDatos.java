package upc.poo.datos;

import upc.poo.entidades.SublineaDeInvestigacion;

public class SublineaDeInvestigacionDatos extends Datos<SublineaDeInvestigacion> {

    public SublineaDeInvestigacionDatos() {
        super("sublineasdeinvestigacion.txt");
    }

    @Override
    public SublineaDeInvestigacion mapear(String dato, boolean lazy) {
        SublineaDeInvestigacion si = new SublineaDeInvestigacion();
        
        String[] d = dato.split(";");
        
        si.setId(d[0]);
        si.setNombre(d[1]);
        si.setIdLineaDeInvestigacion(d[2]);
        
        LineaDeInvestigacionDatos lid = new LineaDeInvestigacionDatos();
        
        si.setLineaDeInvestigacion(lid.obtener(li -> li.getId().equals(d[3]), true).get(0));
        
        return si;
    }
    
}
