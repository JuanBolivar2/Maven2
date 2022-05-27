
package com.mycompany.grafico;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Grafico extends JFrame
        
{
    
    private double radio = 0.0, saitama;
    
    
    public Grafico() {
        super("Dijujar circulo en java:");
        setSize(470,570);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    
    
    public void paint (Graphics g) {
        
        super.paint (g);
        Graphics2D circulo = (Graphics2D)g;
        circulo.setStroke(new BasicStroke(10.f));
        circulo.setPaint(Color.blue);
        radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del radio a dibujar:"));
        saitama=(radio*2);
        circulo.drawOval(30,150, (int)saitama,(int)saitama);
    }
        
        
        
        
                
        

    public static void main(String[] args) {
        
        Grafico grafico = new Grafico();
        
    }
}
