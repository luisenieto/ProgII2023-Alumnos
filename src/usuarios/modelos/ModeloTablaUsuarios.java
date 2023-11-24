/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuarios.modelos;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author root
 */
public class ModeloTablaUsuarios extends AbstractTableModel {
    private ArrayList<String> nombreColumnas = new ArrayList<>();
    private ArrayList<Usuario> usuarios = new ArrayList<>();

    public ModeloTablaUsuarios(ArrayList<Usuario> usuarios) {
        this.nombreColumnas.add("Apellidos");
        this.nombreColumnas.add("Nombres");
        this.nombreColumnas.add("Correo");
        this.nombreColumnas.add("Clave");
        this.usuarios = usuarios;
    }

    @Override
    public int getRowCount() {
        return this.usuarios.size();
    }

    @Override
    public int getColumnCount() {
        return this.nombreColumnas.size();
    }

    @Override
    public Object getValueAt(int fila, int columna) {
        Usuario u = this.usuarios.get(fila);
        switch(columna) {
            case 0 : return u.getApellidos();
            case 1 : return u.getNombres();
            case 2 : return u.getCorreo();
            default : return u.getClave();
        }
    }

    @Override
    public String getColumnName(int columna) {
        return this.nombreColumnas.get(columna);
    }
    
    
    
    
}
