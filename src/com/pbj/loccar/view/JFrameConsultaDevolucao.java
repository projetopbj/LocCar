/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pbj.loccar.view;

import com.pbj.loccar.control.LocacaoControl;
import com.pbj.loccar.view.tables.LocacaoTable;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Akr-Taku
 */
public final class JFrameConsultaDevolucao extends javax.swing.JFrame {

    LocacaoTable tableModel;

    /**
     * Creates new form JFrameDevolverVeiculo
     */
    public JFrameConsultaDevolucao() {
        initComponents();

        tableModel = new LocacaoTable();
        atualizaTabela();

        jTableLoc.setModel(tableModel);

    }

    private String[] pegarLoc() {
        if (jTableLoc.getSelectedRow() != -1) {
            String loc[] = tableModel.getLinha(jTableLoc.getSelectedRow());

            return loc;
        } else {
            return null;
        }
    }

    private void atualizaTabela() {
        tableModel.removeAll();
        try {
            tableModel.addLista(LocacaoControl.lerLocacao(false));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Acessar Banco de dados: " + ex, "", JOptionPane.ERROR_MESSAGE);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBuscaLoc = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableLoc = new javax.swing.JTable();
        jPanelBusca = new javax.swing.JPanel();
        txtBusca = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();
        jPanelFiltro = new javax.swing.JPanel();
        jComboBoxStatus = new javax.swing.JComboBox<>();
        jButtonChamaDevol = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jButtonAtualizarT = new javax.swing.JButton();
        jButtonDel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Locações");
        setPreferredSize(new java.awt.Dimension(600, 450));
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jTableLoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Cliente", "CPF", "Carro", "Placa", "Categoria", "Data da Locação", "Data da Devolução", "Dias", "Valor Parcial"
            }
        ));
        jScrollPane1.setViewportView(jTableLoc);

        jPanelBusca.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar Locação"));

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jPanelFiltro.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtrar"));

        jComboBoxStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Abertos", "Finalizados" }));
        jComboBoxStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxStatusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelFiltroLayout = new javax.swing.GroupLayout(jPanelFiltro);
        jPanelFiltro.setLayout(jPanelFiltroLayout);
        jPanelFiltroLayout.setHorizontalGroup(
            jPanelFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFiltroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBoxStatus, 0, 121, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelFiltroLayout.setVerticalGroup(
            jPanelFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFiltroLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jComboBoxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelBuscaLayout = new javax.swing.GroupLayout(jPanelBusca);
        jPanelBusca.setLayout(jPanelBuscaLayout);
        jPanelBuscaLayout.setHorizontalGroup(
            jPanelBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBuscaLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelBuscaLayout.setVerticalGroup(
            jPanelBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBuscaLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanelBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelBuscaLayout.createSequentialGroup()
                .addComponent(jPanelFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jButtonChamaDevol.setText("Devolver");
        jButtonChamaDevol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChamaDevolActionPerformed(evt);
            }
        });

        jButtonCancel.setText("Cancelar");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        jButtonAtualizarT.setText("Atualizar Tabela");
        jButtonAtualizarT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarTActionPerformed(evt);
            }
        });

        jButtonDel.setText("Apagar Locacao");
        jButtonDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBuscaLocLayout = new javax.swing.GroupLayout(jPanelBuscaLoc);
        jPanelBuscaLoc.setLayout(jPanelBuscaLocLayout);
        jPanelBuscaLocLayout.setHorizontalGroup(
            jPanelBuscaLocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBuscaLocLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBuscaLocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBuscaLocLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonDel)
                        .addGap(34, 34, 34)
                        .addComponent(jButtonChamaDevol, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77))
                    .addGroup(jPanelBuscaLocLayout.createSequentialGroup()
                        .addComponent(jPanelBusca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 677, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBuscaLocLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonAtualizarT)
                .addGap(30, 30, 30))
        );
        jPanelBuscaLocLayout.setVerticalGroup(
            jPanelBuscaLocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBuscaLocLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jButtonAtualizarT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                .addGap(49, 49, 49)
                .addGroup(jPanelBuscaLocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonChamaDevol)
                    .addComponent(jButtonCancel)
                    .addComponent(jButtonDel))
                .addGap(31, 31, 31))
        );

        getContentPane().add(jPanelBuscaLoc);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonChamaDevolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChamaDevolActionPerformed
        // TODO add your handling code here:

        if (jTableLoc.getSelectedRow() != -1) {

            int resp;
            resp = JOptionPane.showConfirmDialog(rootPane, "Tem Certeza que deseja Devolver?", "Devolver Veículo", JOptionPane.YES_OPTION, JOptionPane.QUESTION_MESSAGE);

            if (resp == 0) {

                String getLoc[] = pegarLoc();

                new JFrameDevolucao(Integer.parseInt(getLoc[0])).setVisible(true);
            }

        }


    }//GEN-LAST:event_jButtonChamaDevolActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jComboBoxStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxStatusActionPerformed
        // TODO add your handling code here:

        try {
            if ("Abertos".equals(jComboBoxStatus.getSelectedItem())) {

                tableModel.removeAll();
                tableModel.addLista(LocacaoControl.lerLocacao(false));
                jButtonChamaDevol.setEnabled(true);

            } else if ("Finalizados".equals(jComboBoxStatus.getSelectedItem())) {
                tableModel.removeAll();
                tableModel.addLista(LocacaoControl.lerLocacao(true));
                jButtonChamaDevol.setEnabled(false);
                jButtonDel.setEnabled(false);

            } else {
                tableModel.removeAll();
                tableModel.addLista(LocacaoControl.lerLocacao());
                jButtonChamaDevol.setEnabled(false);
                jButtonDel.setEnabled(false);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Acessar Banco de dados: " + ex, "", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jComboBoxStatusActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        // TODO add your handling code here:
        try {
            if ("Abertos".equals(jComboBoxStatus.getSelectedItem())) {

                tableModel.removeAll();
                tableModel.addLista(LocacaoControl.lerLocacao(false, txtBusca.getText()));

            } else if ("Finalizados".equals(jComboBoxStatus.getSelectedItem())) {
                tableModel.removeAll();
                tableModel.addLista(LocacaoControl.lerLocacao(true, txtBusca.getText()));

            } else {
                tableModel.removeAll();
                tableModel.addLista(LocacaoControl.lerLocacao(txtBusca.getText()));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Acessar Banco de dados: " + ex, "", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonAtualizarTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarTActionPerformed
        // TODO add your handling code here:
        atualizaTabela();
        jButtonChamaDevol.setEnabled(true);
        jComboBoxStatus.setSelectedIndex(0);
        txtBusca.setText("");
    }//GEN-LAST:event_jButtonAtualizarTActionPerformed

    private void jButtonDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDelActionPerformed
        // TODO add your handling code here:
        if (jTableLoc.getSelectedRow() != -1) {

            int resp;
            resp = JOptionPane.showConfirmDialog(rootPane, "Tem Certeza que deseja Apagar o Registro?", "", JOptionPane.YES_OPTION, JOptionPane.QUESTION_MESSAGE);

            if (resp == 0) {

                String getLoc[] = pegarLoc();

                try {
                    LocacaoControl.apagarLocacao(Integer.parseInt(getLoc[0]));
                    JOptionPane.showMessageDialog(null, "Registro Apagado do Banco de Dados!");
                } catch (SQLException | ParseException ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao Acessar Banco de dados: " + ex, "", JOptionPane.ERROR_MESSAGE);

                }
            }

        }


    }//GEN-LAST:event_jButtonDelActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameConsultaDevolucao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameConsultaDevolucao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameConsultaDevolucao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameConsultaDevolucao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
        java.awt.EventQueue.invokeLater(() -> {
            new JFrameConsultaDevolucao().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtualizarT;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonChamaDevol;
    private javax.swing.JButton jButtonDel;
    private javax.swing.JComboBox<String> jComboBoxStatus;
    private javax.swing.JPanel jPanelBusca;
    private javax.swing.JPanel jPanelBuscaLoc;
    private javax.swing.JPanel jPanelFiltro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableLoc;
    private javax.swing.JTextField txtBusca;
    // End of variables declaration//GEN-END:variables
}
