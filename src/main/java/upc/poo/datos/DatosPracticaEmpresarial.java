package upc.poo.datos;

import java.util.Arrays;
import upc.poo.entidades.Contacto;
import upc.poo.entidades.OpcionDeGrado;
import upc.poo.entidades.PracticaEmpresarial;

public class DatosPracticaEmpresarial extends DatosOpcionDeGrado {

    public DatosPracticaEmpresarial() {
       super("practicaempresarial.txt");
    }
    
    @Override
    public PracticaEmpresarial mapear(String dato, boolean lazy) {
        OpcionDeGrado og = super.mapear(dato, lazy);
        
        PracticaEmpresarial pe = new PracticaEmpresarial();
        
        pe.setId(og.getId());
        pe.setNombre(og.getNombre());
        pe.setTiempoDeEjecucionEnMeses(og.getTiempoDeEjecucionEnMeses());
        pe.setIdAsesor(og.getIdAsesor());
        pe.setAsesor(og.getAsesor());
        pe.setDescripcionBreve(og.getDescripcionBreve());
        pe.setIdDirector(dato);
        pe.setDirector(og.getDirector());
        pe.setEstudiantes(og.getEstudiantes());
        pe.setFechaYHoraDeRecepcion(og.getFechaYHoraDeRecepcion());
        pe.setIdLineaDeInvestigacion(og.getIdLineaDeInvestigacion());
        pe.setLineaDeInvestigacion(og.getLineaDeInvestigacion());
        pe.setIdSublineaDeInvestigacion(og.getIdSublineaDeInvestigacion());
        pe.setSublineaDeInvestigacion(og.getSublineaDeInvestigacion());
        
        String[] d = dato.split(";");
        
        pe.setRazonSocial(d[11]);
        pe.setNombreAreaODepartamento(d[12]);
        
        Contacto c = new Contacto();
        c.setTelefonoFijo(d[13]);
        c.setTelefonoCelular(d[14]);
        c.setDireccion(d[15]);
        c.setCorreoElectronico(d[16]);
        pe.setContacto(c);
        
        String[] fad = d[17].split("|");
        
        pe.setFuncionesADesarrollar(Arrays.asList(fad));
        
        return pe;
    }
    
}
