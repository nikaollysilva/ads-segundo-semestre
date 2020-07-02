package Principal;

import javax.swing.JOptionPane;

/**
 *
 * @author Nikaolly
 */
public class JanelaLogin extends javax.swing.JFrame {

    private char senha;
    private String userLogin = "viss";
    private String senhaLogin = "viss123";

    /**
     * Creates new form JanelaPrincipal
     */
    public JanelaLogin() {
        initComponents();
        senha = txfSenha.getEchoChar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtSenha = new javax.swing.JLabel();
        txtNome = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txfNome = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        txfSenha = new javax.swing.JPasswordField();
        checkBox01 = new javax.swing.JCheckBox();
        lblIconOlho = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sistema de Login");

        txtSenha.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Principal/icons8-trancar-30.png"))); // NOI18N
        txtSenha.setText("Senha:");

        txtNome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Principal/icons8-usuário-feminino-30.png"))); // NOI18N
        txtNome.setText("Nome:");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Principal/icons8-login-arredondado-à-direita-50.png"))); // NOI18N

        txfNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfNomeActionPerformed(evt);
            }
        });

        btnLogin.setText("Logar");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        txfSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfSenhaActionPerformed(evt);
            }
        });

        checkBox01.setText("Mostrar senha");
        checkBox01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBox01ActionPerformed(evt);
            }
        });

        lblIconOlho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Principal/icons8-visível-30.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNome)
                                    .addComponent(txtSenha)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(lblIconOlho, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(checkBox01)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txfSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                                        .addComponent(txfNome))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addComponent(txtNome)
                .addGap(3, 3, 3)
                .addComponent(txfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(checkBox01)
                    .addComponent(lblIconOlho, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnLogin)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void login() {
        if (new String(txfSenha.getPassword()).equals(senhaLogin)
                && txfNome.getText().equals(userLogin)) {
            JanelaAplicacao janelaAplicacao = new JanelaAplicacao();
            janelaAplicacao.setVisible(true);
            this.dispose();
        } else {
//        txtNome.setText("Nome: " + txfNome.getText());
//        JOptionPane.showMessageDialog(this,"Nome: " + txfNome.getText()
//        + "\n Senha: " + new String(txfSenha.getPassword()));

            JOptionPane.showMessageDialog(this, "Usuario ou Senha incorreto(s)", "ERRO", JOptionPane.ERROR_MESSAGE);
        }

    }

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        login();
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txfNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfNomeActionPerformed
        login();
    }//GEN-LAST:event_txfNomeActionPerformed

    private void txfSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfSenhaActionPerformed
        login();
    }//GEN-LAST:event_txfSenhaActionPerformed

    private void checkBox01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBox01ActionPerformed
        if (checkBox01.isSelected()) {
            txfSenha.setEchoChar('\u0000');
            lblIconOlho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Principal/icons8-ocultar-30.png")));
            checkBox01.setText("Ocultar senha");
        } else {
            txfSenha.setEchoChar(senha);
            lblIconOlho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Principal/icons8-visível-30.png")));
            checkBox01.setText("Mostrar senha");
        }


    }//GEN-LAST:event_checkBox01ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JanelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JCheckBox checkBox01;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblIconOlho;
    private javax.swing.JTextField txfNome;
    private javax.swing.JPasswordField txfSenha;
    private javax.swing.JLabel txtNome;
    private javax.swing.JLabel txtSenha;
    // End of variables declaration//GEN-END:variables
}
