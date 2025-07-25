
package utp.SistemaEducativo.View;

import utp.SistemaEducativo.LoginView.LoginView;
import utp.SistemaEducativo.Unid03.Class.View.Tema09_Colas_Cliente01View;
import utp.SistemaEducativo.Unid03.Class.View.Tema09_Colas_Pelicula02View;
import utp.SistemaEducativo.Unid03.Tema08_ChatVirtual.VentanaChat;
import utp.SistemaEducativo.Unid03.Tema08_Reproductor.Interfaz;


public class Unidad03_TeoriaView extends javax.swing.JFrame {

    public Unidad03_TeoriaView() {
        initComponents();
        
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
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
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel1.add(BarraLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 750));

        jLabel2.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 51));
        jLabel2.setText("¡ BIENVENIDO A LA UNIDAD 03 !");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(255, 153, 51));
        jSeparator1.setForeground(new java.awt.Color(255, 153, 51));
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51), 2));
        jSeparator1.setMinimumSize(new java.awt.Dimension(0, 2));
        jSeparator1.setPreferredSize(new java.awt.Dimension(0, 2));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, 670, 3));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 19)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 51));
        jLabel3.setText(" Unidad de Aprendizaje 3: Pilas y Colas");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 51));
        jLabel4.setText(" ¡Bienvenido a la Unidad 03!");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText(" En esta unidad conocerás dos estructuras clave: pilas y colas,  ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, -1, 20));

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText(" utilizadas para organizar y procesar datos en un orden específico.");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText(" Aprenderás sus principios (LIFO y FIFO), operaciones básicas y ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText(" cómo implementarlas con arreglos y listas enlazadas, incluyendo ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText(" versiones dinámicas y con prioridad.");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText(" Te serán útiles para resolver problemas donde el orden de atención ");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText(" o ejecución es fundamental.");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 550, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utp/SistemaEducativo/Images/Unidad03.png"))); // NOI18N
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, 560, 290));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(775, 90, 5, 610));

        jLabel14.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 51));
        jLabel14.setText(" Tema 08: Pilas – Operaciones e Implementación");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 100, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("  Las pilas son estructuras que siguen el orden LIFO (último en entrar,");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 130, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("  primero en salir). Sus operaciones principales son push (insertar) y");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 160, -1, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("  Sus operaciones principales son push (insertar) y pop (eliminar). Se ");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 190, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("  implementan con arreglos o listas enlazadas, permitiendo manejar ");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 220, -1, 20));

        jLabel18.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("  datos de forma ordenada y dinámica.");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 250, -1, -1));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utp/SistemaEducativo/Images/java black.png"))); // NOI18N
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 290, -1, 30));

        jButton1.setBackground(new java.awt.Color(51, 153, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 51));
        jButton1.setText("EJERCICIO 01 DE TEMA 08");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 255), 2, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 290, 270, 30));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utp/SistemaEducativo/Images/java black.png"))); // NOI18N
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 340, -1, 30));

        jButton3.setBackground(new java.awt.Color(51, 153, 255));
        jButton3.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 51));
        jButton3.setText("EJERCICIO 02 DE TEMA 08");
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 255), 2, true));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 340, 270, 30));

        jLabel22.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 51));
        jLabel22.setText(" Tema 09: Colas – Operaciones e Implementación");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 390, -1, -1));

        jLabel23.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("  Las colas procesan los elementos en el orden en que llegan (FIFO).");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 430, -1, -1));

        jLabel24.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("  Se explican sus operaciones principales como enqueue (insertar) y");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 460, -1, -1));

        jLabel25.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("  dequeue (eliminar), así como su implementación con arreglos y listas");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 490, -1, 20));

        jLabel26.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("  enlazadas. También se abordan colas dinámicas y colas con prioridad,");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 520, -1, -1));

        jLabel28.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("  útiles para gestionar tareas según niveles de importancia.");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 550, -1, -1));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utp/SistemaEducativo/Images/java black.png"))); // NOI18N
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 590, -1, 30));

        jButton2.setBackground(new java.awt.Color(51, 153, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 51));
        jButton2.setText("EJERCICIO 01 DE TEMA 09");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 255), 2, true));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 590, 270, 30));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utp/SistemaEducativo/Images/java black.png"))); // NOI18N
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 630, -1, 30));

        jButton4.setBackground(new java.awt.Color(51, 153, 255));
        jButton4.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 51));
        jButton4.setText("EJERCICIO 02 DE TEMA 09");
        jButton4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 255), 2, true));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 630, 270, 30));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utp/SistemaEducativo/Images/java.png"))); // NOI18N
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utp/SistemaEducativo/Images/ImageDarkBlue.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 1350, 750));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        VentanaChat chat = new VentanaChat();
        chat.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Interfaz reproductor = new Interfaz();
        reproductor.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Tema09_Colas_Cliente01View clienteCola = new Tema09_Colas_Cliente01View();
        clienteCola.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Tema09_Colas_Pelicula02View peliculaCola = new Tema09_Colas_Pelicula02View();
        peliculaCola.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Unidad03_TeoriaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Unidad03_TeoriaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Unidad03_TeoriaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Unidad03_TeoriaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Unidad03_TeoriaView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BarraLateral;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnMenuPrincipal;
    private javax.swing.JButton btnUnidad01;
    private javax.swing.JButton btnUnidad02;
    private javax.swing.JButton btnUnidad03;
    private javax.swing.JButton btnUnidad04;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
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
    // End of variables declaration//GEN-END:variables
}
