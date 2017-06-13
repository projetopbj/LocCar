/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pbj.loccar.view;

import com.pbj.loccar.control.CategoriaControl;
import com.pbj.loccar.view.tables.CategoriaTable;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Akr-Taku
 *
 * Frame que consulta as categorias cadastradas no sistema
 *
 */
public class JFrameConsultaCategoria extends javax.swing.JFrame {

    /**
     * Creates new form JFrameConsultaCategoria
     */
    CategoriaTable tableModel;

    public JFrameConsultaCategoria() {
        initComponents();
        //Carrega a lista de Categorias Diretamente do Banco de Dados
        tableModel = new CategoriaTable();
        atualizaTabela();

        jTableCateg.setModel(tableModel);//Seta o modelo na tabela do Frame

        //Inicia os Botões como Não clicaveis;
        jButtonExcluir.setEnabled(false);
        jButtonAlterar.setEnabled(false);

    }

    private String[] pegarCategoria() {
        if (jTableCateg.getSelectedRow() != -1) {
            String categ[] = tableModel.getCategoria(jTableCateg.getSelectedRow());

            return categ;
        } else {
            return null;
        }

    }

    private void atualizaTabela() {
        try {
            tableModel.removeAll();
            tableModel.addLista(CategoriaControl.lerCategoria());
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

        jPanelConsultaBotoes = new javax.swing.JPanel();
        jPanelConsultaCateg = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCateg = new javax.swing.JTable();
        jButtonAtualizeTable = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout());

        jPanelConsultaCateg.setBorder(javax.swing.BorderFactory.createTitledBorder("Consulta Categorias"));

        jTableCateg.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Nome", "Motor", "Preço Dia", "Taxa Km", "Ar", "Direção", "Vidro"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableCateg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableCategMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableCateg);

        jButtonAtualizeTable.setText("Atualizar Tabela");
        jButtonAtualizeTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizeTableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelConsultaCategLayout = new javax.swing.GroupLayout(jPanelConsultaCateg);
        jPanelConsultaCateg.setLayout(jPanelConsultaCategLayout);
        jPanelConsultaCategLayout.setHorizontalGroup(
            jPanelConsultaCategLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConsultaCategLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelConsultaCategLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelConsultaCategLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonAtualizeTable)))
                .addContainerGap())
        );
        jPanelConsultaCategLayout.setVerticalGroup(
            jPanelConsultaCategLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConsultaCategLayout.createSequentialGroup()
                .addComponent(jButtonAtualizeTable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonCancel.setText("Cancelar");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        jButtonAlterar.setText("Alterar");
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelConsultaBotoesLayout = new javax.swing.GroupLayout(jPanelConsultaBotoes);
        jPanelConsultaBotoes.setLayout(jPanelConsultaBotoesLayout);
        jPanelConsultaBotoesLayout.setHorizontalGroup(
            jPanelConsultaBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConsultaBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelConsultaCateg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanelConsultaBotoesLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jButtonCancel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonAlterar)
                .addGap(38, 38, 38)
                .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        jPanelConsultaBotoesLayout.setVerticalGroup(
            jPanelConsultaBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConsultaBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelConsultaCateg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelConsultaBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAlterar)
                    .addComponent(jButtonCancel)
                    .addComponent(jButtonExcluir))
                .addGap(0, 69, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelConsultaBotoes);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        // TODO add your handling code here:

        this.dispose();//Fecha a Janela Atual
    }//GEN-LAST:event_jButtonCancelActionPerformed


    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        // TODO add your handling code here:

        if (jTableCateg.getSelectedRow() != -1) {
            new JFrameCadastroCategoria(pegarCategoria()).setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Não há registro selecionado na tabela!", "", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonAtualizeTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizeTableActionPerformed
        // TODO add your handling code here:
        atualizaTabela();

    }//GEN-LAST:event_jButtonAtualizeTableActionPerformed

    private void jTableCategMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCategMouseClicked
        // TODO add your handling code here:
        //Assim que for clicado qualquer linha do cadastro será habilitado os botões
        jButtonExcluir.setEnabled(true);
        jButtonAlterar.setEnabled(true);
    }//GEN-LAST:event_jTableCategMouseClicked

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        // TODO add your handling code here:

        if (jTableCateg.getSelectedRow() != -1) {
            //Confirmação se deseja realmente excluir
            int resp = JOptionPane.showConfirmDialog(rootPane, "Tem Certeza que deseja Excluir?");

            if (resp == 0) {//Somente apaga caso o verificador seja Sim

                //Pega o objeto da linha selecionada e retorna um array
                String categRemov[] = pegarCategoria();
                try {
                    //Pega a primeira posição do array que é iD e remove do banco
                    CategoriaControl.apagarCategoria(Integer.parseInt(categRemov[0]));

                    JOptionPane.showMessageDialog(null, "Registro Excluído Com Sucesso!");

                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao Excluir do Banco de dados: " + ex, "", JOptionPane.ERROR_MESSAGE);

                }
                //Atualiza Tabela do Banco de dados
                atualizaTabela();
            }
        } else {
            //Mensagem de aviso que não há registro selecionado
            JOptionPane.showMessageDialog(null, "Não há registro selecionado na tabela!", "", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    /**
     * @param args the command line arguments
     *
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
            java.util.logging.Logger.getLogger(JFrameConsultaCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameConsultaCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameConsultaCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameConsultaCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new JFrameConsultaCategoria().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonAtualizeTable;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JPanel jPanelConsultaBotoes;
    private javax.swing.JPanel jPanelConsultaCateg;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCateg;
    // End of variables declaration//GEN-END:variables
}
