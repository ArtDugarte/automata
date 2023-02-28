package ClasesAutomatas;

import java.util.TimerTask;
import javax.swing.*;
/**
 *
 * @author ricky
 */
public class MovimientoAutomata {
    public JLabel flecha;
    public JLabel automata;
    public JLabel girar1;
    public JLabel girar2;
    public JLabel avanzar;
    
    public MovimientoAutomata(JLabel a, JLabel f, JLabel g1, JLabel g2, JLabel av) {
        this.flecha = f;
        this.automata = a;
        this.girar1 = g1;
        this.girar2 = g2;
        this.avanzar = av;
    }
    /* Orientacion */
    public TimerTask derechaAbajo(int delay) {
        TimerTask derechaAbajo = new TimerTask() {
            public void run() {
                flecha.setLocation(flecha.getX()-30, flecha.getY()+20);
                girar1.setEnabled(true);
                try {
                    Thread.sleep(delay);
                } catch(InterruptedException e) {
                    System.out.println(e);
                }
                girar1.setEnabled(false);
                try {
                    Thread.sleep(delay);
                } catch(InterruptedException e) {
                    System.out.println(e);
                }
            }
        };
        
        return derechaAbajo;
    }
    
    public TimerTask abajoIzquierda(int delay) {
        TimerTask abajoIzquierda = new TimerTask() {
            public void run() {
                flecha.setLocation(flecha.getX()-20, flecha.getY()-20);
                girar1.setEnabled(true);
                try {
                    Thread.sleep(delay);
                } catch(InterruptedException e) {
                    System.out.println(e);
                }
                girar1.setEnabled(false);
                try {
                    Thread.sleep(delay);
                } catch(InterruptedException e) {
                    System.out.println(e);
                }
            }
        };

        return abajoIzquierda;
    }
        
    public TimerTask izquierdaArriba(int delay) {
        TimerTask izquierdaArriba = new TimerTask() {
            public void run() {
                flecha.setLocation(flecha.getX()+20, flecha.getY()-20);
                girar1.setEnabled(true);
                try {
                    Thread.sleep(delay);
                } catch(InterruptedException e) {
                    System.out.println(e);
                }
                girar1.setEnabled(false);
                try {
                    Thread.sleep(delay);
                } catch(InterruptedException e) {
                    System.out.println(e);
                }
            }
        };
    return izquierdaArriba;
    }
        
    public TimerTask arribaDerecha(int delay) {
        TimerTask arribaDerecha = new TimerTask() {
            public void run() {
                flecha.setLocation(flecha.getX()+30, flecha.getY()+20);
                girar1.setEnabled(true);
                try {
                    Thread.sleep(delay);
                } catch(InterruptedException e) {
                    System.out.println(e);
                }
                girar1.setEnabled(false);
                try {
                    Thread.sleep(delay);
                } catch(InterruptedException e) {
                    System.out.println(e);
                }
            }
        };

        return arribaDerecha;
    }
    
    public TimerTask derechaArriba(int delay) {
        TimerTask derechaArriba = new TimerTask() {
            public void run() {
                flecha.setLocation(flecha.getX()-30, flecha.getY()-20);
                girar2.setEnabled(true);
                try {
                    Thread.sleep(delay);
                } catch(InterruptedException e) {
                    System.out.println(e);
                }
                girar2.setEnabled(false);
                try {
                    Thread.sleep(delay);
                } catch(InterruptedException e) {
                    System.out.println(e);
                }
                
            }
        };

        return derechaArriba;
    }
    
    public TimerTask arribaIzquierda(int delay) {
        TimerTask arribaIzquierda = new TimerTask() {
            public void run() {
                flecha.setLocation(flecha.getX()-20, flecha.getY()+20);
                girar2.setEnabled(true);
                try {
                    Thread.sleep(delay);
                } catch(InterruptedException e) {
                    System.out.println(e);
                }
                girar2.setEnabled(false);
                try {
                    Thread.sleep(delay);
                } catch(InterruptedException e) {
                    System.out.println(e);
                }
            }
        };

        return arribaIzquierda;
    }
    
