package upc.poo.entidades;

import upc.poo.entidades.enums.TipoDeIdentificacion;

public class Identificacion {
    
    private String numero;
    private TipoDeIdentificacion tipo;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public TipoDeIdentificacion getTipo() {
        return tipo;
    }

    public void setTipo(TipoDeIdentificacion tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public String toString() {
        return tipo + ";"
                + numero;
    }
    
}
