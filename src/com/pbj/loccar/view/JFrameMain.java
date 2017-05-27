/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pbj.loccar.view;

import com.pbj.loccar.util.DataHora;



/**
 *
 * @author Akr-Taku
 */
public final class JFrameMain extends javax.swing.JFrame {

    /**
     * Creates new form JFrameMain
     */
    
    
    public JFrameMain() {      
        initComponents();
        jMenuBarBarraPrincipal.setVisible(false);
                jPanelDataHora.setVisible(false);

        
    }
         

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelLogin = new javax.swing.JPanel();
        jLabelLogin = new javax.swing.JLabel();
        jLabelSenha = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        jButtonLogar = new javax.swing.JButton();
        txtSenha = new javax.swing.JPasswordField();
        jPanelDataHora = new javax.swing.JPanel();
        jLabelData = new javax.swing.JLabel();
        jLabelHora = new javax.swing.JLabel();
        jMenuBarBarraPrincipal = new javax.swing.JMenuBar();
        jMenuLogin = new javax.swing.JMenu();
        jMenuDeslogar = new javax.swing.JMenuItem();
        jMenuSair = new javax.swing.JMenuItem();
        jMenuCadastros = new javax.swing.JMenu();
        jMenuItemCadasCliente = new javax.swing.JMenuItem();
        jMenuItemCadasVeiculo = new javax.swing.JMenuItem();
        jMenuCadastroCategoria = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuConsultas = new javax.swing.JMenu();
        jMenuConsClientes = new javax.swing.JMenuItem();
        jMenuConsVeiculos = new javax.swing.JMenuItem();
        jMenuConsultaCategorias = new javax.swing.JMenuItem();
        jMenuLocacao = new javax.swing.JMenu();
        jMenuItemLocar = new javax.swing.JMenuItem();
        jMenuItemDevolver = new javax.swing.JMenuItem();
        jMenuRelatorios = new javax.swing.JMenu();
        jMenuFatLoc = new javax.swing.JMenuItem();
        jMenuAjuda = new javax.swing.JMenu();
        jMenuConfigBD = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LocCar");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanelLogin.setBackground(new java.awt.Color(255, 255, 255));
        jPanelLogin.setBorder(javax.swing.BorderFactory.createTitledBorder("Autentificação"));

        jLabelLogin.setText("Login");

        jLabelSenha.setText("Senha");

        txtLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoginActionPerformed(evt);
            }
        });

        jButtonLogar.setText("Logar");
        jButtonLogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogarActionPerformed(evt);
            }
        });

        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelLoginLayout = new javax.swing.GroupLayout(jPanelLogin);
        jPanelLogin.setLayout(jPanelLoginLayout);
        jPanelLoginLayout.setHorizontalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLoginLayout.createSequentialGroup()
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLoginLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelSenha)
                            .addComponent(jLabelLogin))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                            .addComponent(txtSenha)))
                    .addGroup(jPanelLoginLayout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jButtonLogar)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanelLoginLayout.setVerticalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLoginLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLogin)
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSenha))
                .addGap(31, 31, 31)
                .addComponent(jButtonLogar)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanelDataHora.setBackground(new java.awt.Color(51, 51, 51));
        jPanelDataHora.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelDataHora.setFocusable(false);
        jPanelDataHora.setPreferredSize(new java.awt.Dimension(120, 110));

        jLabelData.setBackground(new java.awt.Color(255, 255, 255));
        jLabelData.setFont(new java.awt.Font("Meiryo", 3, 12)); // NOI18N
        jLabelData.setForeground(new java.awt.Color(204, 204, 204));
        jLabelData.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelData.setText("Data");

        jLabelHora.setFont(new java.awt.Font("Meiryo", 0, 22)); // NOI18N
        jLabelHora.setForeground(new java.awt.Color(204, 204, 204));
        jLabelHora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelHora.setText("Hora");

        javax.swing.GroupLayout jPanelDataHoraLayout = new javax.swing.GroupLayout(jPanelDataHora);
        jPanelDataHora.setLayout(jPanelDataHoraLayout);
        jPanelDataHoraLayout.setHorizontalGroup(
            jPanelDataHoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelDataHoraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelHora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelDataHoraLayout.setVerticalGroup(
            jPanelDataHoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDataHoraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelHora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabelData, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenuBarBarraPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        jMenuLogin.setBorder(null);
        jMenuLogin.setForeground(new java.awt.Color(51, 102, 0));
        jMenuLogin.setText("[Logado]");

        jMenuDeslogar.setText("Deslogar");
        jMenuDeslogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuDeslogarActionPerformed(evt);
            }
        });
        jMenuLogin.add(jMenuDeslogar);

        jMenuSair.setText("Sair");
        jMenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSairActionPerformed(evt);
            }
        });
        jMenuLogin.add(jMenuSair);

        jMenuBarBarraPrincipal.add(jMenuLogin);

        jMenuCadastros.setText("Cadastro");

        jMenuItemCadasCliente.setText("Cadastrar Cliente");
        jMenuItemCadasCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadasClienteActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemCadasCliente);

        jMenuItemCadasVeiculo.setText("Cadastrar Veiculo");
        jMenuItemCadasVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadasVeiculoActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemCadasVeiculo);

        jMenuCadastroCategoria.setText("Cadastrar Categoria");
        jMenuCadastroCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCadastroCategoriaActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuCadastroCategoria);
        jMenuCadastros.add(jSeparator1);

        jMenuItem1.setText("Cadastrar Usuário");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItem1);

        jMenuBarBarraPrincipal.add(jMenuCadastros);

        jMenuConsultas.setText("Consulta");

        jMenuConsClientes.setText("Consultar Clientes");
        jMenuConsClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuConsClientesActionPerformed(evt);
            }
        });
        jMenuConsultas.add(jMenuConsClientes);

        jMenuConsVeiculos.setText("Consultar Veiculos");
        jMenuConsVeiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuConsVeiculosActionPerformed(evt);
            }
        });
        jMenuConsultas.add(jMenuConsVeiculos);

        jMenuConsultaCategorias.setText("Consulta Categorias");
        jMenuConsultaCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuConsultaCategoriasActionPerformed(evt);
            }
        });
        jMenuConsultas.add(jMenuConsultaCategorias);

        jMenuBarBarraPrincipal.add(jMenuConsultas);

        jMenuLocacao.setText("Locação");

        jMenuItemLocar.setText("Locar Veículo");
        jMenuItemLocar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemLocarActionPerformed(evt);
            }
        });
        jMenuLocacao.add(jMenuItemLocar);

        jMenuItemDevolver.setText("Devolver Veículo");
        jMenuItemDevolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDevolverActionPerformed(evt);
            }
        });
        jMenuLocacao.add(jMenuItemDevolver);

        jMenuBarBarraPrincipal.add(jMenuLocacao);

        jMenuRelatorios.setText("Relatórios");

        jMenuFatLoc.setText("Faturas de Locação");
        jMenuFatLoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuFatLocActionPerformed(evt);
            }
        });
        jMenuRelatorios.add(jMenuFatLoc);

        jMenuBarBarraPrincipal.add(jMenuRelatorios);

        jMenuAjuda.setText("Ajuda");

        jMenuConfigBD.setText("Configurações");
        jMenuConfigBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuConfigBDActionPerformed(evt);
            }
        });
        jMenuAjuda.add(jMenuConfigBD);

        jMenuBarBarraPrincipal.add(jMenuAjuda);

        setJMenuBar(jMenuBarBarraPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelDataHora, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(jPanelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(141, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jPanelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addComponent(jPanelDataHora, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemCadasVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadasVeiculoActionPerformed
        // TODO add your handling code here:
        new JFrameCadastroVeiculo().setVisible(true);
        
    }//GEN-LAST:event_jMenuItemCadasVeiculoActionPerformed

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaActionPerformed

    private void jButtonLogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogarActionPerformed

        jPanelLogin.setVisible(false);
        jPanelDataHora.setVisible(true);
        jMenuBarBarraPrincipal.setVisible(true);
        
    }//GEN-LAST:event_jButtonLogarActionPerformed

    private void txtLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLoginActionPerformed

    private void jMenuItemCadasClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadasClienteActionPerformed
        // TODO add your handling code here:
        new JFrameCadastroCliente().setVisible(true);
    }//GEN-LAST:event_jMenuItemCadasClienteActionPerformed

    private void jMenuConsVeiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuConsVeiculosActionPerformed
        // TODO add your handling code here:
        new JFrameConsultaVeiculos().setVisible(true);
    }//GEN-LAST:event_jMenuConsVeiculosActionPerformed

    private void jMenuConsClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuConsClientesActionPerformed
        // TODO add your handling code here:
        
        new JFrameConsultaClientes().setVisible(true);
    }//GEN-LAST:event_jMenuConsClientesActionPerformed

    private void jMenuItemDevolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDevolverActionPerformed
        // TODO add your handling code here:
        new JFrameConsultaDevolucao().setVisible(true);
        
    }//GEN-LAST:event_jMenuItemDevolverActionPerformed

    private void jMenuItemLocarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemLocarActionPerformed
        // TODO add your handling code here:
        new JFrameLocar().setVisible(true);
    }//GEN-LAST:event_jMenuItemLocarActionPerformed

    private void jMenuFatLocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuFatLocActionPerformed
        // TODO add your handling code here:
        
        new JFrameFaturaLoc().setVisible(true);
    }//GEN-LAST:event_jMenuFatLocActionPerformed

    private void jMenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
       

         
    }//GEN-LAST:event_jMenuSairActionPerformed

    private void jMenuDeslogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuDeslogarActionPerformed
        // TODO add your handling code here:
        jPanelLogin.setVisible(true);

        jMenuBarBarraPrincipal.setVisible(false);
        jPanelDataHora.setVisible(false);
    }//GEN-LAST:event_jMenuDeslogarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        //this.setExtendedState(MAXIMIZED_BOTH);

       jLabelData.setText(DataHora.getData());
       
       
       new Thread(){
           public void run(){
               while(true){
                    jLabelHora.setText(DataHora.getHora());
               }
           }
       }.start();
       
    }//GEN-LAST:event_formWindowOpened

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        
        new JFrameCadastroUsuario().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuCadastroCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCadastroCategoriaActionPerformed
        // TODO add your handling code here:
        new JFrameCadastroCategoria().setVisible(true);
    }//GEN-LAST:event_jMenuCadastroCategoriaActionPerformed

    private void jMenuConsultaCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuConsultaCategoriasActionPerformed
        // TODO add your handling code here:

        new JFrameConsultaCategoria().setVisible(true);

    }//GEN-LAST:event_jMenuConsultaCategoriasActionPerformed

    private void jMenuConfigBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuConfigBDActionPerformed
        // TODO add your handling code here
        new JFrameConfigBD().setVisible(true);
    }//GEN-LAST:event_jMenuConfigBDActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLogar;
    private javax.swing.JLabel jLabelData;
    private javax.swing.JLabel jLabelHora;
    private javax.swing.JLabel jLabelLogin;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JMenu jMenuAjuda;
    private javax.swing.JMenuBar jMenuBarBarraPrincipal;
    private javax.swing.JMenuItem jMenuCadastroCategoria;
    private javax.swing.JMenu jMenuCadastros;
    private javax.swing.JMenuItem jMenuConfigBD;
    private javax.swing.JMenuItem jMenuConsClientes;
    private javax.swing.JMenuItem jMenuConsVeiculos;
    private javax.swing.JMenuItem jMenuConsultaCategorias;
    private javax.swing.JMenu jMenuConsultas;
    private javax.swing.JMenuItem jMenuDeslogar;
    private javax.swing.JMenuItem jMenuFatLoc;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemCadasCliente;
    private javax.swing.JMenuItem jMenuItemCadasVeiculo;
    private javax.swing.JMenuItem jMenuItemDevolver;
    private javax.swing.JMenuItem jMenuItemLocar;
    private javax.swing.JMenu jMenuLocacao;
    private javax.swing.JMenu jMenuLogin;
    private javax.swing.JMenu jMenuRelatorios;
    private javax.swing.JMenuItem jMenuSair;
    private javax.swing.JPanel jPanelDataHora;
    private javax.swing.JPanel jPanelLogin;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