    public TimerTask izquierdaAbajo(int delay) {
        TimerTask izquierdaAbajo = new TimerTask() {
            public void run() {
                flecha.setLocation(flecha.getX()+20, flecha.getY()+20);
                girar2.setEnabled(true);
                try {
                    Thread.sleep(delay);
                } catch(InterruptedException e) {
                    System.out.println(e);
                }
                girar2.setEnabled(false);
                try {
                    Thread.sleep(delay);
                } catch(InterruptedException e) {
                    System.out.println(e);
                }
            }
        };

        return izquierdaAbajo;
    }
    
    public TimerTask abajoDerecha(int delay) {
        TimerTask abajoDerecha = new TimerTask() {
            public void run() {
                flecha.setLocation(flecha.getX()+30, flecha.getY()-20);
                girar2.setEnabled(true);
                try {
                    Thread.sleep(delay);
                } catch(InterruptedException e) {
                    System.out.println(e);
                }
                girar2.setEnabled(false);
                try {
                    Thread.sleep(delay);
                } catch(InterruptedException e) {
                    System.out.println(e);
                }
            }
        };

        return abajoDerecha;
    }
    /* Orientacion Fin */
    
        
    public TimerTask irIzquierda(int pasos, int delay) {
        TimerTask irIzquierda = new TimerTask() {
            public void run() {
                for(int i=0; i<pasos; i++){
                    automata.setLocation(automata.getX()-45, automata.getY());
                    flecha.setLocation(flecha.getX()-45, flecha.getY());
                    avanzar.setEnabled(true);
                    try {
                        Thread.sleep(delay);
                    } catch(InterruptedException e) {
                        System.out.println(e);
                    }
                    avanzar.setEnabled(false);
                    try {
                        Thread.sleep(delay);
                    } catch (InterruptedException e) {
                        System.out.println(e);
                    }   
                }

            }
        };
        return irIzquierda;
    }
        
    public TimerTask irDerecha(int pasos, int delay) {
        TimerTask irDerecha = new TimerTask() {
            public void run() {
                for(int i=0; i<pasos; i++){
                    automata.setLocation(automata.getX()+45, automata.getY());
                    flecha.setLocation(flecha.getX()+45, flecha.getY());
                    avanzar.setEnabled(true);
                    try {
                        Thread.sleep(delay);
                    } catch(InterruptedException e) {
                        System.out.println(e);
                    }
                    avanzar.setEnabled(false);
                    try {
                        Thread.sleep(delay);
                    } catch (InterruptedException e) {
                        System.out.println(e);
                    }   
                }

            }
        };
        return irDerecha;
    }

    public TimerTask irArriba(int pasos, int delay) {
        TimerTask irArriba = new TimerTask() {
            public void run() {
                for(int i=0; i<pasos; i++){
                    automata.setLocation(automata.getX(), automata.getY()-39);
                    flecha.setLocation(flecha.getX(), flecha.getY()-39);
                    avanzar.setEnabled(true);
                    try {
                        Thread.sleep(delay);
                    } catch(InterruptedException e) {
                        System.out.println(e);
                    }
                    avanzar.setEnabled(false);
                    try {
                        Thread.sleep(delay);
                    } catch (InterruptedException e) {
                        System.out.println(e);
                    }   
                }

            }
        };

        return irArriba;
    }

    public TimerTask irAbajo(int pasos, int delay) {
        TimerTask irAbajo = new TimerTask() {
            public void run() {
                for(int i=0; i<pasos; i++){
                    automata.setLocation(automata.getX(), automata.getY()+39);
                    flecha.setLocation(flecha.getX(), flecha.getY()+39);
                    avanzar.setEnabled(true);
                    try {
                        Thread.sleep(delay);
                    } catch(InterruptedException e) {
                        System.out.println(e);
                    }
                    avanzar.setEnabled(false);
                    try {
                        Thread.sleep(delay);
                    } catch (InterruptedException e) {
                        System.out.println(e);
                    }   
                }

            }
        };

        return irAbajo;
    }
}
