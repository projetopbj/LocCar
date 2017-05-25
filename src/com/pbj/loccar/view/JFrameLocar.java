/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pbj.loccar.view;


/**
 *
 * @author Akr-Taku
 */
public final class JFrameLocar extends javax.swing.JFrame {

    /**
     * Creates new form JFrameLocar
     */
    public JFrameLocar() {
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

        jPanelInfoLoc = new javax.swing.JPanel();
        jPanelInfoLoc2 = new javax.swing.JPanel();
        jComboBoxEscClient = new javax.swing.JComboBox<>();
        jLabelEscCLient = new javax.swing.JLabel();
        jLabelCPF = new javax.swing.JLabel();
        jLabelEscVeic = new javax.swing.JLabel();
        jLabelPlaca = new javax.swing.JLabel();
        txtGetCPF = new javax.swing.JFormattedTextField();
        jLabelCor = new javax.swing.JLabel();
        jLabelCateg = new javax.swing.JLabel();
        jComboBoxEscVeic = new javax.swing.JComboBox<>();
        txtGetPlaca = new javax.swing.JTextField();
        txtGetCategoria = new javax.swing.JTextField();
        txtGetCor = new javax.swing.JTextField();
        jLabelValorDiaria = new javax.swing.JLabel();
        jComboBoxDesc = new javax.swing.JComboBox<>();
        jLabelDesco = new javax.swing.JLabel();
        txtGetValorDiaria = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDias = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtFDataLoc = new javax.swing.JFormattedTextField();
        txtFSubTotal = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDataDevol = new javax.swing.JFormattedTextField();
        jButtonLocar = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Locar Carro");
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanelInfoLoc2.setBorder(javax.swing.BorderFactory.createTitledBorder("Locação"));

        jComboBoxEscClient.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cliente1", "Cliente2", "ClienteEtc." }));

        jLabelEscCLient.setText("Escolher Cliente");

        jLabelCPF.setText("CPF");

        jLabelEscVeic.setText("Escolher Veículo");

        jLabelPlaca.setText("Placa");

        txtGetCPF.setEditable(false);
        txtGetCPF.setBackground(new java.awt.Color(204, 204, 204));
        try {
            txtGetCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabelCor.setText("Cor");

        jLabelCateg.setText("Categoria");

        jComboBoxEscVeic.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Carro1", "Carro2", "Carro3", "CarroEtc." }));

        txtGetPlaca.setEditable(false);
        txtGetPlaca.setBackground(new java.awt.Color(204, 204, 204));

        txtGetCategoria.setEditable(false);
        txtGetCategoria.setBackground(new java.awt.Color(204, 204, 204));

        txtGetCor.setEditable(false);
        txtGetCor.setBackground(new java.awt.Color(204, 204, 204));
        txtGetCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGetCorActionPerformed(evt);
            }
        });

        jLabelValorDiaria.setText("Valor Diária");

        jComboBoxDesc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não", "Sim" }));
        jComboBoxDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDescActionPerformed(evt);
            }
        });

        jLabelDesco.setText("Desconto");

        txtGetValorDiaria.setEditable(false);
        txtGetValorDiaria.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanelInfoLoc2Layout = new javax.swing.GroupLayout(jPanelInfoLoc2);
        jPanelInfoLoc2.setLayout(jPanelInfoLoc2Layout);
        jPanelInfoLoc2Layout.setHorizontalGroup(
            jPanelInfoLoc2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInfoLoc2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelInfoLoc2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInfoLoc2Layout.createSequentialGroup()
                        .addGroup(jPanelInfoLoc2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelInfoLoc2Layout.createSequentialGroup()
                                .addGroup(jPanelInfoLoc2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabelEscCLient)
                                    .addComponent(jLabelEscVeic)
                                    .addComponent(jComboBoxEscClient, 0, 140, Short.MAX_VALUE)
                                    .addComponent(jComboBoxEscVeic, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanelInfoLoc2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtGetCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelCPF, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtGetPlaca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelPlaca, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGroup(jPanelInfoLoc2Layout.createSequentialGroup()
                                .addGroup(jPanelInfoLoc2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtGetCor, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelCor)
                                    .addComponent(jLabelDesco))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanelInfoLoc2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabelCateg)
                                    .addComponent(jLabelValorDiaria)
                                    .addComponent(txtGetValorDiaria)
                                    .addComponent(txtGetCategoria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))))
                        .addGap(63, 63, 63))
                    .addGroup(jPanelInfoLoc2Layout.createSequentialGroup()
                        .addComponent(jComboBoxDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanelInfoLoc2Layout.setVerticalGroup(
            jPanelInfoLoc2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInfoLoc2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelInfoLoc2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEscCLient)
                    .addComponent(jLabelCPF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelInfoLoc2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxEscClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGetCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelInfoLoc2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEscVeic)
                    .addComponent(jLabelPlaca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelInfoLoc2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxEscVeic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGetPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelInfoLoc2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCateg)
                    .addComponent(jLabelCor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelInfoLoc2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGetCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGetCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelInfoLoc2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelValorDiaria)
                    .addComponent(jLabelDesco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelInfoLoc2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGetValorDiaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setText("Data do Aluguel");

        jLabel2.setText("Dias");

        txtDias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiasActionPerformed(evt);
            }
        });

        jLabel3.setText("SubTotal");

        txtFDataLoc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.MEDIUM))));

        txtFSubTotal.setEditable(false);
        txtFSubTotal.setBackground(new java.awt.Color(204, 204, 204));
        txtFSubTotal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("¤#,##0.00"))));

        jLabel4.setText("Data de Devolução");

        txtDataDevol.setEditable(false);
        txtDataDevol.setBackground(new java.awt.Color(204, 204, 204));
        txtDataDevol.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.MEDIUM))));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtFDataLoc, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel4))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtDias, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtDataDevol, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtFSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFDataLoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDataDevol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonLocar.setText("Locar");

        jButtonCancel.setText("Cancelar");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelInfoLocLayout = new javax.swing.GroupLayout(jPanelInfoLoc);
        jPanelInfoLoc.setLayout(jPanelInfoLocLayout);
        jPanelInfoLocLayout.setHorizontalGroup(
            jPanelInfoLocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInfoLocLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelInfoLocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelInfoLoc2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInfoLocLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jButtonCancel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonLocar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        jPanelInfoLocLayout.setVerticalGroup(
            jPanelInfoLocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInfoLocLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanelInfoLoc2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelInfoLocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonLocar)
                    .addComponent(jButtonCancel))
                .addGap(42, 42, 42))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 29;
        gridBagConstraints.ipady = 48;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(jPanelInfoLoc, gridBagConstraints);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtGetCorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGetCorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGetCorActionPerformed

    private void jComboBoxDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDescActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxDescActionPerformed

    private void txtDiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiasActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        // TODO add your handling code here:
         this.dispose();
    }//GEN-LAST:event_jButtonCancelActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameLocar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameLocar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameLocar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameLocar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameLocar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonLocar;
    private javax.swing.JComboBox<String> jComboBoxDesc;
    private javax.swing.JComboBox<String> jComboBoxEscClient;
    private javax.swing.JComboBox<String> jComboBoxEscVeic;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelCPF;
    private javax.swing.JLabel jLabelCateg;
    private javax.swing.JLabel jLabelCor;
    private javax.swing.JLabel jLabelDesco;
    private javax.swing.JLabel jLabelEscCLient;
    private javax.swing.JLabel jLabelEscVeic;
    private javax.swing.JLabel jLabelPlaca;
    private javax.swing.JLabel jLabelValorDiaria;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelInfoLoc;
    private javax.swing.JPanel jPanelInfoLoc2;
    private javax.swing.JFormattedTextField txtDataDevol;
    private javax.swing.JTextField txtDias;
    private javax.swing.JFormattedTextField txtFDataLoc;
    private javax.swing.JFormattedTextField txtFSubTotal;
    private javax.swing.JFormattedTextField txtGetCPF;
    private javax.swing.JTextField txtGetCategoria;
    private javax.swing.JTextField txtGetCor;
    private javax.swing.JTextField txtGetPlaca;
    private javax.swing.JTextField txtGetValorDiaria;
    // End of variables declaration//GEN-END:variables
}
