/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesAutomatas;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
/**
 *
 * @author ricky
 */
public class Automatas {
    int peso = 100;
    int pesoCargado = 0;
    public String posicionActual;
    public MovimientoAutomata ma;
    int pesoProductos[] = {70, 80, 10, 30, 20};
    
    public Automatas(MovimientoAutomata ma) {
        this.posicionActual = "Inicio";
        this.ma = ma;
    }
    
    public void tomarPedido(ArrayList<Integer> pedido) {
        for (int i = 0; i < pedido.size(); i++) {
            if (this.getPeso(pedido.get(i)) + this.pesoCargado > this.peso) {
                viajar(camino(this.posicionActual, "Inicio"));
                try {
                    Thread.sleep(2900);
                } catch(InterruptedException e) {
                    System.out.println(e);
                }
            } 
            
            viajar(camino(this.posicionActual, this.codProducto(pedido.get(i))));
            try {
                Thread.sleep(2900);
            } catch(InterruptedException e) {
                System.out.println(e);
            }
        }
        
        viajar(camino(this.posicionActual, "Inicio"));
    }
    
    public void viajar(ArrayList<Integer> camino) {
        Timer timer = new Timer("timer");
        int delay = 15000;
        int innerDelay = 150;
        
        for (int i = 0; i < camino.size(); i++) {
            switch(camino.get(i)) {
                case 0: 
                    timer.schedule(this.ma.derechaAbajo(innerDelay), delay);
                    break;
                case 1:
                    timer.schedule(this.ma.abajoIzquierda(innerDelay), delay);
                    break;
                    
                case 2:
                    timer.schedule(this.ma.izquierdaArriba(innerDelay), delay);
                    break;
                    
                case 3:
                    timer.schedule(this.ma.arribaDerecha(innerDelay), delay);
                    break;
                    
                case 4:
                    timer.schedule(this.ma.derechaArriba(innerDelay), delay);
                    break;
                    
                case 5:
                    timer.schedule(this.ma.arribaIzquierda(innerDelay), delay);
                    break;
                    
                case 6:
                    timer.schedule(this.ma.izquierdaAbajo(innerDelay), delay);
                    break;
                    
                case 7:
                    timer.schedule(this.ma.abajoDerecha(innerDelay), delay);
                    break;
                    
                case 8:
                    timer.schedule(this.ma.irArriba(1, innerDelay), delay);
                    break;
                    
                case 9:
                    timer.schedule(this.ma.irDerecha(1, innerDelay), delay);
                    break;
                    
                case 10:
                    timer.schedule(this.ma.irAbajo(1, innerDelay), delay);
                    break;
                    
                case 11:
                    timer.schedule(this.ma.irIzquierda(1, innerDelay), delay);
                    break;
                    
                default:
                    break;
            }
            
            try {
                Thread.sleep(innerDelay);
            } catch(InterruptedException e) {
                System.out.println(e);
            }
        }
    }
    
