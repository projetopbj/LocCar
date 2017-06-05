/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pbj.loccar.view;

import com.pbj.loccar.control.CategoriaControl;
import java.text.NumberFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Akr-Taku
 */
public class JFrameCadastroCategoria extends javax.swing.JFrame {

    /**
     * Creates new form JFrameCadastroCategoria 
     */
  
    private int id;
    
    public JFrameCadastroCategoria() {        
        initComponents();
        jButtonAtualizar.setVisible(false);
    }
    public JFrameCadastroCategoria(String[] categ) {        
        initComponents();
        jButtonCadastro.setVisible(false);
        SetCampos(categ);

                
    }
    
    private void SetCampos(String[] categ){
        
        id = Integer.parseInt(categ[0]);
        txtNomeCateg.setText(categ[1]);
        txtValorDia.setText(categ[2]);
        txtKM.setText(categ[3]);
        jComboBoxAr.setSelectedItem((String) categ[4]);
        jComboBoxVidro.setSelectedItem((String) categ[5]);
        jComboBoxDirecaoH.setSelectedItem((String) categ[6]);
        
        
    }
    
    //Metodo serve para limpar os txt fields
    private void limpaCampos(){
        
        txtNomeCateg.setText("");
        txtValorDia.setText("");
        txtKM.setText("");
        jComboBoxAr.setSelectedIndex(0);
        jComboBoxVidro.setSelectedIndex(0);
        jComboBoxDirecaoH.setSelectedIndex(0);
        
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

        jLabel3 = new javax.swing.JLabel();
        jPanelCampoBotoes = new javax.swing.JPanel();
        jPanelCadastroCateg = new javax.swing.JPanel();
        jLabelNomeCateg = new javax.swing.JLabel();
        jLabelValorDia = new javax.swing.JLabel();
        txtNomeCateg = new javax.swing.JTextField();
        jLabelValorKMExc = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxAr = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jComboBoxDirecaoH = new javax.swing.JComboBox<>();
        jLabelVidroEletrico = new javax.swing.JLabel();
        jComboBoxVidro = new javax.swing.JComboBox<>();
        txtValorDia = new javax.swing.JFormattedTextField();
        txtKM = new javax.swing.JFormattedTextField();
        jButtonCancel = new javax.swing.JButton();
        jButtonCadastro = new javax.swing.JButton();
        jButtonAtualizar = new javax.swing.JButton();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanelCadastroCateg.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro Categoria"));

        jLabelNomeCateg.setText("Nome");

        jLabelValorDia.setText("Valor Dia");

        txtNomeCateg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeCategActionPerformed(evt);
            }
        });

        jLabelValorKMExc.setText("Valor Quilometro Execedido");

        jLabel5.setText("Ar Condicionado");

        jComboBoxAr.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sim", "Não" }));

        jLabel6.setText("Direção Hidráulica");

        jComboBoxDirecaoH.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sim", "Não" }));

        jLabelVidroEletrico.setText("Vidro Elétrico");

        jComboBoxVidro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sim", "Não" }));

        txtValorDia.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        txtKM.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtKM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKMActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCadastroCategLayout = new javax.swing.GroupLayout(jPanelCadastroCateg);
        jPanelCadastroCateg.setLayout(jPanelCadastroCategLayout);
        jPanelCadastroCategLayout.setHorizontalGroup(
            jPanelCadastroCategLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroCategLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCadastroCategLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNomeCateg)
                    .addComponent(txtNomeCateg, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelValorDia)
                    .addComponent(jLabelValorKMExc)
                    .addComponent(txtKM, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValorDia, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelCadastroCategLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabelVidroEletrico)
                    .addComponent(jComboBoxVidro, 0, 158, Short.MAX_VALUE)
                    .addComponent(jComboBoxDirecaoH, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBoxAr, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanelCadastroCategLayout.setVerticalGroup(
            jPanelCadastroCategLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroCategLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCadastroCategLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomeCateg)
                    .addComponent(jLabel5))
                .addGap(3, 3, 3)
                .addGroup(jPanelCadastroCategLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeCateg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxAr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelCadastroCategLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelCadastroCategLayout.createSequentialGroup()
                        .addComponent(jLabelVidroEletrico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxVidro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxDirecaoH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelCadastroCategLayout.createSequentialGroup()
                        .addComponent(jLabelValorDia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtValorDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelValorKMExc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtKM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonCancel.setText("Cancelar");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        jButtonCadastro.setText("Cadastrar");
        jButtonCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastroActionPerformed(evt);
            }
        });

        jButtonAtualizar.setText("Atualizar");
        jButtonAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCampoBotoesLayout = new javax.swing.GroupLayout(jPanelCampoBotoes);
        jPanelCampoBotoes.setLayout(jPanelCampoBotoesLayout);
        jPanelCampoBotoesLayout.setHorizontalGroup(
            jPanelCampoBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCampoBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelCadastroCateg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanelCampoBotoesLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jButtonCancel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonAtualizar)
                .addGap(18, 18, 18)
                .addComponent(jButtonCadastro)
                .addGap(26, 26, 26))
        );
        jPanelCampoBotoesLayout.setVerticalGroup(
            jPanelCampoBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCampoBotoesLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanelCadastroCateg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanelCampoBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancel)
                    .addComponent(jButtonCadastro)
                    .addComponent(jButtonAtualizar))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 28;
        gridBagConstraints.ipady = 17;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(jPanelCampoBotoes, gridBagConstraints);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeCategActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeCategActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeCategActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        // Botão que fecha a teka Atual
        
        this.dispose();
    }//GEN-LAST:event_jButtonCancelActionPerformed
    //Verifica o objeto passado com "SIM" e caso posivito ele retorna true;
   private boolean verifiX(Object obj){
       
       boolean bool = false;
       
       if("Sim".equals(obj))
         {  
             bool = true; 
         
         }
       
       
       return bool;
   }
    
    
    private void jButtonCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastroActionPerformed
        // Botão que salva o Usuário no Banco de dados.
        if ("".equals(txtNomeCateg.getText()) || "".equals(txtValorDia.getText()) || "".equals(txtKM.getText()))
        {
           JOptionPane.showMessageDialog(null, "Não é Possivel Salvar Campos Vazios","",JOptionPane.ERROR_MESSAGE);
        }else{ 
            
            //Verifica se o valor da variavel é sim ou não e retorna true ou false;
            boolean ar = verifiX((String) jComboBoxAr.getSelectedItem());
            boolean vidro = verifiX((String) jComboBoxVidro.getSelectedItem());
            boolean direcao = verifiX((String) jComboBoxDirecaoH.getSelectedItem());

            String dia = txtValorDia.getText().replace(",", ".");
            String km = txtKM.getText().replace(",",".");
            CategoriaControl.salvarCategoria(txtNomeCateg.getText(), Double.parseDouble(dia), Double.parseDouble(km), ar, vidro, direcao);
            
            //Pergunta se deseja cadastrar outra categoria
            int resp = JOptionPane.showConfirmDialog(null, "Deseja cadastrar Nova Categoria?");
            //Se responder Não a Janela fecha
            if (resp == 1 ||resp == 2 ){  this.dispose(); }
            
            limpaCampos();
            
        }
    }//GEN-LAST:event_jButtonCadastroActionPerformed

    private void txtKMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKMActionPerformed

    private void jButtonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarActionPerformed
        // Atualiza a Categoria Recebendo ela diretamente da aba de consulta
                   
        //Verifica se o valor da variavel é sim ou não e retorna true ou false;
        if ("".equals(txtNomeCateg.getText()) || "".equals(txtValorDia.getText()) || "".equals(txtKM.getText()))
        {
           JOptionPane.showMessageDialog(null, "Não é Possivel Salvar Campos Vazios","",JOptionPane.ERROR_MESSAGE);
        }else{ 
            boolean ar = verifiX((String) jComboBoxAr.getSelectedItem());
            boolean vidro = verifiX((String) jComboBoxVidro.getSelectedItem());
            boolean direcao = verifiX((String) jComboBoxDirecaoH.getSelectedItem());
            //Troca o padrão numerico brasileiro para Estrangeiro e salva no banco
            String dia = txtValorDia.getText().replace(",", ".");
            String km = txtKM.getText().replace(",",".");
            //Chama metodo para atualizar o banco
            CategoriaControl.atualizarCategoria(id,txtNomeCateg.getText(), Double.parseDouble(dia), 
                    Double.parseDouble(km),  ar, vidro, direcao);
        
            this.dispose();
        }
        
        
    }//GEN-LAST:event_jButtonAtualizarActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameCadastroCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameCadastroCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameCadastroCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameCadastroCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameCadastroCategoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtualizar;
    private javax.swing.JButton jButtonCadastro;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JComboBox<String> jComboBoxAr;
    private javax.swing.JComboBox<String> jComboBoxDirecaoH;
    private javax.swing.JComboBox<String> jComboBoxVidro;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelNomeCateg;
    private javax.swing.JLabel jLabelValorDia;
    private javax.swing.JLabel jLabelValorKMExc;
    private javax.swing.JLabel jLabelVidroEletrico;
    private javax.swing.JPanel jPanelCadastroCateg;
    private javax.swing.JPanel jPanelCampoBotoes;
    private javax.swing.JFormattedTextField txtKM;
    private javax.swing.JTextField txtNomeCateg;
    private javax.swing.JFormattedTextField txtValorDia;
    // End of variables declaration//GEN-END:variables
}
