
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author crist
 */
public class crudLogica {

    private double[] vector;

    public void crearVector() {

        int grandeVector = Integer.parseInt(JOptionPane.showInputDialog("ingrese el grande del vector"));
        vector = new double[(grandeVector)];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = Integer
                    .parseInt(JOptionPane.showInputDialog("ingrese numero en la posicion" + (i + 1) + " del vector"));
        }

        JOptionPane.showMessageDialog(null, "Su vector con tamaño " + grandeVector + " fue creado");

    }

    public void eliminarIndice(int indice) {

        vector[indice] = 0;

    }

    public void actualizarIndice(int indice) {

    }

    public void leerVector() {

        for (double i : vector) {
            System.out.println(i);
        }
    }

}
