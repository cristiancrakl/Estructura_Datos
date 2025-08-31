/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package elecciones;

import javax.swing.JOptionPane;

/**
 *
 * @author crist
 */
public class Elecciones {

    String[] nombreCandidato;
    int[] nombreMesa;
    int[][] matriz;

    public void crearArrays(int numeroCandidatos, int numeroMesas) {

        nombreCandidato = new String[numeroCandidatos];
        nombreMesa = new int[numeroMesas];

        JOptionPane.showMessageDialog(null, "Correctamente Ingresado");

        for (int l = 0; l < nombreCandidato.length; l++) {
            nombreCandidato[l] = JOptionPane.showInputDialog(null, "ingrese el nombre del candidato" + (l + 1));

        }
        for (int k = 0; k < nombreMesa.length; k++) {
            nombreMesa[k] = k + 1;
        }
        matriz = new int[numeroCandidatos][numeroMesas];

        for (int i = 0; i < numeroCandidatos; i++) {
            for (int j = 0; j < numeroMesas; j++) {

                JOptionPane.showMessageDialog(null, "ingrese el numero de votos de " + nombreCandidato[i]);
                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null, "en la mesa " + nombreMesa[j]));

            }
        }

    }

    public void cantidadVotantes() {

        int votos = 0;

        for (int i = 0; i < nombreCandidato.length; i++) {
            for (int j = 0; j < nombreMesa.length; j++) {

                votos += matriz[i][j];

            }

        }

        JOptionPane.showMessageDialog(null, "El total de votos es: " + votos);

    }

    public void candidatoMasVotado() {

        int[] votosPorCadidatos = new int[nombreCandidato.length];

        for (int i = 0; i < nombreCandidato.length; i++) {
            for (int j = 0; j < nombreMesa.length; j++) {

                votosPorCadidatos[i] += matriz[i][j];

            }
        }

        boolean hayEmpate = false;
        int numeroDeEmpatados = 0;
        int candidatoMasVotado = 0;

        for (int i = 1; i < votosPorCadidatos.length; i++) {

            if (votosPorCadidatos[0] == votosPorCadidatos[i]) {

                numeroDeEmpatados++;

            }

        }
        for (int i = 0; i < votosPorCadidatos.length; i++) {

            if (candidatoMasVotado < votosPorCadidatos[i]) {

                candidatoMasVotado = votosPorCadidatos[i];

            }

        }

        if (numeroDeEmpatados > 0) {
            if (candidatoMasVotado == votosPorCadidatos[0]) {

                hayEmpate = true;

            }

        }

        if (hayEmpate == false) {

            for (int i = 0; i < votosPorCadidatos.length; i++) {

                if (candidatoMasVotado < votosPorCadidatos[i]) {

                    candidatoMasVotado = votosPorCadidatos[i];

                }

            }

            int candidatoIndex = 0;

            for (int i = 0; i < votosPorCadidatos.length; i++) {
                if (candidatoMasVotado == votosPorCadidatos[i]) {
                    candidatoIndex = i;

                }
            }

            JOptionPane.showMessageDialog(null,
                    "el candidato que saco mas votos fue " + nombreCandidato[candidatoIndex] + " con una votacion de:"
                            + candidatoMasVotado);

        } else {
            JOptionPane.showMessageDialog(null,
                    (numeroDeEmpatados + 1) + " candidatos tuvieron el mismo resultado asi que es un empate");

        }

    }

    public void promedioVotosMesa() {

        int[] votosPorMesas = new int[nombreMesa.length];

        for (int i = 0; i < nombreMesa.length; i++) {
            for (int j = 0; j < nombreCandidato.length; j++) {

                votosPorMesas[i] += matriz[j][i];

            }
        }

        int promedioVotos = 0;
        for (int i = 0; i < votosPorMesas.length; i++) {

            JOptionPane.showMessageDialog(null, "el promedio de votos de la mesa" + (nombreMesa[i]) + " es igual:"
                    + (promedioVotos = votosPorMesas[i] / nombreCandidato.length));

        }

    }

    public void mesaMasVotada() {

        int[] votosPorMesas = new int[nombreMesa.length];

        for (int i = 0; i < nombreMesa.length; i++) {
            for (int j = 0; j < nombreCandidato.length; j++) {

                votosPorMesas[i] += matriz[j][i];

            }
        }

        boolean hayEmpate = false;
        int numeroDeEmpatados = 0;
        int mesaMasVotada = 0;

        for (int i = 1; i < votosPorMesas.length; i++) {

            if (votosPorMesas[0] == votosPorMesas[i]) {

                numeroDeEmpatados++;

            }

        }
        for (int i = 0; i < votosPorMesas.length; i++) {

            if (mesaMasVotada < votosPorMesas[i]) {

                mesaMasVotada = votosPorMesas[i];

            }

        }

        if (numeroDeEmpatados > 0) {
            if (mesaMasVotada == votosPorMesas[0]) {

                hayEmpate = true;

            }

        }

        if (hayEmpate == false) {

            int mesaIndex = 0;

            for (int i = 0; i < votosPorMesas.length; i++) {
                if (mesaMasVotada == votosPorMesas[i]) {
                    mesaIndex = i;

                }
            }

            JOptionPane.showMessageDialog(null,
                    "la mesa que saco mas votos fue la mesa " + nombreMesa[mesaIndex] + " con una votacion de:"
                            + mesaMasVotada);

        } else {

            JOptionPane.showMessageDialog(null,
                    (numeroDeEmpatados + 1) + " mesas tuvieron el mismo resultado ");

        }

    }

    public void votosPorCadidato() {

        int[] votosPorCadidato = new int[nombreCandidato.length];

        for (int i = 0; i < nombreCandidato.length; i++) {
            for (int j = 0; j < nombreMesa.length; j++) {

                votosPorCadidato[i] += matriz[i][j];

            }
        }

        for (int i = 0; i < votosPorCadidato.length; i++) {
            JOptionPane.showMessageDialog(null,
                    "los votos del candidato " + nombreCandidato[i] + " fueron: " + votosPorCadidato[i]);
        }

    }

}
