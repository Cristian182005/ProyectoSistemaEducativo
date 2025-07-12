/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package utp.SistemaEducativo.Unid02.Class.View;

import utp.SistemaEducativo.Unid02.Class.Tema07p1_ListaDoblementeEnlazada_NodoContacto;
import utp.SistemaEducativo.Unid02.Class.Tema07p2_ListaDoblementeEnlazada_ListaContacto;
import javax.swing.JOptionPane;
import utp.SistemaEducativo.LoginView.LoginView;
import utp.SistemaEducativo.View.MenuPrincipalView;
import utp.SistemaEducativo.View.Unidad01_TeoriaView;
import utp.SistemaEducativo.View.Unidad02_TeoriaView;
import utp.SistemaEducativo.View.Unidad03_TeoriaView;
import utp.SistemaEducativo.View.Unidad04_TeoriaView;

/**
 *
 * @author usuario
 */
public class Tema07_ListaDoblementeEnlazada_ContactoView extends javax.swing.JFrame {

    private Tema07p2_ListaDoblementeEnlazada_ListaContacto listaContactos;

    public Tema07_ListaDoblementeEnlazada_ContactoView() {
        initComponents();
        listaContactos = new Tema07p2_ListaDoblementeEnlazada_ListaContacto();
        actualizarVista();
        
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        Nombre = new javax.swing.JLabel();
        Telefono = new javax.swing.JLabel();
        Correo = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtTelf = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnTodos = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnAnte = new javax.swing.JButton();
        btnSigui = new javax.swing.JButton();
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
        jLabel1 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setMinimumSize(new java.awt.Dimension(1550, 750));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "AGENDA DE CONTACTOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(255, 255, 51))); // NOI18N

        Nombre.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        Nombre.setForeground(new java.awt.Color(255, 255, 51));
        Nombre.setText("NOMBRE");

        Telefono.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        Telefono.setForeground(new java.awt.Color(255, 255, 51));
        Telefono.setText("TELEFONO");

        Correo.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        Correo.setForeground(new java.awt.Color(255, 255, 51));
        Correo.setText("CORREO");

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        txtTelf.setBackground(new java.awt.Color(255, 255, 255));
        txtTelf.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N

        txtCorreo.setBackground(new java.awt.Color(255, 255, 255));
        txtCorreo.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N

        btnAgregar.setBackground(new java.awt.Color(51, 153, 255));
        btnAgregar.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 51));
        btnAgregar.setText("AGREGAR");
        btnAgregar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(51, 153, 255));
        btnEliminar.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 51));
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnTodos.setBackground(new java.awt.Color(51, 153, 255));
        btnTodos.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnTodos.setForeground(new java.awt.Color(255, 255, 51));
        btnTodos.setText("CONTACTOS");
        btnTodos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        btnTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTodosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Telefono, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(Correo, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(80, 80, 80)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTelf, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                            .addComponent(txtNombre)
                            .addComponent(txtCorreo)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Correo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCorreo))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28))
        );

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, -1, -1));

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CONTACTO ACTUAL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(255, 255, 51))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 51));
        jLabel4.setText("NOMBRE");

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 51));
        jLabel5.setText("TELEFONO");

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 51));
        jLabel6.setText("CORREO");

        jLabel7.setBackground(new java.awt.Color(51, 153, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N

        jLabel8.setBackground(new java.awt.Color(51, 153, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N

        jLabel9.setBackground(new java.awt.Color(51, 153, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 450, -1, -1));

        btnAnte.setBackground(new java.awt.Color(51, 153, 255));
        btnAnte.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnAnte.setForeground(new java.awt.Color(51, 51, 51));
        btnAnte.setText("ANTERIOR");
        btnAnte.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 255), 2, true));
        btnAnte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteActionPerformed(evt);
            }
        });
        jPanel3.add(btnAnte, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 490, 140, 50));

        btnSigui.setBackground(new java.awt.Color(51, 153, 255));
        btnSigui.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnSigui.setForeground(new java.awt.Color(51, 51, 51));
        btnSigui.setText("SIGUIENTE");
        btnSigui.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 255), 2, true));
        btnSigui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguiActionPerformed(evt);
            }
        });
        jPanel3.add(btnSigui, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 490, 140, 50));

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

        jPanel3.add(BarraLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 760));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 51));
        jLabel1.setText("Listas Doblemente Enlazadas y Circulares");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 850, -1));

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

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utp/SistemaEducativo/Images/ImageDarkBlue.jpg"))); // NOI18N
        jLabel10.setText("jLabel4");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 1370, 770));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1566, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnSiguiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguiActionPerformed
        listaContactos.siguiente();
    }//GEN-LAST:event_btnSiguiActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String nombre = txtNombre.getText().trim();
        String telefono = txtTelf.getText().trim();
        String correo = txtCorreo.getText().trim();

        if (!nombre.isEmpty()) {
            listaContactos.agregarContacto(nombre, telefono, correo);
            actualizarVista();
            limpiarCampos();

            // Mostrar mensaje de éxito
            JOptionPane.showMessageDialog(this,
                    "Contacto agregado exitosamente",
                    "Éxito",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this,
                    "El nombre es obligatorio",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        listaContactos.eliminarActual();
        actualizarVista();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAnteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteActionPerformed
        listaContactos.anterior();
        actualizarVista();
    }//GEN-LAST:event_btnAnteActionPerformed

    private void btnTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTodosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTodosActionPerformed

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
    private void actualizarVista() {
        Tema07p1_ListaDoblementeEnlazada_NodoContacto actual = listaContactos.getActual();

        if (actual != null) {
            jLabel8.setText(actual.getNombre());
            jLabel7.setText(actual.getTelefono());
            jLabel9.setText(actual.getCorreo());

            // Actualizar estado de los botones de navegación
            btnAnte.setEnabled(actual.getAnterior() != null);
            btnSigui.setEnabled(actual.getSiguiente() != null);

            // Mostrar posición actual en la lista
            int posicion = obtenerPosicionActual();
            this.setTitle("AGENDA DE CONTACTOS - Contacto " + posicion);
        } else {
            jLabel8.setText("---");
            jLabel7.setText("---");
            jLabel9.setText("---");
            btnAnte.setEnabled(false);
            btnSigui.setEnabled(false);
            this.setTitle("AGENDA DE CONTACTOS - Sin contactos");
        }
    }
    private int obtenerPosicionActual() {
    if (listaContactos.getActual() == null) return 0;
    
    int posicion = 1;
    Tema07p1_ListaDoblementeEnlazada_NodoContacto temp = listaContactos.getActual();
    
    // Retroceder hasta el inicio para contar la posición
    while (temp.getAnterior() != null) {
        temp = temp.getAnterior();
        posicion++;
    }
    
    return posicion;
}

    private void limpiarCampos() {
        txtNombre.setText("");
        txtTelf.setText("");
        txtCorreo.setText("");
        txtNombre.requestFocus();
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
            java.util.logging.Logger.getLogger(Tema07_ListaDoblementeEnlazada_ContactoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tema07_ListaDoblementeEnlazada_ContactoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tema07_ListaDoblementeEnlazada_ContactoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tema07_ListaDoblementeEnlazada_ContactoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new Tema07_ListaDoblementeEnlazada_ContactoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BarraLateral;
    private javax.swing.JLabel Correo;
    private javax.swing.JLabel Nombre;
    private javax.swing.JLabel Telefono;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAnte;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnMenuPrincipal;
    private javax.swing.JButton btnSigui;
    private javax.swing.JButton btnTodos;
    private javax.swing.JButton btnUnidad01;
    private javax.swing.JButton btnUnidad02;
    private javax.swing.JButton btnUnidad03;
    private javax.swing.JButton btnUnidad04;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
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
    private javax.swing.JSeparator sprRedes;
    private javax.swing.JSeparator sprSubtituloRedes;
    private javax.swing.JSeparator sprSubtituloTeoria;
    private javax.swing.JSeparator sprSubtituloUnidades;
    private javax.swing.JSeparator sprTeoria;
    private javax.swing.JSeparator sprUnidades;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelf;
    // End of variables declaration//GEN-END:variables
}
