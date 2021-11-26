/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.UsuarioDAO;
import Model.Usuario;
import java.awt.Dimension;
import javax.swing.JInternalFrame;

/**
 *
 * @author Pedro
 */
public class PLCRLobby extends javax.swing.JFrame {

    private String doc;
    private PLCRLobby pp;
    /**
     * Creates new form Lobby
     */
    public PLCRLobby() {
        initComponents();
        ConfigurarForm();
    }
    
    public PLCRLobby(String cpf, String senha) {
        initComponents();
        ConfigurarForm(cpf, senha);
        doc = cpf;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AreaTrabalho = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        lblSaldo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuWeg = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AreaTrabalho.setBackground(new java.awt.Color(204, 204, 204));
        AreaTrabalho.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 153, 0), 2), "PERFIL", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Game Of Squids", 0, 14))); // NOI18N

        lblNome.setFont(new java.awt.Font("Game Of Squids", 0, 14)); // NOI18N
        lblNome.setText("NOME: Pedro Lucas Correia dos Reis");

        lblSaldo.setFont(new java.awt.Font("Game Of Squids", 0, 14)); // NOI18N
        lblSaldo.setText("SALDO: R$");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSaldo)
                .addContainerGap(265, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblNome)
                .addComponent(lblSaldo))
        );

        AreaTrabalho.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout AreaTrabalhoLayout = new javax.swing.GroupLayout(AreaTrabalho);
        AreaTrabalho.setLayout(AreaTrabalhoLayout);
        AreaTrabalhoLayout.setHorizontalGroup(
            AreaTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        AreaTrabalhoLayout.setVerticalGroup(
            AreaTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AreaTrabalhoLayout.createSequentialGroup()
                .addGap(0, 532, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));

        jMenu1.setText("Ações");
        jMenu1.setFont(new java.awt.Font("Corbel Light", 0, 14)); // NOI18N

        MenuWeg.setFont(new java.awt.Font("Game Of Squids", 0, 12)); // NOI18N
        MenuWeg.setText("Weg");
        MenuWeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuWegActionPerformed(evt);
            }
        });
        jMenu1.add(MenuWeg);

        jMenuItem2.setFont(new java.awt.Font("Game Of Squids", 0, 12)); // NOI18N
        jMenuItem2.setText("Itau");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setFont(new java.awt.Font("Game Of Squids", 0, 12)); // NOI18N
        jMenuItem3.setText("Vale");
        jMenu1.add(jMenuItem3);

        jMenuItem4.setFont(new java.awt.Font("Game Of Squids", 0, 12)); // NOI18N
        jMenuItem4.setText("Ambev");
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Perfil");
        jMenu2.setFont(new java.awt.Font("Corbel Light", 0, 14)); // NOI18N

        jMenuItem5.setFont(new java.awt.Font("Game Of Squids", 0, 12)); // NOI18N
        jMenuItem5.setText("Editar");
        jMenu2.add(jMenuItem5);

        jMenuItem6.setFont(new java.awt.Font("Game Of Squids", 0, 12)); // NOI18N
        jMenuItem6.setText("Saldo");
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Ajuda");
        jMenu3.setFont(new java.awt.Font("Corbel Light", 0, 14)); // NOI18N
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AreaTrabalho)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AreaTrabalho)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuWegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuWegActionPerformed
        abrirForm(new FormOpcoes(1, pp));
    }//GEN-LAST:event_MenuWegActionPerformed

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
            java.util.logging.Logger.getLogger(PLCRLobby.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PLCRLobby.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PLCRLobby.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PLCRLobby.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PLCRLobby().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane AreaTrabalho;
    private javax.swing.JMenuItem MenuWeg;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSaldo;
    // End of variables declaration//GEN-END:variables

    private void abrirForm(JInternalFrame f){
        if (AreaTrabalho.getAllFrames().length == 0){
            Dimension d = AreaTrabalho.getSize();
            AreaTrabalho.add(f);
            f.setLocation( (d.width-f.getSize().width)/2,
                           (d.height-f.getSize().height)/2);
            f.setVisible(true);
        }
    }

    private void ConfigurarForm()
    {
        this.setTitle("Pagina Principal");
        this.setExtendedState(MAXIMIZED_BOTH);
    }
    
    private void ConfigurarForm(String cpf, String senha)
    {
        this.setTitle("Pagina Principal");
        this.setExtendedState(MAXIMIZED_BOTH);
        UsuarioDAO us = new UsuarioDAO();
        Usuario user = us.pesquisarCpfSenha(cpf, senha);
        lblNome.setText("NOME: " + user.getNome());
        lblSaldo.setText("SALDO: R$" + user.getSaldo());
    }

    public void pegarArq(PLCRLobby at)
    {
        this.pp = at;
    }

    public String getDoc() {
        return doc;
    }
    
    
}
