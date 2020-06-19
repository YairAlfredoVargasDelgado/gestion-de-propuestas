package upc.poo.datos;

import java.time.LocalDate;
import java.util.ArrayList;
import upc.poo.entidades.Contacto;
import upc.poo.entidades.Director;
import upc.poo.entidades.Evaluador;
import upc.poo.entidades.Identificacion;
import upc.poo.entidades.LineaDeInvestigacion;
import upc.poo.entidades.NombreCompleto;
import upc.poo.entidades.OpcionDeGrado;
import upc.poo.entidades.enums.Genero;
import upc.poo.entidades.enums.TipoDeIdentificacion;
import upc.poo.logica.LogicaLineaDeInvestigacion;

public class DatosDirector extends DatosPersona {
    
    public DatosDirector() {
        super("director.txt");
    }
    
    @Override
    public Director mapear(String dato, boolean lazy) {
        String[] d = dato.split(";");
        
        NombreCompleto nc = new NombreCompleto();
        Identificacion id = new Identificacion();
        Contacto c = new Contacto();
        Director p = new Director();
        
        p.setId(d[0]);
        
        nc.setPrimerNombre(d[1]);
        nc.setSegundoNombre(d[2]);
        nc.setPrimerApellido(d[3]);
        nc.setSegundoApellido(d[4]);
        
        id.setTipo(TipoDeIdentificacion.valueOf(d[5]));
        id.setNumero(d[6]);
        
        p.setFechaNacimiento(LocalDate.parse(d[7]));
        p.setGenero(Genero.valueOf(d[8]));
        
        c.setTelefonoFijo(d[9]);
        c.setTelefonoCelular(d[10]);
        c.setDireccion(d[11]);
        c.setCorreoElectronico(d[12]);
        
        p.setNombre(nc);
        p.setIdentificacion(id);
        p.setContacto(c);
        
        String[] _d = dato.split(";");
        
        LineaDeInvestigacion li = new LineaDeInvestigacion();
        try {
            li = new LogicaLineaDeInvestigacion().get(_li -> _li.getId().equals(_d[13])).get(0);
            p.setIdLineaDeInvestigacion(li.getId());
        } catch (Exception e) {
            
        }
        p.setLineaDeInvestigacion(li);
        
        if (!lazy) {
            ArrayList<OpcionDeGrado> og = new ArrayList<>();
            
            for (OpcionDeGrado _og: new DatosProyectoDeInvestigacion().obtener(pia -> pia.getIdDirector().equals(p.getId()), true)){
                og.add(_og);
            }
            
            for (OpcionDeGrado _og: new DatosPracticaEmpresarial().obtener(pia -> pia.getIdDirector().equals(p.getId()), true)){
                og.add(_og);
            }
            
            p.setOpcionesDeGrado(og);
        }
        
        return p;
    }
    
}
