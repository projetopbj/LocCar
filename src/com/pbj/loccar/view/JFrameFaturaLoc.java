/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pbj.loccar.view;

import com.pbj.loccar.control.RelatorioControl;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;

/**
 *
 * @author Akr-Taku
 */
public final class JFrameFaturaLoc extends javax.swing.JFrame {

    /**
     * Creates new form JFrameFaturaLoc
     */
    public JFrameFaturaLoc() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroupFilt = new javax.swing.ButtonGroup();
        jPanelFatBotoes = new javax.swing.JPanel();
        jPanelGerarFat = new javax.swing.JPanel();
        jLabelCliente = new javax.swing.JLabel();
        txtBusc = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();
        jLabelCodAlug = new javax.swing.JLabel();
        jComboBoxGetAlug = new javax.swing.JComboBox<>();
        jLabelVeic = new javax.swing.JLabel();
        txtGetVeic = new javax.swing.JTextField();
        jPanelFilt = new javax.swing.JPanel();
        jRadioButtonCPF = new javax.swing.JRadioButton();
        jRadioButtonNome = new javax.swing.JRadioButton();
        jLabelDatI = new javax.swing.JLabel();
        jLabelDatF = new javax.swing.JLabel();
        txtGetGataI = new javax.swing.JFormattedTextField();
        txtGetDataF = new javax.swing.JFormattedTextField();
        jButtonGerarFatLoc = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerar Fatura de Locação");
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanelGerarFat.setBorder(javax.swing.BorderFactory.createTitledBorder("Gerar Fatura"));
        jPanelGerarFat.setToolTipText("");

        jLabelCliente.setText("Cliente");

