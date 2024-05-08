/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.logindoprojetointegrador;

/**
 *
 * @author gabriel
 */
public class CadastroFrame extends javax.swing.JFrame {

    /**
     * Creates new form CadastroFrame
     */
    public CadastroFrame() {
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

        nomeCadastroField = new javax.swing.JTextField();
        emailCadastroField = new javax.swing.JTextField();
        passwordCadastroField = new javax.swing.JPasswordField();
        registrarJButton = new javax.swing.JButton();
        voltarLoginButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nomeCadastroField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeCadastroFieldActionPerformed(evt);
            }
        });
        getContentPane().add(nomeCadastroField, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 300, 410, 90));
        getContentPane().add(emailCadastroField, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 420, 410, 80));
        getContentPane().add(passwordCadastroField, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 540, 410, 80));

        registrarJButton.setContentAreaFilled(false);
        registrarJButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(registrarJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 660, 260, 60));

        voltarLoginButton.setContentAreaFilled(false);
        voltarLoginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        voltarLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarLoginButtonActionPerformed(evt);
            }
        });
        getContentPane().add(voltarLoginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 140, 260, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/2.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 790));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomeCadastroFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeCadastroFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeCadastroFieldActionPerformed

    private void voltarLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarLoginButtonActionPerformed
        LoginFrame voltaFrame = new LoginFrame();
        voltaFrame.setVisible(true);
    }//GEN-LAST:event_voltarLoginButtonActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField emailCadastroField;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField nomeCadastroField;
    private javax.swing.JPasswordField passwordCadastroField;
    private javax.swing.JButton registrarJButton;
    private javax.swing.JButton voltarLoginButton;
    // End of variables declaration//GEN-END:variables
}
