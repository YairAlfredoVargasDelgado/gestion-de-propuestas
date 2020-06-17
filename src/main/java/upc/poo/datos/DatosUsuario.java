package upc.poo.datos;

import upc.poo.entidades.Usuario;

public class DatosUsuario extends Datos<Usuario> {

    public DatosUsuario() {
        super("usuarios.txt");
    }

    @Override
    public Usuario mapear(String dato, boolean lazy) {
        String[] d = dato.split(";");
        
        Usuario u = new Usuario();
        u.setId(d[0]);
        u.setNombre(d[1]);
        u.setContraseña(d[2]);
        
        return u;
    }
    
    
}
