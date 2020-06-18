package upc.poo.datos;

import upc.poo.entidades.ProyectoDeInvestigacion;

public class DatosProyectoDeInvestigacionAplicada extends Datos<ProyectoDeInvestigacion> {

    public DatosProyectoDeInvestigacionAplicada() {
        super("proyectodeinvestigacionaplicada.txt");
    }

    @Override
    public ProyectoDeInvestigacion mapear(String dato, boolean lazy) {
        ProyectoDeInvestigacion pia = new ProyectoDeInvestigacion();
        
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
