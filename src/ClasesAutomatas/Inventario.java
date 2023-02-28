/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesAutomatas;

import java.util.ArrayList;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
/**
 *
 * @author ricky
 */
public class Inventario {
    public ArrayList<Integer> productos;
    public JCheckBox lavadora;
    public JCheckBox nevera;
    public JCheckBox microondas;
    public JCheckBox televisor;
    public JCheckBox computador;
    public Automatas at;
    
    
    
    public Inventario (JCheckBox lavadora, 
            JCheckBox nevera, 
            JCheckBox microondas, 
            JCheckBox televisor,
            JCheckBox computador,
            MovimientoAutomata ma) {
        this.productos = new ArrayList<Integer>();
            productos.add(3); // Lavadora
            productos.add(6); // Nevera
            productos.add(1); // Microondas
            productos.add(10); // Televisor
            productos.add(2); // Computador
        
        this.lavadora = lavadora;
        this.nevera = nevera;
        this.microondas = microondas;
        this.televisor = televisor;
        this.computador = computador;

        this.at = new Automatas(ma);
    }
    
    public void refrescarInventario() {
        this.lavadora.setText("Lavadora " + "(" + this.productos.get(0) + ")");
        this.nevera.setText("Nevera " + "(" + this.productos.get(1) + ")");
        this.microondas.setText("Microondas " + "(" + this.productos.get(2) + ")");
        this.televisor.setText("televisor " + "(" + this.productos.get(3) + ")");
        this.computador.setText("Computador " + "(" + this.productos.get(4) + ")");
    }
    
    public boolean checkPedido(ArrayList<Integer> listaPedido) {
        for (int i = 0; i<listaPedido.size(); i++) {
            int pedido = listaPedido.get(i);
            
            if (this.productos.get(pedido) < 1) {
                return false;
            }
        }
        
        return true;
    }
    
    public void realizarPedido(ArrayList<Integer> listaPedido) {
        if (!this.checkPedido(listaPedido)) {
            JOptionPane.showMessageDialog(null, "No hay suficiente existencia en algunos productos seleccionados");
        } else {
            this.descontarProducto(listaPedido);
            this.refrescarInventario();
            this.at.tomarPedido(listaPedido);
        }
    }
    
    public void descontarProducto(ArrayList<Integer> listaPedido) {
        for (int i = 0; i<listaPedido.size(); i++) {
                int producto = listaPedido.get(i);
                this.productos.set(producto, this.productos.get(producto)-1);
        }
    }
    
    public void agregarProducto(int cantidad, String nombre) {
        switch (nombre){
            case "Lavadora":
                this.productos.set(0, this.productos.get(0)+cantidad);
                break;
            
            case "Nevera":
                this.productos.set(1, this.productos.get(1)+cantidad);
                break;
            
            case "Microondas":
                this.productos.set(2, this.productos.get(2)+cantidad);
                break;
                
            case "Televisor":
                this.productos.set(3, this.productos.get(3)+cantidad);
                break;
                
            case "Computador":
                this.productos.set(4, this.productos.get(4)+cantidad);
                break;
        }
        
        this.refrescarInventario();
        JOptionPane.showMessageDialog(null, "Se ha agregado " + cantidad + " " + nombre);
    }
}
