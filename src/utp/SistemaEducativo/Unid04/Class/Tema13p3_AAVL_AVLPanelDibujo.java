
package utp.SistemaEducativo.Unid04.Class;

import utp.SistemaEducativo.Unid04.Class.Tema13p2_AAVL_AVLTree;
import utp.SistemaEducativo.Unid04.Class.Tema13p1_AAVL_NodoAVL;
import javax.swing.*;
import java.awt.*;

public class Tema13p3_AAVL_AVLPanelDibujo extends JPanel {
    private Tema13p2_AAVL_AVLTree arbol;

    public Tema13p3_AAVL_AVLPanelDibujo(Tema13p2_AAVL_AVLTree arbol) {
        this.arbol = arbol;
        setPreferredSize(new Dimension(800, 400));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (arbol.getRaiz() != null) {
            dibujarNodoAVL(g, arbol.getRaiz(), getWidth() / 2, 30, getWidth() / 4);
        }
    }
private void dibujarNodoAVL(Graphics g, Tema13p1_AAVL_NodoAVL nodo, int x, int y, int separacion) {
    if (nodo == null) return;

    // Dibuja el círculo y el valor
    g.setColor(Color.CYAN);
    g.fillOval(x - 15, y - 15, 30, 30);
    g.setColor(Color.BLACK);
    g.drawOval(x - 15, y - 15, 30, 30);
    g.drawString(String.valueOf(nodo.getValor()), x - 6, y + 5); // ✅ usar getter

    // Dibuja la línea hacia la izquierda
    if (nodo.getIzquierda() != null) {
        g.drawLine(x, y, x - separacion, y + 50);
        dibujarNodoAVL(g, nodo.getIzquierda(), x - separacion, y + 50, separacion / 2);
    }

    // Dibuja la línea hacia la derecha
    if (nodo.getDerecha() != null) {
        g.drawLine(x, y, x + separacion, y + 50);
        dibujarNodoAVL(g, nodo.getDerecha(), x + separacion, y + 50, separacion / 2);
    }
     }
    }
