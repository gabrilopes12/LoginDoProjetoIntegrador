/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.logindoprojetointegrador;

/**
 *
 * @author gabriel
 */
public class TelaRanking extends javax.swing.JFrame {
    int contador = 0;
    int id_aluno;

    /**
     * Creates new form TelaRanking
     */
    public TelaRanking() {
        this.contador = contador;
        this.id_aluno = id_aluno;
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

        nome1Label = new javax.swing.JLabel();
        pontuacao1Label = new javax.swing.JLabel();
        nome2Label = new javax.swing.JLabel();
        pontuacao2Label = new javax.swing.JLabel();
        pontuacao5Label = new javax.swing.JLabel();
        nome5Label = new javax.swing.JLabel();
        pontuacao4Label = new javax.swing.JLabel();
        nome4Label = new javax.swing.JLabel();
        pontuacao3Label = new javax.swing.JLabel();
        nome3Label = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nome1Label.setBackground(new java.awt.Color(0, 0, 0));
        nome1Label.setText("label do nome");
        getContentPane().add(nome1Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 240, 50));

        pontuacao1Label.setText("label da pontuaçao");
        getContentPane().add(pontuacao1Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 160, 250, 60));

        nome2Label.setBackground(new java.awt.Color(0, 0, 0));
        nome2Label.setText("label do nome");
        getContentPane().add(nome2Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 160, 50));

        pontuacao2Label.setText("label da pontuacao");
        getContentPane().add(pontuacao2Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 270, 120, 40));

        pontuacao5Label.setText("label da pontuacao");
        getContentPane().add(pontuacao5Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 590, -1, -1));

        nome5Label.setText("label do nome");
        getContentPane().add(nome5Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 590, -1, -1));

        pontuacao4Label.setText("label da pontuacao");
        getContentPane().add(pontuacao4Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 490, -1, -1));

        nome4Label.setText("label do nome");
        getContentPane().add(nome4Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 490, -1, -1));

        pontuacao3Label.setText("label da pontuacao");
        getContentPane().add(pontuacao3Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 380, -1, -1));

        nome3Label.setText("label do nome");
        getContentPane().add(nome3Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Design sem nome (3).png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(TelaRanking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaRanking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaRanking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaRanking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaRanking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel nome1Label;
    private javax.swing.JLabel nome2Label;
    private javax.swing.JLabel nome3Label;
    private javax.swing.JLabel nome4Label;
    private javax.swing.JLabel nome5Label;
    private javax.swing.JLabel pontuacao1Label;
    private javax.swing.JLabel pontuacao2Label;
    private javax.swing.JLabel pontuacao3Label;
    private javax.swing.JLabel pontuacao4Label;
    private javax.swing.JLabel pontuacao5Label;
    // End of variables declaration//GEN-END:variables
}


// recebe todos os atributos (id_aluno, contador)
//dar um select no banco de dados na tabela alunos: select nome from aluno where id_aluno = ?
// insert into ranking (id_aluno, pontuacao) values (?,?)
// 1 - id_aluno
// 2 - contador
// 2 labels, label.setText(nomeDoAluno), label.setText(contador);