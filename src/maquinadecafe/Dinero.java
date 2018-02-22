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
public class Dinero {
        static float credito;
    
    static int moneda;
    //este metodo muestra una serie de opciones a elegir para meter dinero:10 cent,20,50 1€,2€
    public static void IntroducirDinero() {

        moneda = JOptionPane.showOptionDialog(null, "¿Cuanto desea introducir?", "Cabecera", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"10 centimos", "20 centimos", "50 centimos", "1 euro", "2 euros"}, null);
        //10 centimos
        if (moneda == 0) {
            credito = credito + 0.1f;
        }
        //20 centimos
        if (moneda == 1) {
            credito = credito + 0.2f;
        }
        //50centimos
        if (moneda == 2) {
            credito = credito + 0.5f;
        }
        //1€
        if (moneda == 3) {
            credito = credito + 1;
        }
        //2€
        if (moneda == 4) {
            credito = credito + 2;
        }
    }
        //Metodo el cual te devuelve el credito que estaen la maquina o imprime un mensaje en caso de que no haya y se pulse el boton
    public static void devolverDinero() {
        if (credito > 0) {
            JOptionPane.showMessageDialog(null, "Credito devuelto: " + credito);
            credito = 0;
        } else {
            JOptionPane.showMessageDialog(null, "No hay credito  a devolver");
        }

    }
}


