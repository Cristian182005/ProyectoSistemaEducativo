
package unidades;

import MenuPrincipal.VentanaPrincipal;
import View_Tema03.View_Tema03;

public class VentanaUnidad1 extends javax.swing.JFrame {

    public VentanaUnidad1() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnMenu = new javax.swing.JButton();
        jLTitulo = new javax.swing.JLabel();
        jBTema01 = new javax.swing.JButton();
        jBTema02 = new javax.swing.JButton();
        jBTema03 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtTema02 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        javax.swing.JTextArea txtTema01 = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtTema03 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        btnMenu.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        btnMenu.setText("Menú Principal");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        jLTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLTitulo.setText("Estructuras de Datos Estáticas");

        jBTema01.setText("Tema 01");
        jBTema01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTema01ActionPerformed(evt);
            }
        });

        jBTema02.setText("Tema 02");

        jBTema03.setText("Tema 03");
        jBTema03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTema03ActionPerformed(evt);
            }
        });

        txtTema02.setEditable(false);
        txtTema02.setColumns(20);
        txtTema02.setRows(2);
        txtTema02.setText("Operaciones con Arreglos Unidimensionales:  comparación, \nclonación, fusión.");
        txtTema02.setBorder(null);
        jScrollPane2.setViewportView(txtTema02);

        txtTema01.setEditable(false);
        txtTema01.setColumns(20);
        txtTema01.setRows(2);
        txtTema01.setText("Operaciones con arreglos unidimensionales: inserción, \nactualización, eliminación, recorrido, copia.");
        jScrollPane3.setViewportView(txtTema01);

        txtTema03.setEditable(false);
        txtTema03.setColumns(20);
        txtTema03.setRows(5);
        txtTema03.setTabSize(6);
        txtTema03.setText("Operaciones con Arreglos Bidimensionales:\n- Matrices cuadradas poco densas: Matriz triangular inferior, \n\tMatriz triangular superior, Matriz tridiagonal. \n\n- Matrices simétricas y asimétricas");
        jScrollPane1.setViewportView(txtTema03);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMenu)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBTema02, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBTema01, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBTema03, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLTitulo)))))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnMenu)
                .addGap(25, 25, 25)
                .addComponent(jLTitulo)
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBTema01, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                        .addGap(15, 15, 15))
                    .addComponent(jScrollPane3))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBTema02, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                        .addGap(11, 11, 11))
                    .addComponent(jScrollPane2))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBTema03, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                        .addGap(63, 63, 63))
                    .addComponent(jScrollPane1))
                .addGap(64, 64, 64))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        VentanaPrincipal principal = new VentanaPrincipal();
        principal.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnMenuActionPerformed

    private void jBTema01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTema01ActionPerformed
        
    }//GEN-LAST:event_jBTema01ActionPerformed

    private void jBTema03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTema03ActionPerformed
        View_Tema03 tema03 = new View_Tema03();
        tema03.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jBTema03ActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(VentanaUnidad1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaUnidad1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaUnidad1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaUnidad1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaUnidad1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton jBTema01;
    private javax.swing.JButton jBTema02;
    private javax.swing.JButton jBTema03;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea txtTema02;
    private javax.swing.JTextArea txtTema03;
    // End of variables declaration//GEN-END:variables
}
