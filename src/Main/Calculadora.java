package Main;

import GUI.Ventana;
import javax.swing.JFrame;

public class Calculadora {
    
    public static void main(String[] args){
    
        JFrame ventana = new JFrame("Calculadora Chida");
        ventana.setContentPane(new Ventana());
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(false);
        ventana.pack();
        ventana.setVisible(true);
    
    }
    
}
