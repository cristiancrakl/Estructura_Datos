/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package crud_matrices;

import javax.swing.JOptionPane;

/**
 *
 * @author crist
 */
public class Crud_Matrices {

    private double[][] matriz;

    public void crearMatriz() {

        int columnasMatriz = Integer.parseInt(JOptionPane.showInputDialog("ingrese el grande del vector"));
        int filasMatriz = Integer.parseInt(JOptionPane.showInputDialog("ingrese el grande del vector"));
        matriz = new double[filasMatriz][columnasMatriz];

        for (int i = 0; i < matriz.length; i++) {
            for (int e = 0; e < matriz.length; e++) {

                matriz[i][e] = Integer
                        .parseInt(
                                JOptionPane
                                        .showInputDialog(
                                                "ingrese numero en la posicion" + (i) + "," + (e) + " de la matriz"));

            }

        }

        JOptionPane.showMessageDialog(null, "Su Matriz con tamaño " + columnasMatriz + filasMatriz + " fue creado");

    }

    public void eliminarIndice(int indiceFilas, int indiceColumnas) {

        matriz[indiceFilas][indiceColumnas] = 0;

    }

    public void actualizarIndice(int indice) {

    }

    public void leerVector() {

        for (int i = 0; i < matriz.length; i++) {
            for (int e = 0; e < matriz.length; e++) {

                System.out.println(matriz[i][e]);

            }

        }

    }

}
