/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdecontrol;

import javax.swing.JOptionPane; //importar la clase JOptionPane

public class EstructurasDeControl {
    String nombre; //Esta servira para la informacion I/O

    public EstructurasDeControl() {//el contructor  llama a sus metodos
        pideNombre();
        muestraSaludo();

    }

    private void pideNombre() {
        nombre = JOptionPane.showInputDialog(null, "Escribe tu nombre: ");//dar mensaje para introducir un texto

    }

    private void muestraSaludo() {
        if (nombre == null) {
            JOptionPane.showMessageDialog(null, "oprimiste cancelar");
        } else {
            if (nombre.equals("")) {//este metodo ya no compara las cadenas con == sino con el metodo equals
                JOptionPane.showMessageDialog(null, "oprimiste areptar sin escribir tu nombre ");

            } else {
                JOptionPane.showMessageDialog(null, "hola " + nombre);

            }

        }

    }

    public static void main(String[] args) {
        new EstructurasDeControl();


    }

}
