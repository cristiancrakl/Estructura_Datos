/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.listacircular;

import javax.swing.JOptionPane;

/**
 *
 * @author SCIS-PC18
 */
public class Listacircular {
    Nodo primero;
    Nodo ultimo;

    Listacircular() {
        primero = null;
        ultimo = null;
    }

    public void crearLista() {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresar dato"));
        Nodo nuevo = new Nodo();
        nuevo.setNumero(numero);
        nuevo.setEnlace(nuevo);
        if (primero == null) {
            primero = nuevo;
            ultimo = nuevo;
        } else {
            nuevo.setEnlace(primero);
            primero = nuevo;
            ultimo.setEnlace(primero);
        }
    }

    public void consultar() {
        Nodo temporal = primero;
        if (temporal == null) {
            JOptionPane.showMessageDialog(null, "Lista vacia");
            return;
        }
        do {
            JOptionPane.showMessageDialog(null, "Valor: " + temporal.getNumero());
            temporal = temporal.getEnlace();
        } while (temporal != primero);
    }

    public void eliminar() {
        int valorEliminar = Integer.parseInt(JOptionPane.showInputDialog("Diga el valor a eliminar"));
        Nodo temporal = primero;
        Nodo anterior = null;
        if (temporal == null) {
            JOptionPane.showMessageDialog(null, "Lista vacia");
            return;
        }
        boolean encontrado = false;
        do {
            if (temporal.getNumero() == valorEliminar) {
                encontrado = true;
                if (temporal == primero && temporal == ultimo) {
                    primero = null;
                    ultimo = null;
                } else if (temporal == primero) {
                    primero = temporal.getEnlace();
                    ultimo.setEnlace(primero);
                } else if (temporal == ultimo) {
                    anterior.setEnlace(primero);
                    ultimo = anterior;
                } else {
                    anterior.setEnlace(temporal.getEnlace());
                }
                break;
            }
            anterior = temporal;
            temporal = temporal.getEnlace();
        } while (temporal != primero);
        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "Valor no encontrado");
        }
    }

    public void modificar() {
        int viejo = Integer.parseInt(JOptionPane.showInputDialog("Diga el valor a modificar"));
        int nuevo = Integer.parseInt(JOptionPane.showInputDialog("Diga el nuevo valor"));
        Nodo temporal = primero;
        if (temporal == null) {
            JOptionPane.showMessageDialog(null, "Lista vacia");
            return;
        }
        boolean encontrado = false;
        do {
            if (temporal.getNumero() == viejo) {
                temporal.setNumero(nuevo);
                encontrado = true;
                break;
            }
            temporal = temporal.getEnlace();
        } while (temporal != primero);
        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "Valor no encontrado");
        }
    }

}
