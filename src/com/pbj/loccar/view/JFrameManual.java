/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pbj.loccar.view;

import com.pbj.loccar.control.NavegadorControl;
import com.pbj.loccar.control.RelatorioControl;
import javax.swing.JOptionPane;

/**
 *
 * @author Akr-Taku
 */
public class JFrameManual extends javax.swing.JFrame {

    /**
     * Creates new form JFrameRelatorioLocacao
     */
    public JFrameManual() {
        initComponents();
        jProgressBar.setVisible(false);
    }

    private void abreManual() {
        RelatorioControl rela = new RelatorioControl();
        Thread barra;
        barra = new Thread() {

            @Override
            public void run() {
                jProgressBar.setVisible(true);
                jProgressBar.setIndeterminate(true);
            }
        };
        Thread manual = new Thread() {
            @Override
            public void run() {

                jButtonAbrir.setEnabled(false);
                jButtonCancelar.setEnabled(false);
                try {
                    NavegadorControl.metodoBuscarhtml();
                    dispose();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao Buscar Navegador Relatório: " + ex, "", JOptionPane.ERROR_MESSAGE);
                }

            }
        };
        try {
            barra.start();
            manual.join();
            manual.start();

        } catch (InterruptedException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Abrir Manual: " + ex, "", JOptionPane.ERROR_MESSAGE);
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

        jPanelFrame = new javax.swing.JPanel();
        jPanelGeraManual = new javax.swing.JPanel();
        jButtonAbrir = new javax.swing.JButton();
        jProgressBar = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jButtonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerar Relatórios");
        setResizable(false);

        jPanelFrame.setBackground(new java.awt.Color(217, 217, 217));

        jPanelGeraManual.setBackground(new java.awt.Color(217, 217, 217));
        jPanelGeraManual.setBorder(javax.swing.BorderFactory.createTitledBorder("Gerar Relatórios"));

        jButtonAbrir.setText("Abrir Manual");
        jButtonAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAbrirActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pbj/loccar/others/manual/manualHtml/images/RentsoftLogo.PNG"))); // NOI18N
        jLabel1.setToolTipText("");

        javax.swing.GroupLayout jPanelGeraManualLayout = new javax.swing.GroupLayout(jPanelGeraManual);
        jPanelGeraManual.setLayout(jPanelGeraManualLayout);
        jPanelGeraManualLayout.setHorizontalGroup(
            jPanelGeraManualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGeraManualLayout.createSequentialGroup()
                .addGroup(jPanelGeraManualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelGeraManualLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelGeraManualLayout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(jPanelGeraManualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonAbrir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanelGeraManualLayout.setVerticalGroup(
            jPanelGeraManualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelGeraManualLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAbrir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelFrameLayout = new javax.swing.GroupLayout(jPanelFrame);
        jPanelFrame.setLayout(jPanelFrameLayout);
        jPanelFrameLayout.setHorizontalGroup(
            jPanelFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelGeraManual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelFrameLayout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(jButtonCancelar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelFrameLayout.setVerticalGroup(
            jPanelFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelGeraManual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonCancelar)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAbrirActionPerformed
        // TODO add your handling code here
        
            abreManual();

    }//GEN-LAST:event_jButtonAbrirActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameManual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameManual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameManual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameManual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new JFrameManual().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAbrir;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanelFrame;
    private javax.swing.JPanel jPanelGeraManual;
    private javax.swing.JProgressBar jProgressBar;
    // End of variables declaration//GEN-END:variables
}
