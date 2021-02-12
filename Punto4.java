package com.mycompany.repaso1;
import javax.swing.JOptionPane;
public class Punto4 {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el primer número."));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el número potencia."));
        int con = n1;
        int resultado = 0;
        for (int i = 1; i<=n2; i++) {
            int r = 0;
            for(int j = 1; j <= con; j++){
                r = r + n1;
            }
            resultado = n1;
            n1 = r;
        }
        JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
    }
}

//Desarrollado por: Hamilton Andrés Echeverri Guzmán