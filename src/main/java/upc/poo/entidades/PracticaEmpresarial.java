package upc.poo.entidades;

import java.util.Collection;

public class PracticaEmpresarial extends OpcionDeGrado {
    
    private String razonSocial;
    private Contacto contacto;
    private String nombreAreaODepartamento;
    private Collection<String> funcionesADesarrollar;
    
    public Contacto getContacto() {
        return contacto;
    }

    public void setContacto(Contacto contacto) {
        this.contacto = contacto;
    }

    public String getNombreAreaODepartamento() {
        return nombreAreaODepartamento;
    }

    public void setNombreAreaODepartamento(String nombreAreaODepartamento) {
        this.nombreAreaODepartamento = nombreAreaODepartamento;
    }

    public Collection<String> getFuncionesADesarrollar() {
        return funcionesADesarrollar;
    }

    public void setFuncionesADesarrollar(Collection<String> funcionesADesarrollar) {
        this.funcionesADesarrollar = funcionesADesarrollar;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }
    
    @Override
    public String toString() {
        return super.toString() + ";"
                + razonSocial + ";"
                + nombreAreaODepartamento + ";"
                + funcionesADesarrollar.stream().map(fd -> fd + "|");
    }
    
}
