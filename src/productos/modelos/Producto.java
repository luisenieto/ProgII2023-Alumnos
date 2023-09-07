/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos.modelos;

import java.util.ArrayList;

/**
 *
 * @author root
 */



public class Producto {
    String descripcion;
    ArrayList<Integer> vector = new ArrayList<>();
    
    void mostrar() {
        System.out.println(descripcion);
    }
    
    void mostrar1() {
        System.out.println("Descripción: " + descripcion);
    }
}

