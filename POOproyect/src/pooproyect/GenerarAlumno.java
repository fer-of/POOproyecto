package pooproyect;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class GenerarAlumno {

    static ArrayList<Alumno> listaAlumnos = new ArrayList<>();

    public static void generarMilAlumnos() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("MilAlumnos.txt"))) {
            for (int i = 0; i < 1000; i++) {
                Alumno alumno = new Alumno(
                    i + 1,
                    GenerarDatosAlumno.obtenerNombre(),
                    GenerarDatosAlumno.obtenerApellido(),
                    GenerarDatosAlumno.obtenerApellido(),
                    GenerarHistorialAcademico.obtenerHistorial(),
                    GenerarDatosAlumno.obtenerDireccion(),
                    GenerarDatosAlumno.obtenerEdad()
                );
                listaAlumnos.add(alumno);
                writer.write(alumno.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
