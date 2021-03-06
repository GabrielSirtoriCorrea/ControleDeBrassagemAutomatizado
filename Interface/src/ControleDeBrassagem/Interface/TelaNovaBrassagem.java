/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControleDeBrassagem.Interface;

/**
 *
 * @author Gazebo
 */
public class TelaNovaBrassagem extends javax.swing.JFrame {

    /**
     * Creates new form TelaNovaBrassagem
     */
    public TelaNovaBrassagem() {
        this.setExtendedState(Interface.MAXIMIZED_BOTH); 
        this.setUndecorated(true);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        lblTarget = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnLeftArrow = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btnTopArrow = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnBottomArrow = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnRightArrow = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 40)); // NOI18N
        jLabel2.setText("NOVA BRASSAGEM");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, -1, -1));

        lblTarget.setFont(new java.awt.Font("Comic Sans MS", 1, 30)); // NOI18N
        lblTarget.setText("39ºC");
        getContentPane().add(lblTarget, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 160, 100, 70));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ControleDeBrassagem/Images/Rectangle 34.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 150, 110, 90));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 22)); // NOI18N
        jLabel5.setText("PRÓXIMO");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 520, 180, 50));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ControleDeBrassagem/Images/Polygon 2.png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 510, 80, 90));

        btnLeftArrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeftArrowActionPerformed(evt);
            }
        });
        getContentPane().add(btnLeftArrow, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 540, 40, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ControleDeBrassagem/Images/Polygon 1.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 440, 100, 60));
        getContentPane().add(btnTopArrow, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 460, 40, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ControleDeBrassagem/Images/Polygon 5.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 610, 80, 50));

        btnBottomArrow.setBackground(new java.awt.Color(51, 153, 255));
        getContentPane().add(btnBottomArrow, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 610, 40, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ControleDeBrassagem/Images/Polygon 4.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 500, 50, 110));
        getContentPane().add(btnRightArrow, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 540, 40, 30));

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel8.setText("Temperatura inicial panela 1:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 600, 50));

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 1, 21)); // NOI18N
        jLabel11.setText("CANCELAR");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 590, 180, 50));

        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ControleDeBrassagem/Images/Rectangle 11.png"))); // NOI18N
        btnCancel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 590, 140, 50));

        btnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ControleDeBrassagem/Images/Rectangle 11.png"))); // NOI18N
        btnNext.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(btnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 520, 140, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ControleDeBrassagem/Images/Wallpaper.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLeftArrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeftArrowActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLeftArrowActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        new Interface().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

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
            java.util.logging.Logger.getLogger(TelaNovaBrassagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaNovaBrassagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaNovaBrassagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaNovaBrassagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaNovaBrassagem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBottomArrow;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnLeftArrow;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnRightArrow;
    private javax.swing.JButton btnTopArrow;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblTarget;
    // End of variables declaration//GEN-END:variables
}
