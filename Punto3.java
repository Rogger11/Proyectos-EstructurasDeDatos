package com.mycompany.repaso1;
import javax.swing.JOptionPane;
public class Punto3 {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el primer número."));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el segundo número."));
        int resultado = 0;
        int i = 0;
        while(i < n1){
            resultado = resultado + (n2);
            i++;
        }
        JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
    }
}


//Desarrollado por: Hamilton Andrés Echeverri Guzmán