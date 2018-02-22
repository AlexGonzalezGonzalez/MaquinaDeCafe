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
public class Botones {
    static int azucar = 3;
    static Productos cafe = new Productos("Cafe", 2f);
    static Productos chocolate = new Productos("Chocolate", 5f);

    //metodo que le suma 1 a azucar o muestra que ha llegado al maximo y no puede subir mas.
    public static void anhadirAzucar() {
        if (azucar < 5) {
            azucar++;
            JOptionPane.showMessageDialog(null, "Azucar: " + azucar);

        } else {
            JOptionPane.showMessageDialog(null, "5 es el maximo");
        }

    }

    //metodo que resta 1 a azucar o muestra un mensaje en caso de ser 0
    public static void quitarAzucar() {
        if (azucar > 0) {
            azucar--;
            JOptionPane.showMessageDialog(null, "Azucar: " + azucar);
        } else {
            JOptionPane.showMessageDialog(null, "0 es el minimo");
        }

    }

    //metodo el cual dependiendo de la opcion elegida entra cafe o chocolate del display te muestra el precio, lo que te falta o la confirmacion de la bebida
    public static void seleccionDeProducto() {
        //opcion cafe
        if (Display.opcion == 1) {
            //mostrar precio
            if (Dinero.credito == 0) {
                JOptionPane.showMessageDialog(null, "Precio: " + cafe.precio);
                //mostrar dinero restante
            } else if (Dinero.credito < cafe.precio) {
                JOptionPane.showMessageDialog(null, "Dinero restante: " + (cafe.precio - Dinero.credito));
                //mostrar si desea confirmar la eleccion
            } else {
                if (JOptionPane.showConfirmDialog(null, "Desea seleccionar " + cafe.nombre) == JOptionPane.YES_OPTION) {
                    Productos.elaborarBebida();
                    Productos.ponerVaso();
                    JOptionPane.showMessageDialog(null, "Cambio: " + (Dinero.credito - Botones.cafe.precio));
                    Dinero.credito = 0;
                } //en caso de no confirmar volver a mostrar la lista de opciones
                else {
                    Display.opciones();
                }
            }
        }
        //opcion chocolate
        if (Display.opcion == 2) {
            //mostrar precio chocolate
            if (Dinero.credito == 0) {
                JOptionPane.showMessageDialog(null, "Precio: " + chocolate.precio);
                //mostrar dinero restante
            } else if (Dinero.credito < cafe.precio) {
                JOptionPane.showMessageDialog(null, "Dinero restante: " + (chocolate.precio - Dinero.credito));
                //mostrar confirmacion de eleccion
            } else {

                if (JOptionPane.showConfirmDialog(null, "Desea seleccionar " + chocolate.nombre) == JOptionPane.YES_OPTION) {
                    Productos.elaborarBebida();
                    Productos.ponerVaso();
                    if ((Dinero.credito - Botones.chocolate.precio) != 0) {
                        JOptionPane.showMessageDialog(null, "Cambio: " + (Dinero.credito - Botones.chocolate.precio));
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay cambio");
                    }

                    Dinero.credito = 0;
                    //en case de no confirmar volver a mostrar la pantalla de opciones
                } else {
                    Display.opciones();
                }

            }

        }
    }
}


