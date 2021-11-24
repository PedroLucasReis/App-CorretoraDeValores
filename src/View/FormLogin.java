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

/**
 *
 * @author 834539
 */
public class FormLogin extends javax.swing.JFrame {

    /**
     * Creates new form FormLogin
     */
    public FormLogin() {
        
        this.setUndecorated(true);
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        lblAlerta.setVisible(false);
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
        pnlCpf = new javax.swing.JPanel();
        txtCpf = new javax.swing.JFormattedTextField();
        pnlSenha = new javax.swing.JPanel();
        txtSenha = new javax.swing.JPasswordField();
        lblAinda = new javax.swing.JLabel();
        lblClique = new javax.swing.JLabel();
        lblClose = new javax.swing.JLabel();
        lblLogin = new javax.swing.JLabel();
        pnlEntrar = new javax.swing.JPanel();
        lblEntrar = new javax.swing.JLabel();
        lblAlerta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 153, 0), 2));

        pnlCpf.setBackground(new java.awt.Color(255, 255, 255));
        pnlCpf.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 153, 0), 2), "CPF", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Game Of Squids", 0, 18))); // NOI18N

        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpf.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout pnlCpfLayout = new javax.swing.GroupLayout(pnlCpf);
        pnlCpf.setLayout(pnlCpfLayout);
        pnlCpfLayout.setHorizontalGroup(
            pnlCpfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCpfLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtCpf, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlCpfLayout.setVerticalGroup(
            pnlCpfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCpfLayout.createSequentialGroup()
                .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pnlSenha.setBackground(new java.awt.Color(255, 255, 255));
        pnlSenha.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 153, 0), 2), "SENHA", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Game Of Squids", 0, 18))); // NOI18N

        txtSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout pnlSenhaLayout = new javax.swing.GroupLayout(pnlSenha);
        pnlSenha.setLayout(pnlSenhaLayout);
        pnlSenhaLayout.setHorizontalGroup(
            pnlSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSenhaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlSenhaLayout.setVerticalGroup(
            pnlSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSenhaLayout.createSequentialGroup()
                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        lblAinda.setFont(new java.awt.Font("Corbel Light", 0, 18)); // NOI18N
        lblAinda.setText("Ainda não possui um cadastro?");

        lblClique.setFont(new java.awt.Font("Corbel Light", 0, 18)); // NOI18N
        lblClique.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblClique.setText("Clique aqui!");
        lblClique.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.gray));
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

        lblClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
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

        lblLogin.setFont(new java.awt.Font("Game Of Squids", 0, 48)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(204, 153, 0));
        lblLogin.setText("LOGIN");
        lblLogin.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                lblLoginComponentHidden(evt);
            }
        });

        pnlEntrar.setBackground(new java.awt.Color(255, 255, 255));
        pnlEntrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 153, 0)));
        pnlEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlEntrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlEntrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlEntrarMouseExited(evt);
            }
        });

        lblEntrar.setFont(new java.awt.Font("Game Of Squids", 0, 24)); // NOI18N
        lblEntrar.setForeground(new java.awt.Color(255, 204, 0));
        lblEntrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEntrar.setText("ENTRAR");
        lblEntrar.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEntrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblEntrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblEntrarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlEntrarLayout = new javax.swing.GroupLayout(pnlEntrar);
        pnlEntrar.setLayout(pnlEntrarLayout);
        pnlEntrarLayout.setHorizontalGroup(
            pnlEntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEntrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlEntrarLayout.setVerticalGroup(
            pnlEntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblEntrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        lblAlerta.setFont(new java.awt.Font("Game Of Squids", 0, 14)); // NOI18N
        lblAlerta.setForeground(new java.awt.Color(255, 51, 0));
        lblAlerta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblLogin)
                        .addGap(72, 72, 72)
                        .addComponent(lblClose, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pnlSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pnlCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblAinda)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblClique, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(124, 124, 124)
                                .addComponent(pnlEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 47, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblAlerta, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblClose, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLogin))
                .addGap(11, 11, 11)
                .addComponent(lblAlerta, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAinda)
                    .addComponent(lblClique))
                .addGap(12, 12, 12))
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

    private void lblCliqueMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCliqueMouseEntered
        lblClique.setForeground(Color.ORANGE);
    }//GEN-LAST:event_lblCliqueMouseEntered

    private void lblCliqueMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCliqueMouseExited
        lblClique.setForeground(Color.BLACK);
    }//GEN-LAST:event_lblCliqueMouseExited

    private void lblCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseEntered
        lblClose.setBorder(BorderFactory.createLineBorder(Color.black));
    }//GEN-LAST:event_lblCloseMouseEntered

    private void lblCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseExited
        lblClose.setBorder(BorderFactory.createEmptyBorder());
    }//GEN-LAST:event_lblCloseMouseExited

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblCloseMouseClicked

    private void pnlEntrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlEntrarMouseEntered
        pnlEntrar.setBackground(Color.ORANGE);
        lblEntrar.setForeground(Color.WHITE);
    }//GEN-LAST:event_pnlEntrarMouseEntered

    private void pnlEntrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlEntrarMouseExited
        pnlEntrar.setBackground(Color.WHITE);
        lblEntrar.setForeground(Color.ORANGE);
    }//GEN-LAST:event_pnlEntrarMouseExited

    private void lblLoginComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_lblLoginComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_lblLoginComponentHidden

    private void lblCliqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCliqueMouseClicked
        FormCadastrarUsuario cadastro = new FormCadastrarUsuario();
        cadastro.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblCliqueMouseClicked

    private void pnlEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlEntrarMouseClicked
        entrar();
    }//GEN-LAST:event_pnlEntrarMouseClicked

    private void lblEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEntrarMouseClicked
        entrar();
    }//GEN-LAST:event_lblEntrarMouseClicked

    private void lblEntrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEntrarMouseEntered
        pnlEntrar.setBackground(Color.ORANGE);
        lblEntrar.setForeground(Color.WHITE);
    }//GEN-LAST:event_lblEntrarMouseEntered

    private void lblEntrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEntrarMouseExited
        pnlEntrar.setBackground(Color.WHITE);
        lblEntrar.setForeground(Color.ORANGE);
    }//GEN-LAST:event_lblEntrarMouseExited

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
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAinda;
    private javax.swing.JLabel lblAlerta;
    private javax.swing.JLabel lblClique;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblEntrar;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JPanel pnlCpf;
    private javax.swing.JPanel pnlEntrar;
    private javax.swing.JPanel pnlSenha;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables

    private void entrar()
    {
        Usuario u = new Usuario();
        u.setCpf(txtCpf.getText());
        u.setSenha(new String(txtSenha.getPassword()));
        
        if (u.getCpf().trim().isEmpty()){
            
           lblAlerta.setText("O CAMPO CPF ESTÁ VAZIO!");
           lblAlerta.setVisible(true);
        }
        else if(u.getSenha().trim().isEmpty())
        {

            lblAlerta.setText("O CAMPO SENHA ESTÁ VAZIO!");
            lblAlerta.setVisible(true);
            
        }
        else
        {
            
            if (new UsuarioDAO().login(u.getCpf(), u.getSenha())){
                
                //login realizado com sucesso!
                PLCRLobby ent = new PLCRLobby(u.getCpf());
                ent.setVisible(true);
                this.dispose();
                
            }else{
                JOptionPane.showMessageDialog(
                    null,
                    "Usuário e/ou senha inválido",
                    "Login",
                    JOptionPane.ERROR_MESSAGE
                );
            }
            
        }
    }

}