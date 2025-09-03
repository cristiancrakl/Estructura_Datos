/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elecciones;

/**
 *
 * @author crist
 */
public class Candidato {

    private String nombreCandidato;
    private String nombrePartido;
    private int numeroTarjeton;

    public Candidato(String nombreCandidato, String nombrePartido, int numeroTarjeton) {
        this.nombreCandidato = nombreCandidato;
        this.nombrePartido = nombrePartido;
        this.numeroTarjeton = numeroTarjeton;
    }

    public String getNombreCandidato() {
        return nombreCandidato;
    }

    public void setNombreCandidato(String nombreCandidato) {
        this.nombreCandidato = nombreCandidato;
    }

    public String getNombrePartido() {
        return nombrePartido;
    }

    public void setNombrePartido(String nombrePartido) {
        this.nombrePartido = nombrePartido;
    }

    public int getNumeroTarjeton() {
        return numeroTarjeton;
    }

    public void setNumeroTarjeton(int numeroTarjeton) {
        this.numeroTarjeton = numeroTarjeton;
    }

}
