/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pbj.loccar.view;

import com.pbj.loccar.control.ClienteControl;
import com.pbj.loccar.control.LocacaoControl;
import com.pbj.loccar.control.VeiculoControl;
import com.pbj.loccar.util.DataHora;
import com.pbj.loccar.util.StringCampos;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;


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
        popularComboBoxVeiculos();
        popularComboBoxClientes();
        jPanelCheck.setVisible(false);
        
        
     
    }
    //Método para popular os campos do combo box 
    private void popularComboBoxClientes(){
        List<String> clientes = ClienteControl.returnClienteID();

        for (String temp : clientes) {
            jComboBoxEscClient.addItem(temp);
        }  
        
    }       
    //Método para popular os campos do combo box 
    private void popularComboBoxVeiculos(){
        List<String> veiculos = VeiculoControl.returnVeiculoID();
        for (String temp : veiculos) {
            jComboBoxEscVeic.addItem(temp);
        }  
    }
    //Metpdo para limpar os campos
    private void limpaCampos(){
        txtDesc.setText("");
        txtFDataLoc.setText("");
        txtDias.setText("");
        txtDesconto.setText("");
        txtDataDevol.setText("");
        txtFSubTotal.setText("");


    }
    private boolean verificaCampos(){
        boolean desc = StringCampos.vazio(txtDesc.getText());
        boolean data = StringCampos.vazio(txtFDataLoc.getText());
        boolean dias = StringCampos.vazio(txtDias.getText());
        boolean car = StringCampos.vazio((String) jComboBoxEscVeic.getSelectedItem());
        boolean client = StringCampos.vazio((String) jComboBoxEscClient.getSelectedItem());
        return ( desc || data  || dias );
                
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelInfoLoc = new javax.swing.JPanel();
        jPanelOther = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDias = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtFDataLoc = new javax.swing.JFormattedTextField();
        txtFSubTotal = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDataDevol = new javax.swing.JFormattedTextField();
        jCheckBoxDesconto = new javax.swing.JCheckBox();
        jLabelDescricao = new javax.swing.JLabel();
        txtDesc = new javax.swing.JTextField();
        jPanelCheck = new javax.swing.JPanel();
        txtDesconto = new javax.swing.JFormattedTextField();
        jPanelInfoLoc2 = new javax.swing.JPanel();
        jComboBoxEscClient = new javax.swing.JComboBox<>();
        jLabelEscCLient = new javax.swing.JLabel();
        jLabelCPF = new javax.swing.JLabel();
        jLabelEscVeic = new javax.swing.JLabel();
        jLabelPlaca = new javax.swing.JLabel();
        txtGetCPF = new javax.swing.JFormattedTextField();
        jLabelMarca = new javax.swing.JLabel();
        jLabelCateg = new javax.swing.JLabel();
        jComboBoxEscVeic = new javax.swing.JComboBox<>();
        txtGetPlaca = new javax.swing.JTextField();
        txtGetCategoria = new javax.swing.JTextField();
        txtGetFabricante = new javax.swing.JTextField();
        jLabelValorDiaria = new javax.swing.JLabel();
        txtGetValorDiaria = new javax.swing.JTextField();
        jLabelCor = new javax.swing.JLabel();
        txtCor = new javax.swing.JTextField();
        txtNameVeic = new javax.swing.JTextField();
        jLabelNameVeic = new javax.swing.JLabel();
        txtGetNameClient = new javax.swing.JTextField();
        jButtonLocar = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Locar Carro");

        jPanelOther.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

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
        txtFSubTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFSubTotalActionPerformed(evt);
            }
        });

        jLabel4.setText("Data de Devolução");

        txtDataDevol.setEditable(false);
        txtDataDevol.setBackground(new java.awt.Color(204, 204, 204));
        txtDataDevol.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.MEDIUM))));
        txtDataDevol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataDevolActionPerformed(evt);
            }
        });

        jCheckBoxDesconto.setText("Desconto");
        jCheckBoxDesconto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBoxDescontoMouseClicked(evt);
            }
        });
        jCheckBoxDesconto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxDescontoActionPerformed(evt);
            }
        });

        jLabelDescricao.setText("Descrição");

        try {
            txtDesconto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanelCheckLayout = new javax.swing.GroupLayout(jPanelCheck);
        jPanelCheck.setLayout(jPanelCheckLayout);
        jPanelCheckLayout.setHorizontalGroup(
            jPanelCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCheckLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelCheckLayout.setVerticalGroup(
            jPanelCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCheckLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelOtherLayout = new javax.swing.GroupLayout(jPanelOther);
        jPanelOther.setLayout(jPanelOtherLayout);
        jPanelOtherLayout.setHorizontalGroup(
            jPanelOtherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOtherLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelOtherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDescricao)
                    .addComponent(txtDataDevol, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(23, 23, 23)
                .addGroup(jPanelOtherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelOtherLayout.createSequentialGroup()
                        .addGroup(jPanelOtherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(txtFDataLoc, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelOtherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtDias, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelOtherLayout.createSequentialGroup()
                        .addGroup(jPanelOtherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtFSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(jPanelOtherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBoxDesconto)
                            .addComponent(jPanelCheck, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelOtherLayout.setVerticalGroup(
            jPanelOtherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOtherLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanelOtherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelOtherLayout.createSequentialGroup()
                        .addGroup(jPanelOtherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelDescricao)
                            .addComponent(jLabel1))
                        .addGap(5, 5, 5)
                        .addGroup(jPanelOtherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFDataLoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelOtherLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelOtherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addComponent(jCheckBoxDesconto))
                .addGap(4, 4, 4)
                .addGroup(jPanelOtherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelOtherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDataDevol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtFSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanelCheck, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        jPanelInfoLoc2.setBorder(javax.swing.BorderFactory.createTitledBorder("Locação"));

        jComboBoxEscClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEscClientActionPerformed(evt);
            }
        });

        jLabelEscCLient.setText("ID Cliente");

        jLabelCPF.setText("CPF");

        jLabelEscVeic.setText("ID Veículo");

        jLabelPlaca.setText("Placa");

        txtGetCPF.setEditable(false);
        txtGetCPF.setBackground(new java.awt.Color(204, 204, 204));
        try {
            txtGetCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabelMarca.setText("Fabricante");

        jLabelCateg.setText("Categoria");

        jComboBoxEscVeic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEscVeicActionPerformed(evt);
            }
        });

        txtGetPlaca.setEditable(false);
        txtGetPlaca.setBackground(new java.awt.Color(204, 204, 204));

        txtGetCategoria.setEditable(false);
        txtGetCategoria.setBackground(new java.awt.Color(204, 204, 204));

        txtGetFabricante.setEditable(false);
        txtGetFabricante.setBackground(new java.awt.Color(204, 204, 204));
        txtGetFabricante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGetFabricanteActionPerformed(evt);
            }
        });

        jLabelValorDiaria.setText("Valor Diária");

        txtGetValorDiaria.setEditable(false);
        txtGetValorDiaria.setBackground(new java.awt.Color(204, 204, 204));

        jLabelCor.setText("Cor");

        txtCor.setEditable(false);
        txtCor.setBackground(new java.awt.Color(204, 204, 204));

        txtNameVeic.setEditable(false);
        txtNameVeic.setBackground(new java.awt.Color(204, 204, 204));

        jLabelNameVeic.setText("Nome Veiculo");

        txtGetNameClient.setEditable(false);
        txtGetNameClient.setBackground(new java.awt.Color(204, 204, 204));
        txtGetNameClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGetNameClientActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelInfoLoc2Layout = new javax.swing.GroupLayout(jPanelInfoLoc2);
        jPanelInfoLoc2.setLayout(jPanelInfoLoc2Layout);
        jPanelInfoLoc2Layout.setHorizontalGroup(
            jPanelInfoLoc2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInfoLoc2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelInfoLoc2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelInfoLoc2Layout.createSequentialGroup()
                        .addGroup(jPanelInfoLoc2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelEscCLient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelEscVeic)
                            .addComponent(jComboBoxEscClient, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxEscVeic, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelInfoLoc2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelNameVeic)
                            .addComponent(txtGetNameClient, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txtNameVeic))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addGroup(jPanelInfoLoc2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtGetCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCPF, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtGetPlaca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelPlaca, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(jPanelInfoLoc2Layout.createSequentialGroup()
                        .addGroup(jPanelInfoLoc2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelMarca)
                            .addComponent(txtGetFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCor)
                            .addComponent(txtCor, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelInfoLoc2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelCateg)
                            .addComponent(jLabelValorDiaria)
                            .addComponent(txtGetValorDiaria)
                            .addComponent(txtGetCategoria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))))
                .addGap(30, 30, 30))
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
                    .addComponent(txtGetCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGetNameClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelInfoLoc2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEscVeic)
                    .addComponent(jLabelPlaca)
                    .addComponent(jLabelNameVeic))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelInfoLoc2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxEscVeic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGetPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNameVeic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelInfoLoc2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCateg)
                    .addComponent(jLabelMarca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelInfoLoc2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGetCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGetFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelInfoLoc2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelValorDiaria)
                    .addComponent(jLabelCor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelInfoLoc2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGetValorDiaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jButtonLocar.setText("Locar");
        jButtonLocar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLocarActionPerformed(evt);
            }
        });

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInfoLocLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonLocar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
            .addGroup(jPanelInfoLocLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelInfoLoc2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelInfoLocLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelOther, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelInfoLocLayout.setVerticalGroup(
            jPanelInfoLocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInfoLocLayout.createSequentialGroup()
                .addComponent(jPanelInfoLoc2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelOther, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelInfoLocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonLocar)
                    .addComponent(jButtonCancel))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelInfoLoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelInfoLoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtGetFabricanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGetFabricanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGetFabricanteActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
         this.dispose();
         
         
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jButtonLocarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLocarActionPerformed
        // TODO add your handling code here:
        if(verificaCampos()){
           //Mensagem informando caso exista algum campo vazio;
           JOptionPane.showMessageDialog(null, "Não é Possivel Salvar Campos Vazios","",JOptionPane.ERROR_MESSAGE);
            
        }else{
            boolean bool = jCheckBoxDesconto.isSelected();
            if(bool == true && !"".equals(txtDesconto.getText())){
                
                 

                 LocacaoControl.salvarLocacao(txtDesc.getText(), DataHora.dataToString(txtFDataLoc.getText()), Integer.parseInt(txtDias.getText()) ,
                    Integer.parseInt((String)jComboBoxEscClient.getSelectedItem()),
                    Integer.parseInt((String) jComboBoxEscVeic.getSelectedItem()), true, 
                    Integer.parseInt(txtDesconto.getText()));
                VeiculoControl.atualizarVeiculo(Integer.parseInt((String)jComboBoxEscVeic.getSelectedItem()), true);
            }else{
                
                LocacaoControl.salvarLocacao(txtDesc.getText(), DataHora.dataToString(txtFDataLoc.getText()), Integer.parseInt(txtDias.getText()) ,
                    Integer.parseInt((String)jComboBoxEscClient.getSelectedItem()),
                    Integer.parseInt((String) jComboBoxEscVeic.getSelectedItem()), false, 0);
                VeiculoControl.atualizarVeiculo(Integer.parseInt((String)jComboBoxEscVeic.getSelectedItem()), true);
            }
            
            this.dispose();

        }
       limpaCampos();
       

    }//GEN-LAST:event_jButtonLocarActionPerformed

    private void jCheckBoxDescontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxDescontoActionPerformed
        // TODO add your handling code here:
        jPanelCheck.setVisible(jCheckBoxDesconto.isSelected());
    }//GEN-LAST:event_jCheckBoxDescontoActionPerformed

    private void jCheckBoxDescontoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBoxDescontoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxDescontoMouseClicked

    private void txtDataDevolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataDevolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataDevolActionPerformed

    private void txtFSubTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFSubTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFSubTotalActionPerformed

    private void txtDiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiasActionPerformed

    private void jComboBoxEscVeicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEscVeicActionPerformed
        // Sempre que um Id é setado as informações do veiculo aparecem.
       String veic[] = new String[11];
        
       int index;
       index = Integer.parseInt((String) jComboBoxEscVeic.getSelectedItem());
       
       veic = VeiculoControl.pegaVeiculo(index);
       
       txtGetCategoria.setText(veic[9]);
       txtCor.setText(veic[7]);
       txtGetValorDiaria.setText(veic[10]);
       txtNameVeic.setText(veic[2]);
       txtGetPlaca.setText(veic[1]);
       txtGetFabricante.setText(veic[5]);
       
        
    }//GEN-LAST:event_jComboBoxEscVeicActionPerformed

    private void txtGetNameClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGetNameClientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGetNameClientActionPerformed

    private void jComboBoxEscClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEscClientActionPerformed
        // Seta as informações do cliente assim que ele é selecionado.
       String client[] = new String[16];
        
       int index;
       index = Integer.parseInt((String) jComboBoxEscClient.getSelectedItem());
       
       client = ClienteControl.pegarCliente(index);
       
       txtGetNameClient.setText(client[1]);
       txtGetCPF.setText(client[3]);
        
        
    }//GEN-LAST:event_jComboBoxEscClientActionPerformed

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
    private javax.swing.JCheckBox jCheckBoxDesconto;
    private javax.swing.JComboBox<String> jComboBoxEscClient;
    private javax.swing.JComboBox<String> jComboBoxEscVeic;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelCPF;
    private javax.swing.JLabel jLabelCateg;
    private javax.swing.JLabel jLabelCor;
    private javax.swing.JLabel jLabelDescricao;
    private javax.swing.JLabel jLabelEscCLient;
    private javax.swing.JLabel jLabelEscVeic;
    private javax.swing.JLabel jLabelMarca;
    private javax.swing.JLabel jLabelNameVeic;
    private javax.swing.JLabel jLabelPlaca;
    private javax.swing.JLabel jLabelValorDiaria;
    private javax.swing.JPanel jPanelCheck;
    private javax.swing.JPanel jPanelInfoLoc;
    private javax.swing.JPanel jPanelInfoLoc2;
    private javax.swing.JPanel jPanelOther;
    private javax.swing.JTextField txtCor;
    private javax.swing.JFormattedTextField txtDataDevol;
    private javax.swing.JTextField txtDesc;
    private javax.swing.JFormattedTextField txtDesconto;
    private javax.swing.JTextField txtDias;
    private javax.swing.JFormattedTextField txtFDataLoc;
    private javax.swing.JFormattedTextField txtFSubTotal;
    private javax.swing.JFormattedTextField txtGetCPF;
    private javax.swing.JTextField txtGetCategoria;
    private javax.swing.JTextField txtGetFabricante;
    private javax.swing.JTextField txtGetNameClient;
    private javax.swing.JTextField txtGetPlaca;
    private javax.swing.JTextField txtGetValorDiaria;
    private javax.swing.JTextField txtNameVeic;
    // End of variables declaration//GEN-END:variables
}
