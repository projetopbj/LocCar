/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pbj.loccar.view;

import com.pbj.loccar.control.PropriedadeControl;
import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Akr-Taku
 */
public class JFrameConfigBD extends javax.swing.JFrame {

    /**
     * Creates new form JFrameConfigBD
     */
    public JFrameConfigBD() {

        initComponents();

        ArrayList<String> propriedades;
        try {
            propriedades = PropriedadeControl.retornarProp();
            //Seta os dados Diretamente dos Properties para o Campo de Config
            txtHost.setText(propriedades.get(0));
            txtPorta.setText(propriedades.get(1));
            txtBancoNome.setText(propriedades.get(2));
            txtUser.setText(propriedades.get(3));
            txtPass.setText(propriedades.get(4));

            setEditavel(false, Color.GRAY);

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Acessar O arquivo de Propriedades: " + ex, "", JOptionPane.ERROR_MESSAGE);
        }

    }

    //Metodo que troca os campos editaveis para não editaveis
    private void setEditavel(boolean bool, Color cor) {

        txtHost.setEditable(bool);
        txtPorta.setEditable(bool);
        txtBancoNome.setEditable(bool);
        txtUser.setEditable(bool);
        txtPass.setEditable(bool);

        txtHost.setBackground(cor);
        txtPorta.setBackground(cor);
        txtBancoNome.setBackground(cor);
        txtUser.setBackground(cor);
        txtPass.setBackground(cor);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelCampoBotoes = new javax.swing.JPanel();
        jPanelCampoBD = new javax.swing.JPanel();
        jLabelHost = new javax.swing.JLabel();
        jLabelPorta = new javax.swing.JLabel();
        jLabelUser = new javax.swing.JLabel();
        jLabelPass = new javax.swing.JLabel();
        txtHost = new javax.swing.JTextField();
        txtPorta = new javax.swing.JTextField();
        txtUser = new javax.swing.JTextField();
        txtPass = new javax.swing.JTextField();
        jLabelBancoNome = new javax.swing.JLabel();
        txtBancoNome = new javax.swing.JTextField();
        jButtonSalvar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Configurar Banco");
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanelCampoBD.setBorder(javax.swing.BorderFactory.createTitledBorder("Configuração Banco de Dados"));

        jLabelHost.setText("Host");

        jLabelPorta.setText("Porta");

        jLabelUser.setText("Usuário");

        jLabelPass.setText("Senha");

        txtHost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHostActionPerformed(evt);
            }
        });

        txtPorta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPortaActionPerformed(evt);
            }
        });

        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });

        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });

        jLabelBancoNome.setText("Banco de Dados");

        txtBancoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBancoNomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCampoBDLayout = new javax.swing.GroupLayout(jPanelCampoBD);
        jPanelCampoBD.setLayout(jPanelCampoBDLayout);
        jPanelCampoBDLayout.setHorizontalGroup(
            jPanelCampoBDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCampoBDLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCampoBDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCampoBDLayout.createSequentialGroup()
                        .addGroup(jPanelCampoBDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelCampoBDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtHost)
                                .addGroup(jPanelCampoBDLayout.createSequentialGroup()
                                    .addGroup(jPanelCampoBDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabelUser)
                                        .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(27, 27, 27)
                                    .addGroup(jPanelCampoBDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabelPass)
                                        .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabelHost))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelCampoBDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelPorta)
                            .addComponent(txtPorta, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabelBancoNome)
                    .addComponent(txtBancoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanelCampoBDLayout.setVerticalGroup(
            jPanelCampoBDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCampoBDLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanelCampoBDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelHost)
                    .addComponent(jLabelPorta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCampoBDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPorta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabelBancoNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBancoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanelCampoBDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUser)
                    .addComponent(jLabelPass))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCampoBDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
        );

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonAlterar.setText("Alterar");
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jButtonCancel.setText("Cancelar");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCampoBotoesLayout = new javax.swing.GroupLayout(jPanelCampoBotoes);
        jPanelCampoBotoes.setLayout(jPanelCampoBotoesLayout);
        jPanelCampoBotoesLayout.setHorizontalGroup(
            jPanelCampoBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCampoBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelCampoBD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanelCampoBotoesLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanelCampoBotoesLayout.setVerticalGroup(
            jPanelCampoBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCampoBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelCampoBD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(jPanelCampoBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancel)
                    .addComponent(jButtonAlterar)
                    .addComponent(jButtonSalvar))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelCampoBotoes);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassActionPerformed

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

    private void txtHostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHostActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        // TODO add your handling code here:

        setEditavel(true, Color.WHITE);
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        // TODO add your handling code here:

        this.dispose();
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void txtPortaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPortaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPortaActionPerformed

    private void txtBancoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBancoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBancoNomeActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        // TODO add your handling code here:
        //Salva Os properties pegando os dados a partir dos campos de texto
        try {
            PropriedadeControl.salvarProp(txtHost.getText(), txtPorta.getText(), txtBancoNome.getText(), txtUser.getText(), txtPass.getText());
            JOptionPane.showMessageDialog(this, "Salvo Com Sucesso!");

            setEditavel(false, Color.GRAY);

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Salvar as Propriedades: " + ex, "", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_jButtonSalvarActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameConfigBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameConfigBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameConfigBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameConfigBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new JFrameConfigBD().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabelBancoNome;
    private javax.swing.JLabel jLabelHost;
    private javax.swing.JLabel jLabelPass;
    private javax.swing.JLabel jLabelPorta;
    private javax.swing.JLabel jLabelUser;
    private javax.swing.JPanel jPanelCampoBD;
    private javax.swing.JPanel jPanelCampoBotoes;
    private javax.swing.JTextField txtBancoNome;
    private javax.swing.JTextField txtHost;
    private javax.swing.JTextField txtPass;
    private javax.swing.JTextField txtPorta;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
