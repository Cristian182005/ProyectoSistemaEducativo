/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utp.SistemaEducativo.Unid04.Class;

/**
 *
 * @author usuario
 */
import utp.SistemaEducativo.Unid04.Class.Tema10p1_AGB_Nodo;
import java.util.Stack;

public class Tema10p2_AGB_ArbolExpresion {
    private Tema10p1_AGB_Nodo raiz;

    public void construirArbol(String expresion) {
        expresion = expresion.replaceAll("\\s+", "");
        char[] chars = expresion.toCharArray();
        
        Stack<Tema10p1_AGB_Nodo> nodos = new Stack<>();
        Stack<Character> ops = new Stack<>();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') {
                ops.push(chars[i]);
            } else if (chars[i] == ')') {
                while (ops.peek() != '(') {
                    Tema10p1_AGB_Nodo nodo = new Tema10p1_AGB_Nodo(ops.pop().toString());
                    nodo.derecho = nodos.pop();
                    nodo.izquierdo = nodos.pop();
                    nodos.push(nodo);
                }
                ops.pop();
            } else if (esOperador(chars[i])) {
                while (!ops.isEmpty() && precedencia(ops.peek()) >= precedencia(chars[i])) {
                    Tema10p1_AGB_Nodo nodo = new Tema10p1_AGB_Nodo(ops.pop().toString());
                    nodo.derecho = nodos.pop();
                    nodo.izquierdo = nodos.pop();
                    nodos.push(nodo);
                }
                ops.push(chars[i]);
            } else {
                StringBuilder num = new StringBuilder();
                while (i < chars.length && (Character.isDigit(chars[i]) || chars[i] == '.')) {
                    num.append(chars[i++]);
                }
                i--;
                nodos.push(new Tema10p1_AGB_Nodo(num.toString()));
            }
        }

        while (!ops.isEmpty()) {
            Tema10p1_AGB_Nodo nodo = new Tema10p1_AGB_Nodo(ops.pop().toString());
            nodo.derecho = nodos.pop();
            nodo.izquierdo = nodos.pop();
            nodos.push(nodo);
        }

        raiz = nodos.isEmpty() ? null : nodos.pop();
    }

    private boolean esOperador(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }

    private int precedencia(char op) {
        switch (op) {
            case '+':
            case '-': return 1;
            case '*':
            case '/': return 2;
            default: return 0;
        }
    }

    public String preorden() {
        return preorden(raiz);
    }

    private String preorden(Tema10p1_AGB_Nodo nodo) {
        if (nodo == null) return "";
        return nodo.valor + " " + preorden(nodo.izquierdo) + preorden(nodo.derecho);
    }

    public String inorden() {
        return inorden(raiz);
    }

    private String inorden(Tema10p1_AGB_Nodo nodo) {
        if (nodo == null) return "";
        if (nodo.izquierdo != null || nodo.derecho != null) {
            return "(" + inorden(nodo.izquierdo) + " " + nodo.valor + " " + inorden(nodo.derecho) + ")";
        }
        return nodo.valor;
    }

    public String postorden() {
        return postorden(raiz);
    }

    private String postorden(Tema10p1_AGB_Nodo nodo) {
        if (nodo == null) return "";
        return postorden(nodo.izquierdo) + postorden(nodo.derecho) + " " + nodo.valor;
    }
    
    public double evaluar() {
        return evaluar(raiz);
    }

    private double evaluar(Tema10p1_AGB_Nodo nodo) {
        if (nodo == null) return 0;
        
        // Si es un número
        if (nodo.izquierdo == null && nodo.derecho == null) {
            return Double.parseDouble(nodo.valor);
        }
        
        double izquierdo = evaluar(nodo.izquierdo);
        double derecho = evaluar(nodo.derecho);
        
        switch (nodo.valor) {
            case "+": return izquierdo + derecho;
            case "-": return izquierdo - derecho;
            case "*": return izquierdo * derecho;
            case "/": 
                if (derecho == 0) throw new ArithmeticException("División por cero");
                return izquierdo / derecho;
            default: throw new IllegalArgumentException("Operador no válido");
        }
    }

}