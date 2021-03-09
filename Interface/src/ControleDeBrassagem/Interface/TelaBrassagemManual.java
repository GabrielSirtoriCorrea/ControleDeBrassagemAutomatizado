/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControleDeBrassagem.Interface;

import org.json.simple.JSONObject;

/**
 *
 * @author Gazebo
 */
public class TelaBrassagemManual extends javax.swing.JFrame {
    boolean newStatus;
    StatusController status;
    /**
     * Creates new form TelaBrassagemManual
     */
    public TelaBrassagemManual() {
        this.setExtendedState(Interface.MAXIMIZED_BOTH); 
        this.setUndecorated(true);
        initComponents();
        status = new StatusController();
        status.writeStatus(null, "BrewMode", "Manual");
        System.out.println(status.readStatus().get("Bomb"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnEmergency = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnMotorTank2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnMotorTank1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnResistanceTank1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnResistanceTank3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btnBomb = new javax.swing.JButton();
        ledBomb = new javax.swing.JLabel();
        ledResistenceTank1 = new javax.swing.JLabel();
        ledMotorTank2 = new javax.swing.JLabel();
        ledMotorTank1 = new javax.swing.JLabel();
        ledResistenceTank3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnChangeMode = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel3.setText("EMERGÊNCIA");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 240, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ControleDeBrassagem/Images/Ellipse 1.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 200, 190));

        btnEmergency.setText("EMERGENCIA");
        btnEmergency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmergencyActionPerformed(evt);
            }
        });
        getContentPane().add(btnEmergency, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 160, 90));

        jLabel18.setFont(new java.awt.Font("Comic Sans MS", 1, 22)); // NOI18N
        jLabel18.setText("MODO DE BRASSAGEM: MANUAL");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 460, 50));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ControleDeBrassagem/Images/Rectangle 9.png"))); // NOI18N
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 630, 70));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 28)); // NOI18N
        jLabel5.setText("<html><center>MOTOR  TANQUE 2<center></html>");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 390, 170, 100));

        btnMotorTank2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ControleDeBrassagem/Images/Rectangle 18.png"))); // NOI18N
        btnMotorTank2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnMotorTank2.setPreferredSize(new java.awt.Dimension(182, 32));
        btnMotorTank2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMotorTank2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnMotorTank2, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 390, 170, 100));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 22)); // NOI18N
        jLabel4.setText("<html><center>MOTOR \nTANQUE 1<center></html>");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 130, 170, 100));

        btnMotorTank1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ControleDeBrassagem/Images/Rectangle 18.png"))); // NOI18N
        btnMotorTank1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnMotorTank1.setPreferredSize(new java.awt.Dimension(182, 32));
        btnMotorTank1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMotorTank1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnMotorTank1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 130, 170, 100));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 22)); // NOI18N
        jLabel6.setText("<html><center>RESISTÊNCIA TANQUE 1<center></html>");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 130, 180, 100));

        btnResistanceTank1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ControleDeBrassagem/Images/Rectangle 18.png"))); // NOI18N
        btnResistanceTank1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnResistanceTank1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResistanceTank1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnResistanceTank1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 130, 170, 100));

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 22)); // NOI18N
        jLabel7.setText("<html><center>RESISTÊNCIA TANQUE 3<center></html>");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 390, 180, 100));

        btnResistanceTank3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ControleDeBrassagem/Images/Rectangle 18.png"))); // NOI18N
        btnResistanceTank3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnResistanceTank3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResistanceTank3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnResistanceTank3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 390, 170, 100));

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 22)); // NOI18N
        jLabel8.setText("<html><center>BOMBA<center></html>");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 140, 100));

        btnBomb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ControleDeBrassagem/Images/Rectangle 18.png"))); // NOI18N
        btnBomb.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnBomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBombActionPerformed(evt);
            }
        });
        getContentPane().add(btnBomb, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 170, 100));

        ledBomb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ControleDeBrassagem/Images/BtnOFF.png"))); // NOI18N
        getContentPane().add(ledBomb, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 400, -1, 80));

        ledResistenceTank1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ControleDeBrassagem/Images/BtnOFF.png"))); // NOI18N
        getContentPane().add(ledResistenceTank1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 240, -1, 80));

        ledMotorTank2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ControleDeBrassagem/Images/BtnOFF.png"))); // NOI18N
        getContentPane().add(ledMotorTank2, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 510, -1, 80));

        ledMotorTank1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ControleDeBrassagem/Images/BtnOFF.png"))); // NOI18N
        getContentPane().add(ledMotorTank1, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 240, -1, 80));

        ledResistenceTank3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ControleDeBrassagem/Images/BtnOFF.png"))); // NOI18N
        getContentPane().add(ledResistenceTank3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 510, -1, 80));

        jLabel14.setFont(new java.awt.Font("Comic Sans MS", 1, 22)); // NOI18N
        jLabel14.setText("<html><center>ALTERAR MODO<center></html>");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 150, 80));

        btnChangeMode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ControleDeBrassagem/Images/Rectangle 16.png"))); // NOI18N
        btnChangeMode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnChangeMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeModeActionPerformed(evt);
            }
        });
        getContentPane().add(btnChangeMode, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 150, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ControleDeBrassagem/Images/Wallpaper.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBombActionPerformed
        // TODO add your handling code here:
        status = new StatusController();
        newStatus =  !status.readStatus().getBoolean("Bomb");
        status.writeStatus(null, "Bomb", newStatus);
        System.out.println(status.readStatus().get("Bomb"));
    }//GEN-LAST:event_btnBombActionPerformed

    private void btnMotorTank2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMotorTank2ActionPerformed
        status = new StatusController();
        newStatus =  !status.readStatus().getJSONObject("Tank2").getBoolean("Motor");
        status.writeStatus("Tank2", "Motor", newStatus);
        System.out.println(status.readStatus().getJSONObject("Tank2").getBoolean("Motor"));
    }//GEN-LAST:event_btnMotorTank2ActionPerformed

    private void btnResistanceTank3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResistanceTank3ActionPerformed
        // TODO add your handling code here:
        status = new StatusController();
        newStatus =  !status.readStatus().getJSONObject("Tank3").getBoolean("Resistence");
        status.writeStatus("Tank3", "Resistence", newStatus);
        System.out.println(status.readStatus().getJSONObject("Tank3").getBoolean("Resistence"));
    }//GEN-LAST:event_btnResistanceTank3ActionPerformed

    private void btnResistanceTank1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResistanceTank1ActionPerformed
        // TODO add your handling code here:
        status = new StatusController();
        newStatus =  !status.readStatus().getJSONObject("Tank1").getBoolean("Resistence");
        status.writeStatus("Tank1", "Resistence", newStatus);
        System.out.println(status.readStatus().getJSONObject("Tank1").getBoolean("Resistence"));
    }//GEN-LAST:event_btnResistanceTank1ActionPerformed

    private void btnMotorTank1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMotorTank1ActionPerformed
        // TODO add your handling code here:
        status = new StatusController();
        newStatus =  !status.readStatus().getJSONObject("Tank1").getBoolean("Motor");
        status.writeStatus("Tank1", "Motor", newStatus);
        System.out.println(status.readStatus().getJSONObject("Tank1").getBoolean("Motor"));
    }//GEN-LAST:event_btnMotorTank1ActionPerformed

    private void btnEmergencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmergencyActionPerformed
        // TODO add your handling code here:
        new StatusController().resetStatus();
        
    }//GEN-LAST:event_btnEmergencyActionPerformed

    private void btnChangeModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeModeActionPerformed
        // TODO add your handling code here:
        new Interface().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnChangeModeActionPerformed

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
            java.util.logging.Logger.getLogger(TelaBrassagemManual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaBrassagemManual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaBrassagemManual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaBrassagemManual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaBrassagemManual().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBomb;
    private javax.swing.JButton btnChangeMode;
    private javax.swing.JButton btnEmergency;
    private javax.swing.JButton btnMotorTank1;
    private javax.swing.JButton btnMotorTank2;
    private javax.swing.JButton btnResistanceTank1;
    private javax.swing.JButton btnResistanceTank3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel ledBomb;
    private javax.swing.JLabel ledMotorTank1;
    private javax.swing.JLabel ledMotorTank2;
    private javax.swing.JLabel ledResistenceTank1;
    private javax.swing.JLabel ledResistenceTank3;
    // End of variables declaration//GEN-END:variables
}
