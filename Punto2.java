package com.mycompany.repaso1;
import javax.swing.JOptionPane;
public class Punto2 {
    public static void main(String[] args) {
        String Palabra = JOptionPane.showInputDialog(null, "Ingresa la palabra.");
        int i = 0;
        int d = Palabra.length()-1;
        boolean E = false;
        while((i<d) && (!E)){
            if (Palabra.toLowerCase().charAt(i)==Palabra.toLowerCase().charAt(d)){
                i++;
                d--;
            }else{
                E = true;
            }
        }
        if(!E){
            JOptionPane.showMessageDialog(null, Palabra + " es un palindromo.");
        }else{
            JOptionPane.showMessageDialog(null, Palabra + " no es un palindromo.");
        }
    }
}
