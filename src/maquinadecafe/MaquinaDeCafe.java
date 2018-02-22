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
public class MaquinaDeCafe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                //LLamamos a la clase display para que nos muestre las opciones y dependiendo de la elegida hara una cosa u otra hasta que elijamos Salir ^^

        int opcion = Display.opciones();
        do {
            if (opcion == 0) {
                Dinero.IntroducirDinero();
                JOptionPane.showMessageDialog(null, "Credito: " + Dinero.credito);
            }
            if (opcion == 1 || opcion == 2) {
                Botones.seleccionDeProducto();
            }
            if (opcion == 3) {
                Botones.anhadirAzucar();
            }
            if (opcion == 4) {
                Botones.quitarAzucar();
            }
            if (opcion == 5) {
                Dinero.devolverDinero();
            }
            opcion = Display.opciones();
        } while (opcion != 6);
    }

}

    
    

