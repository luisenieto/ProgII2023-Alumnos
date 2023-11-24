/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedidos.modelos;

import productos.modelos.Producto;

/**
 *
 * @author root
 */
public class ProductoDelPedido {
    private Producto unProducto;
    private int cantidad;

    public ProductoDelPedido(Producto unProducto, int cantidad) {
        this.unProducto = unProducto;
        this.cantidad = cantidad;
    }
    
    public void mostrar() {
        this.unProducto.mostrar();
        System.out.println(this.cantidad);
    }
}
