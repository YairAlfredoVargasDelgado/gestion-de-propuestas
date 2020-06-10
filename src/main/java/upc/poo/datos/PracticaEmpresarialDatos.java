package upc.poo.datos;

import java.util.Arrays;
import upc.poo.entidades.Contacto;
import upc.poo.entidades.PracticaEmpresarial;

public class PracticaEmpresarialDatos extends OpcionDeGradoDatos {

    public PracticaEmpresarialDatos() {
       super("practicaempresarial.txt");
    }
    
    @Override
    public PracticaEmpresarial mapear(String dato, boolean lazy) {
        PracticaEmpresarial pe = (PracticaEmpresarial) super.mapear(dato, lazy);
        
        String[] d = dato.split(";");
        
        pe.setRazonSocial(d[7]);
        
        Contacto c = new Contacto();
        c.setTelefonoFijo(d[8]);
        c.setTelefonoCelular(d[9]);
        c.setDireccion(d[10]);
        c.setCorreoElectronico(d[11]);
        pe.setContacto(c);
        
        pe.setNombreAreaODepartamento(d[12]);
        
        String[] fad = d[13].split("|");
        
        pe.setFuncionesADesarrollar(Arrays.asList(fad));
        
        return pe;
    }
    
}
