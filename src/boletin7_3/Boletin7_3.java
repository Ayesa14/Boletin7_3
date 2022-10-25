package boletin7_3;

import javax.swing.JOptionPane;

public class Boletin7_3 {

    public static void main(String[] args) {
       PositivoNegativoCero obj = new PositivoNegativoCero();
       
       int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número "));
     
       
       obj.esPositivo(n);
    }
}
    

