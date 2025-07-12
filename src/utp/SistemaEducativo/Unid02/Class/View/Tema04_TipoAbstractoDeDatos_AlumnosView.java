
package utp.SistemaEducativo.Unid02.Class.View;

import utp.SistemaEducativo.Unid02.Class.Tema04p2_TipoAbstractoDeDatos_ListaAlumno;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class Tema04_TipoAbstractoDeDatos_AlumnosView extends javax.swing.JFrame {

    private static Tema04_TipoAbstractoDeDatos_AlumnosView instance;
    private final Tema04p2_TipoAbstractoDeDatos_ListaAlumno lista;

    public static Tema04_TipoAbstractoDeDatos_AlumnosView getInstance() {
        if (instance == null) {
            instance = new Tema04_TipoAbstractoDeDatos_AlumnosView();
        }
        return instance;
    }

    public Tema04_TipoAbstractoDeDatos_AlumnosView() {
        initComponents();
        lista = Tema04p2_TipoAbstractoDeDatos_ListaAlumno.getInstance();

        // Configurar combo box
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(
                new String[]{"INICIAL", "PRIMARIA", "SECUNDARIA"}));

        // Configurar tablas
        tbInicial.setModel(lista.getModeloTabla("INICIAL"));
        tbPrimaria.setModel(lista.getModeloTabla("PRIMARIA"));
        tbSecundaria.setModel(lista.getModeloTabla("SECUNDARIA"));

        // Configurar ventana
        setTitle("Registro de Alumnos");
        setSize(1007, 640);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Nombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        Apellido = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        Carrera = new javax.swing.JLabel();
        txtGrado = new javax.swing.JTextField();
        btnAgrega = new javax.swing.JButton();
        lblInicial = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbInicial = new javax.swing.JTable();
        btnRegresar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbPrimaria = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbSecundaria = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setForeground(new java.awt.Color(102, 102, 102));

        jLabel1.setText("AGREGAR ALUMNO");

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        Nombre.setText("Nombre");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        Apellido.setText("Apellido");

        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });

        Carrera.setText("Grado");

        txtGrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGradoActionPerformed(evt);
            }
        });

        btnAgrega.setText("AGREGAR");
        btnAgrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregaActionPerformed(evt);
            }
        });

        lblInicial.setText("Inicial");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "INICIAL", "PRIMARIA", "SECUNDARIA", " " }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Nombre)
                    .addComponent(Apellido)
                    .addComponent(Carrera)
                    .addComponent(lblInicial))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNombre)
                            .addComponent(txtApellido)
                            .addComponent(txtGrado))
                        .addGap(35, 35, 35))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(35, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(btnAgrega)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Apellido)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Carrera)
                    .addComponent(txtGrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInicial)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAgrega)
                .addContainerGap(101, Short.MAX_VALUE))
        );

        tbInicial.setBackground(new java.awt.Color(204, 204, 204));
        tbInicial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Apellido", "Grado"
            }
        ));
        jScrollPane1.setViewportView(tbInicial);

        btnRegresar.setBackground(new java.awt.Color(204, 204, 204));
        btnRegresar.setText("REGRESAR");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        tbPrimaria.setBackground(new java.awt.Color(204, 204, 204));
        tbPrimaria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Apellido", "Grado"
            }
        ));
        jScrollPane2.setViewportView(tbPrimaria);

        tbSecundaria.setBackground(new java.awt.Color(204, 204, 204));
        tbSecundaria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Apellido", "Grado"
            }
        ));
        jScrollPane3.setViewportView(tbSecundaria);

        jLabel2.setText("INICIAL");

        jLabel3.setText("PRIMARIA");

        jLabel4.setText("SECUNDARIA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1)
                        .addGap(149, 149, 149))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnRegresar)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 678, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane3))))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnRegresar)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        Tema04_TipoAbstractoDeDatos_BuscarAlumnoView.getInstance().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnAgregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregaActionPerformed
        try {
            validarCampos();

            String nombre = txtNombre.getText().trim();
            String apellido = txtApellido.getText().trim();
            int grado = Integer.parseInt(txtGrado.getText().trim());
            String nivel = (String) jComboBox1.getSelectedItem();

            lista.agregarAlumno(nombre, apellido, grado, nivel);
            actualizarTablas();
            limpiarCampos();
            txtNombre.requestFocus();

        } catch (NumberFormatException e) {
            mostrarError("El grado debe ser un número válido");
        } catch (IllegalArgumentException e) {
            mostrarError(e.getMessage());
        }
    }

    private void validarCampos() {
        if (txtNombre.getText().trim().isEmpty()) {
            throw new IllegalArgumentException("Nombre es obligatorio");
        }
        if (txtApellido.getText().trim().isEmpty()) {
            throw new IllegalArgumentException("Apellido es obligatorio");
        }
        if (txtGrado.getText().trim().isEmpty()) {
            throw new IllegalArgumentException("Grado es obligatorio");
        }
    }//GEN-LAST:event_btnAgregaActionPerformed

    private void txtGradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGradoActionPerformed
        txtApellido.requestFocus();
    }//GEN-LAST:event_txtGradoActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        txtGrado.requestFocus();
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        txtApellido.requestFocus();
    }//GEN-LAST:event_txtNombreActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        SwingUtilities.invokeLater(() -> {
            Tema04_TipoAbstractoDeDatos_AlumnosView.getInstance().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Apellido;
    private javax.swing.JLabel Carrera;
    private javax.swing.JLabel Nombre;
    private javax.swing.JButton btnAgrega;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblInicial;
    private javax.swing.JTable tbInicial;
    private javax.swing.JTable tbPrimaria;
    private javax.swing.JTable tbSecundaria;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtGrado;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    private void mostrarError(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }

    public void actualizarTablas() {
    
    DefaultTableModel modeloInicial = (DefaultTableModel) tbInicial.getModel();
    DefaultTableModel modeloPrimaria = (DefaultTableModel) tbPrimaria.getModel();
    DefaultTableModel modeloSecundaria = (DefaultTableModel) tbSecundaria.getModel();
    
    modeloInicial.setRowCount(0);
    modeloPrimaria.setRowCount(0);
    modeloSecundaria.setRowCount(0);
    
    Object[][] datosInicial = lista.obtenerDatosParaTabla("INICIAL");
    Object[][] datosPrimaria = lista.obtenerDatosParaTabla("PRIMARIA");
    Object[][] datosSecundaria = lista.obtenerDatosParaTabla("SECUNDARIA");

    for (Object[] fila : datosInicial) {
        modeloInicial.addRow(fila);
    }
    for (Object[] fila : datosPrimaria) {
        modeloPrimaria.addRow(fila);
    }
    for (Object[] fila : datosSecundaria) {
        modeloSecundaria.addRow(fila);
    }
}

    private void limpiarCampos() {
        txtNombre.setText("");
        txtApellido.setText("");
        txtGrado.setText("");
    }

}
