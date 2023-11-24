/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedidos.modelos;

import java.time.LocalDateTime;
import java.util.ArrayList;
import productos.modelos.Producto;

/**
 *
 * @author root
 */
public class Pedido {
    private int numero;
    private LocalDateTime fechaYHora;
    private ArrayList<ProductoDelPedido> productos = new ArrayList<>();
    
    public Pedido(int numero, LocalDateTime fechaYHora, ProductoDelPedido pdp) {
        this.numero = numero;
        this.fechaYHora = fechaYHora; 
        this.productos.add(pdp);
    }
    
    

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public LocalDateTime getFechaYHora() {
        return fechaYHora;
    }

    public void setFechaYHora(LocalDateTime fechaYHora) {
        this.fechaYHora = fechaYHora;
    }

    public void agregarProducto(Producto p, int cantidad) {
        ProductoDelPedido pdp = new ProductoDelPedido(p, cantidad);
        this.productos.add(pdp);
    }
    
//    public ArrayList<Producto> getProductos() {
//        return this.productos;
//    }

    public void mostrarProductos() {
        for(ProductoDelPedido p : this.productos) {
            p.mostrar();
        }
    }
    
    
}
