package pooproyect;

public class Alumno {
    String nombre, apellidoP, apellidoM, carrera, direccion, historialAcademico;
    int numCuenta, edad;

    public Alumno() {}

    public Alumno(int numCuenta, String nombre, String apellidoP, String apellidoM, String carrera, String direccion, int edad) {
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.carrera = carrera;
        this.direccion = direccion;
        this.numCuenta = numCuenta;
        this.edad = edad;
    }

    // Getters y Setters

    @Override
    public String toString() {
        return numCuenta + ";" + nombre + ";" + apellidoP + ";" + apellidoM + ";" + edad + ";" + direccion + ";" + carrera;
    }
}
