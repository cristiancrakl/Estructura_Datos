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

        int columnasMatriz = Integer.parseInt(JOptionPane.showInputDialog("ingrese el grande de las filas"));
        int filasMatriz = Integer.parseInt(JOptionPane.showInputDialog("ingrese el grande de columnas"));
        matriz = new double[filasMatriz][columnasMatriz];

        for (int i = 0; i < filasMatriz; i++) {
            for (int e = 0; e < columnasMatriz; e++) {

                matriz[i][e] = Integer
                        .parseInt(
                                JOptionPane
                                        .showInputDialog(
                                                "ingrese numero en la posicion" + (i) + "," + (e) + " de la matriz"));

            }

        }

        JOptionPane.showMessageDialog(null,
                "Su Matriz con tamaño " + columnasMatriz + " , " + filasMatriz + " fue creado");

    }

    public void eliminarIndice() {

        int indiceFilas = Integer.parseInt(JOptionPane.showInputDialog("ingrese el indice de la fila a modificar"));
        int indiceColumnas = Integer
                .parseInt(JOptionPane.showInputDialog("ingrese el indice de la columna a modificar"));

        matriz[indiceFilas][indiceColumnas] = 0;

        JOptionPane.showMessageDialog(null, "indice borrado con exito");

    }

    public void actualizarIndice() {

        int indiceFilas = Integer.parseInt(JOptionPane.showInputDialog("ingrese el indice de la fila a modificar"));
        int indiceColumnas = Integer
                .parseInt(JOptionPane.showInputDialog("ingrese el indice de la columna a modificar"));

        matriz[indiceFilas][indiceColumnas] = Integer
                .parseInt(JOptionPane.showInputDialog("ingrese el numero de la fila a modificar"));

    }

    public void leerMatriz() {

        for (int i = 0; i < matriz.length; i++) {
            for (int e = 0; e < matriz[i].length; e++) {

                System.out.println(matriz[i][e]);

            }

        }

    }

}
