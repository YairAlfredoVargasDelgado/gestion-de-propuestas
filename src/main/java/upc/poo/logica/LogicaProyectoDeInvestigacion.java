package upc.poo.logica;

import upc.poo.datos.DatosProyectoDeInvestigacionAplicada;
import upc.poo.entidades.ProyectoDeInvestigacion;

public class LogicaProyectoDeInvestigacion extends Logica<ProyectoDeInvestigacion> {

    public LogicaProyectoDeInvestigacion() {
        super(new DatosProyectoDeInvestigacionAplicada());
    }

}
