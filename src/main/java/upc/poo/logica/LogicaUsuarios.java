package upc.poo.logica;

import upc.poo.datos.DatosUsuario;
import upc.poo.entidades.Usuario;

public class LogicaUsuarios extends Logica<Usuario> {

    public LogicaUsuarios() {
        super(new DatosUsuario());
    }

}
