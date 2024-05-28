/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooproyect;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Diegi
 */
/**
 * Esta clase representa un generador de historial académico para estudiantes.
 * Genera un historial de materias y calificaciones para una carrera específica.
 */
public class GenerarHistorialAcademico {
    
    static String carrera;
    static int semestre;
    
    static ArrayList<String> ListaMaterias = new ArrayList();
    static ArrayList<Integer> ListaCalificacion = new ArrayList();
    static ArrayList<Integer> ListaCreditos = new ArrayList();
    
    public static int generarCalificacion(){
        Random random = new Random();
        return random.nextInt(5)+5;
    }
    
    
    public static int generarSemestre() {
        Random random = new Random();
        return random.nextInt(3)+1;
    }
    
    public static int generarNumeroAleatorioCarrera() {
        Random random = new Random();
        return random.nextInt(15);
    }
    
    public static String obtenerHistorial() {
        int aleatorioCarrera = generarNumeroAleatorioCarrera();
        semestre = generarSemestre();
        aleatorioCarrera = 8;
        String historial="";
        switch (aleatorioCarrera) {
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
                historial = generarHistorialComputacion(semestre);
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

        return semestre + ";" +carrera + ";" + historial;
    }
    
   ///////////////////////////////////////////////////////////// 
    
   public static String generarHistorialComputacion(int semestre){
       
       String historialComputacion="";
               
       switch(semestre){
           case 1 -> {
               ListaMaterias.add("Algebra");
               ListaMaterias.add("CyGA");
               ListaMaterias.add("Quimica");
               ListaMaterias.add("Fundamentos de fisica");
               ListaMaterias.add("Fundamentos de programacion");
               
               for (int i = 0; i < 5; i++) {
                   ListaCalificacion.add(generarCalificacion());
               }
               
               if (ListaCalificacion.get(0)>5) {
                   ListaCreditos.add(8);
               }else{
                   ListaCreditos.add(0);
               }
               
               if (ListaCalificacion.get(1)>5) {
                   ListaCreditos.add(12);
               }else{
                   ListaCreditos.add(0);
               }
               
               if (ListaCalificacion.get(2)>5) {
                   ListaCreditos.add(10);
               }else{
                   ListaCreditos.add(0);
               }
               
               if (ListaCalificacion.get(3)>5) {
                   ListaCreditos.add(6);
               }else{
                   ListaCreditos.add(0);
               }
               
               if (ListaCalificacion.get(4)>5) {
                   ListaCreditos.add(10);
               }else{
                   ListaCreditos.add(0);
               }
               
               for (int i = 0; i < 4; i++) {
                   historialComputacion += ListaMaterias.get(i) + ";" + ListaCalificacion.get(i) + ";" + ListaCreditos.get(i)+ ";";
               }
               historialComputacion += ListaMaterias.get(4) + ";" + ListaCalificacion.get(4) + ";" + ListaCreditos.get(4);
               
               ListaMaterias.clear();
               ListaCalificacion.clear();
               ListaCreditos.clear();
               
            }
           
           
           
           case 2 -> {
               ListaMaterias.add("Algebra");
               ListaMaterias.add("CyGA");
               ListaMaterias.add("Quimica");
               ListaMaterias.add("Fundamentos de fisica");
               ListaMaterias.add("Fundamentos de programacion");
               ListaMaterias.add("Algebra lineal");
               ListaMaterias.add("Calculo Int");
               ListaMaterias.add("Mecanica");
               ListaMaterias.add("Redaccion");
               ListaMaterias.add("EDA");
               
               
               for (int i = 0; i < 10; i++) {
                   ListaCalificacion.add(generarCalificacion());
               }
               
               if (ListaCalificacion.get(0)>5) {
                   ListaCreditos.add(8);
               }else{
                   ListaCreditos.add(0);
               }
               
               if (ListaCalificacion.get(1)>5) {
                   ListaCreditos.add(12);
               }else{
                   ListaCreditos.add(0);
               }
               
               if (ListaCalificacion.get(2)>5) {
                   ListaCreditos.add(10);
               }else{
                   ListaCreditos.add(0);
               }
               
               if (ListaCalificacion.get(3)>5) {
                   ListaCreditos.add(6);
               }else{
                   ListaCreditos.add(0);
               }
               
               if (ListaCalificacion.get(4)>5) {
                   ListaCreditos.add(10);
               }else{
                   ListaCreditos.add(0);
               }
               
               if (ListaCalificacion.get(5)>5) {
                   ListaCreditos.add(8);
               }else{
                   ListaCreditos.add(0);
               }
               
               if (ListaCalificacion.get(6)>5) {
                   ListaCreditos.add(8);
               }else{
                   ListaCreditos.add(0);
               }
               
               if (ListaCalificacion.get(7)>5) {
                   ListaCreditos.add(12);
               }else{
                   ListaCreditos.add(0);
               }
               
               
               if (ListaCalificacion.get(8)>5) {
                   ListaCreditos.add(6);
               }else{
                   ListaCreditos.add(0);
               }
               
               if (ListaCalificacion.get(9)>5) {
                   ListaCreditos.add(10);
               }else{
                   ListaCreditos.add(0);
               }
               
               for (int i = 0; i < 9; i++) {
                   historialComputacion += ListaMaterias.get(i) + ";" + ListaCalificacion.get(i) + ";" + ListaCreditos.get(i)+ ";";
               }
               historialComputacion += ListaMaterias.get(9) + ";" + ListaCalificacion.get(9) + ";" + ListaCreditos.get(9);
               
               ListaMaterias.clear();
               ListaCalificacion.clear();
               ListaCreditos.clear();
               
            }
           
           case 3 -> {
               ListaMaterias.add("Algebra");
               ListaMaterias.add("CyGA");
               ListaMaterias.add("Quimica");
               ListaMaterias.add("Fundamentos de fisica");
               ListaMaterias.add("Fundamentos de programacion");
               ListaMaterias.add("Algebra lineal");
               ListaMaterias.add("Calculo Int");
               ListaMaterias.add("Mecanica");
               ListaMaterias.add("Redaccion");
               ListaMaterias.add("EDA");
               ListaMaterias.add("Probabilidad");
               ListaMaterias.add("Calculo vectorial");
               ListaMaterias.add("Ecuaciones diferenciales");
               ListaMaterias.add("Cultura y comunicacion");
               ListaMaterias.add("EDA 2");
               ListaMaterias.add("POO");
               
               
               for (int i = 0; i < 16; i++) {
                   ListaCalificacion.add(generarCalificacion());
               }
               
               if (ListaCalificacion.get(0)>5) {
                   ListaCreditos.add(8);
               }else{
                   ListaCreditos.add(0);
               }
               
               if (ListaCalificacion.get(1)>5) {
                   ListaCreditos.add(12);
               }else{
                   ListaCreditos.add(0);
               }
               
               if (ListaCalificacion.get(2)>5) {
                   ListaCreditos.add(10);
               }else{
                   ListaCreditos.add(0);
               }
               
               if (ListaCalificacion.get(3)>5) {
                   ListaCreditos.add(6);
               }else{
                   ListaCreditos.add(0);
               }
               
               if (ListaCalificacion.get(4)>5) {
                   ListaCreditos.add(10);
               }else{
                   ListaCreditos.add(0);
               }
               
               if (ListaCalificacion.get(5)>5) {
                   ListaCreditos.add(8);
               }else{
                   ListaCreditos.add(0);
               }
               
               if (ListaCalificacion.get(6)>5) {
                   ListaCreditos.add(8);
               }else{
                   ListaCreditos.add(0);
               }
               
               if (ListaCalificacion.get(7)>5) {
                   ListaCreditos.add(12);
               }else{
                   ListaCreditos.add(0);
               }
               
               
               if (ListaCalificacion.get(8)>5) {
                   ListaCreditos.add(6);
               }else{
                   ListaCreditos.add(0);
               }
               
               if (ListaCalificacion.get(9)>5) {
                   ListaCreditos.add(10);
               }else{
                   ListaCreditos.add(0);
               }
               
               if (ListaCalificacion.get(10)>5) {
                   ListaCreditos.add(8);
               }else{
                   ListaCreditos.add(0);
               }
               
               if (ListaCalificacion.get(11)>5) {
                   ListaCreditos.add(8);
               }else{
                   ListaCreditos.add(0);
               }
               
               if (ListaCalificacion.get(12)>5) {
                   ListaCreditos.add(8);
               }else{
                   ListaCreditos.add(0);
               }
               
               if (ListaCalificacion.get(13)>5) {
                   ListaCreditos.add(2);
               }else{
                   ListaCreditos.add(0);
               }
               
               if (ListaCalificacion.get(14)>5) {
                   ListaCreditos.add(10);
               }else{
                   ListaCreditos.add(0);
               }
               
               if (ListaCalificacion.get(15)>5) {
                   ListaCreditos.add(10);
               }else{
                   ListaCreditos.add(0);
               }
               
               if (ListaCalificacion.get(9)>5) {
                   ListaCreditos.add(10);
               }else{
                   ListaCreditos.add(0);
               }
               
               for (int i = 0; i < 15; i++) {
                   historialComputacion += ListaMaterias.get(i) + ";" + ListaCalificacion.get(i) + ";" + ListaCreditos.get(i)+ ";";
               }
               historialComputacion += ListaMaterias.get(15) + ";" + ListaCalificacion.get(15) + ";" + ListaCreditos.get(15);
               
               ListaMaterias.clear();
               ListaCalificacion.clear();
               ListaCreditos.clear();
               
            }  
               
       }
       
       return historialComputacion;
   } 
    
    
}
