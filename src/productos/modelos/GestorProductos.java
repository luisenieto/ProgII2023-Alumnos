/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos.modelos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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
    private String nombreArchivo;
    
    private GestorProductos(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
        this.leer(nombreArchivo);
    }
    
    public static GestorProductos crear(String nombreArchivo) {
        if (instancia == null)
            instancia = new GestorProductos(nombreArchivo);
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
        this.escribir();
        return OK;
    }
    
    
    public void mostrarProductos() {
        for(Producto p : this.productos)
            p.mostrar();
    }
    
    
    private void escribir() {
        File f = new File(this.nombreArchivo);
        try {
            FileWriter fw = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(fw);
            
            for(Producto p : this.productos) {
                String linea;
                linea = p.verDescripcion() + ",";
                linea += Float.toString(p.verPrecioDelProducto()) + ",";
                linea += p.verEstado();
                bw.write(linea);
                bw.newLine();
            }
            
            bw.close();
        }
        catch(IOException e) {
            
        }
//        File f = new File(nombreArchivo);
//        try {
//            FileWriter fw = new FileWriter(f, true);
//            fw.write(cadena);
//            fw.close();
//        }
//        catch(IOException e) {
//            
//        }
    }

    private void leer(String nombreArchivo) {
        File f = new File(nombreArchivo);
        try {
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String linea;
            while((linea = br.readLine()) != null) {
                String [] vector = linea.split(",");
                String descripcion = vector[0];
                float precio = Float.parseFloat(vector[1]);
                String estado = vector[2];
                Producto p = new Producto(descripcion, precio, estado);
                this.productos.add(p);
            }
            
            br.close();
        }
        catch(FileNotFoundException fnf ) {
            
        }
        catch(IOException fnf ) {
            
        }
        
//        File f = new File(nombreArchivo);
//        try {
//            FileReader fr = new FileReader(f);            
//            int caracter;
//            while((caracter = fr.read()) != -1) {
//                System.out.print((char)caracter);
//            }
//            fr.close();
//        }
//        catch(FileNotFoundException fnf ) {
//            
//        }
//        catch(IOException ioe) {
//            
//        }
    }
}
