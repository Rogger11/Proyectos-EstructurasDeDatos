package com.mycompany.repaso1;
import javax.swing.JOptionPane;
public class Punto4 {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el primer número."));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el número potencia."));
        int resultado = 0;
        int i = 0;
        boolean listo = false;
        while(i < n2){
            resultado = resultado + (n1 + n1);
            i++;
        }
        JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
    }
}