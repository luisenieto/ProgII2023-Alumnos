/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuarios.modelos;

import java.util.Objects;

/**
 *
 * @author root
 */
public abstract class Usuario {
    protected String correo;
    private String clave;
    private String apellidos;
    private String nombres;

    
    public Usuario(String correo, String clave, String apellidos, String nombres) {
        this.correo = correo;
        this.clave = clave;
        this.apellidos = apellidos;
        this.nombres = nombres;
    }
    
    
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    
    /**
     * Este método permite ...
     * 
     */
    public void mostrar() {
        System.out.println(this.apellidos);
        System.out.println(this.nombres);
        System.out.println(this.correo);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.correo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass().getSuperclass() != obj.getClass().getSuperclass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.correo, other.correo)) {
            return false;
        }
        return true;
    }

    
    public abstract String queSoy();
    
    
}
