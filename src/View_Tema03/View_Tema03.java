package View_Tema03;

import CLASES.Tema03_Matriz;
import javax.swing.JOptionPane;
//import unidades.VentanaUnidad1;

public class View_Tema03 extends javax.swing.JFrame {

    private Tema03_Matriz matriz;

    public View_Tema03() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLTitutoTema03 = new javax.swing.JLabel();
        lbTamaño = new javax.swing.JLabel();
        lbElementos = new javax.swing.JLabel();
        txtTamaño = new javax.swing.JTextField();
        txtElementos = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaMostrar = new javax.swing.JTextArea();
        btnAgregar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaMostrarGraficamente = new javax.swing.JTextArea();
        jbMetrica = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txaMetrica = new javax.swing.JTextArea();
        btnMetrica = new javax.swing.JButton();
        btnMostraMatriz = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        btnUnidad02 = new javax.swing.JButton();
        btnUnidad03 = new javax.swing.JButton();
        btnUnidad01 = new javax.swing.JButton();
        btnUnidad04 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLTitutoTema03.setFont(new java.awt.Font("Segoe UI", 3, 22)); // NOI18N
        jLTitutoTema03.setText("Arreglo Bidimensional - Matriz Simetrica y Asimetrica");

        lbTamaño.setText("INGRESAR TAMAÑO:");

        lbElementos.setText("INGRESAR ELEMENTOS: ");

