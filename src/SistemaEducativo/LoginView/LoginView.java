package SistemaEducativo.LoginView;

import SistemaEducativo.View.MenuPrincipalView;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginView extends javax.swing.JFrame {

    public LoginView() {
        initComponents();
        txtUsuario.setText("Ingrese su nombre de usuario");
        txpPassword.setEchoChar((char) 0);
        txpPassword.setText("******");

        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jlSesion = new javax.swing.JLabel();
        jlUsuario = new javax.swing.JLabel();
        jlContraseña = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtUsuario = new javax.swing.JTextField();
        txpPassword = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        btnLogin = new javax.swing.JButton();
        chbMostrar = new javax.swing.JCheckBox();
        jlImagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));

        jPanel1.setMinimumSize(new java.awt.Dimension(1550, 750));
        jPanel1.setPreferredSize(new java.awt.Dimension(1550, 750));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlSesion.setBackground(new java.awt.Color(51, 153, 255));
        jlSesion.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jlSesion.setForeground(new java.awt.Color(51, 153, 255));
        jlSesion.setText("INICIAR SESIÓN");
        jPanel2.add(jlSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, -1, -1));

        jlUsuario.setBackground(new java.awt.Color(51, 153, 255));
        jlUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlUsuario.setForeground(new java.awt.Color(51, 153, 255));
        jlUsuario.setText("USUARIO");
        jPanel2.add(jlUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, -1, -1));

        jlContraseña.setBackground(new java.awt.Color(51, 153, 255));
        jlContraseña.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlContraseña.setForeground(new java.awt.Color(51, 153, 255));
        jlContraseña.setText("CONTRASEÑA");
        jPanel2.add(jlContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(51, 153, 255));
        jSeparator1.setForeground(new java.awt.Color(51, 153, 255));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 321, 10));

        txtUsuario.setBackground(new java.awt.Color(255, 255, 255));
        txtUsuario.setForeground(new java.awt.Color(51, 51, 51));
        txtUsuario.setBorder(null);
        txtUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsuarioFocusLost(evt);
            }
        });
        jPanel2.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 321, 34));

        txpPassword.setBackground(new java.awt.Color(255, 255, 255));
        txpPassword.setBorder(null);
        txpPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txpPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txpPasswordFocusLost(evt);
            }
        });
        txpPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txpPasswordActionPerformed(evt);
            }
        });
        jPanel2.add(txpPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 320, 30));

        jSeparator2.setBackground(new java.awt.Color(51, 153, 255));
        jSeparator2.setForeground(new java.awt.Color(51, 153, 255));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 321, 10));

        btnLogin.setBackground(new java.awt.Color(51, 153, 255));
        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("LOGIN");
        btnLogin.setBorder(null);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel2.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, 321, 34));

        chbMostrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        chbMostrar.setForeground(new java.awt.Color(0, 0, 0));
        chbMostrar.setText("Mostrar");
        chbMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbMostrarActionPerformed(evt);
            }
        });
        jPanel2.add(chbMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 530, 500));

        jlImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaEducativo/Images/ImageDarkBlue.jpg"))); // NOI18N
        jlImagen.setText("jLabel4");
        jPanel1.add(jlImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 1550, 780));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusLost
        if (txtUsuario.getText().isEmpty()) {
            txtUsuario.setText("Ingrese su nombre de usuario");
        }
    }//GEN-LAST:event_txtUsuarioFocusLost

    private void txtUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusGained
        if (txtUsuario.getText().equals("Ingrese su nombre de usuario")) {
            txtUsuario.setText("");
        }
    }//GEN-LAST:event_txtUsuarioFocusGained

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String usuario = txtUsuario.getText();
        String clave = String.valueOf(txpPassword.getPassword());

        if (usuario.equals("admin") && clave.equals("1234")) {
            JOptionPane.showMessageDialog(this, "BIENVENIDO, " + usuario);
            MenuPrincipalView login = new MenuPrincipalView();
            login.setVisible(true);
            this.setVisible(false);
            txpPassword.setText("");
            txtUsuario.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "DATOS INVALIDOS", "ERROR", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnLoginActionPerformed

    private void txpPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txpPasswordFocusGained
        String pass = String.valueOf(txpPassword.getPassword());
        if (pass.equals("******")) {
            txpPassword.setText("");
            txpPassword.setEchoChar('*');
        }
    }//GEN-LAST:event_txpPasswordFocusGained

    private void txpPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txpPasswordFocusLost
        String pass = String.valueOf(txpPassword.getPassword());
        if (pass.isEmpty()) {
            txpPassword.setEchoChar((char) 0);
            txpPassword.setText("******");
        }
    }//GEN-LAST:event_txpPasswordFocusLost

    private void txpPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txpPasswordActionPerformed

    }//GEN-LAST:event_txpPasswordActionPerformed

    private void chbMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbMostrarActionPerformed
        if (chbMostrar.isSelected()) {
            txpPassword.setEchoChar((char) 0);
        } else {
            txpPassword.setEchoChar('*');
        }
    }//GEN-LAST:event_chbMostrarActionPerformed

    public JPasswordField getTxpPassword() {
        return txpPassword;
    }

    public void setTxpPassword(JPasswordField txpPassword) {
        this.txpPassword = txpPassword;
    }

    public JTextField getTxtUsuario() {
        return txtUsuario;
    }

    public void setTxtUsuario(JTextField txtUsuario) {
        this.txtUsuario = txtUsuario;
    }

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
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JCheckBox chbMostrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel jlContraseña;
    private javax.swing.JLabel jlImagen;
    private javax.swing.JLabel jlSesion;
    private javax.swing.JLabel jlUsuario;
    private javax.swing.JPasswordField txpPassword;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
