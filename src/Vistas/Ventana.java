package Vistas;
import ClasesAutomatas.*;

import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.Graphics;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.util.Timer;
import java.util.TimerTask;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Ventana extends javax.swing.JFrame {
    public MovimientoAutomata ma;
    public Inventario in;
    

    public Ventana() {
        initComponents();
        setLocationRelativeTo(null);
        pedido.setEnabled(false);
        abastecer.setEnabled(true);
        Pedido.setVisible(true);
        Inventario.setVisible(false);
        setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon("src/Imagenes/cursor.png").getImage(), new Point(0, 0), "custom cursor"));
        galpon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Automata2.png"))); 
        this.ma = new MovimientoAutomata(this.robot, this.flecha_a, this.giro1_color, this.giro2_color, this.avanzar_color);
        this.in = new Inventario(this.lavadora_check, this.nevera_check, this.microondas_check, this.televisor_check, this.computador_check, this.ma);
        this.in.refrescarInventario();
        
        // Cargar existencia a los checkboxs
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pedido = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        base_fondo_flechas = new javax.swing.JPanel();
        giro1_color = new javax.swing.JLabel();
        avanzar_color = new javax.swing.JLabel();
        giro2_color = new javax.swing.JLabel();
        giro1 = new javax.swing.JLabel();
        avanzar = new javax.swing.JLabel();
        giro2 = new javax.swing.JLabel();
        fondo_flechas = new javax.swing.JLabel();
        buscar_pedido = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        lavadora_check = new javax.swing.JCheckBox();
        nevera_check = new javax.swing.JCheckBox();
        microondas_check = new javax.swing.JCheckBox();
        televisor_check = new javax.swing.JCheckBox();
        computador_check = new javax.swing.JCheckBox();
        titulo1 = new javax.swing.JLabel();
        Inventario = new javax.swing.JPanel();
        titulo2 = new javax.swing.JLabel();
        colocar_mercancia = new javax.swing.JButton();
        tipo_mercancia = new javax.swing.JComboBox<>();
        tipo_mercan = new javax.swing.JLabel();
        titulo_columnas = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        Botones = new javax.swing.JPanel();
        pedido = new javax.swing.JButton();
        abastecer = new javax.swing.JButton();
        cerrar = new javax.swing.JButton();
        fondo_botones = new javax.swing.JLabel();
        Automata = new javax.swing.JPanel();
        robot = new javax.swing.JLabel();
        flecha_a = new javax.swing.JLabel();
        caja_lavadora = new javax.swing.JLabel();
        caja_nevera = new javax.swing.JLabel();
        caja_microondas = new javax.swing.JLabel();
        caja_televisor = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        galpon = new javax.swing.JLabel();
        Leyenda = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        lavadora = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nevera = new javax.swing.JLabel();
        micro = new javax.swing.JLabel();
        tv = new javax.swing.JLabel();
        pc = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fondo_leyenda = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Pedido.setBackground(new java.awt.Color(144, 118, 74));
        Pedido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        Pedido.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setBackground(new java.awt.Color(255, 255, 255));
        titulo.setFont(new java.awt.Font("Cooper Black", 1, 28)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("Seleccione la Mercancía");
        Pedido.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, 30));

        base_fondo_flechas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        giro1_color.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flechas/giro1_color.png"))); // NOI18N
        giro1_color.setEnabled(false);
        base_fondo_flechas.add(giro1_color, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 60, 80));

        avanzar_color.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flechas/avanzar_color.png"))); // NOI18N
        avanzar_color.setEnabled(false);
        base_fondo_flechas.add(avanzar_color, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 60, 80));

        giro2_color.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flechas/giro2_color.png"))); // NOI18N
        giro2_color.setEnabled(false);
        base_fondo_flechas.add(giro2_color, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, -1));

        giro1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flechas/giro1_gris.png"))); // NOI18N
        base_fondo_flechas.add(giro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        avanzar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flechas/avanzar_gris.png"))); // NOI18N
        base_fondo_flechas.add(avanzar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, -1));

        giro2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flechas/giro2_gris.png"))); // NOI18N
        base_fondo_flechas.add(giro2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, -1));

        fondo_flechas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo_flechas.jpg"))); // NOI18N
        fondo_flechas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        base_fondo_flechas.add(fondo_flechas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 120));

        Pedido.add(base_fondo_flechas, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 470, 270, 120));

        buscar_pedido.setBackground(new java.awt.Color(0, 0, 0));
        buscar_pedido.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        buscar_pedido.setForeground(new java.awt.Color(255, 255, 255));
        buscar_pedido.setText("Buscar pedido");
        buscar_pedido.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(
            new ImageIcon("src/Imagenes/mano.png").getImage(),
            new Point(0, 0), "mano_cursor"));
    buscar_pedido.setFocusPainted(false);
    buscar_pedido.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            buscar_pedidoActionPerformed(evt);
        }
    });
    Pedido.add(buscar_pedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, -1, -1));

    jScrollPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
    jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
    jScrollPane2.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(
        new ImageIcon("src/Imagenes/mano.png").getImage(),
        new Point(0, 0), "mano_cursor"));

