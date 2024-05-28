/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooproyect;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author marif
 */
public class AlumnoCRUD {
    
    private static final String FILE_PATH ="MilAlumnos.txt";
    
    public void crearAlumno(Alumno alumno) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
            writer.write(alumno.toString());
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
    public List<Alumno> leerAlumnos() {
    List<Alumno> alumnos = new ArrayList<>();
    try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
        String line;
        while ((line = reader.readLine()) != null) {
            String[] fields = line.split(";");
            try {
                // Intenta convertir los campos de número a enteros
                int numCuenta = Integer.parseInt(fields[0]);
                int edad = Integer.parseInt(fields[6]);
                // Crea el objeto Alumno solo si las conversiones son exitosas
                Alumno alumno = new Alumno(
                        numCuenta,
                        fields[1],
                        fields[2],
                        fields[3],
                        fields[4],
                        fields[5],
                        edad
                );
                alumnos.add(alumno);
            } catch (NumberFormatException e) {
                // Maneja la excepción si hay un problema al convertir a entero
                System.err.println("Error al convertir a entero en línea: " + line);
                e.printStackTrace();
            }
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    return alumnos;
}

    
    public void actualizarAlumno(int numCuenta, Alumno actualizarAlumno) {
        List<Alumno> alumnos = leerAlumnos();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (Alumno alumno : alumnos) {
                if (alumno.getNumCuenta() == numCuenta) {
                    writer.write(actualizarAlumno.toString());
                } else {
                    writer.write(alumno.toString());
                }
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void eliminarAlumno(int numCuenta) {
        List<Alumno> alumnos = leerAlumnos();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (Alumno alumno : alumnos) {
                if (alumno.getNumCuenta() != numCuenta) {
                    writer.write(alumno.toString());
                    writer.newLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
}
