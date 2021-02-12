package com.mycompany.repaso1;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        boolean estado = false;
        while(!estado){
            int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor ingresa un número, de lo contrario escribe 00 para salir del menú."));
            switch(opcion){
                case 00:
                    estado = true;
                    break;
                default:
                    numeros.add(opcion);
                    break;
            }
        }
        JOptionPane.showMessageDialog(null, "El número máximo es: "+ Collections.max(numeros));
    }
}

//Desarrollado por: Hamilton Andrés Echeverri Guzmán