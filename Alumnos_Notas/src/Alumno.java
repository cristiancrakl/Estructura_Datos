public class Alumno {

    private String nombre;
    private int edad;
    private double nota;

    public Alumno(String nombre, int edad, double nota) {
        this.nombre = nombre;
        this.edad = edad;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public void aprueba() {

        if (getNota() >= 3.0) {

            System.out.println("el alumno aprobo con nota de: " + getNota());

        } else {
            System.out.println("el alumno no logro aprobar con nota de: " + getNota());
        }

    }

    public void mostrarDatos() {

        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Nota: " + getNota());

    }

}
