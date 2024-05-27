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
public class Pergunta4 extends javax.swing.JFrame {
    int contador = 0;

    /**
     * Creates new form Pergunta1
     */
    public Pergunta4(int contador) {
        this.contador = contador;
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
        alernativaCfield1 = new javax.swing.JTextField();
        alernativaBfield1 = new javax.swing.JTextField();
        alternativaAButton = new javax.swing.JButton();
        alternativaBButton = new javax.swing.JButton();
        alternativaCButton = new javax.swing.JButton();
        alternativaDButton = new javax.swing.JButton();
        jTextArea1 = new javax.swing.JTextArea();
        alernativaDfield2 = new javax.swing.JTextField();
        tituloLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        alernativaAfield.setEditable(false);
        alernativaAfield.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        alernativaAfield.setText("digestório e cardiovascular.");
        alernativaAfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alernativaAfieldActionPerformed(evt);
            }
        });
        getContentPane().add(alernativaAfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 460, 60));

        alernativaCfield1.setEditable(false);
        alernativaCfield1.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        alernativaCfield1.setText("muscular e ósseo. ");
        alernativaCfield1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alernativaCfield1ActionPerformed(evt);
            }
        });
        getContentPane().add(alernativaCfield1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 310, 310, 60));

        alernativaBfield1.setEditable(false);
        alernativaBfield1.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        alernativaBfield1.setText("respiratório e cardiovascular.");
        alernativaBfield1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alernativaBfield1ActionPerformed(evt);
            }
        });
        getContentPane().add(alernativaBfield1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 520, 480, 60));

        alternativaAButton.setContentAreaFilled(false);
        alternativaAButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        alternativaAButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alternativaAButtonActionPerformed(evt);
            }
        });
        getContentPane().add(alternativaAButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, -1, 70));

        alternativaBButton.setContentAreaFilled(false);
        alternativaBButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        alternativaBButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alternativaBButtonActionPerformed(evt);
            }
        });
        getContentPane().add(alternativaBButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 510, -1, 70));

        alternativaCButton.setContentAreaFilled(false);
        alternativaCButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        alternativaCButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alternativaCButtonActionPerformed(evt);
            }
        });
        getContentPane().add(alternativaCButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 300, 70, 70));

        alternativaDButton.setContentAreaFilled(false);
        alternativaDButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        alternativaDButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alternativaDButtonActionPerformed(evt);
            }
        });
        getContentPane().add(alternativaDButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 510, 80, 80));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Helvetica Neue", 0, 30)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setTabSize(6);
        jTextArea1.setText("A faringe é uma estrutura comum aos sistemas: ");
        jTextArea1.setAutoscrolls(false);
        jTextArea1.setBorder(null);
        getContentPane().add(jTextArea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, -1, 60));

        alernativaDfield2.setEditable(false);
        alernativaDfield2.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        alernativaDfield2.setText("digestório e respiratório.");
        alernativaDfield2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alernativaDfield2ActionPerformed(evt);
            }
        });
        getContentPane().add(alernativaDfield2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 520, 410, 60));

        tituloLabel.setFont(new java.awt.Font("HeadLineA", 2, 60)); // NOI18N
        tituloLabel.setForeground(new java.awt.Color(255, 153, 153));
        tituloLabel.setText("FARINGE");
        getContentPane().add(tituloLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, 190, 80));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Design sem nome (1).png"))); // NOI18N
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void alernativaAfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alernativaAfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alernativaAfieldActionPerformed

    private void alernativaBfield1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alernativaBfield1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alernativaBfield1ActionPerformed

    private void alernativaCfield1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alernativaCfield1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alernativaCfield1ActionPerformed

    private void alternativaAButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alternativaAButtonActionPerformed
        JOptionPane.showMessageDialog(null, "Alternativa errada, tente novamente!");
    }//GEN-LAST:event_alternativaAButtonActionPerformed

    private void alternativaBButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alternativaBButtonActionPerformed
        JOptionPane.showMessageDialog(null, "Alternativa errada, tente novamente!");
    }//GEN-LAST:event_alternativaBButtonActionPerformed

    private void alternativaCButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alternativaCButtonActionPerformed
        JOptionPane.showMessageDialog(null, "Alternativa errada, tente novamente!");
    }//GEN-LAST:event_alternativaCButtonActionPerformed

    private void alternativaDButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alternativaDButtonActionPerformed
        JOptionPane.showMessageDialog(null, "Parabéns, alternativa certa!");
        contador++;
        //Pergunta3 tela3 = new Pergunta3();
      // tela3.setVisible(true);
        //this.dispose();
    }//GEN-LAST:event_alternativaDButtonActionPerformed

    private void alernativaDfield2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alernativaDfield2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alernativaDfield2ActionPerformed

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
            java.util.logging.Logger.getLogger(Pergunta4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pergunta4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pergunta4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pergunta4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pergunta4(0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alernativaAfield;
    private javax.swing.JTextField alernativaBfield1;
    private javax.swing.JTextField alernativaCfield1;
    private javax.swing.JTextField alernativaDfield2;
    private javax.swing.JButton alternativaAButton;
    private javax.swing.JButton alternativaBButton;
    private javax.swing.JButton alternativaCButton;
    private javax.swing.JButton alternativaDButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel tituloLabel;
    // End of variables declaration//GEN-END:variables
}
