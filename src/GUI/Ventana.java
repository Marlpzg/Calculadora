package GUI;

import fabricas_abstracta.Operacion;
import fabricas_concretas.FactoryAritmetica;
import fabricas_concretas.FactoryConvertor;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import fabricas_concretas.FactoryFabricas;
import productos_abstractos.Aritmetica;
import productos_abstractos.Convertor;

public class Ventana extends JPanel{
    
    public int WIDTH = 300, widthTF = 120, widthB1 = 50, widthB2 = 60;
    public int HEIGHT = 300, heightTF = 30, heightB = 30;
    public JTextField num1, num2, res;
    public JButton suma, resta, mult, div, bin, dec, oct, hex;
    private Convertor conv;
    private Operacion fc, fa;
    private Aritmetica operar;
    
    public Ventana(){
           
        num1 = new JTextField();
        num1.setBounds(20, 40, widthTF, heightTF);
        
        num2 = new JTextField();
        num2.setBounds(160, 40, widthTF, heightTF);
        
        res = new JTextField();
        res.setBounds(90, 200, widthTF, heightTF);
        
        suma = new JButton("+");
        suma.setBounds(35, 90, widthB1, heightB);
        
        resta = new JButton("-");
        resta.setBounds(95, 90, widthB1, heightB);
        
        mult = new JButton("x");
        mult.setBounds(155, 90, widthB1, heightB);
        
        div = new JButton("÷");
        div.setBounds(215, 90, widthB1, heightB);
                
        bin = new JButton("BIN");
        bin.setBounds(15, 140, widthB2, heightB);
        
        dec = new JButton("DEC");
        dec.setBounds(85, 140, widthB2, heightB);
        
        oct = new JButton("OCT");
        oct.setBounds(155, 140, widthB2, heightB);
        
        hex = new JButton("HEX");
        hex.setBounds(225, 140, widthB2, heightB);
        
        num1.setEditable(true);
        num2.setEditable(true);
        res.setEditable(false);

        fc = FactoryFabricas.getFabrica("C");
        fa = FactoryFabricas.getFabrica("A");

        suma.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent arg0){

                operar = fa.getOperacionA("suma");
                res.setText(operar.Operar(String.valueOf(num1.getText()), String.valueOf(num2.getText())));

            }
        
        });
        
        resta.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent arg0){
                operar = fa.getOperacionA("resta");
                res.setText(operar.Operar(String.valueOf(num1.getText()), String.valueOf(num2.getText())));
            }
        
        });
        
        mult.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent arg0){
                operar = fa.getOperacionA("mult");
                res.setText(operar.Operar(String.valueOf(num1.getText()), String.valueOf(num2.getText())));
            }
        
        });
        
        div.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent arg0){
                operar = fa.getOperacionA("div");
                res.setText(operar.Operar(String.valueOf(num1.getText()), String.valueOf(num2.getText())));
            }
        
        });
        
        bin.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent arg0){

                conv = fc.getOperacionC("bin");
                res.setText(conv.convertir(num1.getText()));
            }
        
        });
        
        dec.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent arg0){
                conv = fc.getOperacionC("dec");
                res.setText(conv.convertir(num1.getText()));
            }
        
        });
        
        oct.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent arg0){
                res.setText("to oct");
                /*
                conv = fc.getOperacionC("oct");
                res.setText(conv.convertir(num1.getText()));
                */
            }
        
        });
        
        hex.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent arg0){
                res.setText("to hex");
            }
        
        });
        
        add(num1);
        add(num2);
        add(res);
        
        add(suma);
        add(resta);
        add(mult);
        add(div);
        
        add(bin);
        add(dec);
        add(oct);
        add(hex);
        setLayout(null);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
    }
    
}
