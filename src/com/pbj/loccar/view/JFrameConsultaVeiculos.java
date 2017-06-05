/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pbj.loccar.view;

import com.pbj.loccar.control.VeiculoControl;
import com.pbj.loccar.view.tables.VeiculoTable;
import javax.swing.JOptionPane;

/**
 *
 * @author Akr-Taku
 * 
 * JFrame de COnsulta de Veiculos
 */
public final class JFrameConsultaVeiculos extends javax.swing.JFrame {

    /**
     * Creates new form JFrameConsultaVeiculos
     * 
     * 
     */
    VeiculoTable tableModel;
    
    public JFrameConsultaVeiculos() {
        initComponents();
        
        
        tableModel = new VeiculoTable(VeiculoControl.lerVeiculo());
        jTableVeiculos.setModel(tableModel);
        
        //Inicia os Botões como Não clicaveis;
        jButtonExcluir.setEnabled(false);
        jButtonEditar.setEnabled(false);
        //Seta o Rádio Button do modelo como selecionado por padrão
        jRadioButtonModelo.setSelected(true);
    }
    private String[] pegarVeiculo(){
        if(jTableVeiculos.getSelectedRow() != -1 ){      
            String veic[] = tableModel.getVeiculo(jTableVeiculos.getSelectedRow());
     
        return veic;
        }else{
            return null;
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
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroupFiltra = new javax.swing.ButtonGroup();
        jPanelCV = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableVeiculos = new javax.swing.JTable();
        jPanelConsVeic = new javax.swing.JPanel();
        jButtonEditar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jPanelPesq = new javax.swing.JPanel();
        txtConsulta = new javax.swing.JTextField();
        jButtonBusca = new javax.swing.JButton();
        jPanelFilt = new javax.swing.JPanel();
        jRadioButtonAno = new javax.swing.JRadioButton();
        jRadioButtonModelo = new javax.swing.JRadioButton();
        jPanelList = new javax.swing.JPanel();
        jComboBoxListar = new javax.swing.JComboBox<>();
        jButtonAtualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta Veículos");
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jTableVeiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Modelo", "Ano", "Nº Portas", "Placa", "Cor", "Categoria", "Disponível"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableVeiculos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableVeiculosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableVeiculos);

        jButtonEditar.setText("Editar");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonCancel.setText("Cancelar");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelConsVeicLayout = new javax.swing.GroupLayout(jPanelConsVeic);
        jPanelConsVeic.setLayout(jPanelConsVeicLayout);
        jPanelConsVeicLayout.setHorizontalGroup(
            jPanelConsVeicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelConsVeicLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jButtonCancel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jPanelConsVeicLayout.setVerticalGroup(
            jPanelConsVeicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConsVeicLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelConsVeicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEditar)
                    .addComponent(jButtonExcluir)
                    .addComponent(jButtonCancel))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanelPesq.setBorder(javax.swing.BorderFactory.createTitledBorder("Consultar Veículos"));

        jButtonBusca.setText("Buscar");
        jButtonBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscaActionPerformed(evt);
            }
        });

        jPanelFilt.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtrar Por"));

        buttonGroupFiltra.add(jRadioButtonAno);
        jRadioButtonAno.setText("Ano");

        buttonGroupFiltra.add(jRadioButtonModelo);
        jRadioButtonModelo.setText("Modelo");
        jRadioButtonModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonModeloActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelFiltLayout = new javax.swing.GroupLayout(jPanelFilt);
        jPanelFilt.setLayout(jPanelFiltLayout);
        jPanelFiltLayout.setHorizontalGroup(
            jPanelFiltLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFiltLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFiltLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButtonModelo)
                    .addComponent(jRadioButtonAno))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelFiltLayout.setVerticalGroup(
            jPanelFiltLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFiltLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButtonAno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 3, Short.MAX_VALUE)
                .addComponent(jRadioButtonModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanelList.setBorder(javax.swing.BorderFactory.createTitledBorder("Listar"));

        jComboBoxListar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Disponíveis" }));
        jComboBoxListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxListarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelListLayout = new javax.swing.GroupLayout(jPanelList);
        jPanelList.setLayout(jPanelListLayout);
        jPanelListLayout.setHorizontalGroup(
            jPanelListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBoxListar, 0, 80, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelListLayout.setVerticalGroup(
            jPanelListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBoxListar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelPesqLayout = new javax.swing.GroupLayout(jPanelPesq);
        jPanelPesq.setLayout(jPanelPesqLayout);
        jPanelPesqLayout.setHorizontalGroup(
            jPanelPesqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPesqLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonBusca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelFilt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelPesqLayout.setVerticalGroup(
            jPanelPesqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPesqLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanelPesqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBusca))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelPesqLayout.createSequentialGroup()
                .addGroup(jPanelPesqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelFilt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jButtonAtualizar.setText("Atualizar Tabela");
        jButtonAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCVLayout = new javax.swing.GroupLayout(jPanelCV);
        jPanelCV.setLayout(jPanelCVLayout);
        jPanelCVLayout.setHorizontalGroup(
            jPanelCVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCVLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonAtualizar)
                .addGap(20, 20, 20))
            .addGroup(jPanelCVLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelConsVeic, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelPesq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanelCVLayout.setVerticalGroup(
            jPanelCVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCVLayout.createSequentialGroup()
                .addComponent(jPanelPesq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAtualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanelConsVeic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 204;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(jPanelCV, gridBagConstraints);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        // TODO add your handling code here:
        if(jTableVeiculos.getSelectedRow() != -1 ){ 
            int resp =  JOptionPane.showConfirmDialog(rootPane, "Tem Certeza que deseja Excluir?");
            if (resp == 0){//Somente apaga caso o verificador seja Sim
             
                //Pega o objeto da linha selecionada e retorna um array
                String veicRemove[] = pegarVeiculo();
                //Pega a primeira posição do array que é iD e remove do banco
                VeiculoControl.apagarVeiculo(Integer.parseInt(veicRemove[0]));
                //Atualiza Tabela do Banco de dados
                tableModel.removeAll();
                tableModel.addLista(VeiculoControl.lerVeiculo());
            }else{
            //Mensagem de aviso que não há registro selecionado
            JOptionPane.showMessageDialog(null, "Não há registro selecionado na tabela!","",JOptionPane.WARNING_MESSAGE);
            }
        }
  
      
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jRadioButtonModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonModeloActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        // TODO add your handling code here:
        
         this.dispose();
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jButtonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarActionPerformed
        // TODO add your handling code here:
        tableModel.removeAll();
        tableModel.addLista(VeiculoControl.lerVeiculo());
        txtConsulta.setText("");
        
    }//GEN-LAST:event_jButtonAtualizarActionPerformed

    private void jTableVeiculosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableVeiculosMouseClicked
        // Habilita os botões de editar e excluir ao clicar com o mouse;        
        jButtonExcluir.setEnabled(true);
        jButtonEditar.setEnabled(true);
    }//GEN-LAST:event_jTableVeiculosMouseClicked

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        // TODO add your handling code here:
        if(jTableVeiculos.getSelectedRow() != -1 ){ 
             
                //Pega o objeto da linha selecionada e retorna um array
                new JFrameCadastroVeiculo(pegarVeiculo()).setVisible(true);

        }else{
            //Mensagem de aviso que não há registro selecionado
            JOptionPane.showMessageDialog(null, "Não há registro selecionado na tabela!","",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jComboBoxListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxListarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxListarActionPerformed

    private void jButtonBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscaActionPerformed
        // TODO add your handling code here:
        // Cai se a seleção estiver em disponiveis o radio tiver em Ano
        if("Disponíveis".equals(jComboBoxListar.getSelectedItem()) && jRadioButtonAno.isSelected()){
            
            tableModel.removeAll();
            tableModel.addLista(VeiculoControl.lerVeiculo(Integer.parseInt(txtConsulta.getText()), false));
            txtConsulta.setText("");
            //Cai se tiver em todos e o radio no Ano
        }else if(jRadioButtonAno.isSelected() && !"".equals(txtConsulta.getText())){
            
            tableModel.removeAll();
            tableModel.addLista(VeiculoControl.lerVeiculo(Integer.parseInt(txtConsulta.getText())));
            txtConsulta.setText("");
            //Cai nos disponiveis e se tiver no Modelo
        }else if("Disponíveis".equals(jComboBoxListar.getSelectedItem()) && jRadioButtonModelo.isSelected() ){
            tableModel.removeAll();
            tableModel.addLista(VeiculoControl.lerVeiculo(txtConsulta.getText(), false));   
            txtConsulta.setText("");
            //Cai no todos e se tiver no Modelo
        }else if(jRadioButtonModelo.isSelected() && !"".equals(txtConsulta.getText())){
            tableModel.removeAll();
            tableModel.addLista(VeiculoControl.lerVeiculo(txtConsulta.getText())); 
            txtConsulta.setText("");
           // Cai quando Somente o campo disponiveis está selecionado
        }else if ("Disponíveis".equals(jComboBoxListar.getSelectedItem())){
            tableModel.removeAll();
            tableModel.addLista(VeiculoControl.lerVeiculo(false));
            txtConsulta.setText("");
        }else{
            tableModel.removeAll();
            tableModel.addLista(VeiculoControl.lerVeiculo());
            txtConsulta.setText("");
        }
            
    }//GEN-LAST:event_jButtonBuscaActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameConsultaVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameConsultaVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameConsultaVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameConsultaVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameConsultaVeiculos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupFiltra;
    private javax.swing.JButton jButtonAtualizar;
    private javax.swing.JButton jButtonBusca;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JComboBox<String> jComboBoxListar;
    private javax.swing.JPanel jPanelCV;
    private javax.swing.JPanel jPanelConsVeic;
    private javax.swing.JPanel jPanelFilt;
    private javax.swing.JPanel jPanelList;
    private javax.swing.JPanel jPanelPesq;
    private javax.swing.JRadioButton jRadioButtonAno;
    private javax.swing.JRadioButton jRadioButtonModelo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableVeiculos;
    private javax.swing.JTextField txtConsulta;
    // End of variables declaration//GEN-END:variables
}
