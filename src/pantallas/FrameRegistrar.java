/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pantallas;

import Entidades.Visitante;
import EntidadesLogic.EntidadesLogic;
import javax.swing.JOptionPane;

/**
 *
 * @author piero
 */
public class FrameRegistrar extends javax.swing.JFrame {
   
    /**
     * Creates new form Frameingresar
     */
    public FrameRegistrar() {
        initComponents();
        
        this.setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        lbl = new javax.swing.JLabel();
        lblimagen = new javax.swing.JLabel();
        lblnombre = new javax.swing.JLabel();
        lblapellidos = new javax.swing.JLabel();
        lblusuario = new javax.swing.JLabel();
        lbldni = new javax.swing.JLabel();
        lblcorreo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtcontraseña = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtapellidos = new javax.swing.JTextField();
        txtusuario = new javax.swing.JTextField();
        txtdni = new javax.swing.JTextField();
        txtcorreo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btmRegistrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(155, 109, 54));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesFrameRegistrar/Rectangle 14.png"))); // NOI18N

        lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesFrameRegistrar/Ayudanos a encontrar mascostas.png"))); // NOI18N

        lblimagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesFrameRegistrar/Ellipse 2.png"))); // NOI18N

        lblnombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesFrameRegistrar/Nombre_.png"))); // NOI18N

        lblapellidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesFrameRegistrar/Apellidos_.png"))); // NOI18N

        lblusuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesFrameRegistrar/Usuario_.png"))); // NOI18N

        lbldni.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesFrameRegistrar/DNI_.png"))); // NOI18N

        lblcorreo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesFrameRegistrar/Correo_.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(155, 109, 54));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtcontraseña.setBackground(new java.awt.Color(217, 217, 217));
        txtcontraseña.setBorder(null);
        jPanel2.add(txtcontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 134, 150, -1));

        txtnombre.setBackground(new java.awt.Color(217, 217, 217));
        txtnombre.setBorder(null);
        jPanel2.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 14, 150, -1));

        txtapellidos.setBackground(new java.awt.Color(217, 217, 217));
        txtapellidos.setBorder(null);
        jPanel2.add(txtapellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 54, 150, -1));

        txtusuario.setBackground(new java.awt.Color(217, 217, 217));
        txtusuario.setBorder(null);
        jPanel2.add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 94, 150, -1));

        txtdni.setBackground(new java.awt.Color(217, 217, 217));
        txtdni.setBorder(null);
        jPanel2.add(txtdni, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 169, 150, -1));

        txtcorreo.setBackground(new java.awt.Color(217, 217, 217));
        txtcorreo.setBorder(null);
        jPanel2.add(txtcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 204, 150, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesFrameRegistrar/Rectangle 3 (1).png"))); // NOI18N
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesFrameRegistrar/Rectangle 3 (1).png"))); // NOI18N
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesFrameRegistrar/Rectangle 3 (1).png"))); // NOI18N
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesFrameRegistrar/Rectangle 3 (1).png"))); // NOI18N
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 165, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesFrameRegistrar/Rectangle 3 (1).png"))); // NOI18N
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesFrameRegistrar/Rectangle 3 (1).png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesFrameRegistrar/Group 6.png"))); // NOI18N
        btnCancelar.setBorder(null);
        btnCancelar.setBorderPainted(false);
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btmRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesFrameRegistrar/Group 7.png"))); // NOI18N
        btmRegistrar.setBorder(null);
        btmRegistrar.setBorderPainted(false);
        btmRegistrar.setContentAreaFilled(false);
        btmRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btmRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmRegistrarActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesFrameRegistrar/Contraseña_.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(logo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 51, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblnombre, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblapellidos, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblusuario, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbldni, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblcorreo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(btnCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btmRegistrar)
                .addGap(24, 24, 24))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl)
                        .addGap(70, 70, 70))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblimagen)
                        .addGap(97, 97, 97))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(logo)
                .addGap(39, 39, 39)
                .addComponent(lblimagen)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(lblnombre)
                        .addGap(29, 29, 29)
                        .addComponent(lblapellidos)
                        .addGap(29, 29, 29)
                        .addComponent(lblusuario)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1)
                        .addGap(26, 26, 26)
                        .addComponent(lbldni)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblcorreo)
                        .addGap(24, 24, 24)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btmRegistrar))
                .addGap(18, 18, 18)
                .addComponent(lbl)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btmRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmRegistrarActionPerformed
         if (!txtnombre.getText().isEmpty()
                 && !txtapellidos.getText().isEmpty()
                 && !txtcorreo.getText().isEmpty()
                 && !txtdni.getText().isEmpty()
                 && !txtusuario.getText().isEmpty()
                 && !txtcontraseña.getText().isEmpty()) {
            
             Visitante visitante = new Visitante(txtnombre.getText(),
                     txtapellidos.getText(),
                     txtdni.getText(),
                     txtusuario.getText(),
                     txtcontraseña.getText(),
                     txtcorreo.getText());
             
             if (EntidadesLogic.insertar(visitante)) {
                 JOptionPane.showMessageDialog(this, 
                         "Usuario registrado exitosamente");
             }else{
                 JOptionPane.showMessageDialog(this, 
                         "Usuario ya existente");
             }
 
             
        }
    }//GEN-LAST:event_btmRegistrarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
     
       FrameIngresar ingresar =new FrameIngresar();
        ingresar.setVisible(true);
        
       this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameRegistrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btmRegistrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl;
    private javax.swing.JLabel lblapellidos;
    private javax.swing.JLabel lblcorreo;
    private javax.swing.JLabel lbldni;
    private javax.swing.JLabel lblimagen;
    private javax.swing.JLabel lblnombre;
    private javax.swing.JLabel lblusuario;
    private javax.swing.JLabel logo;
    private javax.swing.JTextField txtapellidos;
    private javax.swing.JTextField txtcontraseña;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtdni;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}