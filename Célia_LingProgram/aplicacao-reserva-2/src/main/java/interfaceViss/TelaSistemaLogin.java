package interfaceViss;

import java.awt.Color;
import javax.swing.BorderFactory;
import login.viss.SistemaLogin;
import login.viss.Usuario;
import model.dao.UserDao;

/**
 *
 * @author Nikaolly
 */
public class TelaSistemaLogin extends javax.swing.JFrame {

    private char senha;

    public TelaSistemaLogin() {
        initComponents();
        txfInputLogin.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
        txfInputSenha.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
        senha = txfInputSenha.getEchoChar();
        checkBox01.setForeground(Color.GRAY);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        txtTitulo = new javax.swing.JLabel();
        txfInputSenha = new javax.swing.JPasswordField();
        txfInputLogin = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        checkBox01 = new javax.swing.JCheckBox();
        lblIconOlho = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        checkBox02 = new javax.swing.JCheckBox();
        iconLight = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtMensagem = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));

        txtTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTitulo.setText("Insira sua conta Viss");

        txfInputLogin.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txfInputLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfInputLoginActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Usuario:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Senha:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel3.setText("Insira o CPF ou CNPJ");

        checkBox01.setText("Mostrar senha");
        checkBox01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBox01ActionPerformed(evt);
            }
        });

        lblIconOlho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/visivel.png"))); // NOI18N
        lblIconOlho.setText("22");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo-roxo-sem-fundo (1).png"))); // NOI18N

        checkBox02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBox02ActionPerformed(evt);
            }
        });

        iconLight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/notSun.png"))); // NOI18N

        jButton1.setBackground(new java.awt.Color(153, 0, 255));
        jButton1.setText("Logar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtMensagem.setForeground(new java.awt.Color(204, 0, 0));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/close.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/computer_guy.png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/coroninha_roxo.png"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/coroninha_roxo.png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/coroninha_roxo.png"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/coroninha_roxo.png"))); // NOI18N

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTitulo)
                                    .addGroup(backgroundLayout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addComponent(jLabel5))))
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(backgroundLayout.createSequentialGroup()
                                        .addComponent(iconLight, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(checkBox02))
                                    .addGroup(backgroundLayout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txfInputLogin, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel2)
                                                .addComponent(jLabel1)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txfInputSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(backgroundLayout.createSequentialGroup()
                                                .addGap(7, 7, 7)
                                                .addComponent(lblIconOlho, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(checkBox01))))))))
                        .addGap(0, 29, Short.MAX_VALUE)))
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addContainerGap())
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(72, 72, 72)))
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(32, 32, 32)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(70, 70, 70))
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel5))
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfInputLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfInputSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(checkBox01)
                            .addComponent(lblIconOlho, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkBox02, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(iconLight))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed

    }//GEN-LAST:event_kButton1ActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        UserDao userDao = new UserDao();
        Usuario user = new Usuario();
        SistemaLogin sistemaLogin = new SistemaLogin();

        user.setLoginCPF(txfInputLogin.getText());
        userDao.buscarDados(user);
        System.out.println();
        sistemaLogin.validarLogin(user, txfInputLogin.getText(), new String(txfInputSenha.getPassword()));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void checkBox02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBox02ActionPerformed
        if (checkBox02.isSelected()) {
            background.setBackground(Color.decode("#1C1C1C"));
            iconLight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sun.png")));
            jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/closeWhite.png")));
            jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/coroninha_verde.png")));
            jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/coroninha_verde.png")));
            jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/coroninha_verde.png")));
            jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/coroninha_verde.png")));
            jLabel1.setForeground(Color.WHITE);
            jLabel2.setForeground(Color.WHITE);
            jLabel3.setForeground(Color.WHITE);
            jLabel4.setForeground(Color.WHITE);
            jLabel5.setForeground(Color.WHITE);
            txtTitulo.setForeground(Color.WHITE);
            txfInputLogin.setBackground(Color.decode("#1C1C1C"));
            txfInputSenha.setBackground(Color.decode("#1C1C1C"));
            txfInputLogin.setForeground(Color.WHITE);
            txfInputSenha.setForeground(Color.WHITE);
        } else {
            background.setBackground(Color.white);
            iconLight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/notSun.png")));
            jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/close.png")));
            jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/coroninha_roxo.png")));
            jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/coroninha_roxo.png")));
            jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/coroninha_roxo.png")));
            jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/coroninha_roxo.png")));
            jLabel1.setForeground(Color.BLACK);
            jLabel2.setForeground(Color.BLACK);
            jLabel3.setForeground(Color.BLACK);
            jLabel4.setForeground(Color.BLACK);
            jLabel5.setForeground(Color.BLACK);
            txtTitulo.setForeground(Color.BLACK);
            txfInputLogin.setBackground(Color.WHITE);
            txfInputSenha.setBackground(Color.WHITE);
            txfInputLogin.setForeground(Color.BLACK);
            txfInputSenha.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_checkBox02ActionPerformed

    private void checkBox01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBox01ActionPerformed
        if (checkBox01.isSelected()) {
            txfInputSenha.setEchoChar('\u0000');
            lblIconOlho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/oculto.png")));
            checkBox01.setText("Ocultar senha");
        } else {
            txfInputSenha.setEchoChar(senha);
            lblIconOlho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/visivel.png")));
            checkBox01.setText("Mostrar senha");
        }
    }//GEN-LAST:event_checkBox01ActionPerformed

    private void txfInputLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfInputLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfInputLoginActionPerformed

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
            java.util.logging.Logger.getLogger(TelaSistemaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaSistemaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaSistemaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaSistemaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaSistemaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JCheckBox checkBox01;
    private javax.swing.JCheckBox checkBox02;
    private javax.swing.JLabel iconLight;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblIconOlho;
    private javax.swing.JTextField txfInputLogin;
    private javax.swing.JPasswordField txfInputSenha;
    private javax.swing.JLabel txtMensagem;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}
