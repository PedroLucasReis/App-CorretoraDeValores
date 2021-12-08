/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package View;

import Controller.UsuarioDAO;
import Model.Usuario;
import java.awt.Color;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.util.Arrays;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

/**
 *
 * @author Pichau
 */
public class InternalFrameEditarSaldo extends javax.swing.JInternalFrame {

    private PLCRLobby ant;
    private int op;
    /**
     * Creates new form EditarSaldo
     */
    public InternalFrameEditarSaldo() {
        initComponents();
        ConfigurarForm();
        op=0;
        Operacao(0);
    }
    
    public InternalFrameEditarSaldo(PLCRLobby back) {
        initComponents();
        ConfigurarForm();
        ant = back;
        op=0;
        Operacao(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblSaldo = new javax.swing.JLabel();
        lblArraste = new javax.swing.JLabel();
        lblFinalizar = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        sldSaldo = new javax.swing.JSlider();
        lblSaldoSlider = new javax.swing.JLabel();
        tglTipo = new javax.swing.JToggleButton();
        lblClose = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 153, 0), 2));

        lblSaldo.setFont(new java.awt.Font("Game Of Squids", 0, 24)); // NOI18N
        lblSaldo.setText("SALDO");

        lblArraste.setFont(new java.awt.Font("Game Of Squids", 0, 18)); // NOI18N
        lblArraste.setText("ARRASTE A BARRA PARA ESCOLHER O NOVO SALDO:");

        lblFinalizar.setFont(new java.awt.Font("Game Of Squids", 0, 24)); // NOI18N
        lblFinalizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFinalizar.setText("FINALIZAR");
        lblFinalizar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 153, 0), 2));
        lblFinalizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFinalizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblFinalizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblFinalizarMouseExited(evt);
            }
        });

        lblSenha.setFont(new java.awt.Font("Game Of Squids", 0, 18)); // NOI18N
        lblSenha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSenha.setText("SUA SENHA:");

        txtSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        sldSaldo.setMaximum(10000);
        sldSaldo.setPaintTicks(true);
        sldSaldo.setValue(0);
        sldSaldo.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        sldSaldo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldSaldoStateChanged(evt);
            }
        });

        lblSaldoSlider.setFont(new java.awt.Font("Game Of Squids", 0, 18)); // NOI18N
        lblSaldoSlider.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSaldoSlider.setText("R$:");

        tglTipo.setFont(new java.awt.Font("Game Of Squids", 0, 14)); // NOI18N
        tglTipo.setText("DEPOSITAR");
        tglTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tglTipoActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblArraste, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(289, 289, 289)
                        .addComponent(lblSaldo)
                        .addGap(243, 243, 243)
                        .addComponent(lblClose, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addComponent(tglTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(lblSaldoSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(sldSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(lblSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(lblFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblClose, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(lblSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(tglTipo)
                .addGap(18, 18, 18)
                .addComponent(lblArraste, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSaldoSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sldSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(lblSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(lblFinalizar)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sldSaldoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldSaldoStateChanged
        lblSaldoSlider.setText("R$: " + sldSaldo.getValue());
    }//GEN-LAST:event_sldSaldoStateChanged

    private void lblFinalizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFinalizarMouseEntered
        lblFinalizar.setForeground(Color.ORANGE);
    }//GEN-LAST:event_lblFinalizarMouseEntered

    private void lblFinalizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFinalizarMouseExited
        lblFinalizar.setForeground(Color.BLACK);
    }//GEN-LAST:event_lblFinalizarMouseExited

    private void lblFinalizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFinalizarMouseClicked
        confirm();
    }//GEN-LAST:event_lblFinalizarMouseClicked

    private void tglTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tglTipoActionPerformed
        if(op==0)
        {
            op=1;
            tglTipo.setText("SACAR");
            Operacao(1);
        }
        else
        {
            op=0;
            tglTipo.setText("DEPOSITAR");
            Operacao(0);
        }
    }//GEN-LAST:event_tglTipoActionPerformed

    private void lblCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseEntered
        lblClose.setBorder(BorderFactory.createLineBorder(Color.black));
    }//GEN-LAST:event_lblCloseMouseEntered

    private void lblCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseExited
        lblClose.setBorder(BorderFactory.createEmptyBorder());
    }//GEN-LAST:event_lblCloseMouseExited

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        this.dispose();
    }//GEN-LAST:event_lblCloseMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblArraste;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblFinalizar;
    private javax.swing.JLabel lblSaldo;
    private javax.swing.JLabel lblSaldoSlider;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JSlider sldSaldo;
    private javax.swing.JToggleButton tglTipo;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables

    private void ConfigurarForm()
    {
        this.setTitle("Pagina Principal");
        lblSaldoSlider.setText("R$: 0");
    }

    public void confirm()
    {
        if(txtSenha.getPassword().length<10)
        {
            JOptionPane.showMessageDialog(
                    null,
                    "A senha deve ter no minimo 10 caracteres",
                    "Operação",
                    JOptionPane.ERROR_MESSAGE
                );
            
        }
        else
        {
            Usuario us;
            us = new UsuarioDAO().pesquisarCpfSenha(ant.getDoc(), new String(txtSenha.getPassword()));
            if(us == null)
            {
                JOptionPane.showMessageDialog(
                    null,
                    "A senha está incorreta",
                    "Senha",
                    JOptionPane.ERROR_MESSAGE
                );
            }
            else
            {
                double valort;
                if(tglTipo.isSelected()==false)
                {
                    valort = us.getSaldo() + sldSaldo.getValue();
                    us.setSaldo(valort);
                    int ret = new UsuarioDAO().atualizar(us,0);
                    if(ret==1)
                    {
                        JOptionPane.showMessageDialog(
                            null,
                            "Saldo Atualizado com sucesso!",
                            "Saldo",
                            JOptionPane.INFORMATION_MESSAGE
                            );
                        this.ant.atualizar(new String(txtSenha.getPassword()));
                        this.dispose();
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(
                            null,
                            "Ocorreu um Erro!",
                            "Saldo",
                            JOptionPane.ERROR_MESSAGE
                            );
                    }
                    this.ant.atualizar(new String(txtSenha.getPassword()));
                    this.dispose();
                }
                else
                {
                    if(us.getSaldo() >= sldSaldo.getValue())
                    {
                        valort = us.getSaldo() - sldSaldo.getValue();
                        us.setSaldo(valort);
                        int ret = new UsuarioDAO().atualizar(us,0);
                        if(ret==1)
                        {
                            JOptionPane.showMessageDialog(
                                null,
                                "Saldo Atualizado com sucesso!",
                                "Saldo",
                                JOptionPane.INFORMATION_MESSAGE
                                );
                            this.ant.atualizar(new String(txtSenha.getPassword()));
                            this.dispose();
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(
                                null,
                                "Ocorreu um Erro!",
                                "Saldo",
                                JOptionPane.ERROR_MESSAGE
                                );
                        }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(
                        null,
                        "Você só possui R$: " + us.getSaldo(),
                        "Saldo",
                        JOptionPane.ERROR_MESSAGE
                        );
                    }
                    
                }
                
            }
            
            
        }
    }

    
    private void Operacao(int i)
    {
        if(i==0)
        {
             tglTipo.setText("DEPOSITAR");
             tglTipo.setForeground(Color.GREEN);
             
        }
        else
        {
            tglTipo.setText("SACAR");
            tglTipo.setForeground(Color.RED);
            
        }
    }
}