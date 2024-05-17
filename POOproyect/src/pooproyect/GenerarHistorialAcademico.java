/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooproyect;

import java.util.Random;

/**
 *
 * @author Diegi
 */
public class GenerarHistorialAcademico {
    
    static String carrera;
    
    
    
    public static int generarNumeroAleatorioCarrera() {
        Random random = new Random();
        return random.nextInt(15);
    }
    
    public static String obtenerCarrera() {
        int i = generarNumeroAleatorioCarrera();
        switch (i) {
            case 0 -> {
                carrera = "Ingenieria Aeroespacial";
            }
            case 1 -> {
                carrera = "Ingenieria Civil";
            }
            case 2 -> {
                carrera = "Ingenieria Geomatica";
            }
            case 3 -> {
                carrera = "Ingenieria Ambiental";
            }
            case 4 -> {
                carrera = "Ingenieria Geofisica";
            }
            case 5 -> {
                carrera = "Ingenieria Geologica";
            }
            case 6 -> {
                carrera = "Ingenieria Petrolera";
            }
            case 7 -> {
                carrera = "Ingenieria de Minas y Metalurgia";
            }
            case 8 -> {
                carrera = "Ingenieria en Computacion";
            }
            case 9 -> {
                carrera = "Ingenieria Electrica Electronica";
            }
            case 10 -> {
                carrera = "Ingenieria en Telecomunicaciones";
            }
            case 11 -> {
                carrera = "Ingenieria Mecanica";
            }
            case 12 -> {
                carrera = "Ingenieria Industrial";
            }
            case 13 -> {
                carrera = "Ingenieria Mecatronica";
            }
            case 14 -> {
                carrera = "Ingenieria en Sistemas Biomedicos";
            }

            default -> {
                System.out.println("No existe esa carrera");
            }
        }

        return carrera;
    }
    

}
