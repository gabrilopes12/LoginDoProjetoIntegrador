/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.logindoprojetointegrador;

import javax.swing.JOptionPane;

/**
 *
 * @author gabriel
 */
public class Pergunta1 extends javax.swing.JFrame {

    /**
     * Creates new form Pergunta1
     */
    public Pergunta1() {
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

        alernativaAfield = new javax.swing.JTextField();
        alernativaDfield1 = new javax.swing.JTextField();
        alernativaCfield1 = new javax.swing.JTextField();
        alernativaBfield1 = new javax.swing.JTextField();
        enunciadoField = new javax.swing.JTextField();
        alternativaAButton = new javax.swing.JButton();
        alternativaBButton = new javax.swing.JButton();
        alternativaCButton = new javax.swing.JButton();
        alternativaDButton = new javax.swing.JButton();
        tituloLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        alernativaAfield.setText("Exócrina. ");
        alernativaAfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alernativaAfieldActionPerformed(evt);
            }
        });
        getContentPane().add(alernativaAfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 80, 60));

        alernativaDfield1.setText("Endócrina.");
        alernativaDfield1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alernativaDfield1ActionPerformed(evt);
            }
        });
        getContentPane().add(alernativaDfield1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 540, 80, 60));

        alernativaCfield1.setText("Folicular.");
        alernativaCfield1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alernativaCfield1ActionPerformed(evt);
            }
        });
        getContentPane().add(alernativaCfield1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 320, 80, 60));

        alernativaBfield1.setText("Mista.");
        alernativaBfield1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alernativaBfield1ActionPerformed(evt);
            }
        });
        getContentPane().add(alernativaBfield1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 540, 80, 60));

        enunciadoField.setEditable(false);
        enunciadoField.setText("1. As glândulas salivares produzem e lançam a saliva no interior da boca. Por causa dessa característica, pode-se afirmar que são um exemplo de glândula: ");
        enunciadoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enunciadoFieldActionPerformed(evt);
            }
        });
        getContentPane().add(enunciadoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 950, 50));

        alternativaAButton.setContentAreaFilled(false);
        alternativaAButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        alternativaAButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alternativaAButtonActionPerformed(evt);
            }
        });
        getContentPane().add(alternativaAButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 313, 80, 80));

        alternativaBButton.setContentAreaFilled(false);
        alternativaBButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        alternativaBButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alternativaBButtonActionPerformed(evt);
            }
        });
        getContentPane().add(alternativaBButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 530, 80, 80));

        alternativaCButton.setContentAreaFilled(false);
        alternativaCButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        alternativaCButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alternativaCButtonActionPerformed(evt);
            }
        });
        getContentPane().add(alternativaCButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(758, 303, 90, 90));

        alternativaDButton.setContentAreaFilled(false);
        alternativaDButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        alternativaDButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alternativaDButtonActionPerformed(evt);
            }
        });
        getContentPane().add(alternativaDButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 523, 80, 90));

        tituloLabel.setFont(new java.awt.Font("HeadLineA", 2, 60)); // NOI18N
        tituloLabel.setForeground(new java.awt.Color(255, 153, 153));
        tituloLabel.setText("BOCA");
        getContentPane().add(tituloLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 70, 130, 80));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PERGUNTAS.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1290, 740));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enunciadoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enunciadoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enunciadoFieldActionPerformed

    private void alernativaAfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alernativaAfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alernativaAfieldActionPerformed

    private void alernativaBfield1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alernativaBfield1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alernativaBfield1ActionPerformed

    private void alernativaCfield1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alernativaCfield1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alernativaCfield1ActionPerformed

    private void alernativaDfield1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alernativaDfield1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alernativaDfield1ActionPerformed

    private void alternativaAButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alternativaAButtonActionPerformed
        JOptionPane.showMessageDialog(null, "Parabéns, alternativa certa!");
        
        Pergunta2 tela2 = new Pergunta2();
        tela2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_alternativaAButtonActionPerformed

    private void alternativaBButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alternativaBButtonActionPerformed
        JOptionPane.showMessageDialog(null, "Alternativa errada, tente novamente!");
    }//GEN-LAST:event_alternativaBButtonActionPerformed

    private void alternativaCButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alternativaCButtonActionPerformed
        JOptionPane.showMessageDialog(null, "Alternativa errada, tente novamente!");
    }//GEN-LAST:event_alternativaCButtonActionPerformed

    private void alternativaDButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alternativaDButtonActionPerformed
        JOptionPane.showMessageDialog(null, "Alternativa errada, tente novamente!");
    }//GEN-LAST:event_alternativaDButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Pergunta1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pergunta1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pergunta1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pergunta1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pergunta1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alernativaAfield;
    private javax.swing.JTextField alernativaBfield1;
    private javax.swing.JTextField alernativaCfield1;
    private javax.swing.JTextField alernativaDfield1;
    private javax.swing.JButton alternativaAButton;
    private javax.swing.JButton alternativaBButton;
    private javax.swing.JButton alternativaCButton;
    private javax.swing.JButton alternativaDButton;
    private javax.swing.JTextField enunciadoField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel tituloLabel;
    // End of variables declaration//GEN-END:variables
}
