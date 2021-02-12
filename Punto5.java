package com.mycompany.repaso1;
import javax.swing.JOptionPane;
import java.util.ArrayList;
public class Punto5 {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<String>();
        int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el número a calcular el factorial."));
        int Fact = 1;
        String listaham = "1";
        for (int i = 2; i <= numero; i++){
            Fact = Fact * i;
        }
        for(int i = 1; i <= numero; i++){
            lista.add("" + i);
        }
        for(int i = 1; i < numero; i++){
            listaham += " x " + lista.get(i);
        } 
        JOptionPane.showMessageDialog(null, "El factorial de "+ numero +" = "+ numero +"! = "+ listaham +" = "+ Fact);
    }
}


//Desarrollado por: Hamilton Andrés Echeverri Guzmán