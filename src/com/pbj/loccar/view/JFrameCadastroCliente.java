/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pbj.loccar.view;

import com.pbj.loccar.control.ClienteControl;
import com.pbj.loccar.exceptions.DataInvalidaException;
import com.pbj.loccar.util.DataHora;
import java.util.Date;
import javax.swing.JOptionPane;
import static com.pbj.loccar.util.DataHora.dataToString;
import com.pbj.loccar.util.StringCampos;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Akr-Taku
 */
public final class JFrameCadastroCliente extends javax.swing.JFrame {

    /**
     * Creates new form JFrameCadastroCliente
     */
    private int id;

    public JFrameCadastroCliente(String[] client) {
        initComponents();
        setCampos(client);
        jButtonSalvar.setVisible(false);

    }

    public JFrameCadastroCliente() {
        initComponents();

        jButtonAtualizar.setVisible(false);

    }

    //Seta campos como vazio
    private void limpaCampos() {
        txtNome.setText("");
        txtRG.setText("");
        txtFCpf.setText("");
        txtFNascimento.setText("");
        txtEmail.setText("");
        txtFCelular.setText("");
        txtFTelefone.setText("");
        txtRua.setText("");
        txtComplemento.setText("");
        txtFCep.setText("");
        txtBairro.setText("");
        txtCidade.setText("");
    }

    //Verifica Campos Vazios
    private boolean comparaCampos() {

        boolean nam = StringCampos.vazio(txtNome.getText());
        boolean rg = StringCampos.vazio(txtRG.getText());
        boolean cpf = StringCampos.vazio(txtFCpf.getText());
        boolean nas = StringCampos.vazio(txtFNascimento.getText());
        boolean cel = StringCampos.vazio(txtFCelular.getText());
        boolean tel = StringCampos.vazio(txtFTelefone.getText());
        boolean em = StringCampos.vazio(txtEmail.getText());
        boolean rua = StringCampos.vazio(txtRua.getText());
        boolean com = StringCampos.vazio(txtComplemento.getText());
        boolean cep = StringCampos.vazio(txtFCep.getText());
        boolean bai = StringCampos.vazio(txtBairro.getText());
        boolean cid = StringCampos.vazio(txtCidade.getText());

        return (nam || rg || cpf || nas || cel || tel || em || rua || com || cep || bai || cid);

    }

