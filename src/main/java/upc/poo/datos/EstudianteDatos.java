package upc.poo.datos;

import java.time.LocalDate;
import java.util.ArrayList;
import upc.poo.entidades.Contacto;
import upc.poo.entidades.Estudiante;
import upc.poo.entidades.EstudianteOpcionDeGrado;
import upc.poo.entidades.Identificacion;
import upc.poo.entidades.NombreCompleto;
import upc.poo.entidades.OpcionDeGrado;
import upc.poo.entidades.Persona;
import upc.poo.entidades.enums.Genero;
import upc.poo.entidades.enums.TipoDeIdentificacion;


public class EstudianteDatos extends PersonaDatos {

    public EstudianteDatos() {
        super("estudiante.txt");
    }

    @Override
    public Estudiante mapear(String dato, boolean lazy) {
        
        String[] d = dato.split(";");
        
        NombreCompleto nc = new NombreCompleto();
        Identificacion id = new Identificacion();
        Contacto c = new Contacto();
        Persona p = new Estudiante();
        
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
        
        if (!lazy) {
            ArrayList<OpcionDeGrado> og = new ArrayList<>();
            
            ArrayList<EstudianteOpcionDeGrado> eog = new ArrayList<>();
        }
        
        return (Estudiante)p;
    }
    
}