        txtBusc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscActionPerformed(evt);
            }
        });

        jButtonBuscar.setText("Buscar");

        jLabelCodAlug.setText("Código do Aluguel");

        jComboBoxGetAlug.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "11111111", "00000222", "11112223" }));

        jLabelVeic.setText("Veiculo");

        txtGetVeic.setEditable(false);
        txtGetVeic.setBackground(new java.awt.Color(204, 204, 204));
        txtGetVeic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGetVeicActionPerformed(evt);
            }
        });

        jPanelFilt.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtrar Por"));

        buttonGroupFilt.add(jRadioButtonCPF);
        jRadioButtonCPF.setText("CPF");
        jRadioButtonCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonCPFActionPerformed(evt);
            }
        });

        buttonGroupFilt.add(jRadioButtonNome);
        jRadioButtonNome.setText("Nome");

        javax.swing.GroupLayout jPanelFiltLayout = new javax.swing.GroupLayout(jPanelFilt);
        jPanelFilt.setLayout(jPanelFiltLayout);
        jPanelFiltLayout.setHorizontalGroup(
            jPanelFiltLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFiltLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRadioButtonNome)
                .addContainerGap())
            .addGroup(jPanelFiltLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButtonCPF)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelFiltLayout.setVerticalGroup(
            jPanelFiltLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFiltLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButtonCPF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonNome)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jLabelDatI.setText("Data de Entrega");

        jLabelDatF.setText("Data de Devolução");

        txtGetGataI.setEditable(false);
        txtGetGataI.setBackground(new java.awt.Color(204, 204, 204));
        txtGetGataI.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.MEDIUM))));
        txtGetGataI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGetGataIActionPerformed(evt);
            }
        });

        txtGetDataF.setEditable(false);
        txtGetDataF.setBackground(new java.awt.Color(204, 204, 204));
        txtGetDataF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.MEDIUM))));
        txtGetDataF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGetDataFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelGerarFatLayout = new javax.swing.GroupLayout(jPanelGerarFat);
        jPanelGerarFat.setLayout(jPanelGerarFatLayout);
        jPanelGerarFatLayout.setHorizontalGroup(
            jPanelGerarFatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGerarFatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelGerarFatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelGerarFatLayout.createSequentialGroup()
                        .addGroup(jPanelGerarFatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelGerarFatLayout.createSequentialGroup()
                                .addComponent(txtBusc, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE))
                            .addGroup(jPanelGerarFatLayout.createSequentialGroup()
                                .addGroup(jPanelGerarFatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelCliente)
                                    .addComponent(jLabelCodAlug))
                                .addGap(149, 149, 149)
                                .addComponent(jLabelVeic)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(10, 10, 10)
                        .addComponent(jPanelFilt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(jPanelGerarFatLayout.createSequentialGroup()
                        .addGroup(jPanelGerarFatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxGetAlug, 0, 217, Short.MAX_VALUE)
                            .addComponent(jLabelDatI)
                            .addComponent(txtGetGataI))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelGerarFatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelGerarFatLayout.createSequentialGroup()
                                .addComponent(txtGetVeic, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanelGerarFatLayout.createSequentialGroup()
                                .addGroup(jPanelGerarFatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelDatF)
                                    .addComponent(txtGetDataF, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        jPanelGerarFatLayout.setVerticalGroup(
            jPanelGerarFatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGerarFatLayout.createSequentialGroup()
                .addGroup(jPanelGerarFatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelGerarFatLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabelCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelGerarFatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBusc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonBuscar))
                        .addGap(36, 36, 36)
                        .addGroup(jPanelGerarFatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCodAlug)
                            .addComponent(jLabelVeic)))
                    .addGroup(jPanelGerarFatLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanelFilt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelGerarFatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxGetAlug, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGetVeic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanelGerarFatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDatI)
                    .addComponent(jLabelDatF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelGerarFatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtGetDataF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGetGataI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(129, Short.MAX_VALUE))
        );

        jButtonGerarFatLoc.setText("Gerar Fatura de Locação");
        jButtonGerarFatLoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGerarFatLocActionPerformed(evt);
            }
        });

        jButtonCancel.setText("Cancelar");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelFatBotoesLayout = new javax.swing.GroupLayout(jPanelFatBotoes);
        jPanelFatBotoes.setLayout(jPanelFatBotoesLayout);
        jPanelFatBotoesLayout.setHorizontalGroup(
            jPanelFatBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFatBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelGerarFat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFatBotoesLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonGerarFatLoc, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        jPanelFatBotoesLayout.setVerticalGroup(
            jPanelFatBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFatBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelGerarFat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanelFatBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGerarFatLoc)
                    .addComponent(jButtonCancel))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 18;
        gridBagConstraints.ipady = 24;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(jPanelFatBotoes, gridBagConstraints);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscActionPerformed

    private void jRadioButtonCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonCPFActionPerformed

    private void txtGetVeicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGetVeicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGetVeicActionPerformed

    private void txtGetGataIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGetGataIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGetGataIActionPerformed

    private void txtGetDataFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGetDataFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGetDataFActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        // TODO add your handling code here:
         this.dispose();
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jButtonGerarFatLocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGerarFatLocActionPerformed
    
            RelatorioControl rel = new RelatorioControl();
            rel.relatorio("Locacoes");
    }//GEN-LAST:event_jButtonGerarFatLocActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameFaturaLoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameFaturaLoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameFaturaLoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameFaturaLoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameFaturaLoc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupFilt;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonGerarFatLoc;
    private javax.swing.JComboBox<String> jComboBoxGetAlug;
    private javax.swing.JLabel jLabelCliente;
    private javax.swing.JLabel jLabelCodAlug;
    private javax.swing.JLabel jLabelDatF;
    private javax.swing.JLabel jLabelDatI;
    private javax.swing.JLabel jLabelVeic;
    private javax.swing.JPanel jPanelFatBotoes;
    private javax.swing.JPanel jPanelFilt;
    private javax.swing.JPanel jPanelGerarFat;
    private javax.swing.JRadioButton jRadioButtonCPF;
    private javax.swing.JRadioButton jRadioButtonNome;
    private javax.swing.JTextField txtBusc;
    private javax.swing.JFormattedTextField txtGetDataF;
    private javax.swing.JFormattedTextField txtGetGataI;
    private javax.swing.JTextField txtGetVeic;
    // End of variables declaration//GEN-END:variables
}