    //Popula Campos
    private void setCampos(String[] client) {

        id = Integer.parseInt(client[0]);
        txtNome.setText(client[1]);
        txtRG.setText(client[2]);
        txtFCpf.setText(client[3]);
        jComboBoxEstadoC.setSelectedItem(client[4]);
        jComboBoxSexo.setSelectedItem(client[5]);
        try {
            txtFNascimento.setText(DataHora.stringToData(DataHora.convertData(client[6])));
        } catch (DataInvalidaException ex) {
            txtFNascimento.setText(DataHora.getData());
        }
        txtEmail.setText(client[7]);
        txtFTelefone.setText(client[8]);
        txtFCelular.setText(client[9]);
        txtRua.setText(client[10]);
        txtFCep.setText(client[11]);
        txtComplemento.setText(client[12]);
        txtBairro.setText(client[13]);
        txtCidade.setText(client[14]);
        jComboBoxUF.setSelectedItem(client[15]);

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

        jPanelCadastroBotoes = new javax.swing.JPanel();
        jPanelCadastroCliente = new javax.swing.JPanel();
        jLabelNome = new javax.swing.JLabel();
        jLabelCPF = new javax.swing.JLabel();
        jLabelRG = new javax.swing.JLabel();
        jLabelNascimento = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jLabelSexo = new javax.swing.JLabel();
        txtFCpf = new javax.swing.JFormattedTextField();
        txtFNascimento = new javax.swing.JFormattedTextField();
        txtNome = new javax.swing.JTextField();
        txtRG = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtFTelefone = new javax.swing.JFormattedTextField();
        jComboBoxSexo = new javax.swing.JComboBox<>();
        jLabelEstadoC = new javax.swing.JLabel();
        jComboBoxEstadoC = new javax.swing.JComboBox<>();
        jLabelTelef = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtFCelular = new javax.swing.JFormattedTextField();
        jLabelRua = new javax.swing.JLabel();
        jLabelComplemento = new javax.swing.JLabel();
        jLabelCep = new javax.swing.JLabel();
        jLabelBairro = new javax.swing.JLabel();
        jLabelCidade = new javax.swing.JLabel();
        txtRua = new javax.swing.JTextField();
        txtComplemento = new javax.swing.JTextField();
        txtFCep = new javax.swing.JFormattedTextField();
        txtBairro = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        jLabelEstado = new javax.swing.JLabel();
        jComboBoxUF = new javax.swing.JComboBox<>();
        jButtonSalvar = new javax.swing.JButton();
        jButtonAtualizar = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Clientes");
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanelCadastroCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Pessoais"));

        jLabelNome.setText("Nome");

        jLabelCPF.setText("CPF");

        jLabelRG.setText("RG");

        jLabelNascimento.setText("Data de Nascimento");

        jLabelEmail.setText("Email");

        jLabelSexo.setText("Sexo");

        try {
            txtFCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtFCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFCpfActionPerformed(evt);
            }
        });

        txtFNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        txtFNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFNascimentoActionPerformed(evt);
            }
        });

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        txtRG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRGActionPerformed(evt);
            }
        });

        try {
            txtFTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtFTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFTelefoneActionPerformed(evt);
            }
        });

        jComboBoxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F" }));
        jComboBoxSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSexoActionPerformed(evt);
            }
        });

        jLabelEstadoC.setText("EstadoCivil");

        jComboBoxEstadoC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "S", "C", "D", "V" }));

        jLabelTelef.setText("Telefone");

        jLabel2.setText("Celular");

        try {
            txtFCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtFCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFCelularActionPerformed(evt);
            }
        });

        jLabelRua.setText("Rua");

        jLabelComplemento.setText("Complemento");

        jLabelCep.setText("CEP");

        jLabelBairro.setText("Bairro");

        jLabelCidade.setText("Cidade");

        txtRua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRuaActionPerformed(evt);
            }
        });

        txtComplemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtComplementoActionPerformed(evt);
            }
        });

        try {
            txtFCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        txtBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBairroActionPerformed(evt);
            }
        });

        txtCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCidadeActionPerformed(evt);
            }
        });

        jLabelEstado.setText("UF");

        jComboBoxUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RR", "RO", "RJ", "RN", "RS", "SC", "SP", "SE", "TO" }));

        javax.swing.GroupLayout jPanelCadastroClienteLayout = new javax.swing.GroupLayout(jPanelCadastroCliente);
        jPanelCadastroCliente.setLayout(jPanelCadastroClienteLayout);
        jPanelCadastroClienteLayout.setHorizontalGroup(
            jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCadastroClienteLayout.createSequentialGroup()
                        .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelCadastroClienteLayout.createSequentialGroup()
                                .addComponent(txtFTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtFCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelCadastroClienteLayout.createSequentialGroup()
                                .addComponent(jLabelTelef)
                                .addGap(123, 123, 123)
                                .addComponent(jLabel2))
                            .addComponent(jLabelNome)
                            .addComponent(jLabelEmail)
                            .addGroup(jPanelCadastroClienteLayout.createSequentialGroup()
                                .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtNome, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelCadastroClienteLayout.createSequentialGroup()
                                        .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtFCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabelCPF))
                                        .addGap(31, 31, 31)
                                        .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelRG)
                                            .addComponent(txtRG, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelNascimento)
                                    .addComponent(txtFNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelCadastroClienteLayout.createSequentialGroup()
                                .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelRua)
                                    .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelComplemento)
                                    .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(27, Short.MAX_VALUE))
                    .addGroup(jPanelCadastroClienteLayout.createSequentialGroup()
                        .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelCadastroClienteLayout.createSequentialGroup()
                                .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxEstadoC, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelEstadoC))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelSexo)))
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelCadastroClienteLayout.createSequentialGroup()
                                .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelCadastroClienteLayout.createSequentialGroup()
                                        .addComponent(txtFCep, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabelBairro)
                                            .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabelCep))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelCidade)
                                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelEstado)
                                    .addComponent(jComboBoxUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanelCadastroClienteLayout.setVerticalGroup(
            jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelCadastroClienteLayout.createSequentialGroup()
                        .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCPF)
                            .addComponent(jLabelRG))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelCadastroClienteLayout.createSequentialGroup()
                        .addComponent(jLabelNascimento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelCadastroClienteLayout.createSequentialGroup()
                        .addComponent(jLabelEstadoC)
                        .addGap(26, 26, 26))
                    .addComponent(jComboBoxEstadoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelCadastroClienteLayout.createSequentialGroup()
                        .addComponent(jLabelSexo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTelef)
                    .addComponent(jLabel2))
                .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCadastroClienteLayout.createSequentialGroup()
                        .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelRua)
                            .addComponent(jLabelComplemento))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCep)
                            .addComponent(jLabelBairro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelCadastroClienteLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabelCidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelCadastroClienteLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelEstado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(94, 94, 94))
        );

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonAtualizar.setText("Atualizar");
        jButtonAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarActionPerformed(evt);
            }
        });

        jButtonCancel.setText("Cancelar");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCadastroBotoesLayout = new javax.swing.GroupLayout(jPanelCadastroBotoes);
        jPanelCadastroBotoes.setLayout(jPanelCadastroBotoesLayout);
        jPanelCadastroBotoesLayout.setHorizontalGroup(
            jPanelCadastroBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelCadastroCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCadastroBotoesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanelCadastroBotoesLayout.setVerticalGroup(
            jPanelCadastroBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCadastroBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAtualizar)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonCancel))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 17;
        gridBagConstraints.ipady = 52;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(jPanelCadastroBotoes, gridBagConstraints);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtFCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFCpfActionPerformed

    private void txtFNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFNascimentoActionPerformed

    private void txtFTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFTelefoneActionPerformed

    private void txtFCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFCelularActionPerformed

    private void txtBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBairroActionPerformed

    private void txtCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCidadeActionPerformed

    private void jButtonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarActionPerformed
        // TODO add your handling code here
        //Verificando os campos Vazios
        if (comparaCampos()) {
            //Mensagem informando caso exista algum campo vazio;
            JOptionPane.showMessageDialog(null, "Não é Possivel Salvar Campos Vazios", "", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                Date dataNasc = DataHora.dataToString(txtFNascimento.getText());
                
                try {
                    ClienteControl.atualizarCliente(id, txtNome.getText(), txtRG.getText(), txtFCpf.getText(), (String) jComboBoxEstadoC.getSelectedItem(),
                            (String) jComboBoxSexo.getSelectedItem(), dataNasc, txtEmail.getText(), txtFTelefone.getText(),
                            txtFCelular.getText(), txtRua.getText(), txtFCep.getText(), txtComplemento.getText(), txtBairro.getText(), txtCidade.getText(),
                            (String) jComboBoxUF.getSelectedItem());
                    JOptionPane.showMessageDialog(null, "CLiente Salvo no Banco de Dados!");
                    
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao Salvar No Banco de dados: " + ex, "", JOptionPane.ERROR_MESSAGE);
                }
                
                //Fecha A janela depois de atualizar.
                this.dispose();
                
            } catch (ParseException ex) {
                Logger.getLogger(JFrameCadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
            }

        }


    }//GEN-LAST:event_jButtonAtualizarActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        // TODO add your handling code here:
        //Verificando os campos Vazios
        if (comparaCampos()) {
            //Mensagem informando caso exista algum campo vazio;
            JOptionPane.showMessageDialog(null, "Não é Possivel Salvar Campos Vazios", "", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                Date dataNasc = dataToString(txtFNascimento.getText());
                
                try {
                    ClienteControl.salvarCliente(txtNome.getText(), txtRG.getText(), txtFCpf.getText(), (String) jComboBoxEstadoC.getSelectedItem(),
                            (String) jComboBoxSexo.getSelectedItem(), dataNasc, txtEmail.getText(), txtFTelefone.getText(),
                            txtFCelular.getText(), txtRua.getText(), txtFCep.getText(), txtComplemento.getText(), txtBairro.getText(), txtCidade.getText(),
                            (String) jComboBoxUF.getSelectedItem());
                    
                    JOptionPane.showMessageDialog(null, "Cliente Atualizado no Banco de Dados!");
                    
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao Salvar No Banco de dados: " + ex, "", JOptionPane.ERROR_MESSAGE);
                }
                
                //Pergunta se deseja cadastrar outro cliente
                int resp = JOptionPane.showConfirmDialog(null, "Deseja cadastrar Novo Cliente?");
                //Se responder Não a Janela fecha
                if (resp == 1 || resp == 2) {
                    this.dispose();
                }
                
                limpaCampos();
                
            } catch (ParseException ex) {
                Logger.getLogger(JFrameCadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtRGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRGActionPerformed

    private void jComboBoxSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxSexoActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void txtRuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRuaActionPerformed

    private void txtComplementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtComplementoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtComplementoActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new JFrameCadastroCliente().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtualizar;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxEstadoC;
    private javax.swing.JComboBox<String> jComboBoxSexo;
    private javax.swing.JComboBox<String> jComboBoxUF;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelBairro;
    private javax.swing.JLabel jLabelCPF;
    private javax.swing.JLabel jLabelCep;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelComplemento;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelEstadoC;
    private javax.swing.JLabel jLabelNascimento;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelRG;
    private javax.swing.JLabel jLabelRua;
    private javax.swing.JLabel jLabelSexo;
    private javax.swing.JLabel jLabelTelef;
    private javax.swing.JPanel jPanelCadastroBotoes;
    private javax.swing.JPanel jPanelCadastroCliente;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JFormattedTextField txtFCelular;
    private javax.swing.JFormattedTextField txtFCep;
    private javax.swing.JFormattedTextField txtFCpf;
    private javax.swing.JFormattedTextField txtFNascimento;
    private javax.swing.JFormattedTextField txtFTelefone;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtRG;
    private javax.swing.JTextField txtRua;
    // End of variables declaration//GEN-END:variables
}
