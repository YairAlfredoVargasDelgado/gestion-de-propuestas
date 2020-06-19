package upc.poo.datos;

import java.util.Arrays;
import upc.poo.entidades.OpcionDeGrado;
import upc.poo.entidades.ProyectoDeInvestigacion;

public class DatosProyectoDeInvestigacion extends DatosOpcionDeGrado {

    public DatosProyectoDeInvestigacion() {
        super("proyectodeinvestigacionaplicada.txt");
    }

    @Override
    public ProyectoDeInvestigacion mapear(String dato, boolean lazy) {
        OpcionDeGrado og = super.mapear(dato, lazy);
        
        ProyectoDeInvestigacion pe = new ProyectoDeInvestigacion();
        
        pe.setId(og.getId());
        pe.setIdAsesor(og.getIdAsesor());
        pe.setNombre(og.getNombre());
        pe.setAsesor(og.getAsesor());
        pe.setDescripcionBreve(og.getDescripcionBreve());
        pe.setIdDirector(dato);
        pe.setDirector(og.getDirector());
        pe.setEstudiantes(og.getEstudiantes());
        pe.setTiempoDeEjecucionEnMeses(og.getTiempoDeEjecucionEnMeses());
        pe.setFechaYHoraDeRecepcion(og.getFechaYHoraDeRecepcion());
        pe.setIdLineaDeInvestigacion(og.getIdLineaDeInvestigacion());
        pe.setLineaDeInvestigacion(og.getLineaDeInvestigacion());
        pe.setIdSublineaDeInvestigacion(og.getIdSublineaDeInvestigacion());
        pe.setSublineaDeInvestigacion(og.getSublineaDeInvestigacion());
        
        String[] d = dato.split(";");
        
        pe.setObjetivoGeneral(d[11]);
        pe.setResumenDelPlanteamientoDelProblema(d[12]);
        pe.setJustificacion(d[13]);
        
        String[] fad = d[14].split("|");
        pe.setObjetivosEspecificos(Arrays.asList(fad));
        
        return pe;
    }
    
}