jPanel1.setBackground(new java.awt.Color(204, 204, 204));
jPanel1.setLayout(new java.awt.GridLayout(5, 1));

lavadora_check.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
lavadora_check.setText("Lavadora");
lavadora_check.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        lavadora_checkActionPerformed(evt);
    }
    });
    jPanel1.add(lavadora_check);

    nevera_check.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
    nevera_check.setText("Nevera");
    nevera_check.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            nevera_checkActionPerformed(evt);
        }
    });
    jPanel1.add(nevera_check);

    microondas_check.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
    microondas_check.setText("Microondas");
    jPanel1.add(microondas_check);

    televisor_check.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
    televisor_check.setText("Televisor");
    jPanel1.add(televisor_check);

    computador_check.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
    computador_check.setText("Computador");
    computador_check.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            computador_checkActionPerformed(evt);
        }
    });
    jPanel1.add(computador_check);

    jScrollPane2.setViewportView(jPanel1);

    Pedido.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 210, 120));

    titulo1.setBackground(new java.awt.Color(255, 255, 255));
    titulo1.setFont(new java.awt.Font("Cooper Black", 1, 28)); // NOI18N
    titulo1.setForeground(new java.awt.Color(255, 255, 255));
    titulo1.setText("a Buscar");
    Pedido.add(titulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, -1, -1));

    getContentPane().add(Pedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 600));

    Inventario.setBackground(new java.awt.Color(144, 118, 74));
    Inventario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
    Inventario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    titulo2.setBackground(new java.awt.Color(255, 255, 255));
    titulo2.setFont(new java.awt.Font("Cooper Black", 1, 28)); // NOI18N
    titulo2.setForeground(new java.awt.Color(255, 255, 255));
    titulo2.setText("Inventario");
    Inventario.add(titulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, 30));

    colocar_mercancia.setBackground(new java.awt.Color(0, 0, 0));
    colocar_mercancia.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
    colocar_mercancia.setForeground(new java.awt.Color(255, 255, 255));
    colocar_mercancia.setText("Colocar Mercancia");
    colocar_mercancia.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(
        new ImageIcon("src/Imagenes/mano.png").getImage(),
        new Point(0, 0), "mano_cursor"));
colocar_mercancia.setFocusPainted(false);
colocar_mercancia.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        colocar_mercanciaActionPerformed(evt);
    }
    });
    Inventario.add(colocar_mercancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, -1, -1));

    tipo_mercancia.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
    tipo_mercancia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lavadora", "Nevera", "Microondas", "Televisor", "Computador" }));
    tipo_mercancia.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(
        new ImageIcon("src/Imagenes/mano.png").getImage(),
        new Point(0, 0), "mano_cursor"));
Inventario.add(tipo_mercancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 180, -1));

