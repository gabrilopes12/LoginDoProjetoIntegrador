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
public class TelaProfessor extends javax.swing.JFrame {
    private Usuario usuario;
    int id_professor = 0;
    /**
     * Creates new form TelaProfessor
     */
    public TelaProfessor(Usuario usuario) {
        try{
            this.usuario = usuario;
            DAO dao = new DAO();
            int professor = dao.verificaIDProfessor(usuario);
            id_professor = professor;
            
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog (null, "Problemas técnicos. Tente novamente mais tarde");
            e.printStackTrace();
        }
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mostrarAlunosButton = new javax.swing.JButton();
        gerenciarPerguntasButton = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mostrarAlunosButton.setContentAreaFilled(false);
        mostrarAlunosButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mostrarAlunosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarAlunosButtonActionPerformed(evt);
            }
        });
        getContentPane().add(mostrarAlunosButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 310, 170));

        gerenciarPerguntasButton.setContentAreaFilled(false);
        gerenciarPerguntasButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gerenciarPerguntasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerenciarPerguntasButtonActionPerformed(evt);
            }
        });
        getContentPane().add(gerenciarPerguntasButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 300, 320, 160));

        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/red aumentar.png"))); // NOI18N
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 40, 40));

        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/red diminuir.png"))); // NOI18N
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 40, 40));

        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/red pause.png"))); // NOI18N
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 40, 40));

        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/red play.png"))); // NOI18N
        jButton8.setBorderPainted(false);
        jButton8.setContentAreaFilled(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 40));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botaosair.png"))); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 8));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 540, 210, 90));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BOM DIA PROFESSOR!.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mostrarAlunosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarAlunosButtonActionPerformed
       telaVerAlunos tva = new telaVerAlunos(usuario);
       tva.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mostrarAlunosButtonActionPerformed

    private void gerenciarPerguntasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerenciarPerguntasButtonActionPerformed
        telaGerenciarPerguntas telaGerencia = new telaGerenciarPerguntas(usuario);
        telaGerencia.setVisible(true);
        this.dispose();
        
        
    }//GEN-LAST:event_gerenciarPerguntasButtonActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // aumentar volume
        MusicPlayer.increaseVolume();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // diminuir volume
        MusicPlayer.decreaseVolume();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // pausar musica
        MusicPlayer.pauseMusic();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // play music

        MusicPlayer.playMusic("/gameMusic.wav");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int escolha = JOptionPane.showConfirmDialog(null, "Deseja sair e voltar para a tela de login?","Sair!",JOptionPane.OK_CANCEL_OPTION);
        if(escolha == JOptionPane.OK_OPTION){
            LoginFrame lf = new LoginFrame();
            lf.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run(Usuario usuario) {
                new TelaProfessor(usuario).setVisible(true);
            }

            @Override
            public void run() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton gerenciarPerguntasButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton mostrarAlunosButton;
    // End of variables declaration//GEN-END:variables
}
