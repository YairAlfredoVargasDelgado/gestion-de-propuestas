package upc.poo.datos;

import upc.poo.entidades.ProyectoDeInvestigacionAplicada;

public class DatosProyectoDeInvestigacionAplicada extends Datos<ProyectoDeInvestigacionAplicada> {

    public DatosProyectoDeInvestigacionAplicada() {
        super("proyectodeinvestigacionaplicada.txt");
    }

    @Override
    public ProyectoDeInvestigacionAplicada mapear(String dato, boolean lazy) {
        ProyectoDeInvestigacionAplicada pia = new ProyectoDeInvestigacionAplicada();
        
        String[] d = dato.split(";");
        
        pia.setNombre(d[0]);
        pia.setDescripcionBreve(d[1]);
        
        DatosLineaDeInvestigacion lid = new DatosLineaDeInvestigacion();        
        pia.setLineaDeInvestigacion(lid.obtener(li -> li.getId().equals(d[2]), true).get(0));
        
        if (!lazy) {
            DatosEstudiante ed = new DatosEstudiante();
        }
        
        return pia;
    }
    
}
