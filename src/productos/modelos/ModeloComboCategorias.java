/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos.modelos;

import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author root
 */
public class ModeloComboCategorias extends DefaultComboBoxModel {

    public ModeloComboCategorias() {
        for(Categoria c : Categoria.values())
            this.addElement(c);
    }
    
    public Categoria verCategoria() {
        return (Categoria)this.getSelectedItem();
    }
    
    public void asignarCategoria(Categoria c) {
        this.setSelectedItem(c);
    }
    
}