        txtTamaño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTamañoActionPerformed(evt);
            }
        });

        txaMostrar.setColumns(20);
        txaMostrar.setRows(5);
        jScrollPane1.setViewportView(txaMostrar);

        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        txaMostrarGraficamente.setColumns(20);
        txaMostrarGraficamente.setRows(5);
        jScrollPane2.setViewportView(txaMostrarGraficamente);

        jbMetrica.setText("VERIFICACION DE METRICA: ");

        txaMetrica.setColumns(20);
        txaMetrica.setRows(5);
        jScrollPane3.setViewportView(txaMetrica);

        btnMetrica.setText("VERIFICAR");
        btnMetrica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMetricaActionPerformed(evt);
            }
        });

        btnMostraMatriz.setText("MOSTRAR MATRIZ");
        btnMostraMatriz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostraMatrizActionPerformed(evt);
            }
        });

        btnAtras.setText("ATRAS");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        btnUnidad02.setText("UNIDAD 02");
        btnUnidad02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnidad02ActionPerformed(evt);
            }
        });

        btnUnidad03.setText("UNIDAD 03");
        btnUnidad03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnidad03ActionPerformed(evt);
            }
        });

        btnUnidad01.setText("UNIDAD 01");
        btnUnidad01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnidad01ActionPerformed(evt);
            }
        });

        btnUnidad04.setText("UNIDAD 04");
        btnUnidad04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnidad04ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbMetrica))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLTitutoTema03)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(97, 97, 97)
                                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(62, 62, 62)
                                        .addComponent(btnMostraMatriz, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbElementos)
                                            .addComponent(lbTamaño))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtTamaño, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtElementos, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(121, 121, 121)
                                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnMetrica, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(97, 97, 97))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUnidad01, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUnidad02, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUnidad03, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUnidad04, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUnidad02, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUnidad03, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUnidad01, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUnidad04, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(jLTitutoTema03)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbTamaño)
                            .addComponent(txtTamaño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbElementos)
                            .addComponent(txtElementos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnMostraMatriz, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(56, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jbMetrica)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3)
                        .addGap(18, 18, 18)
                        .addComponent(btnMetrica, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
        );

        jTabbedPane3.addTab("Arreglo Bidimensional", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        /*VentanaUnidad1 unidad01 = new VentanaUnidad1();
        unidad01.setVisible(true);
        this.setVisible(false);*/
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnMostraMatrizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostraMatrizActionPerformed
        if (matriz == null || matriz.getMatriz() == null || matriz.getMatriz().length == 0) {
            JOptionPane.showMessageDialog(this, "Primero debes agregar los datos de la matriz.");
            return;
        }

        int[][] original = matriz.getMatriz();
        int[][] inversa = matriz.getInversa();
        int n = matriz.getTamaño();

        StringBuilder sb = new StringBuilder();
        sb.append("Matriz formada:\n\n");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sb.append(original[i][j]).append("\t");
            }
            sb.append("\n");
        }

        sb.append("\nMatriz inversa (transpuesta):\n\n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sb.append(inversa[i][j]).append("\t");
            }
            sb.append("\n");
        }

        txaMostrarGraficamente.setText(sb.toString());
    }//GEN-LAST:event_btnMostraMatrizActionPerformed

    private void btnMetricaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMetricaActionPerformed
        if (matriz == null) {
            JOptionPane.showMessageDialog(this, "Primero debes agregar los datos de la matriz.");
            return;
        }

        int[][] datos = matriz.getMatriz();
        int n = matriz.getTamaño();

        StringBuilder sb = new StringBuilder();
        sb.append("Comparación para verificar simetría:\n\n");

        boolean simetrica = true;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sb.append("[").append(i).append("][").append(j).append("] = ").append(datos[i][j])
                        .append("  vs  ")
                        .append("[").append(j).append("][").append(i).append("] = ").append(datos[j][i]);

                if (datos[i][j] != datos[j][i]) {
                    sb.append("  ❌\n");
                    simetrica = false;
                } else {
                    sb.append("  ✅\n");
                }
            }
        }

        sb.append("\nLa matriz es ");
        sb.append(simetrica ? "SIMÉTRICA ✅" : "ASIMÉTRICA ❌");

        txaMetrica.setText(sb.toString());
    }//GEN-LAST:event_btnMetricaActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtTamaño.setText("");
        txtElementos.setText("");
        txaMostrar.setText("");
        txaMostrarGraficamente.setText("");
        txaMetrica.setText("");
        txtTamaño.requestFocus();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        int tamaño = Integer.parseInt(txtTamaño.getText());

        matriz = new Tema03_Matriz(tamaño);

        String elementos = txtElementos.getText().trim();
        String[] valores = elementos.split("\\s+|,"); // permite espacios o comas

        int n = matriz.getTamaño();

        if (valores.length != n * n) {
            JOptionPane.showMessageDialog(this, "Debes ingresar exactamente " + (n * n) + " elementos.");
            return;
        }

        int[][] datos = new int[n][n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                datos[i][j] = Integer.parseInt(valores[index++]);
            }
        }

        matriz.llenar(datos);
        txaMostrar.setText("\n"
                + "Tamaño de la matriz: " + tamaño + "x" + tamaño + "\n"
                + "\n"
                + "Los elementos de \n"
                + "la matriz son: " + elementos);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtTamañoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTamañoActionPerformed

    }//GEN-LAST:event_txtTamañoActionPerformed

    private void btnUnidad01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnidad01ActionPerformed
        /*VentanaUnidad1 unidad01 = new VentanaUnidad1();
        unidad01.setVisible(true);
        this.setVisible(false);*/
    }//GEN-LAST:event_btnUnidad01ActionPerformed

    private void btnUnidad02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnidad02ActionPerformed

    }//GEN-LAST:event_btnUnidad02ActionPerformed

    private void btnUnidad03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnidad03ActionPerformed

    }//GEN-LAST:event_btnUnidad03ActionPerformed

    private void btnUnidad04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnidad04ActionPerformed

    }//GEN-LAST:event_btnUnidad04ActionPerformed

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
            java.util.logging.Logger.getLogger(View_Tema03.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_Tema03.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_Tema03.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_Tema03.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_Tema03().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnMetrica;
    private javax.swing.JButton btnMostraMatriz;
    private javax.swing.JButton btnUnidad01;
    private javax.swing.JButton btnUnidad02;
    private javax.swing.JButton btnUnidad03;
    private javax.swing.JButton btnUnidad04;
    private javax.swing.JLabel jLTitutoTema03;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JLabel jbMetrica;
    private javax.swing.JLabel lbElementos;
    private javax.swing.JLabel lbTamaño;
    private javax.swing.JTextArea txaMetrica;
    private javax.swing.JTextArea txaMostrar;
    private javax.swing.JTextArea txaMostrarGraficamente;
    private javax.swing.JTextField txtElementos;
    private javax.swing.JTextField txtTamaño;
    // End of variables declaration//GEN-END:variables
}
