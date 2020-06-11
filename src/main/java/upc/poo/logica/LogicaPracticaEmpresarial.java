package upc.poo.logica;

import upc.poo.datos.DatosPracticaEmpresarial;
import upc.poo.entidades.PracticaEmpresarial;

public class LogicaPracticaEmpresarial extends Logica<PracticaEmpresarial> {
    
    public LogicaPracticaEmpresarial() {
        super(new DatosPracticaEmpresarial());
    }
    
}
