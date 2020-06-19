package upc.poo.datos;

import upc.poo.entidades.EntidadBase;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

public abstract class Datos<T extends EntidadBase> {
    
    private final Archivo archivo;
    
    public Datos(String ruta) {
        archivo = new Archivo(ruta);
    }
    
    public Integer count() {
        return obtenerTodas(false).size();
    }
    
    public T obtener(String id, boolean lazy) {
        for (T entidad: obtenerTodas(lazy)) {
            if (entidad.getId().equals(id)){
                return entidad;
            }
        }
        return null;
    }
    
    public ArrayList<T> obtener(Predicate<T> p, boolean lazy){
        ArrayList<T> datos = new ArrayList<>();
        
        for (T entidad: obtenerTodas(lazy)) {
            if (p.test(entidad) == true){
                datos.add(entidad);
            }
        }
        return datos;
    }
    
    public ArrayList<T> obtenerTodas(boolean lazy) {
        Scanner lector = archivo.abrirParaLectura();
        
        ArrayList<T> datos = new ArrayList<>();
        while (lector.hasNext()) {
            datos.add(mapear(lector.nextLine(), lazy));
        }
        
        lector.close();
        
        return datos;
    }
    
    public boolean eliminar(String id) {
        T entidad = obtener(id, false);
        if (entidad != null) {
            ArrayList<T> todas = obtenerTodas(false);
            todas.remove(entidad);
            
            if (!archivo.recrearArchivo()) {
                return false;
            }
            
            for (T _entidad: todas) {
                registrar(_entidad);
            }
            return true;
        }
        return false;
    }
    
    public boolean actualizar(String id, T t) {
        if (eliminar(id)) {
            registrar(t);
            return true;
        }
        return false;
    }
    
    protected String obtenerId() {
        return String.valueOf(1 + this.count());
    }
    
    public boolean registrar(T entidad) {
        try {
            BufferedWriter escritor = archivo.abrirParaEscritura(true);
            entidad.setId(String.valueOf(1 + this.count()));
            if (existe(entidad.getId())) {
                return false;
            }
            escritor.write(entidad.toString() + "\n");
            escritor.close();
            return true;
        } catch (IOException ex) {
            ex.printStackTrace();
            return false;
        }
    }
    
    public boolean existe(String id) {
        return obtener(id, false) != null;
    }
    
    public abstract T mapear(String dato, boolean lazy);
    
}