    public ArrayList<Integer> camino(String origen, String destino) {
        ArrayList camino = new ArrayList<Integer>();
        
        switch(origen) {
            case "Inicio":
                switch(destino){
                    case "Lavadora":
                        camino.add(9); //irDerecha
                        camino.add(9); //irDerecha
                        camino.add(9); //irDerecha
                        camino.add(0); //derechaAbajo
                        camino.add(10); //irAbajo
                        camino.add(10); //irAbajo
                        camino.add(1); //abajoIzquierda
                        this.posicionActual = "Lavadora";
                        this.pesoCargado = this.pesoCargado + this.pesoProductos[0];
                        break;
                        
                    case "Nevera":
                        camino.add(9);
                        camino.add(9);
                        camino.add(9);
                        camino.add(0);
                        camino.add(10);
                        camino.add(10);
                        camino.add(10);
                        camino.add(10);
                        camino.add(7);
                        this.posicionActual = "Nevera";
                        this.pesoCargado = this.pesoCargado + this.pesoProductos[1];
                        break;
                        
                    case "Microondas":
                        camino.add(0);
                        camino.add(10);
                        camino.add(10);
                        camino.add(10);
                        camino.add(10);
                        camino.add(10);
                        camino.add(10);
                        camino.add(10);
                        camino.add(10);
                        camino.add(10);
                        camino.add(7);
                        this.posicionActual = "Microondas";
                        this.pesoCargado = this.pesoCargado + this.pesoProductos[2];
                        break;
                        
                    case "Televisor":
                        camino.add(9);
                        camino.add(9);
                        camino.add(9);
                        camino.add(9);
                        camino.add(9);
                        camino.add(9);
                        camino.add(0);
                        camino.add(10);
                        camino.add(7);
                        this.posicionActual = "Televisor";
                        this.pesoCargado = this.pesoCargado + this.pesoProductos[3];
                        break;
                        
                    case "Computador":
                        camino.add(9);
                        camino.add(9);
                        camino.add(9);
                        camino.add(9);
                        camino.add(9);
                        camino.add(9);
                        camino.add(0);
                        camino.add(10);
                        camino.add(10);
                        camino.add(10);
                        camino.add(10);
                        camino.add(10);
                        camino.add(10);
                        camino.add(7);
                        this.posicionActual = "Computador";
                        this.pesoCargado = this.pesoCargado + this.pesoProductos[4];
                        break;
                        
                    default:
                        break;
                }
                break;
            
            case "Lavadora":
                switch(destino){
                    case "Inicio":
                        camino.add(2);
                        camino.add(8);
                        camino.add(8);
                        camino.add(5);
                        camino.add(11);
                        camino.add(11);
                        camino.add(11);
                        camino.add(2);
                        camino.add(3);
                        this.posicionActual = "Inicio";
                        this.resetPeso();
                        break;
                        
                    case "Nevera":
                        camino.add(6);
                        camino.add(10);
                        camino.add(10);
                        camino.add(7);
                        this.posicionActual = "Nevera";
                        this.pesoCargado = this.pesoCargado + this.pesoProductos[1];
                        break;
                        
                    case "Microondas":
                        camino.add(2);
                        camino.add(8);
                        camino.add(8);
                        camino.add(5);
                        camino.add(11);
                        camino.add(11);
                        camino.add(11);
                        camino.add(6);
                        camino.add(10);
                        camino.add(10);
                        camino.add(10);
                        camino.add(10);
                        camino.add(10);
                        camino.add(10);
                        camino.add(10);
                        camino.add(10);
                        camino.add(10);
                        camino.add(7);
                        this.posicionActual = "Microondas";
                        this.pesoCargado = this.pesoCargado + this.pesoProductos[2];
                        break;
                        
                    case "Televisor":
                        camino.add(2);
                        camino.add(8);
                        camino.add(8);
                        camino.add(3);
                        camino.add(9);
                        camino.add(9);
                        camino.add(9);
                        camino.add(0);
                        camino.add(10);
                        camino.add(7);
                        this.posicionActual = "Televisor";
                        this.pesoCargado = this.pesoCargado + this.pesoProductos[3];
                        break;
                        
                    case "Computador":
                        camino.add(2);
                        camino.add(8);
                        camino.add(8);
                        camino.add(3);
                        camino.add(9);
                        camino.add(9);
                        camino.add(9);
                        camino.add(0);
                        camino.add(10);
                        camino.add(10);
                        camino.add(10);
                        camino.add(10);
                        camino.add(10);
                        camino.add(10);
                        camino.add(7);
                        this.posicionActual = "Computador";
                        this.pesoCargado = this.pesoCargado + this.pesoProductos[4];
                        break;
                }
                break;
                
            case "Nevera":
                switch(destino){
                    case "Inicio":
                        camino.add(4);
                        camino.add(8);
                        camino.add(8);
                        camino.add(8);
                        camino.add(8);
                        camino.add(5);
                        camino.add(11);
                        camino.add(11);
                        camino.add(11);
                        camino.add(2);
                        camino.add(3);
                        this.posicionActual = "Inicio";
                        this.resetPeso();
                        break;
                        
                    case "Lavadora":
                        camino.add(4);
                        camino.add(8);
                        camino.add(8);
                        camino.add(5);
                        this.posicionActual = "Lavadora";
                        this.pesoCargado = this.pesoCargado + this.pesoProductos[0];
                        break;
                        
                    case "Microondas":
                        camino.add(4);
                        camino.add(8);
                        camino.add(8);
                        camino.add(8);
                        camino.add(8);
                        camino.add(5);
                        camino.add(11);
                        camino.add(11);
                        camino.add(11);
                        camino.add(6);
                        camino.add(10);
                        camino.add(10);
                        camino.add(10);
                        camino.add(10);
                        camino.add(10);
                        camino.add(10);
                        camino.add(10);
                        camino.add(10);
                        camino.add(10);
                        camino.add(7);
                        this.posicionActual = "Microondas";
                        this.pesoCargado = this.pesoCargado + this.pesoProductos[2];
                        break;
                        
                    case "Televisor":
                        camino.add(4);
                        camino.add(8);
                        camino.add(8);
                        camino.add(8);
                        camino.add(8);
                        camino.add(3);
                        camino.add(9);
                        camino.add(9);
                        camino.add(9);
                        camino.add(0);
                        camino.add(10);
                        camino.add(7);
                        this.posicionActual = "Televisor";
                        this.pesoCargado = this.pesoCargado + this.pesoProductos[3];
                        break;
                        
                    case "Computador":
                        camino.add(4);
                        camino.add(8);
                        camino.add(8);
                        camino.add(8);
                        camino.add(8);
                        camino.add(3);
                        camino.add(9);
                        camino.add(9);
                        camino.add(9);
                        camino.add(0);
                        camino.add(10);
                        camino.add(10);
                        camino.add(10);
                        camino.add(10);
                        camino.add(10);
                        camino.add(10);
                        camino.add(7);
                        this.posicionActual = "Computador";
                        this.pesoCargado = this.pesoCargado + this.pesoProductos[4];
                        break;
                }
                break;
                
            case "Microondas":
                switch(destino){
                    case "Inicio":
                        camino.add(4);
                        camino.add(8);
                        camino.add(8);
                        camino.add(8);
                        camino.add(8);
                        camino.add(8);
                        camino.add(8);
                        camino.add(8);
                        camino.add(8);
                        camino.add(8);
                        camino.add(3);
                        this.posicionActual = "Inicio";
                        this.resetPeso();
                        break;
                        
                    case "Lavadora":
                        camino.add(4);
                        camino.add(8);
                        camino.add(8);
                        camino.add(8);
                        camino.add(8);
                        camino.add(8);
                        camino.add(8);
                        camino.add(8);
                        camino.add(8);
                        camino.add(8);
                        camino.add(3);
                        camino.add(9);
                        camino.add(9);
                        camino.add(9);
                        camino.add(0);
                        camino.add(10);
                        camino.add(10);
                        camino.add(1);
                        this.posicionActual = "Lavadora";
                        this.pesoCargado = this.pesoCargado + this.pesoProductos[0];
                        break;
                        
                    case "Nevera":
                        camino.add(4);
                        camino.add(8);
                        camino.add(8);
                        camino.add(8);
                        camino.add(8);
                        camino.add(8);
                        camino.add(8);
                        camino.add(8);
                        camino.add(8);
                        camino.add(8);
                        camino.add(3);
                        camino.add(9);
                        camino.add(9);
                        camino.add(9);
                        camino.add(0);
                        camino.add(10);
                        camino.add(10);
                        camino.add(10);
                        camino.add(10);
                        camino.add(7);
                        this.posicionActual = "Nevera";
                        this.pesoCargado = this.pesoCargado + this.pesoProductos[1];
                        break;
                        
                    case "Televisor":
                        camino.add(4);
                        camino.add(8);
                        camino.add(8);
                        camino.add(8);
                        camino.add(8);
                        camino.add(8);
                        camino.add(8);
                        camino.add(8);
                        camino.add(8);
                        camino.add(8);
                        camino.add(3);
                        camino.add(9);
                        camino.add(9);
                        camino.add(9);
                        camino.add(9);
                        camino.add(9);
                        camino.add(9);
                        camino.add(0);
                        camino.add(10);
                        camino.add(7);
                        this.posicionActual = "Televisor";
                        this.pesoCargado = this.pesoCargado + this.pesoProductos[3];
                        break;
                        
                    case "Computador":
                        camino.add(4);
                        camino.add(8);
                        camino.add(8);
                        camino.add(8);
                        camino.add(8);
                        camino.add(8);
                        camino.add(8);
                        camino.add(8);
                        camino.add(8);
                        camino.add(8);
                        camino.add(3);
                        camino.add(9);
                        camino.add(9);
                        camino.add(9);
                        camino.add(9);
                        camino.add(9);
                        camino.add(9);
                        camino.add(0);
                        camino.add(10);
                        camino.add(10);
                        camino.add(10);
                        camino.add(10);
                        camino.add(10);
                        camino.add(10);
                        camino.add(7);
                        this.posicionActual = "Computador";
                        this.pesoCargado = this.pesoCargado + this.pesoProductos[4];
                        break;
                }
                break;
                
            case "Televisor":
                switch(destino){
                    case "Inicio":
                        camino.add(4);
                        camino.add(8);
                        camino.add(5);
                        camino.add(11);
                        camino.add(11);
                        camino.add(11);
                        camino.add(11);
                        camino.add(11);
                        camino.add(11);
                        camino.add(2);
                        camino.add(3);
                        this.posicionActual = "Inicio";
                        this.resetPeso();
                        break;
                        
                    case "Lavadora":
                        camino.add(4);
                        camino.add(8);
                        camino.add(5);
                        camino.add(11);
                        camino.add(11);
                        camino.add(11);
                        camino.add(6);
                        camino.add(10);
                        camino.add(10);
                        camino.add(1);
                        this.posicionActual = "Lavadora";
                        this.pesoCargado = this.pesoCargado + this.pesoProductos[0];
                        break;
                        
                    case "Nevera":
                        camino.add(4);
                        camino.add(8);
                        camino.add(5);
                        camino.add(11);
                        camino.add(11);
                        camino.add(11);
                        camino.add(6);
                        camino.add(10);
                        camino.add(10);
                        camino.add(10);
                        camino.add(10);
                        camino.add(7);
                        this.posicionActual = "Nevera";
                        this.pesoCargado = this.pesoCargado + this.pesoProductos[1];
                        break;
                        
                    case "Microondas":
                        camino.add(4);
                        camino.add(8);
                        camino.add(5);
                        camino.add(11);
                        camino.add(11);
                        camino.add(11);
                        camino.add(11);
                        camino.add(11);
                        camino.add(11);
                        camino.add(6);
                        camino.add(10);
                        camino.add(10);
                        camino.add(10);
                        camino.add(10);
                        camino.add(10);
                        camino.add(10);
                        camino.add(10);
                        camino.add(10);
                        camino.add(10);
                        camino.add(7);
                        this.posicionActual = "Microondas";
                        this.pesoCargado = this.pesoCargado + this.pesoProductos[2];
                        break;
                        
                    case "Computador":
                        camino.add(0);
                        camino.add(10);
                        camino.add(10);
                        camino.add(10);
                        camino.add(10);
                        camino.add(10);
                        camino.add(7);
                        this.posicionActual = "Computador";
                        this.pesoCargado = this.pesoCargado + this.pesoProductos[4];
                        break;
                }
                break;
                
            case "Computador":
                switch(destino){
                    case "Inicio":
                        camino.add(4);
                        camino.add(8);
                        camino.add(8);
                        camino.add(8);
                        camino.add(8);
                        camino.add(8);
                        camino.add(8);
                        camino.add(5);
                        camino.add(11);
                        camino.add(11);
                        camino.add(11);
                        camino.add(11);
                        camino.add(11);
                        camino.add(11);
                        camino.add(2);
                        camino.add(3);
                        this.posicionActual = "Inicio";
                        this.resetPeso();
                        break;
                        
                    case "Lavadora":
                        camino.add(4);
                        camino.add(8);
                        camino.add(8);
                        camino.add(8);
                        camino.add(8);
                        camino.add(8);
                        camino.add(8);
                        camino.add(5);
                        camino.add(11);
                        camino.add(11);
                        camino.add(11);
                        camino.add(6);
                        camino.add(10);
                        camino.add(10);
                        camino.add(1);
                        this.posicionActual = "Lavadora";
                        this.pesoCargado = this.pesoCargado + this.pesoProductos[0];
                        break;
                        
                    case "Nevera":
                        camino.add(4);
                        camino.add(8);
                        camino.add(8);
                        camino.add(8);
                        camino.add(8);
                        camino.add(8);
                        camino.add(8);
                        camino.add(5);
                        camino.add(11);
                        camino.add(11);
                        camino.add(11);
                        camino.add(6);
                        camino.add(10);
                        camino.add(10);
                        camino.add(10);
                        camino.add(10);
                        camino.add(7);
                        this.posicionActual = "Nevera";
                        this.pesoCargado = this.pesoCargado + this.pesoProductos[1];
                        break;
                        
                    case "Microondas":
                        camino.add(4);
                        camino.add(8);
                        camino.add(8);
                        camino.add(8);
                        camino.add(8);
                        camino.add(8);
                        camino.add(8);
                        camino.add(5);
                        camino.add(11);
                        camino.add(11);
                        camino.add(11);
                        camino.add(11);
                        camino.add(11);
                        camino.add(11);
                        camino.add(6);
                        camino.add(10);
                        camino.add(10);
                        camino.add(10);
                        camino.add(10);
                        camino.add(10);
                        camino.add(10);
                        camino.add(10);
                        camino.add(10);
                        camino.add(10);
                        camino.add(7);
                        this.posicionActual = "Microondas";
                        this.pesoCargado = this.pesoCargado + this.pesoProductos[2];
                        break;
                        
                    case "Televisor":
                        camino.add(4);
                        camino.add(8);
                        camino.add(8);
                        camino.add(8);
                        camino.add(8);
                        camino.add(8);
                        camino.add(3);
                        this.posicionActual = "Televisor";
                        this.pesoCargado = this.pesoCargado + this.pesoProductos[3];
                        break;
                }
                break;
        }
        
        return camino;
    }
    
    public void resetPeso() {
        this.pesoCargado = 0;
    }
    
    public int getPeso(int producto) {
        return this.pesoProductos[producto];
    }
    
    public void checkPeso() {
        
    }
    
    public String codProducto(int cod) {
        String producto = "";
        
        switch(cod) {
            case 0:
                producto = "Lavadora";
                break;
            case 1:
                producto = "Nevera";
                break;
            case 2:
                producto = "Microondas";
                break;
            case 3:
                producto = "Televisor";
                break;
            case 4:
                producto = "Computador";
                break;
        }
        
        return producto;
    }
}
