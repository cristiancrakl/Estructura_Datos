package calculadora;

import javax.swing.JOptionPane;

public class CalculadoraLogica {

    public static void sumar(Double Num1, Double Num2) {

        Double resultado = Num1 + Num2;
        JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);

    }

    public static void restar(Double Num1, Double Num2) {

        Double resultado = Num1 - Num2;
        JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);

    }

    public static void multplicar(Double Num1, Double Num2) {

        Double resultado = Num1 * Num2;
        JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);

    }

    public static void dividir(Double Num1, Double Num2) {

        Double resultado = Num1 / Num2;
        JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);

    }

    public static void main(String[] args) {

    }

}
