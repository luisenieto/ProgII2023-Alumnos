/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores.principal;

import productos.modelos.GestorProductos;

/**
 *
 * @author root
 */
public class Principal {
    public static void main(String[] args) {
//        JFrame ventana = new JFrame("Mi ventana");
//        ventana.setSize(300, 400);
//        ventana.setLocationRelativeTo(null);
//        ventana.setResizable(false);
//        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        ventana.setVisible(true);

//        VentanaProductos ventana = new VentanaProductos();
//        VentanaProductos2 ventana2 = new VentanaProductos2(ventana, false);
//        GestorProductos gp1 = GestorProductos.crear();
//        
//        GestorProductos gp2 = GestorProductos.crear();
//        System.out.println(gp1.crearProducto("Producto1", 1.0f, "Habilitado"));
//        System.out.println(gp2.crearProducto("Producto2", 2.0f, "Habilitado"));
//        System.out.println(gp1.crearProducto("Producto3", 3.0f, "Habilitado"));
////        if (gp.crearProducto("Producto4", 4.0f, null).equals(GestorProductos.ERROR_ESTADO)) {
////            //
////        }
//        
//        gp2.mostrarProductos();

        GestorProductos gp = GestorProductos.crear("Productos");
//        gp.escribir("Archivo", "Hola Mundo");
//        gp.escribir("Archivo", "\n");
//        gp.escribir("Archivo", "Hola Mundo2");
        gp.crearProducto("dede", 10, "estado");
//        gp.mostrarProductos();
    }
}
