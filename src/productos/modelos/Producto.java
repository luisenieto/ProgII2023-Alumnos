/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos.modelos;

import java.util.Objects;
import pedidos.modelos.Pedido;



/**
 *
 * @author root
 */



public class Producto {
    private String descripcion;
    private float precioDelProducto;
    private String estado;
//    private Pedido unPedido;

    public Producto(String descripcion, float precioDelProducto, String estado) {
        this.descripcion = descripcion;
        this.precioDelProducto = precioDelProducto;
        this.estado = estado;
    }

    
    
    public Producto(String d, float p) {
        descripcion = d;
        precioDelProducto = p;
        estado = "Habilitado";    
    }
    
    public Producto(String d) {         
        descripcion = d;        
        precioDelProducto = 10.0f;
        estado = "Habilitado";
    }
    
    
    
    public void mostrar() {   
        System.out.println(this.verDescripcion());
        System.out.println(precioDelProducto);
        System.out.println(estado);        
    }
    
    public void mostrar(float precio) {        
        if (precio >= 10) {
            //
        }
        else {
            //
        }
    }

    public String verDescripcion() {
        return this.descripcion;
    }

    public void asignarDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float verPrecioDelProducto() {
        return precioDelProducto;
    }

    public void asignarPrecioDelProducto(float precioDelProducto) {
        this.precioDelProducto = precioDelProducto;
    }

    public String verEstado() {
        return estado;
    }

    public void asignarEstado(String estado) {
        this.estado = estado;
    }
    
    
//    public String toString() {
//        return this.descripcion;
//    }

    @Override
    public String toString() {
        return this.descripcion;
    }

//    @Override
//    public int hashCode() {
//        int hash = 3;
//        hash = 67 * hash + Objects.hashCode(this.descripcion);
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final Producto other = (Producto) obj;
//        if (!Objects.equals(this.descripcion, other.descripcion)) {
//            return false;
//        }
//        return true;
//    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.descripcion);
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
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Producto other = (Producto) obj;
        if (!Objects.equals(this.descripcion, other.descripcion)) {
            return false;
        }
        return true;
    }
    
    
}

