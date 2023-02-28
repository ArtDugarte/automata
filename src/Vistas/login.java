package Vistas;

import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class login extends javax.swing.JFrame {

    public login() {
        initComponents();
        setLocationRelativeTo(null);
        setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon("src/Imagenes/cursor.png").getImage(), new Point(0, 0), "custom cursor"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        clave = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        entrar = new javax.swing.JButton();
        cerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Login"); // NOI18N
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bot.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));

        jLabel1.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        jLabel1.setText("Contraseña");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 470, -1, -1));

        clave.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        jPanel1.add(clave, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 510, 220, -1));

        jLabel3.setFont(new java.awt.Font("Cooper Black", 0, 36)); // NOI18N
        jLabel3.setText("Inicio de Sesión");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, -1));

        entrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iniciar-sesion.png"))); // NOI18N
        entrar.setContentAreaFilled(false);
        entrar.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(
            new ImageIcon("src/Imagenes/mano.png").getImage(),
            new Point(0, 0), "mano_cursor"));
    entrar.setFocusPainted(false);
    entrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iniciar-sesion2.png"))); // NOI18N
    entrar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iniciar-sesion2.png"))); // NOI18N
    entrar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            entrarActionPerformed(evt);
        }
    });
    jPanel1.add(entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 500, -1, -1));

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
    jPanel1.add(cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 30, -1));

    getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 600));

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed

        System.exit(0);
    }//GEN-LAST:event_cerrarActionPerformed

    private void entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarActionPerformed
        
        if(clave.getText().equals("12345")){
            
            Ventana v = new Ventana();
            v.setVisible(true);
            this.dispose();
        }  
        else{
        
            JOptionPane.showMessageDialog(null, "La contraseña es Incorrecta");
            clave.setText("");
        }        
    }//GEN-LAST:event_entrarActionPerformed

    public void correr() {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cerrar;
    private javax.swing.JPasswordField clave;
    private javax.swing.JButton entrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
