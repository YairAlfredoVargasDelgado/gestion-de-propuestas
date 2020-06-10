package upc.poo.logica;

import java.util.ArrayList;
import upc.poo.datos.Datos;
import upc.poo.entidades.EntidadBase;

public class Logica<T extends EntidadBase> {
    
    public Logica(Datos datos) {
        this.datos = datos;
    }
    
    private final Datos datos;
    
    public ArrayList getAll(boolean lazy) {
        return datos.obtenerTodas(lazy);
    }
    
    public T get(String id) {
        return (T) datos.obtener(id, true);
    }
    
    public boolean registrar(T entidad) {
        return datos.registrar(entidad);
    }
    
    public boolean eliminar(String id) {
        return datos.eliminar(id);
    }
    
}
