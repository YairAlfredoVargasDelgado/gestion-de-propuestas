package upc.poo.datos;

import upc.poo.entidades.SublineaDeInvestigacion;

public class DatosSublineaDeInvestigacion extends Datos<SublineaDeInvestigacion> {

    public DatosSublineaDeInvestigacion() {
        super("sublineasdeinvestigacion.txt");
    }

    @Override
    public SublineaDeInvestigacion mapear(String dato, boolean lazy) {
        SublineaDeInvestigacion si = new SublineaDeInvestigacion();
        
        String[] d = dato.split(";");
        
        si.setId(d[0]);
        si.setNombre(d[1]);
        si.setIdLineaDeInvestigacion(d[2]);
        
        DatosLineaDeInvestigacion lid = new DatosLineaDeInvestigacion();
        
        si.setLineaDeInvestigacion(lid.obtener(li -> li.getId().equals(d[3]), true).get(0));
        
        return si;
    }
    
}
