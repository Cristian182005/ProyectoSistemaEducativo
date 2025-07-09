
package utp.SistemaEducativo.Unid01.Class.View;

import utp.SistemaEducativo.Unid01.Class.Tema03_ArregloBidimensional_02;
import javax.swing.JOptionPane;
import utp.SistemaEducativo.LoginView.LoginView;
import utp.SistemaEducativo.View.MenuPrincipalView;
import utp.SistemaEducativo.View.Unidad01_TeoriaView;
import utp.SistemaEducativo.View.Unidad02_TeoriaView;
import utp.SistemaEducativo.View.Unidad03_TeoriaView;
import utp.SistemaEducativo.View.Unidad04_TeoriaView;

public class Tema03_ArregloBidimensional02View extends javax.swing.JFrame {

    private Tema03_ArregloBidimensional_02 matriz;

    public Tema03_ArregloBidimensional02View() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtElementos = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaMostrarGraficamente = new javax.swing.JTextArea();
        jbMetrica = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txaMetrica = new javax.swing.JTextArea();
        btnMetrica = new javax.swing.JButton();
        btnMostraMatriz = new javax.swing.JButton();
        txtTamaño = new javax.swing.JTextField();
        lbElementos = new javax.swing.JLabel();
        lbTamaño = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        jLTitutoTema03 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaMostrar = new javax.swing.JTextArea();
        btnLimpiar = new javax.swing.JButton();
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
        btnVolver = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setMinimumSize(new java.awt.Dimension(1550, 750));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtElementos.setBackground(new java.awt.Color(255, 255, 255));
        txtElementos.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jPanel1.add(txtElementos, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 200, 370, 40));

        txaMostrarGraficamente.setBackground(new java.awt.Color(255, 255, 255));
        txaMostrarGraficamente.setColumns(20);
        txaMostrarGraficamente.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        txaMostrarGraficamente.setRows(5);
        jScrollPane2.setViewportView(txaMostrarGraficamente);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 450, 410, 170));

        jbMetrica.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jbMetrica.setForeground(new java.awt.Color(255, 255, 255));
        jbMetrica.setText("VERIFICACION DE METRICA: ");
        jPanel1.add(jbMetrica, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 270, -1, -1));

        txaMetrica.setBackground(new java.awt.Color(255, 255, 255));
        txaMetrica.setColumns(20);
        txaMetrica.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        txaMetrica.setRows(5);
        jScrollPane3.setViewportView(txaMetrica);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 310, 400, 270));

        btnMetrica.setBackground(new java.awt.Color(51, 153, 255));
        btnMetrica.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnMetrica.setForeground(new java.awt.Color(255, 255, 51));
        btnMetrica.setText("VERIFICAR");
        btnMetrica.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 255), 2, true));
        btnMetrica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMetricaActionPerformed(evt);
            }
        });
        jPanel1.add(btnMetrica, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 600, 140, 40));

        btnMostraMatriz.setBackground(new java.awt.Color(51, 153, 255));
        btnMostraMatriz.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnMostraMatriz.setForeground(new java.awt.Color(255, 255, 51));
        btnMostraMatriz.setText("MOSTRAR MATRIZ");
        btnMostraMatriz.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 255), 2, true));
        btnMostraMatriz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostraMatrizActionPerformed(evt);
            }
        });
        jPanel1.add(btnMostraMatriz, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 640, 200, 40));

        txtTamaño.setBackground(new java.awt.Color(255, 255, 255));
        txtTamaño.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        txtTamaño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTamañoActionPerformed(evt);
            }
        });
        jPanel1.add(txtTamaño, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 140, 210, 40));

        lbElementos.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        lbElementos.setForeground(new java.awt.Color(255, 255, 255));
        lbElementos.setText("INGRESAR ELEMENTOS: ");
        jPanel1.add(lbElementos, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, -1, 40));

        lbTamaño.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        lbTamaño.setForeground(new java.awt.Color(255, 255, 255));
        lbTamaño.setText("INGRESAR TAMAÑO:");
        jPanel1.add(lbTamaño, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, -1, 40));

        btnAgregar.setBackground(new java.awt.Color(51, 153, 255));
        btnAgregar.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 51));
        btnAgregar.setText("AGREGAR");
        btnAgregar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 255), 2, true));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 140, 130, 40));

        jLTitutoTema03.setFont(new java.awt.Font("Segoe UI Black", 1, 35)); // NOI18N
        jLTitutoTema03.setForeground(new java.awt.Color(255, 153, 51));
        jLTitutoTema03.setText("Arreglo Bidimensional - Matriz Simetrica y Asimetrica");
        jPanel1.add(jLTitutoTema03, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, -1, -1));

        txaMostrar.setBackground(new java.awt.Color(255, 255, 255));
        txaMostrar.setColumns(20);
        txaMostrar.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        txaMostrar.setRows(5);
        jScrollPane1.setViewportView(txaMostrar);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, 410, 170));

        btnLimpiar.setBackground(new java.awt.Color(51, 153, 255));
        btnLimpiar.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 51));
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 255), 2, true));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 200, 130, 40));

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
        btnMenuPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaEducativo/Images/LogoImage.png"))); // NOI18N
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

        jlLogoFB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaEducativo/Images/FB.png"))); // NOI18N
        BarraLateral.add(jlLogoFB, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 591, -1, -1));

        jlLogoTwitter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaEducativo/Images/Twitter.png"))); // NOI18N
        BarraLateral.add(jlLogoTwitter, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 591, -1, -1));

        jlLogoYoutube.setBackground(new java.awt.Color(255, 255, 255));
        jlLogoYoutube.setForeground(new java.awt.Color(255, 255, 255));
        jlLogoYoutube.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaEducativo/Images/YT.png"))); // NOI18N
        BarraLateral.add(jlLogoYoutube, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 591, -1, -1));

        jlLogoInstagram.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaEducativo/Images/IG.png"))); // NOI18N
        BarraLateral.add(jlLogoInstagram, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 647, -1, -1));

        jlLogoCorreo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaEducativo/Images/Correo.png"))); // NOI18N
        BarraLateral.add(jlLogoCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 647, -1, -1));

        jlCorreo01.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jlCorreo01.setForeground(new java.awt.Color(255, 255, 255));
        jlCorreo01.setText("sistemaeduca");
        BarraLateral.add(jlCorreo01, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 660, -1, -1));

        jlCorreo02.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jlCorreo02.setForeground(new java.awt.Color(255, 255, 255));
        jlCorreo02.setText("tivo@gmail.com");
        BarraLateral.add(jlCorreo02, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 683, -1, -1));

        jPanel1.add(BarraLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 760));

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
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 120, 40));

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaEducativo/Images/java.png"))); // NOI18N
        jPanel1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 20, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utp/SistemaEducativo/Images/ImageDarkBlue.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 1350, 750));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
                    sb.append("  \n");
                    simetrica = false;
                } else {
                    sb.append("  \n");
                }
            }
        }

        sb.append("\nLa matriz es ");
        sb.append(simetrica ? "SIMÉTRICA " : "ASIMÉTRICA ");

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

        matriz = new Tema03_ArregloBidimensional_02(tamaño);

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
            + "la matriz son: " + elementos + "\n");
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtTamañoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTamañoActionPerformed

    }//GEN-LAST:event_txtTamañoActionPerformed

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
        Unidad01_TeoriaView unidad1 = new Unidad01_TeoriaView();
        unidad1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverActionPerformed

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
            java.util.logging.Logger.getLogger(Tema03_ArregloBidimensional02View.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tema03_ArregloBidimensional02View.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tema03_ArregloBidimensional02View.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tema03_ArregloBidimensional02View.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tema03_ArregloBidimensional02View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BarraLateral;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnMenuPrincipal;
    private javax.swing.JButton btnMetrica;
    private javax.swing.JButton btnMostraMatriz;
    private javax.swing.JButton btnUnidad01;
    private javax.swing.JButton btnUnidad02;
    private javax.swing.JButton btnUnidad03;
    private javax.swing.JButton btnUnidad04;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLTitutoTema03;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel jbMetrica;
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
    private javax.swing.JLabel lbElementos;
    private javax.swing.JLabel lbTamaño;
    private javax.swing.JSeparator sprRedes;
    private javax.swing.JSeparator sprSubtituloRedes;
    private javax.swing.JSeparator sprSubtituloTeoria;
    private javax.swing.JSeparator sprSubtituloUnidades;
    private javax.swing.JSeparator sprTeoria;
    private javax.swing.JSeparator sprUnidades;
    private javax.swing.JTextArea txaMetrica;
    private javax.swing.JTextArea txaMostrar;
    private javax.swing.JTextArea txaMostrarGraficamente;
    private javax.swing.JTextField txtElementos;
    private javax.swing.JTextField txtTamaño;
    // End of variables declaration//GEN-END:variables
}
