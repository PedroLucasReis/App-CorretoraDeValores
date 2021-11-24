/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.UsuarioDAO;
import Model.Usuario;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

/**
 *
 * @author 834539
 */
public class FormCadastrarUsuario extends javax.swing.JFrame {

    /**
     * Creates new form FormCadastrarUsuario
     */
    public FormCadastrarUsuario() {
        this.setUndecorated(true);
        initComponents();
        configurarForm(0);
    }
    
    public FormCadastrarUsuario(int tip) {
        this.setUndecorated(true);
        initComponents();
        configurarForm(tip);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFundo = new javax.swing.JPanel();
        lblRegister = new javax.swing.JLabel();
        pnlNome = new javax.swing.JPanel();
        txtNome = new javax.swing.JTextField();
        pnlEmail = new javax.swing.JPanel();
        txtEmail = new javax.swing.JTextField();
        pnlEmailconf = new javax.swing.JPanel();
        txtEmailConf = new javax.swing.JTextField();
        pnlCPF = new javax.swing.JPanel();
        txtCpf = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        txtData = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        txtTelefone = new javax.swing.JFormattedTextField();
        lblPossui = new javax.swing.JLabel();
        lblClique = new javax.swing.JLabel();
        pnlConfirmar = new javax.swing.JPanel();
        lblConfirmar = new javax.swing.JLabel();
        lblClose = new javax.swing.JLabel();
        pnlSenha = new javax.swing.JPanel();
        txtSenha = new javax.swing.JPasswordField();
        pnlSenhaConf = new javax.swing.JPanel();
        txtSenhaConf = new javax.swing.JPasswordField();
        lblAlerta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlFundo.setBackground(new java.awt.Color(255, 255, 255));
        pnlFundo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 153, 0), 2));

        lblRegister.setFont(new java.awt.Font("Game Of Squids", 0, 36)); // NOI18N
        lblRegister.setForeground(new java.awt.Color(204, 153, 0));
        lblRegister.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegister.setText("REGISTRAR");

        pnlNome.setBackground(new java.awt.Color(255, 255, 255));
        pnlNome.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 153, 0), 2), "NOME COMPLETO", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Game Of Squids", 0, 18))); // NOI18N

        javax.swing.GroupLayout pnlNomeLayout = new javax.swing.GroupLayout(pnlNome);
        pnlNome.setLayout(pnlNomeLayout);
        pnlNomeLayout.setHorizontalGroup(
            pnlNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtNome)
                .addContainerGap())
        );
        pnlNomeLayout.setVerticalGroup(
            pnlNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNomeLayout.createSequentialGroup()
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pnlEmail.setBackground(new java.awt.Color(255, 255, 255));
        pnlEmail.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 153, 0), 2), "EMAIL", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Game Of Squids", 0, 18))); // NOI18N

        javax.swing.GroupLayout pnlEmailLayout = new javax.swing.GroupLayout(pnlEmail);
        pnlEmail.setLayout(pnlEmailLayout);
        pnlEmailLayout.setHorizontalGroup(
            pnlEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEmailLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtEmail)
                .addContainerGap())
        );
        pnlEmailLayout.setVerticalGroup(
            pnlEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEmailLayout.createSequentialGroup()
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pnlEmailconf.setBackground(new java.awt.Color(255, 255, 255));
        pnlEmailconf.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 153, 0), 2), "CONFIRMAR EMAIL", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Game Of Squids", 0, 18))); // NOI18N

        javax.swing.GroupLayout pnlEmailconfLayout = new javax.swing.GroupLayout(pnlEmailconf);
        pnlEmailconf.setLayout(pnlEmailconfLayout);
        pnlEmailconfLayout.setHorizontalGroup(
            pnlEmailconfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEmailconfLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtEmailConf)
                .addContainerGap())
        );
        pnlEmailconfLayout.setVerticalGroup(
            pnlEmailconfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEmailconfLayout.createSequentialGroup()
                .addComponent(txtEmailConf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pnlCPF.setBackground(new java.awt.Color(255, 255, 255));
        pnlCPF.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 153, 0), 2, true), "CPF", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Game Of Squids", 0, 18))); // NOI18N

        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpf.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout pnlCPFLayout = new javax.swing.GroupLayout(pnlCPF);
        pnlCPF.setLayout(pnlCPFLayout);
        pnlCPFLayout.setHorizontalGroup(
            pnlCPFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCPFLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtCpf, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlCPFLayout.setVerticalGroup(
            pnlCPFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCPFLayout.createSequentialGroup()
                .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 153, 0), 2), "DATA DE NASCIMENTO", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Game Of Squids", 0, 18))); // NOI18N

        try {
            txtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtData.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtData)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 153, 0), 2), "TELEFONE", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Game Of Squids", 0, 18))); // NOI18N

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefone.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        lblPossui.setFont(new java.awt.Font("Corbel Light", 0, 18)); // NOI18N
        lblPossui.setText("Já possui um cadastro?");

        lblClique.setFont(new java.awt.Font("Corbel Light", 0, 18)); // NOI18N
        lblClique.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblClique.setText("Clique aqui!");
        lblClique.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblClique.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCliqueMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCliqueMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCliqueMouseExited(evt);
            }
        });

        pnlConfirmar.setBackground(new java.awt.Color(255, 255, 255));
        pnlConfirmar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 153, 0), 2));
        pnlConfirmar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlConfirmarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlConfirmarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlConfirmarMouseExited(evt);
            }
        });

        lblConfirmar.setFont(new java.awt.Font("Game Of Squids", 0, 18)); // NOI18N
        lblConfirmar.setForeground(new java.awt.Color(255, 204, 0));
        lblConfirmar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblConfirmar.setText("CONFIRMAR CADASTRO");
        lblConfirmar.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblConfirmar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblConfirmarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblConfirmarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblConfirmarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlConfirmarLayout = new javax.swing.GroupLayout(pnlConfirmar);
        pnlConfirmar.setLayout(pnlConfirmarLayout);
        pnlConfirmarLayout.setHorizontalGroup(
            pnlConfirmarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConfirmarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlConfirmarLayout.setVerticalGroup(
            pnlConfirmarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConfirmarLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        lblClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/CLOSE-131994911256789607.png"))); // NOI18N
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCloseMouseExited(evt);
            }
        });

        pnlSenha.setBackground(new java.awt.Color(255, 255, 255));
        pnlSenha.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 153, 0), 2), "SENHA", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Game Of Squids", 0, 18))); // NOI18N

        txtSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout pnlSenhaLayout = new javax.swing.GroupLayout(pnlSenha);
        pnlSenha.setLayout(pnlSenhaLayout);
        pnlSenhaLayout.setHorizontalGroup(
            pnlSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSenhaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtSenha)
                .addContainerGap())
        );
        pnlSenhaLayout.setVerticalGroup(
            pnlSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSenhaLayout.createSequentialGroup()
                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pnlSenhaConf.setBackground(new java.awt.Color(255, 255, 255));
        pnlSenhaConf.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 153, 0), 2), "CONFIRMAR SENHA", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Game Of Squids", 0, 18))); // NOI18N

        txtSenhaConf.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout pnlSenhaConfLayout = new javax.swing.GroupLayout(pnlSenhaConf);
        pnlSenhaConf.setLayout(pnlSenhaConfLayout);
        pnlSenhaConfLayout.setHorizontalGroup(
            pnlSenhaConfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSenhaConfLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtSenhaConf)
                .addContainerGap())
        );
        pnlSenhaConfLayout.setVerticalGroup(
            pnlSenhaConfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSenhaConfLayout.createSequentialGroup()
                .addComponent(txtSenhaConf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        lblAlerta.setBackground(new java.awt.Color(255, 255, 255));
        lblAlerta.setFont(new java.awt.Font("Game Of Squids", 0, 14)); // NOI18N
        lblAlerta.setForeground(new java.awt.Color(255, 0, 0));
        lblAlerta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnlFundoLayout = new javax.swing.GroupLayout(pnlFundo);
        pnlFundo.setLayout(pnlFundoLayout);
        pnlFundoLayout.setHorizontalGroup(
            pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFundoLayout.createSequentialGroup()
                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFundoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlEmailconf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pnlFundoLayout.createSequentialGroup()
                                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(pnlCPF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(pnlSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pnlSenhaConf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(pnlFundoLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(lblRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblClose, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnlFundoLayout.createSequentialGroup()
                        .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlFundoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblPossui)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblClique, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlFundoLayout.createSequentialGroup()
                                .addGap(159, 159, 159)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlFundoLayout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(pnlConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlFundoLayout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(lblAlerta, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 45, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlFundoLayout.setVerticalGroup(
            pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRegister)
                    .addComponent(lblClose, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(lblAlerta, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlEmailconf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlSenhaConf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPossui)
                    .addComponent(lblClique, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnlConfirmarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlConfirmarMouseEntered
        pnlConfirmar.setBackground(Color.ORANGE);
        lblConfirmar.setForeground(Color.WHITE);
    }//GEN-LAST:event_pnlConfirmarMouseEntered

    private void pnlConfirmarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlConfirmarMouseExited
        pnlConfirmar.setBackground(Color.WHITE);
        lblConfirmar.setForeground(Color.ORANGE);
    }//GEN-LAST:event_pnlConfirmarMouseExited

    private void lblCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseEntered
       lblClose.setBorder(BorderFactory.createLineBorder(Color.black));
    }//GEN-LAST:event_lblCloseMouseEntered

    private void lblCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseExited
        lblClose.setBorder(BorderFactory.createEmptyBorder());
    }//GEN-LAST:event_lblCloseMouseExited

    private void lblCliqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCliqueMouseClicked
        FormLogin log = new FormLogin();
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblCliqueMouseClicked

    private void lblCliqueMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCliqueMouseEntered
        lblClique.setForeground(Color.ORANGE);
    }//GEN-LAST:event_lblCliqueMouseEntered

    private void lblCliqueMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCliqueMouseExited
        lblClique.setForeground(Color.BLACK);
    }//GEN-LAST:event_lblCliqueMouseExited

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblCloseMouseClicked

    private void pnlConfirmarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlConfirmarMouseClicked
        confirmar();
    }//GEN-LAST:event_pnlConfirmarMouseClicked

    private void lblConfirmarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblConfirmarMouseClicked
        confirmar();
    }//GEN-LAST:event_lblConfirmarMouseClicked

    private void lblConfirmarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblConfirmarMouseEntered
        pnlConfirmar.setBackground(Color.ORANGE);
        lblConfirmar.setForeground(Color.WHITE);
    }//GEN-LAST:event_lblConfirmarMouseEntered

    private void lblConfirmarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblConfirmarMouseExited
        pnlConfirmar.setBackground(Color.WHITE);
        lblConfirmar.setForeground(Color.ORANGE);
    }//GEN-LAST:event_lblConfirmarMouseExited

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
            java.util.logging.Logger.getLogger(FormCadastrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCadastrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCadastrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCadastrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCadastrarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAlerta;
    private javax.swing.JLabel lblClique;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblConfirmar;
    private javax.swing.JLabel lblPossui;
    private javax.swing.JLabel lblRegister;
    private javax.swing.JPanel pnlCPF;
    private javax.swing.JPanel pnlConfirmar;
    private javax.swing.JPanel pnlEmail;
    private javax.swing.JPanel pnlEmailconf;
    private javax.swing.JPanel pnlFundo;
    private javax.swing.JPanel pnlNome;
    private javax.swing.JPanel pnlSenha;
    private javax.swing.JPanel pnlSenhaConf;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmailConf;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JPasswordField txtSenhaConf;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables

    
    private void configurarForm(int tip2)
    {
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        lblAlerta.setVisible(false);
        if(tip2==1)
        {
            lblRegister.setText("PRIMEIRO REGISTRO");
            lblPossui.setVisible(false);
            lblClique.setVisible(false);
        }
    }

    private void confirmar()
    {
        
        String txt1, txt2;
        
        if(txtNome.getText().trim().isEmpty())
        {
            lblAlerta.setText("NECESSARIO PREENCHER O CAMPO: NOME COMPLETO");
            lblAlerta.setVisible(true);
        }
        else if(txtEmail.getText().trim().isEmpty())
        {
            lblAlerta.setText("NECESSARIO PREENCHER O CAMPO: EMAIL");
            lblAlerta.setVisible(true);
        }
        else if(txtEmailConf.getText().trim().isEmpty())
        {  
            lblAlerta.setText("NECESSARIO PREENCHER O CAMPO: CONFIRMAR EMAIL");
            lblAlerta.setVisible(true);
        }
        else if(txtCpf.getText().trim().length()<14)
        {
            lblAlerta.setText("NECESSARIO PREENCHER O CAMPO: CPF");
            lblAlerta.setVisible(true);
        }
        else if(txtData.getText().trim().length()<10)
        {
            lblAlerta.setText("NECESSARIO PREENCHER O CAMPO: DATA DE NASCIMENTO");
            lblAlerta.setVisible(true);
        }
        else if(txtSenha.getPassword().length<10)
        {
            lblAlerta.setText("SENHA MUITO CURTA! NECESSARIO 10 CARACTERES");
            lblAlerta.setVisible(true);
        }
        else if(txtSenhaConf.getPassword().length<10)
        {
            lblAlerta.setText("DEVE-SE DIGITAR A MESMA SENHA NOS DOIS CAMPOS");
            lblAlerta.setVisible(true);
        }
        else if(txtTelefone.getText().trim().length()<14)
        {
            lblAlerta.setText("NECESSARIO PREENCHER O CAMPO: TELEFONE");
            lblAlerta.setVisible(true);
        }
        else
        {
            txt1 = txtEmail.getText();
            txt2 = txtEmailConf.getText();
            if(txt1.equals(txt2)==false)
            {
               lblAlerta.setText("OS EMAIL'S ESTÃO DIFERENTES");
               lblAlerta.setVisible(true);
            } 
            else 
            {
                txt1 = new String(txtSenha.getPassword());
                txt2 = new String(txtSenhaConf.getPassword());
                if(txt1.equals(txt2)==false)
                {
                    lblAlerta.setText("AS SENHAS ESTÃO DIFERENTES");
                    lblAlerta.setVisible(true);
                }
                else
                {
                    Usuario us = new Usuario();
                    us.setNome(txtNome.getText());
                    us.setEmail(txtEmail.getText());
                    us.setCpf(txtCpf.getText());
                    us.setTelefone(txtTelefone.getText());
                    us.setData(txtData.getText());
                    us.setSenha(new String(txtSenha.getPassword()));
                    us.setSaldo(0);
                    
                    UsuarioDAO dao = new UsuarioDAO();
                    int resul = dao.inserir(us);
                    
                    if (resul >= 1){
                        PLCRLobby ent = new PLCRLobby(us.getCpf(), us.getSenha());
                        ent.setVisible(true);
                        this.dispose();
                    }else{
                        JOptionPane.showMessageDialog(
                            null,
                            "Ocorreu um erro.",
                            "PLCR",
                            JOptionPane.ERROR_MESSAGE
                        );
                    }
                }
            }
        }
        
        
        
        
    }





}
