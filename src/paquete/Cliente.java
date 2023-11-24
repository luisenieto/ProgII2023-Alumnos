/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

import usuarios.modelos.Usuario;

/**
 *
 * @author root
 */
public class Cliente extends Usuario {
//    private String domicilio;
    
    public Cliente(String correo, String clave, String apellidos, String nombres) {       
        super(correo, clave, apellidos, nombres); 
        //this.domicilio = domicilio;
       
    }

//    public Cliente(String correo, String clave, String apellidos, String nombres) {
//        this.correo = correo;
//        this.clave = clave;
//        this.apellidos = apellidos;
//        this.nombres = nombres;
//    }
    
    public void metodo() {
//        this.correo = "sass";
    }

    @Override
    public void mostrar() {
        System.out.println("Cliente");
        System.out.println("=======");
        super.mostrar(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String queSoy() {
        return "Soy un cliente";
    }
    
    
    
    
}
