/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuarios.modelos;

/**
 *
 * @author root
 */
public class Empleado extends Usuario {
    
    public Empleado(String correo, String clave, String apellidos, String nombres) {
        super(correo, clave, apellidos, nombres);
    }
    
    public Empleado(String correo, String clave, String nombres) {
        this(correo, clave, "Gómez", nombres);        
    }
    
    public void metodo() {
        System.out.println(this.getCorreo());
    }

//    public Empleado(String correo, String clave, String apellidos, String nombres) {
//        this.correo = correo;
//        this.clave = clave;
//        this.apellidos = apellidos;
//        this.nombres = nombres;
//    }
//
//    

    @Override
    public void mostrar() {
        System.out.println("Empleado");
        System.out.println("========");
        super.mostrar(); 
       
    }
    
    @Override
    public String queSoy() {
        return "Soy un empleado";
    }
}
