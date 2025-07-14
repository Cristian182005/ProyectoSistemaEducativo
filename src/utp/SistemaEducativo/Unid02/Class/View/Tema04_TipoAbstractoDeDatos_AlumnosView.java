
package utp.SistemaEducativo.Unid02.Class.View;

import utp.SistemaEducativo.Unid02.Class.Tema04p2_TipoAbstractoDeDatos_ListaAlumno;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import utp.SistemaEducativo.LoginView.LoginView;
import utp.SistemaEducativo.View.MenuPrincipalView;
import utp.SistemaEducativo.View.Unidad01_TeoriaView;
import utp.SistemaEducativo.View.Unidad02_TeoriaView;
import utp.SistemaEducativo.View.Unidad03_TeoriaView;
import utp.SistemaEducativo.View.Unidad04_TeoriaView;

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
        
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
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
        jScrollPane2 = new javax.swing.JScrollPane();
        tbPrimaria = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbSecundaria = new javax.swing.JTable();
        btnRegresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        BarraLateral = new javax.swing.JPanel();
        jlTitulo01 = new javax.swing.JLabel();
        jlTitulo02 = new javax.swing.JLabel();
        btnMenuPrincipal = new javax.swing.JButton();
        jlTitulo03 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        btnUnidad01 = new javax.swing.JButton();
        sprUnidades = new javax.swing.JSeparator();
        jlSubtituloTeoria = new javax.swing.JLabel();
        sprSubtituloTeoria = new javax.swing.JSeparator();
        sprTeoria = new javax.swing.JSeparator();
        jlSubtituloUnidades = new javax.swing.JLabel();
        sprSubtituloUnidades = new javax.swing.JSeparator();
        btnUnidad02 = new javax.swing.JButton();
        btnUnidad03 = new javax.swing.JButton();
        btnUnidad04 = new javax.swing.JButton();
        sprRedes = new javax.swing.JSeparator();
        jlSubtituloRedes = new javax.swing.JLabel();
        sprSubtituloRedes = new javax.swing.JSeparator();
        jlLogoFB = new javax.swing.JLabel();
        jlLogoTwitter = new javax.swing.JLabel();
        jlLogoYoutube = new javax.swing.JLabel();
        jlLogoInstagram = new javax.swing.JLabel();
        jlLogoCorreo = new javax.swing.JLabel();
        jlCorreo01 = new javax.swing.JLabel();
        jlCorreo02 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setMinimumSize(new java.awt.Dimension(1550, 750));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 51));
        jLabel1.setText("AGREGAR ALUMNO");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, -1, -1));

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));

        Nombre.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        Nombre.setForeground(new java.awt.Color(255, 255, 255));
        Nombre.setText("NOMBRE");

        txtNombre.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        Apellido.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        Apellido.setForeground(new java.awt.Color(255, 255, 255));
        Apellido.setText("APELLIDO");

        txtApellido.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });

        Carrera.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        Carrera.setForeground(new java.awt.Color(255, 255, 255));
        Carrera.setText("GRADO");

        txtGrado.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        txtGrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGradoActionPerformed(evt);
            }
        });

        btnAgrega.setBackground(new java.awt.Color(51, 153, 255));
        btnAgrega.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        btnAgrega.setForeground(new java.awt.Color(255, 255, 51));
        btnAgrega.setText("AGREGAR");
        btnAgrega.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        btnAgrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregaActionPerformed(evt);
            }
        });

        lblInicial.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        lblInicial.setForeground(new java.awt.Color(255, 255, 255));
        lblInicial.setText("NIVEL DE EDUCACION");

        jComboBox1.setBackground(new java.awt.Color(51, 153, 255));
        jComboBox1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 255, 51));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "INICIAL", "PRIMARIA", "SECUNDARIA", " " }));
        jComboBox1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
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
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Nombre)
                                    .addComponent(Apellido))
                                .addGap(128, 128, 128)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                                    .addComponent(txtNombre)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblInicial)
                                    .addComponent(Carrera))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtGrado)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(btnAgrega, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Nombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtGrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Carrera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(lblInicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(30, 30, 30)
                .addComponent(btnAgrega, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, 430, 300));

        tbInicial.setBackground(new java.awt.Color(51, 153, 255));
        tbInicial.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        tbInicial.setForeground(new java.awt.Color(255, 255, 51));
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

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 160, -1, 130));

        tbPrimaria.setBackground(new java.awt.Color(51, 153, 255));
        tbPrimaria.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        tbPrimaria.setForeground(new java.awt.Color(255, 255, 51));
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

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 320, -1, 160));

        tbSecundaria.setBackground(new java.awt.Color(51, 153, 255));
        tbSecundaria.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        tbSecundaria.setForeground(new java.awt.Color(255, 255, 51));
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

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 510, -1, 160));

        btnRegresar.setBackground(new java.awt.Color(51, 153, 255));
        btnRegresar.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(255, 255, 51));
        btnRegresar.setText("BUSQUEDA DE ALUMNO");
        btnRegresar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 255), 2, true));
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel3.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 630, 250, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 51));
        jLabel2.setText("INICIAL");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 140, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 51));
        jLabel3.setText("PRIMARIA");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 300, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 51));
        jLabel4.setText("SECUNDARIA");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 490, -1, -1));

        BarraLateral.setBackground(new java.awt.Color(51, 153, 255));
        BarraLateral.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        BarraLateral.setForeground(new java.awt.Color(51, 153, 255));
        BarraLateral.setMinimumSize(new java.awt.Dimension(1550, 750));
        BarraLateral.setPreferredSize(new java.awt.Dimension(1550, 750));
        BarraLateral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlTitulo01.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        jlTitulo01.setForeground(new java.awt.Color(255, 255, 255));
        jlTitulo01.setText("SISTEMA EDUCATIVO");
        BarraLateral.add(jlTitulo01, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 16, 185, -1));

        jlTitulo02.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jlTitulo02.setForeground(new java.awt.Color(255, 255, 255));
        jlTitulo02.setText("ALGORITMO Y ESTRUCTURAS");
        BarraLateral.add(jlTitulo02, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 161, -1, -1));

        btnMenuPrincipal.setBackground(new java.awt.Color(51, 153, 255));
        btnMenuPrincipal.setForeground(new java.awt.Color(51, 153, 255));
        btnMenuPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utp/SistemaEducativo/Images/LogoImage.png"))); // NOI18N
        btnMenuPrincipal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 255), 2, true));
        btnMenuPrincipal.setContentAreaFilled(false);
        btnMenuPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuPrincipalActionPerformed(evt);
            }
        });
        BarraLateral.add(btnMenuPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 45, 135, 110));

        jlTitulo03.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jlTitulo03.setForeground(new java.awt.Color(255, 255, 255));
        jlTitulo03.setText("DE DATOS");
        BarraLateral.add(jlTitulo03, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 184, -1, -1));

        btnLogin.setBackground(new java.awt.Color(51, 153, 255));
        btnLogin.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("ACCESO");
        btnLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255), 2));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        BarraLateral.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 180, 41));

        btnUnidad01.setBackground(new java.awt.Color(51, 153, 255));
        btnUnidad01.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnUnidad01.setForeground(new java.awt.Color(255, 255, 255));
        btnUnidad01.setText("UNIDAD 01");
        btnUnidad01.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255), 2));
        btnUnidad01.setMaximumSize(new java.awt.Dimension(74, 30));
        btnUnidad01.setMinimumSize(new java.awt.Dimension(74, 30));
        btnUnidad01.setPreferredSize(new java.awt.Dimension(74, 30));
        btnUnidad01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnidad01ActionPerformed(evt);
            }
        });
        BarraLateral.add(btnUnidad01, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 353, 180, 41));

        sprUnidades.setBackground(new java.awt.Color(255, 255, 255));
        sprUnidades.setForeground(new java.awt.Color(255, 255, 255));
        sprUnidades.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        sprUnidades.setMinimumSize(new java.awt.Dimension(0, 2));
        sprUnidades.setPreferredSize(new java.awt.Dimension(0, 2));
        BarraLateral.add(sprUnidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 200, -1));

        jlSubtituloTeoria.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jlSubtituloTeoria.setForeground(new java.awt.Color(255, 255, 51));
        jlSubtituloTeoria.setText("INICIAR SESIÓN");
        BarraLateral.add(jlSubtituloTeoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, 13));

        sprSubtituloTeoria.setBackground(new java.awt.Color(255, 255, 255));
        sprSubtituloTeoria.setForeground(new java.awt.Color(255, 255, 255));
        BarraLateral.add(sprSubtituloTeoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 253, 187, 4));

        sprTeoria.setBackground(new java.awt.Color(255, 255, 255));
        sprTeoria.setForeground(new java.awt.Color(255, 255, 255));
        sprTeoria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        sprTeoria.setMinimumSize(new java.awt.Dimension(0, 2));
        sprTeoria.setPreferredSize(new java.awt.Dimension(0, 2));
        sprTeoria.setRequestFocusEnabled(false);
        BarraLateral.add(sprTeoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 219, 200, -1));

        jlSubtituloUnidades.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jlSubtituloUnidades.setForeground(new java.awt.Color(255, 255, 51));
        jlSubtituloUnidades.setText("BANDEJA DE UNIDADES");
        BarraLateral.add(jlSubtituloUnidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 319, -1, -1));

        sprSubtituloUnidades.setBackground(new java.awt.Color(255, 255, 255));
        sprSubtituloUnidades.setForeground(new java.awt.Color(255, 255, 255));
        BarraLateral.add(sprSubtituloUnidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 344, 178, -1));

        btnUnidad02.setBackground(new java.awt.Color(51, 153, 255));
        btnUnidad02.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnUnidad02.setForeground(new java.awt.Color(255, 255, 255));
        btnUnidad02.setText("UNIDAD 02");
        btnUnidad02.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255), 2));
        btnUnidad02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnidad02ActionPerformed(evt);
            }
        });
        BarraLateral.add(btnUnidad02, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 180, 41));

        btnUnidad03.setBackground(new java.awt.Color(51, 153, 255));
        btnUnidad03.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnUnidad03.setForeground(new java.awt.Color(255, 255, 255));
        btnUnidad03.setText("UNIDAD 03");
        btnUnidad03.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255), 2));
        btnUnidad03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnidad03ActionPerformed(evt);
            }
        });
        BarraLateral.add(btnUnidad03, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 447, 180, 41));

        btnUnidad04.setBackground(new java.awt.Color(51, 153, 255));
        btnUnidad04.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnUnidad04.setForeground(new java.awt.Color(255, 255, 255));
        btnUnidad04.setText("UNIDAD 04");
        btnUnidad04.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255), 2));
        btnUnidad04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnidad04ActionPerformed(evt);
            }
        });
        BarraLateral.add(btnUnidad04, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 494, 180, 41));

        sprRedes.setBackground(new java.awt.Color(255, 255, 255));
        sprRedes.setForeground(new java.awt.Color(255, 255, 255));
        sprRedes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        sprRedes.setMinimumSize(new java.awt.Dimension(0, 2));
        sprRedes.setPreferredSize(new java.awt.Dimension(0, 2));
        BarraLateral.add(sprRedes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 541, 200, -1));

        jlSubtituloRedes.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jlSubtituloRedes.setForeground(new java.awt.Color(255, 255, 51));
        jlSubtituloRedes.setText("REDES SOCIALES");
        BarraLateral.add(jlSubtituloRedes, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 550, -1, -1));

        sprSubtituloRedes.setBackground(new java.awt.Color(255, 255, 255));
        sprSubtituloRedes.setForeground(new java.awt.Color(255, 255, 255));
        BarraLateral.add(sprSubtituloRedes, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 575, 123, 10));

        jlLogoFB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utp/SistemaEducativo/Images/FB.png"))); // NOI18N
        BarraLateral.add(jlLogoFB, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 591, -1, -1));

        jlLogoTwitter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utp/SistemaEducativo/Images/Twitter.png"))); // NOI18N
        BarraLateral.add(jlLogoTwitter, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 591, -1, -1));

        jlLogoYoutube.setBackground(new java.awt.Color(255, 255, 255));
        jlLogoYoutube.setForeground(new java.awt.Color(255, 255, 255));
        jlLogoYoutube.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utp/SistemaEducativo/Images/YT.png"))); // NOI18N
        BarraLateral.add(jlLogoYoutube, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 591, -1, -1));

        jlLogoInstagram.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utp/SistemaEducativo/Images/IG.png"))); // NOI18N
        BarraLateral.add(jlLogoInstagram, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 647, -1, -1));

        jlLogoCorreo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utp/SistemaEducativo/Images/Correo.png"))); // NOI18N
        BarraLateral.add(jlLogoCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 647, -1, -1));

        jlCorreo01.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jlCorreo01.setForeground(new java.awt.Color(255, 255, 255));
        jlCorreo01.setText("sistemaeduca");
        BarraLateral.add(jlCorreo01, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 660, -1, -1));

        jlCorreo02.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jlCorreo02.setForeground(new java.awt.Color(255, 255, 255));
        jlCorreo02.setText("tivo@gmail.com");
        BarraLateral.add(jlCorreo02, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 683, -1, -1));

        jPanel3.add(BarraLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 780));

        jLabel11.setFont(new java.awt.Font("Segoe UI Black", 1, 40)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 153, 51));
        jLabel11.setText("Tipo Abstracto de Datos (TAD)");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, 660, -1));

        btnVolver.setBackground(new java.awt.Color(51, 153, 255));
        btnVolver.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 51));
        btnVolver.setText("Volver");
        btnVolver.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 255), 2, true));
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel3.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 120, 40));

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utp/SistemaEducativo/Images/java.png"))); // NOI18N
        jPanel3.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 20, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utp/SistemaEducativo/Images/ImageDarkBlue.jpg"))); // NOI18N
        jLabel12.setText("jLabel4");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 1380, 780));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1572, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 782, Short.MAX_VALUE)
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

    private void btnMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuPrincipalActionPerformed
        MenuPrincipalView menu = new MenuPrincipalView();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnMenuPrincipalActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        LoginView login = new LoginView();
        login.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnUnidad01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnidad01ActionPerformed
        Unidad01_TeoriaView teoria01 = new Unidad01_TeoriaView();
        teoria01.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnUnidad01ActionPerformed

    private void btnUnidad02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnidad02ActionPerformed
        Unidad02_TeoriaView teoria02 = new Unidad02_TeoriaView();
        teoria02.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnUnidad02ActionPerformed

    private void btnUnidad03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnidad03ActionPerformed
        Unidad03_TeoriaView teoria03 = new Unidad03_TeoriaView();
        teoria03.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnUnidad03ActionPerformed

    private void btnUnidad04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnidad04ActionPerformed
        Unidad04_TeoriaView teoria04 = new Unidad04_TeoriaView();
        teoria04.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnUnidad04ActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        Unidad02_TeoriaView unidad2 = new Unidad02_TeoriaView();
        unidad2.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverActionPerformed

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
    private javax.swing.JPanel BarraLateral;
    private javax.swing.JLabel Carrera;
    private javax.swing.JLabel Nombre;
    private javax.swing.JButton btnAgrega;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnMenuPrincipal;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnUnidad01;
    private javax.swing.JButton btnUnidad02;
    private javax.swing.JButton btnUnidad03;
    private javax.swing.JButton btnUnidad04;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel jlCorreo01;
    private javax.swing.JLabel jlCorreo02;
    private javax.swing.JLabel jlLogoCorreo;
    private javax.swing.JLabel jlLogoFB;
    private javax.swing.JLabel jlLogoInstagram;
    private javax.swing.JLabel jlLogoTwitter;
    private javax.swing.JLabel jlLogoYoutube;
    private javax.swing.JLabel jlSubtituloRedes;
    private javax.swing.JLabel jlSubtituloTeoria;
    private javax.swing.JLabel jlSubtituloUnidades;
    private javax.swing.JLabel jlTitulo01;
    private javax.swing.JLabel jlTitulo02;
    private javax.swing.JLabel jlTitulo03;
    private javax.swing.JLabel lblInicial;
    private javax.swing.JSeparator sprRedes;
    private javax.swing.JSeparator sprSubtituloRedes;
    private javax.swing.JSeparator sprSubtituloTeoria;
    private javax.swing.JSeparator sprSubtituloUnidades;
    private javax.swing.JSeparator sprTeoria;
    private javax.swing.JSeparator sprUnidades;
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
