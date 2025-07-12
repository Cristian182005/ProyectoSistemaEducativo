
package utp.SistemaEducativo.Unid01.Class.View;
 
import utp.SistemaEducativo.Unid01.Class.Tema01_ArregloUnidimensional;
import javax.swing.JOptionPane;
import utp.SistemaEducativo.LoginView.LoginView;
import utp.SistemaEducativo.View.MenuPrincipalView;
import utp.SistemaEducativo.View.Unidad01_TeoriaView;
import utp.SistemaEducativo.View.Unidad02_TeoriaView;
import utp.SistemaEducativo.View.Unidad03_TeoriaView;
import utp.SistemaEducativo.View.Unidad04_TeoriaView;

public class Tema01_ArregloUnidimensionalView extends javax.swing.JFrame {
    
    private Tema01_ArregloUnidimensional arreglo;
    
    public Tema01_ArregloUnidimensionalView() {
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
        txtRecorrido = new javax.swing.JTextField();
        txtDatos = new javax.swing.JTextField();
        txtTamaño = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnInsertarDatos = new javax.swing.JButton();
        btnActualizarDato = new javax.swing.JButton();
        btnBorrarDato = new javax.swing.JButton();
        btnBorrarArreglo = new javax.swing.JButton();
        btnRecorrerArreglo = new javax.swing.JButton();
        btnCrearArreglo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1550, 750));

        jPanel1.setMinimumSize(new java.awt.Dimension(1550, 750));
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

        jPanel1.add(BarraLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 760));

        txtRecorrido.setEditable(false);
        txtRecorrido.setBackground(new java.awt.Color(255, 255, 255));
        txtRecorrido.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jPanel1.add(txtRecorrido, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 440, 550, 90));

        txtDatos.setBackground(new java.awt.Color(255, 255, 255));
        txtDatos.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jPanel1.add(txtDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 250, 320, 40));

        txtTamaño.setBackground(new java.awt.Color(255, 255, 255));
        txtTamaño.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jPanel1.add(txtTamaño, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 180, 320, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Insertar datos del arreglo:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Insertar tamaño del arreglo: ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, -1, -1));

        btnInsertarDatos.setBackground(new java.awt.Color(51, 153, 255));
        btnInsertarDatos.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnInsertarDatos.setForeground(new java.awt.Color(255, 255, 51));
        btnInsertarDatos.setText("Insertar");
        btnInsertarDatos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 255), 2, true));
        btnInsertarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarDatosActionPerformed(evt);
            }
        });
        jPanel1.add(btnInsertarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 250, 160, 40));

        btnActualizarDato.setBackground(new java.awt.Color(51, 153, 255));
        btnActualizarDato.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnActualizarDato.setForeground(new java.awt.Color(255, 255, 51));
        btnActualizarDato.setText("Actualizar Dato");
        btnActualizarDato.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 255), 2, true));
        btnActualizarDato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarDatoActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizarDato, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 560, 160, 50));

        btnBorrarDato.setBackground(new java.awt.Color(51, 153, 255));
        btnBorrarDato.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnBorrarDato.setForeground(new java.awt.Color(255, 255, 51));
        btnBorrarDato.setText("Borrar Dato");
        btnBorrarDato.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 255), 2, true));
        btnBorrarDato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarDatoActionPerformed(evt);
            }
        });
        jPanel1.add(btnBorrarDato, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 560, 150, 50));

        btnBorrarArreglo.setBackground(new java.awt.Color(51, 153, 255));
        btnBorrarArreglo.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnBorrarArreglo.setForeground(new java.awt.Color(255, 255, 51));
        btnBorrarArreglo.setText("Borrar Arreglo");
        btnBorrarArreglo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarArregloActionPerformed(evt);
            }
        });
        jPanel1.add(btnBorrarArreglo, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 560, 170, 50));

        btnRecorrerArreglo.setBackground(new java.awt.Color(51, 153, 255));
        btnRecorrerArreglo.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnRecorrerArreglo.setForeground(new java.awt.Color(255, 255, 51));
        btnRecorrerArreglo.setText("Recorrer");
        btnRecorrerArreglo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 255), 2, true));
        btnRecorrerArreglo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecorrerArregloActionPerformed(evt);
            }
        });
        jPanel1.add(btnRecorrerArreglo, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 350, 160, 50));

        btnCrearArreglo.setBackground(new java.awt.Color(51, 153, 255));
        btnCrearArreglo.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnCrearArreglo.setForeground(new java.awt.Color(255, 255, 51));
        btnCrearArreglo.setText("Crear Arreglo");
        btnCrearArreglo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 255), 2, true));
        btnCrearArreglo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearArregloActionPerformed(evt);
            }
        });
        jPanel1.add(btnCrearArreglo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 180, 160, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 51));
        jLabel1.setText("Arreglos Unidimensionales - Operaciones Básicas");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, -1, -1));

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

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utp/SistemaEducativo/Images/java.png"))); // NOI18N
        jPanel1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 20, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utp/SistemaEducativo/Images/ImageDarkBlue.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 1350, 750));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarDatosActionPerformed
        if (arreglo == null) {
            JOptionPane.showMessageDialog(null, "Primero crea un arreglo.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String texto = txtDatos.getText().trim();
        if (texto.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese al menos un valor.", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String[] partes = texto.split(",");
        int insertados = 0;
        int noInsertados = 0;

        for (String parte : partes) {
            try {
                int valor = Integer.parseInt(parte.trim());
                if (arreglo.insertar(valor)) {
                    insertados++;
                } else {
                    noInsertados++;
                }
            } catch (NumberFormatException ex) {
                noInsertados++;
            }
        }

        String mensaje = "Valores insertados: " + insertados;
        if (noInsertados > 0) {
            mensaje += "\nNo se pudieron insertar " + noInsertados + " valores (error o arreglo lleno).";
        }

        JOptionPane.showMessageDialog(null, mensaje);
    }//GEN-LAST:event_btnInsertarDatosActionPerformed

    private void btnRecorrerArregloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecorrerArregloActionPerformed
        if (arreglo == null) {
            JOptionPane.showMessageDialog(null, "Primero crea un arreglo.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String contenido = arreglo.recorrer();
        txtRecorrido.setText(contenido.isEmpty() ? "Arreglo vacío" : contenido);
    }//GEN-LAST:event_btnRecorrerArregloActionPerformed

    private void btnCrearArregloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearArregloActionPerformed
        if (arreglo != null) {
            JOptionPane.showMessageDialog(null, "Ya existe un arreglo. Debes eliminarlo antes de crear uno nuevo.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            int tamaño = Integer.parseInt(txtTamaño.getText());
            if (tamaño > 0) {
                arreglo = new Tema01_ArregloUnidimensional(tamaño);
                JOptionPane.showMessageDialog(null, "Arreglo creado con tamaño " + tamaño);
            } else {
                JOptionPane.showMessageDialog(null, "El tamaño debe ser mayor que 0.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCrearArregloActionPerformed

    private void btnBorrarArregloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarArregloActionPerformed
        if (arreglo == null) {
            JOptionPane.showMessageDialog(null, "No hay ningún arreglo creado.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int confirmacion = JOptionPane.showConfirmDialog(
            null,
            "¿Estás seguro de que deseas eliminar el arreglo?",
            "Confirmar eliminación",
            JOptionPane.YES_NO_OPTION
        );

        if (confirmacion == JOptionPane.YES_OPTION) {
            arreglo = null;
            txtDatos.setText("");
            txtTamaño.setText("");
            txtRecorrido.setText("");
            JOptionPane.showMessageDialog(null, "Arreglo eliminado correctamente.");
        }
    }//GEN-LAST:event_btnBorrarArregloActionPerformed

    private void btnActualizarDatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarDatoActionPerformed
        if (arreglo == null) {
            JOptionPane.showMessageDialog(null, "Primero crea un arreglo.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            String inputPos = JOptionPane.showInputDialog(null, "Ingrese la posición que desea actualizar:");
            if (inputPos == null) return; // Cancelado

            int pos = Integer.parseInt(inputPos);

            String inputValor = JOptionPane.showInputDialog(null, "Ingrese el nuevo valor para la posición [" + pos + "]:");
            if (inputValor == null) return; // Cancelado

            int nuevoValor = Integer.parseInt(inputValor);

            boolean actualizado = arreglo.actualizar(pos, nuevoValor);

            if (actualizado) {
                JOptionPane.showMessageDialog(null, "Valor actualizado correctamente en la posición [" + pos + "].");
                txtRecorrido.setText(arreglo.recorrer());
            } else {
                JOptionPane.showMessageDialog(null, "Posición inválida. Fuera del rango actual.", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Debe ingresar números válidos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnActualizarDatoActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        Unidad01_TeoriaView unidad1 = new Unidad01_TeoriaView();
        unidad1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnBorrarDatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarDatoActionPerformed
        if (arreglo == null) {
            JOptionPane.showMessageDialog(null, "Primero crea un arreglo.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            String inputPos = JOptionPane.showInputDialog(null, "Ingrese la posición que desea eliminar:");
            if (inputPos == null) return; // Cancelado

            int pos = Integer.parseInt(inputPos);

            boolean eliminado = arreglo.eliminar(pos);

            if (eliminado) {
                JOptionPane.showMessageDialog(null, "Elemento en la posición [" + pos + "] eliminado correctamente.");
                txtRecorrido.setText(arreglo.recorrer());
            } else {
                JOptionPane.showMessageDialog(null, "Posición inválida. Fuera del rango actual.", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnBorrarDatoActionPerformed

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
            java.util.logging.Logger.getLogger(Tema01_ArregloUnidimensionalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tema01_ArregloUnidimensionalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tema01_ArregloUnidimensionalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tema01_ArregloUnidimensionalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tema01_ArregloUnidimensionalView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BarraLateral;
    private javax.swing.JButton btnActualizarDato;
    private javax.swing.JButton btnBorrarArreglo;
    private javax.swing.JButton btnBorrarDato;
    private javax.swing.JButton btnCrearArreglo;
    private javax.swing.JButton btnInsertarDatos;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnMenuPrincipal;
    private javax.swing.JButton btnRecorrerArreglo;
    private javax.swing.JButton btnUnidad01;
    private javax.swing.JButton btnUnidad02;
    private javax.swing.JButton btnUnidad03;
    private javax.swing.JButton btnUnidad04;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
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
    private javax.swing.JTextField txtDatos;
    private javax.swing.JTextField txtRecorrido;
    private javax.swing.JTextField txtTamaño;
    // End of variables declaration//GEN-END:variables
}
