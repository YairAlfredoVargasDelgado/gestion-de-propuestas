package upc.poo.logica;

import upc.poo.datos.Datos;
import upc.poo.datos.DatosSublineaDeInvestigacion;
import upc.poo.entidades.SublineaDeInvestigacion;

public class LogicaSublineaDeInvestigacion extends Logica<SublineaDeInvestigacion> {
    
    public LogicaSublineaDeInvestigacion() {
        super(new DatosSublineaDeInvestigacion());
    }
    
}
