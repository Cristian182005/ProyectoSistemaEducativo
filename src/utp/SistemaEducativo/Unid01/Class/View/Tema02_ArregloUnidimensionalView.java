/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package utp.SistemaEducativo.Unid01.Class.View;

import utp.SistemaEducativo.Unid01.Class.Tema02_AU;
import javax.swing.JOptionPane;
import utp.SistemaEducativo.LoginView.LoginView;
import utp.SistemaEducativo.View.MenuPrincipalView;
import utp.SistemaEducativo.View.Unidad01_TeoriaView;
import utp.SistemaEducativo.View.Unidad02_TeoriaView;
import utp.SistemaEducativo.View.Unidad03_TeoriaView;
import utp.SistemaEducativo.View.Unidad04_TeoriaView;
/**
 *
 * @author Cesar
 */
public class Tema02_ArregloUnidimensionalView extends javax.swing.JFrame {
private Tema02_AU arreglo1 = new Tema02_AU();
private Tema02_AU arreglo2 = new Tema02_AU();
private int arregloActivo = 1;
 
private Tema02_AU getArregloActivo() {
    return arregloActivo == 1 ? arreglo1 : arreglo2;
    
}

private void actualizarVistaDeArreglos() {
    StringBuilder sb = new StringBuilder();

    sb.append("📦 Arreglo 1: ");
    if (arreglo1.getCapacidad() > 0) {
        sb.append(arreglo1.mostrar()).append("\n");
    } else {
        sb.append("No creado.\n");
    }

    sb.append("📦 Arreglo 2: ");
    if (arreglo2.getCapacidad() > 0) {
        sb.append(arreglo2.mostrar()).append("\n");
    } else {
        sb.append("No creado.\n");
    }

    txtAreaMuestra.setText(sb.toString());
}
    public Tema02_ArregloUnidimensionalView() {
        initComponents();
        
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        txtTamaño = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaMuestra = new javax.swing.JTextArea();
        txtValores = new javax.swing.JTextField();
        btnBorrar = new javax.swing.JButton();
        btnComparar = new javax.swing.JButton();
        btnClonar = new javax.swing.JButton();
        btnFusionar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnSeleccionarArreglo1 = new javax.swing.JButton();
        btnSeleccionarArreglo2 = new javax.swing.JButton();
        txtAreaSalida = new javax.swing.JTextField();
        txtCrear = new javax.swing.JButton();
        btnInsertar = new javax.swing.JButton();
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
        jLabel35 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setMinimumSize(new java.awt.Dimension(1550, 750));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 51));
        jLabel1.setText("Arreglos Unidimensionales - Operaciones Avanzadas");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ingrese el tamaño de un arreglo:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, -1, -1));

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
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 100, 40));

        txtTamaño.setBackground(new java.awt.Color(255, 255, 255));
        txtTamaño.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jPanel1.add(txtTamaño, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 250, 200, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ingrese elementos del arreglo:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, -1, -1));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N

        txtAreaMuestra.setEditable(false);
        txtAreaMuestra.setBackground(new java.awt.Color(255, 255, 255));
        txtAreaMuestra.setColumns(20);
        txtAreaMuestra.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        txtAreaMuestra.setRows(5);
        jScrollPane1.setViewportView(txtAreaMuestra);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 470, 680, 150));

        txtValores.setBackground(new java.awt.Color(255, 255, 255));
        txtValores.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jPanel1.add(txtValores, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 340, 390, 40));

        btnBorrar.setBackground(new java.awt.Color(51, 153, 255));
        btnBorrar.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnBorrar.setForeground(new java.awt.Color(255, 255, 51));
        btnBorrar.setText("Borrar Arreglo");
        btnBorrar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 255), 2, true));
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 410, 160, 40));

        btnComparar.setBackground(new java.awt.Color(51, 153, 255));
        btnComparar.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnComparar.setForeground(new java.awt.Color(255, 255, 51));
        btnComparar.setText("Comparar");
        btnComparar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 255), 2, true));
        btnComparar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompararActionPerformed(evt);
            }
        });
        jPanel1.add(btnComparar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 640, 120, 40));

        btnClonar.setBackground(new java.awt.Color(51, 153, 255));
        btnClonar.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnClonar.setForeground(new java.awt.Color(255, 255, 51));
        btnClonar.setText("Clonar");
        btnClonar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 255), 2, true));
        btnClonar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClonarActionPerformed(evt);
            }
        });
        jPanel1.add(btnClonar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 640, 110, 40));

        btnFusionar.setBackground(new java.awt.Color(51, 153, 255));
        btnFusionar.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnFusionar.setForeground(new java.awt.Color(255, 255, 51));
        btnFusionar.setText("Fusionar");
        btnFusionar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 255), 2, true));
        btnFusionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFusionarActionPerformed(evt);
            }
        });
        jPanel1.add(btnFusionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 640, 110, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Seleccionar arreglo:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, -1, -1));

        btnSeleccionarArreglo1.setBackground(new java.awt.Color(51, 153, 255));
        btnSeleccionarArreglo1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnSeleccionarArreglo1.setForeground(new java.awt.Color(255, 255, 51));
        btnSeleccionarArreglo1.setText("Arreglo 1");
        btnSeleccionarArreglo1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 255), 2, true));
        btnSeleccionarArreglo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarArreglo1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnSeleccionarArreglo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 160, 130, 40));

        btnSeleccionarArreglo2.setBackground(new java.awt.Color(51, 153, 255));
        btnSeleccionarArreglo2.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnSeleccionarArreglo2.setForeground(new java.awt.Color(255, 255, 51));
        btnSeleccionarArreglo2.setText("Arreglo 2");
        btnSeleccionarArreglo2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 255), 2, true));
        btnSeleccionarArreglo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarArreglo2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnSeleccionarArreglo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 160, 130, 40));

        txtAreaSalida.setEditable(false);
        txtAreaSalida.setBackground(new java.awt.Color(255, 255, 255));
        txtAreaSalida.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jPanel1.add(txtAreaSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 160, 350, -1));

        txtCrear.setBackground(new java.awt.Color(51, 153, 255));
        txtCrear.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        txtCrear.setForeground(new java.awt.Color(255, 255, 51));
        txtCrear.setText("Crear");
        txtCrear.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 255), 2, true));
        txtCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCrearActionPerformed(evt);
            }
        });
        jPanel1.add(txtCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 250, 110, 40));

        btnInsertar.setBackground(new java.awt.Color(51, 153, 255));
        btnInsertar.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnInsertar.setForeground(new java.awt.Color(255, 255, 51));
        btnInsertar.setText("Insertar");
        btnInsertar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 255), 2, true));
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });
        jPanel1.add(btnInsertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 340, 120, 40));

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

        jPanel1.add(BarraLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 770));

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utp/SistemaEducativo/Images/java.png"))); // NOI18N
        jPanel1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 10, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utp/SistemaEducativo/Images/ImageDarkBlue.jpg"))); // NOI18N
        jLabel8.setText("jLabel4");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 1360, 770));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1562, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSeleccionarArreglo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarArreglo1ActionPerformed
        arregloActivo = 1;
        txtAreaSalida.setText("Trabajando con ARREGLO 1");
    }//GEN-LAST:event_btnSeleccionarArreglo1ActionPerformed

    private void btnSeleccionarArreglo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarArreglo2ActionPerformed
        arregloActivo = 2;
        txtAreaSalida.setText("Trabajando con ARREGLO 2");
    }//GEN-LAST:event_btnSeleccionarArreglo2ActionPerformed

    private void txtCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCrearActionPerformed
        try {
            int tamaño = Integer.parseInt(txtTamaño.getText());

            if (tamaño <= 0) {
                JOptionPane.showMessageDialog(null, "El tamaño debe ser mayor que 0.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            Tema02_AU arreglo = getArregloActivo();
            boolean creado = arreglo.crearArreglo(tamaño);

            if (creado) {
                JOptionPane.showMessageDialog(null, "Arreglo " + arregloActivo + " creado con tamaño " + tamaño + ".", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo crear el arreglo.", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Ingrese un número válido para el tamaño.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtCrearActionPerformed

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        if (getArregloActivo().getCapacidad() == 0) {
            JOptionPane.showMessageDialog(null, "Primero debes crear el arreglo.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String texto = txtValores.getText().trim();

        if (texto.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese al menos un valor.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int insertados = getArregloActivo().insertarVarios(texto);
        JOptionPane.showMessageDialog(null, insertados + " valores insertados en Arreglo " + arregloActivo + ".", "Insertado", JOptionPane.INFORMATION_MESSAGE);

      actualizarVistaDeArreglos();
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        Tema02_AU arreglo = getArregloActivo();

        if (arreglo.getCapacidad() == 0) {
            JOptionPane.showMessageDialog(null, "El arreglo " + arregloActivo + " no ha sido creado.", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(null, "¿Deseas borrar el arreglo " + arregloActivo + "?", "Confirmar", JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            arreglo.borrarArreglo();
            JOptionPane.showMessageDialog(null, "Arreglo " + arregloActivo + " eliminado.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            actualizarVistaDeArreglos();
        }
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnClonarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClonarActionPerformed
        Tema02_AU arreglo = getArregloActivo();

        if (arreglo.getCapacidad() == 0 || arreglo.getElementos() == 0) {
            JOptionPane.showMessageDialog(null, "No hay datos para clonar en el arreglo " + arregloActivo + ".", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int[] clon = arreglo.clonar();

        JOptionPane.showMessageDialog(null, "Clon del arreglo " + arregloActivo + " creado exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);

        // Mostrar el arreglo clonado en el TextArea sin alterar los originales
        StringBuilder sb = new StringBuilder();
        actualizarVistaDeArreglos(); // primero mostrar los arreglos originales
        sb.append(txtAreaMuestra.getText()).append("\n");
        sb.append("🧬 Clon del arreglo ").append(arregloActivo).append(": ");
        for (int i = 0; i < clon.length; i++) {
            sb.append("[").append(i).append("]=").append(clon[i]).append("  ");
        }

        txtAreaMuestra.setText(sb.toString());
    }//GEN-LAST:event_btnClonarActionPerformed

    private void btnFusionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFusionarActionPerformed
        Tema02_AU a1 = arreglo1;
        Tema02_AU a2 = arreglo2;

        if (a1.getCapacidad() == 0 || a2.getCapacidad() == 0) {
            JOptionPane.showMessageDialog(null, "Ambos arreglos deben estar creados para fusionarlos.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int[] fusion = a1.fusionar(a2.getArregloActual());

        JOptionPane.showMessageDialog(null, "Fusión completada: arreglo1 + arreglo2.", "Éxito", JOptionPane.INFORMATION_MESSAGE);

        // Mostrar ambos arreglos y la fusión en el TextArea
        StringBuilder sb = new StringBuilder();
        actualizarVistaDeArreglos(); // primero muestra los arreglos originales
        sb.append(txtAreaMuestra.getText()).append("\n");

        sb.append("🔗 Fusión (arreglo1 + arreglo2): ");
        for (int i = 0; i < fusion.length; i++) {
            sb.append("[").append(i).append("]=").append(fusion[i]).append("  ");
        }

        txtAreaMuestra.setText(sb.toString());
    }//GEN-LAST:event_btnFusionarActionPerformed

    private void btnCompararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompararActionPerformed
        if (arreglo1.getCapacidad() == 0 || arreglo2.getCapacidad() == 0) {
            JOptionPane.showMessageDialog(null, "Ambos arreglos deben estar creados para comparar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        boolean iguales = arreglo1.comparar(arreglo2.getArregloActual());

        // Mostrar resultado en un JOptionPane
        if (iguales) {
            JOptionPane.showMessageDialog(null, "Los arreglos son idénticos.", "Comparación", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Los arreglos son diferentes.", "Comparación", JOptionPane.INFORMATION_MESSAGE);
        }

        // Mostrar los dos arreglos y el resultado en el JTextArea
        StringBuilder sb = new StringBuilder();
        actualizarVistaDeArreglos(); // mostrar los dos arreglos
        sb.append(txtAreaMuestra.getText()).append("\n");
        sb.append("📌 Resultado de la comparación: ").append(iguales ? "Son iguales" : "Son diferentes");

        txtAreaMuestra.setText(sb.toString());
    }//GEN-LAST:event_btnCompararActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        Unidad01_TeoriaView teoria01 = new Unidad01_TeoriaView();
        teoria01.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverActionPerformed

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
            java.util.logging.Logger.getLogger(Tema02_ArregloUnidimensionalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tema02_ArregloUnidimensionalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tema02_ArregloUnidimensionalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tema02_ArregloUnidimensionalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tema02_ArregloUnidimensionalView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BarraLateral;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnClonar;
    private javax.swing.JButton btnComparar;
    private javax.swing.JButton btnFusionar;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnMenuPrincipal;
    private javax.swing.JButton btnSeleccionarArreglo1;
    private javax.swing.JButton btnSeleccionarArreglo2;
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
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
    private javax.swing.JTextArea txtAreaMuestra;
    private javax.swing.JTextField txtAreaSalida;
    private javax.swing.JButton txtCrear;
    private javax.swing.JTextField txtTamaño;
    private javax.swing.JTextField txtValores;
    // End of variables declaration//GEN-END:variables
}
