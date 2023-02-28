/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesAutomatas;

import javax.swing.JLabel;
/**
 *
 * @author ricky
 */
public class MovimientoFlechas {
    public JLabel giro1;
    public JLabel giro2;
    public JLabel avanzar; 
    
    public MovimientoFlechas(JLabel g1, JLabel g2, JLabel av) {
        this.giro1 = g1;
        this.giro2 = g2;
        this.avanzar = av;
    }
    
    public void girarDerecha(int delay) {
        this.giro1.setEnabled(true);
        try {
            Thread.sleep(delay);
        } catch(InterruptedException e) {
            System.out.println(e);
        }
        this.giro1.setEnabled(false);
    }
    
    public void girarIzquierda(int delay) {
        this.giro2.setEnabled(true);
        try {
            Thread.sleep(delay);
        } catch(InterruptedException e) {
            System.out.println(e);
        }
        this.giro2.setEnabled(false);
    }
}