tipo_mercan.setBackground(new java.awt.Color(255, 255, 255));
tipo_mercan.setFont(new java.awt.Font("Cooper Black", 1, 24)); // NOI18N
tipo_mercan.setText("Tipo de Mercancia");
Inventario.add(tipo_mercan, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, 30));

titulo_columnas.setBackground(new java.awt.Color(255, 255, 255));
titulo_columnas.setFont(new java.awt.Font("Cooper Black", 1, 24)); // NOI18N
titulo_columnas.setText("Cantidad de Mercancia");
Inventario.add(titulo_columnas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, 30));

jSpinner1.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
jSpinner1.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
jSpinner1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
Inventario.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, 180, -1));

getContentPane().add(Inventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 600));

Botones.setBackground(new java.awt.Color(255, 255, 255));
Botones.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
Botones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

pedido.setBackground(new java.awt.Color(0, 0, 0));
pedido.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
pedido.setForeground(new java.awt.Color(255, 255, 255));
pedido.setText("Pedido");
pedido.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(
    new ImageIcon("src/Imagenes/mano.png").getImage(),
    new Point(0, 0), "mano_cursor"));
    pedido.setFocusPainted(false);
    pedido.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            pedidoActionPerformed(evt);
        }
    });
    Botones.add(pedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

    abastecer.setBackground(new java.awt.Color(0, 0, 0));
    abastecer.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
    abastecer.setForeground(new java.awt.Color(255, 255, 255));
    abastecer.setText("Abastecer inventario");
    abastecer.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(
        new ImageIcon("src/Imagenes/mano.png").getImage(),
        new Point(0, 0), "mano_cursor"));
abastecer.setFocusPainted(false);
abastecer.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        abastecerActionPerformed(evt);
    }
    });
    Botones.add(abastecer, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

    cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar.png"))); // NOI18N
    cerrar.setContentAreaFilled(false);
    cerrar.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(
        new ImageIcon("src/Imagenes/mano.png").getImage(),
        new Point(0, 0), "mano_cursor"));
