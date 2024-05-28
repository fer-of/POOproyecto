package pooproyect;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/**
 * Esta clase genera datos aleatorios para alumnos, como nombres, apellidos, edades y direcciones.
 */
public class GenerarDatosAlumno {

    static ArrayList<String> nombresFemeninos = leerNombresDesdeArchivo("nombresMujer.txt");
    static ArrayList<String> nombresMasculinos = leerNombresDesdeArchivo("nombresHombre.txt");
    static ArrayList<String> apellidos = leerNombresDesdeArchivo("apellidos.txt");
    static ArrayList<String> direccion = leerNombresDesdeArchivo("DireccionesDepuradas.txt");

    private static ArrayList<String> leerNombresDesdeArchivo(String rutaArchivo) {
        ArrayList<String> datos = new ArrayList<>();
        try (FileReader fr = new FileReader(rutaArchivo); BufferedReader br = new BufferedReader(fr)) {
            String linea;
            while ((linea = br.readLine()) != null) {
                datos.add(linea);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return datos;
    }

    public static int generarNumeroAleatorioEdad() {
        Random random = new Random();
        return random.nextInt(8) + 18;
    } 

    public static int generarNumeroAleatorioBound1() {
        Random random = new Random();
        return random.nextInt(2);
    }

    public static int generarNumeroAleatorioBoundi(int i) {
        Random random = new Random();
        return random.nextInt(i);
    }

    public static String obtenerNombreFemenino() {
        int i = generarNumeroAleatorioBoundi(49);
        return nombresFemeninos.get(i);
    }

    public static String obtenerNombreMasculino() {
        int i = generarNumeroAleatorioBoundi(49);
        return nombresMasculinos.get(i);
    }

    public static String obtenerApellido() {
        int i = generarNumeroAleatorioBoundi(99);
        return apellidos.get(i);
    }

    public static String obtenerNombre() {
        String nombres;
        int cantidadNombres = generarNumeroAleatorioBoundi(5);
        int sexo = generarNumeroAleatorioBound1();

        if (sexo == 1) {
            if (cantidadNombres == 1) {
                String nombre1 = obtenerNombreFemenino();
                String nombre2 = obtenerNombreFemenino();
                if (nombre1.equals(nombre2)) {
                    nombre2 = obtenerNombreFemenino();
                }
                nombres = nombre1 + ' ' + nombre2;
                return nombres;
            } else {
                String nombre = obtenerNombreFemenino();
                return nombre;
            }
        } else {
            if (cantidadNombres == 1) {
                String nombre1 = obtenerNombreMasculino();
                String nombre2 = obtenerNombreMasculino();
                if (nombre1.equals(nombre2)) {
                    nombre2 = obtenerNombreMasculino();
                }
                nombres = nombre1 + ' ' + nombre2;
                return nombres;
            } else {
                String nombre = obtenerNombreMasculino();
                return nombre;
            }
        }
    }

    public static int obtenerEdad() {
        return generarNumeroAleatorioEdad();
    }
    
    public static String obtenerDireccion() {
        int i = generarNumeroAleatorioBoundi(371);
        return direccion.get(i);
    }
}

    

    
