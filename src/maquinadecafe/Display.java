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
public class Display {
        static int opcion;
    //metodo que muestra una serie de opciones: Introducir dinero, cafe, chocolate, anhadir azucar, quitar azucar, devolver dinero o salir.
    public static int opciones() {
        opcion = JOptionPane.showOptionDialog(null, "Selecciona la opcion que desees", "Cafetera Daniel Castelao", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Introducir Dinero", Botones.cafe.nombre, Botones.chocolate.nombre, "Anhadir Azucar", "Quitar Azucar", "Devolver Dinero", "Salir"}, null);
        return opcion;
    }
}      


