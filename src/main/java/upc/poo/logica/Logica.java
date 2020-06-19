package upc.poo.logica;

import java.util.ArrayList;
import java.util.function.Predicate;
import upc.poo.datos.Datos;
import upc.poo.entidades.EntidadBase;

public class Logica<T extends EntidadBase> {
    
    public Logica(Datos datos) {
        this.datos = datos;
    }
    
    protected final Datos datos;
    
    public ArrayList getAll(boolean lazy) {
        return datos.obtenerTodas(lazy);
    }
    
    public T get(String id) {
        return (T) datos.obtener(id, true);
    }
    
    public ArrayList<T> get(Predicate<T> condicion) {
        return datos.obtener(condicion, true);
    }
    
    public ArrayList<T> get(Predicate<T> condicion, boolean lazy) {
        return datos.obtener(condicion, lazy);
    }
    
    public boolean registrar(T entidad) {
        return datos.registrar(entidad);
    }
    
    public boolean eliminar(String id) {
        return datos.eliminar(id);
    }
    
    public boolean modificar(String id, T t) {
        return datos.actualizar(id, t);
    }
    
}
