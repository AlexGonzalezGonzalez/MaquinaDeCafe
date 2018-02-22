/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquinadecafe;

import javax.swing.JOptionPane;

/**
 *
 * @author estudios
 */
public class Productos {
        String nombre;
    float precio;
    
    public Productos(String nombre, float precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    
    public static void elaborarBebida(){
        if(Display.opcion==1)
        JOptionPane.showMessageDialog(null, "Elaborando "+Botones.cafe.nombre);
        else
            JOptionPane.showMessageDialog(null, "Elaborando "+Botones.chocolate.nombre);
    }
    public static void ponerVaso(){
        JOptionPane.showMessageDialog(null,"Poniendo Vaso");
    }
    
}


