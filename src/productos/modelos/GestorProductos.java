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
public class GestorProductos {
    public static final String ERROR_DESCRIPCION = "Descripción incorrecta";
    public static final String ERROR_PRECIO = "Precio incorrecto";
    public static final String ERROR_ESTADO = "Estado mal";
    public static final String ERROR_DUPLICADO = "Ya existe un producto con esa descripción";
    public static final String OK = "Producto creado";
    
    private ArrayList<Producto> productos = new ArrayList<>();
    
    private static GestorProductos instancia;
    
    private GestorProductos() {
        
    }
    
    public static GestorProductos crear() {
        if (instancia == null)
            instancia = new GestorProductos();
        return instancia;
    }
    
    public String crearProducto(String descripcion, float precio, String estado) {
        if (descripcion == null || descripcion.isEmpty()) 
            return ERROR_DESCRIPCION;
        
        if (precio <= 0.0f) 
            return ERROR_PRECIO;
        
        if (estado == null || estado.isEmpty()) 
            return ERROR_ESTADO;
        
        Producto p = new Producto(descripcion, precio, estado);
        if (this.productos.contains(p)) 
            return ERROR_DUPLICADO;                    
        
        this.productos.add(p);
        return OK;
    }
    
    
    public void mostrarProductos() {
        for(Producto p : this.productos)
            p.mostrar();
    }
}
