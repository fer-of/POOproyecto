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
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author Diegi
 */
public class GenerarAlumno {
    
    static int numAluRegistrados(){
    int numeroDeLineas=0;
    try {
        BufferedReader br;
        FileReader fr = new FileReader("Alumnos.txt");
        br = new BufferedReader (fr);
        String linea = br.readLine();
        while (linea != null) {
            numeroDeLineas++;
            linea = br.readLine();
        }
        br.close();
        System.out.println("Numero de alumnos registrados: "+ (numeroDeLineas));
    } catch (IOException ioe) {
        System.out.println("\n\nError al abrir o guardar el archivo: "); ioe.printStackTrace();
    }
    return numeroDeLineas;
   }
    
    static int numAluRegistrados=numAluRegistrados();
    
    public String generarNuevo(){
        String datos = "";
        datos = numAluRegistrados + "," + GenerarDatosAlumno.obtenerNombre()+ "," + GenerarDatosAlumno.obtenerApellido() + "," + GenerarDatosAlumno.obtenerApellido() + "," + GenerarDatosAlumno.obtenerEdad()+ ","+ GenerarHistorialAcademico.obtenerCarrera() + "," + GenerarDatosAlumno.obtenerDireccion();
        
        try{
            BufferedReader br;
            br = new BufferedReader(new InputStreamReader(System.in)); 
            FileWriter fw = new FileWriter ("Alumnos.txt"); 
            BufferedWriter bw= new BufferedWriter (fw); PrintWriter 
            salida = new PrintWriter (bw); salida.println(datos); 
            salida.close();
        } catch (IOException ioe) {
            System.out.println("\n\nError al abrir o guardar el archivo: "); 
            ioe.printStackTrace();
        } 
        
        numAluRegistrados++;
        return datos;
    }
    
}