cerrar.setFocusPainted(false);
cerrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar2.png"))); // NOI18N
cerrar.setRolloverEnabled(false);
cerrar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar2.png"))); // NOI18N
cerrar.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        cerrarActionPerformed(evt);
    }
    });
    Botones.add(cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 30, -1));

    fondo_botones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo_flechas.jpg"))); // NOI18N
    fondo_botones.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(0, 0, 0)));
    Botones.add(fondo_botones, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -6, 500, 60));

    getContentPane().add(Botones, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 490, 50));

    Automata.setBackground(new java.awt.Color(0, 0, 0));
    Automata.setBorder(javax.swing.BorderFactory.createEtchedBorder());
    Automata.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    robot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/robot.png"))); // NOI18N
    Automata.add(robot, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 30, -1));

    flecha_a.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/punto.png"))); // NOI18N
    Automata.add(flecha_a, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 10, 10));

    caja_lavadora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/caja_lavadora.png"))); // NOI18N
    Automata.add(caja_lavadora, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, -1, 30));

    caja_nevera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/caja_nevera.png"))); // NOI18N
    Automata.add(caja_nevera, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, -1, 30));

    caja_microondas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/caja_microondas.png"))); // NOI18N
    Automata.add(caja_microondas, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, -1, 30));

    caja_televisor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/caja_televisor.png"))); // NOI18N
    Automata.add(caja_televisor, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, -1, 30));

    jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/caja_computador.png"))); // NOI18N
    Automata.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, -1, 30));

    galpon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pruebas/Automata1.png"))); // NOI18N
    Automata.add(galpon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 490, 450));

    Leyenda.setBackground(new java.awt.Color(255, 255, 255));
    Leyenda.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
    Leyenda.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
    Automata.add(Leyenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 390, 490, 110));

    getContentPane().add(Automata, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 490, 470));

    jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lavadora.png"))); // NOI18N
    getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 500, -1, -1));

    lavadora.setBackground(new java.awt.Color(204, 255, 255));
    lavadora.setFont(new java.awt.Font("Cooper Black", 0, 14)); // NOI18N
    lavadora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    lavadora.setText("Lavadora");
    lavadora.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    lavadora.setOpaque(true);
    getContentPane().add(lavadora, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 540, 80, -1));

    jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nevera.png"))); // NOI18N
    getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 500, -1, -1));

    jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/micro.png"))); // NOI18N
    getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 500, -1, -1));

    jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/televisor.png"))); // NOI18N
    getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 510, -1, -1));

    jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pc.png"))); // NOI18N
    getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 500, -1, -1));

    nevera.setBackground(new java.awt.Color(204, 255, 204));
    nevera.setFont(new java.awt.Font("Cooper Black", 0, 14)); // NOI18N
    nevera.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    nevera.setText("Nevera");
    nevera.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    nevera.setOpaque(true);
    getContentPane().add(nevera, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 540, 60, -1));

    micro.setBackground(new java.awt.Color(255, 255, 204));
    micro.setFont(new java.awt.Font("Cooper Black", 0, 14)); // NOI18N
    micro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    micro.setText("Microondas");
    micro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    micro.setOpaque(true);
    getContentPane().add(micro, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 540, 90, -1));

    tv.setBackground(new java.awt.Color(255, 102, 102));
    tv.setFont(new java.awt.Font("Cooper Black", 0, 14)); // NOI18N
    tv.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    tv.setText("Televisor");
    tv.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    tv.setOpaque(true);
    getContentPane().add(tv, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 540, 80, -1));

    pc.setBackground(new java.awt.Color(204, 204, 204));
    pc.setFont(new java.awt.Font("Cooper Black", 0, 14)); // NOI18N
    pc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    pc.setText("Computador");
    pc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    pc.setOpaque(true);
    getContentPane().add(pc, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 540, 100, -1));

    jLabel1.setBackground(new java.awt.Color(255, 153, 102));
    jLabel1.setFont(new java.awt.Font("Cooper Black", 0, 13)); // NOI18N
    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel1.setText("70 Kg");
    jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    jLabel1.setOpaque(true);
    getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 570, -1, -1));

    jLabel10.setBackground(new java.awt.Color(255, 153, 102));
    jLabel10.setFont(new java.awt.Font("Cooper Black", 0, 13)); // NOI18N
    jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel10.setText("20 Kg");
    jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    jLabel10.setOpaque(true);
    getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 570, 50, -1));

    jLabel9.setBackground(new java.awt.Color(255, 153, 102));
    jLabel9.setFont(new java.awt.Font("Cooper Black", 0, 13)); // NOI18N
    jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel9.setText("30 Kg");
    jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    jLabel9.setOpaque(true);
    getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 570, 50, -1));

    jLabel8.setBackground(new java.awt.Color(255, 153, 102));
    jLabel8.setFont(new java.awt.Font("Cooper Black", 0, 13)); // NOI18N
    jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel8.setText("10 Kg");
    jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    jLabel8.setOpaque(true);
    getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 570, 50, -1));

    jLabel2.setBackground(new java.awt.Color(255, 153, 102));
    jLabel2.setFont(new java.awt.Font("Cooper Black", 0, 13)); // NOI18N
    jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel2.setText("80 Kg");
    jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    jLabel2.setOpaque(true);
    getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 570, 40, -1));

    fondo_leyenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo_flechas.jpg"))); // NOI18N
    fondo_leyenda.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(0, 0, 0)));
    getContentPane().add(fondo_leyenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 500, 500, 110));

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed

        System.exit(0);

    }//GEN-LAST:event_cerrarActionPerformed

    private void pedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pedidoActionPerformed

        pedido.setEnabled(false);
        abastecer.setEnabled(true);
        Pedido.setVisible(true);
        Inventario.setVisible(false);
        galpon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Automata2.png")));
        
    }//GEN-LAST:event_pedidoActionPerformed

    private void abastecerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abastecerActionPerformed

        pedido.setEnabled(true);
        abastecer.setEnabled(false);
        Pedido.setVisible(false);
        Inventario.setVisible(true);
        galpon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Automata2.png")));
    }//GEN-LAST:event_abastecerActionPerformed

    private void lavadora_checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lavadora_checkActionPerformed
  
    }//GEN-LAST:event_lavadora_checkActionPerformed

    private void buscar_pedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar_pedidoActionPerformed
        ArrayList<Integer> listaPedido;
        listaPedido = new ArrayList<Integer>();
        
        if (lavadora_check.isSelected()) {
            listaPedido.add(0);
        }
        if (nevera_check.isSelected()) {
            listaPedido.add(1);
        }
        if (microondas_check.isSelected()) {
            listaPedido.add(2);
        }
        if (televisor_check.isSelected()) {
            listaPedido.add(3);
        }
        if (computador_check.isSelected()) {
            listaPedido.add(4);
        }
        if (listaPedido.size() == 0) {
            JOptionPane.showMessageDialog(null, "Por favor, seleccione al menos 1 producto");
        }
        
        this.in.realizarPedido(listaPedido);
        
        /*
        Timer timer = new Timer("Timer");

        int delay = 2200;
        
        timer.schedule(this.ma.irDerecha(2,300), delay);
        try {
            Thread.sleep(300);
        } catch(InterruptedException e) {
            System.out.println(e);
        }
        */
        
        
        
        
    }//GEN-LAST:event_buscar_pedidoActionPerformed

    private void nevera_checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nevera_checkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nevera_checkActionPerformed

    private void colocar_mercanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colocar_mercanciaActionPerformed
        int cantidad = (Integer)this.jSpinner1.getValue();
        String nombreProducto = (String)this.tipo_mercancia.getSelectedItem();
        
        this.in.agregarProducto(cantidad, nombreProducto);
    }//GEN-LAST:event_colocar_mercanciaActionPerformed

    private void computador_checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_computador_checkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_computador_checkActionPerformed

    public void correr() {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Automata;
    private javax.swing.JPanel Botones;
    private javax.swing.JPanel Inventario;
    private javax.swing.JPanel Leyenda;
    private javax.swing.JPanel Pedido;
    private javax.swing.JButton abastecer;
    private javax.swing.JLabel avanzar;
    private javax.swing.JLabel avanzar_color;
    private javax.swing.JPanel base_fondo_flechas;
    private javax.swing.JButton buscar_pedido;
    private javax.swing.JLabel caja_lavadora;
    private javax.swing.JLabel caja_microondas;
    private javax.swing.JLabel caja_nevera;
    private javax.swing.JLabel caja_televisor;
    private javax.swing.JButton cerrar;
    private javax.swing.JButton colocar_mercancia;
    private javax.swing.JCheckBox computador_check;
    private javax.swing.JLabel flecha_a;
    private javax.swing.JLabel fondo_botones;
    private javax.swing.JLabel fondo_flechas;
    private javax.swing.JLabel fondo_leyenda;
    private javax.swing.JLabel galpon;
    private javax.swing.JLabel giro1;
    private javax.swing.JLabel giro1_color;
    private javax.swing.JLabel giro2;
    private javax.swing.JLabel giro2_color;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JLabel lavadora;
    private javax.swing.JCheckBox lavadora_check;
    private javax.swing.JLabel micro;
    private javax.swing.JCheckBox microondas_check;
    private javax.swing.JLabel nevera;
    private javax.swing.JCheckBox nevera_check;
    private javax.swing.JLabel pc;
    private javax.swing.JButton pedido;
    private javax.swing.JLabel robot;
    private javax.swing.JCheckBox televisor_check;
    private javax.swing.JLabel tipo_mercan;
    private javax.swing.JComboBox<String> tipo_mercancia;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel titulo1;
    private javax.swing.JLabel titulo2;
    private javax.swing.JLabel titulo_columnas;
    private javax.swing.JLabel tv;
    // End of variables declaration//GEN-END:variables
}
