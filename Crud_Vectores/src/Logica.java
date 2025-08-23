
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author crist
 */
public class Logica {

    int dimensionArray;
    int[] array;

    public void createArray() {

        dimensionArray = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese la dimension del array"));
        array = new int[dimensionArray];

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el numero en la poscion" + i));
        }

        JOptionPane.showMessageDialog(null, "array creado correctamente");

    }

    public void deleteArray() {

        int poscicionEliminar = Integer
                .parseInt(JOptionPane.showInputDialog(null, "ingrese la posicion del array a eliminar"));

        array[poscicionEliminar] = 0;

    }

    public void updateArray() {

        int poscicionActualizar = Integer
                .parseInt(JOptionPane.showInputDialog(null, "ingrese la posicion del array a actualizar"));

        array[poscicionActualizar] = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el numero"));

    }

    public void readArray() {

        for (int i : array) {
            JOptionPane.showMessageDialog(null, i);
        }

    }

}
