/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.listasimple;

import javax.swing.JOptionPane;

/**
 *
 * @author SCIS2-01
 */
public class ListaSimple {

    Nodo primero;

    public ListaSimple() {
        primero = null;
    }

    public void inicio(String nombre, int edad) {

        Nodo nuevo = new Nodo();
        nuevo.setNombre(nombre);
        nuevo.setEdad(edad);
        nuevo.setDireccion(null);
        if (primero == null) {
            primero = nuevo;
        } else {
            nuevo.setDireccion(primero);
            primero = nuevo;
        }

    }

    public void consultar() {

        Nodo temporal = primero;
        if (temporal == null) {
            JOptionPane.showMessageDialog(null, "Lista vacia");
        } else {
            while (temporal != null) {
                JOptionPane.showMessageDialog(null,
                        "Nombre : " + temporal.getNombre() + " Edad : " + temporal.getEdad());

                temporal = temporal.getDireccion();
            }
        }
    }

    public void ultimo(String nombre, int edad) {
        Nodo nuevo = new Nodo();
        nuevo.setNombre(nombre);
        nuevo.setEdad(edad);
        nuevo.setDireccion(null);
        if (primero == null) {
            JOptionPane.showMessageDialog(null, "Lista vacia");
            primero = nuevo;
        } else {
            Nodo temporal = primero;
            while (temporal.getDireccion() != null) {
                temporal = temporal.getDireccion();
            }
            temporal.setDireccion(nuevo);

        }
    }

    public void adelante(String nombre, int edad, String bus) {
        Nodo nuevo = new Nodo();
        nuevo.setNombre(nombre);
        nuevo.setEdad(edad);
        nuevo.setDireccion(null);
        if (primero == null) {
            JOptionPane.showMessageDialog(null, "Lista vacia");

        } else {

            Nodo temporal = primero;
            do {
                if (temporal.getNombre().equals(bus)) {
                    nuevo.setDireccion(temporal.getDireccion());
                    temporal.setDireccion(nuevo);
                    break;
                }
                temporal = temporal.getDireccion();

            } while (temporal.getDireccion() != null);

        }

    }

}
