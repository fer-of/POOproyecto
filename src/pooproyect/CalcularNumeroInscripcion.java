package pooproyect;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Esta clase calcula el número de inscripción para los alumnos basado en un indicador escolar.
 * Ordena los alumnos según su indicador escolar y muestra el número de inscripción.
 */
public class CalcularNumeroInscripcion {

    public ArrayList<Integer> listaIndex = new ArrayList<>();
    public ArrayList<Float> listaIndicador = new ArrayList<>();

    public ArrayList<String> obtenerMaterias() {
        ArrayList<String> materias = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("MilAlumnos.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] tokens = linea.split(";");
                for (int i = 8; i < tokens.length; i += 3) {
                    materias.add(tokens[i]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return materias;
    }

    public ArrayList<Float> obtenerPromedios() {
        ArrayList<Integer> calificaciones = new ArrayList<>();
        ArrayList<Float> promedios = new ArrayList<>();
        float suma = 0f;
        try (BufferedReader br = new BufferedReader(new FileReader("MilAlumnos.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] tokens = linea.split(";");
                for (int i = 9; i < tokens.length; i += 3) {
                    try {
                        int calificacion = Integer.parseInt(tokens[i]);
                        calificaciones.add(calificacion);
                    } catch (NumberFormatException e) {
                        System.err.println("Error al convertir a entero: " + e.getMessage());
                    }
                }
                for (Integer e : calificaciones) {
                    suma += e;
                }
                
                promedios.add((Float) suma /calificaciones.size());
                calificaciones.clear();
                suma = 0;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return promedios;
    }

    public ArrayList<Float> obtenerEscolaridades() {
        ArrayList<Integer> calificaciones = new ArrayList<>();
        ArrayList<Float> escolaridad = new ArrayList<>();
        float suma = 0f;
        try (BufferedReader br = new BufferedReader(new FileReader("MilAlumnos.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] tokens = linea.split(";");
                for (int i = 9; i < tokens.length; i += 3) {
                    try {
                        int calificacion = Integer.parseInt(tokens[i]);
                        calificaciones.add(calificacion);
                    } catch (NumberFormatException e) {
                        System.err.println("Error al convertir a entero: " + e.getMessage());
                    }
                }
                for (Integer e : calificaciones) {
                    if(e > 5){
                        suma += 1;
                    }
                }
                
                escolaridad.add(((Float) suma /calificaciones.size())* 100);
                calificaciones.clear();
                suma = 0;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return escolaridad;
    }
    
    public ArrayList<Float> obtenerVelocidades() {
        ArrayList<Integer> creditos = new ArrayList<>();
        ArrayList<Float> velocidades = new ArrayList<>();
        float suma = 0f;
        int semestre = 1, numcreditos =1;
        try (BufferedReader br = new BufferedReader(new FileReader("MilAlumnos.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] tokens = linea.split(";");
                semestre = Integer.parseInt(tokens[6]);
                switch (semestre) {
                    case 1 -> numcreditos = 46;
                    case 2 -> numcreditos = 90;
                    case 3 -> numcreditos = 136;
                    case 4 -> numcreditos = 178;
                    case 5 -> numcreditos = 220;
                    case 6 -> numcreditos = 268;
                    case 7 -> numcreditos = 314;
                    case 8 -> numcreditos = 358;
                    case 9 -> numcreditos = 398;
                    case 10 -> numcreditos = 438;
                }
                for (int i = 10; i < tokens.length; i += 3) {
                    try {
                        int credito = Integer.parseInt(tokens[i]);
                        creditos.add(credito);
                    } catch (NumberFormatException e) {
                        System.err.println("Error al convertir a entero: " + e.getMessage());
                    }
                }
                for (Integer e : creditos) {
                        suma += e;
                }
                
                velocidades.add(((Float) suma /numcreditos)* 100);
                creditos.clear();
                suma = 0;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return velocidades;
    }
    
    public ArrayList<Float> calcularIndicadorEscolar() {
    ArrayList<Float> listaPromedios = this.obtenerPromedios();
    ArrayList<Float> listaEscolaridades = this.obtenerEscolaridades();
    ArrayList<Float> listaVelocidades = this.obtenerVelocidades();
    ArrayList<Float> listaIndicadorEscolar = new ArrayList<>();
    
    try {
        FileWriter fileWriter = new FileWriter("indexConIndicador.txt");
        PrintWriter printWriter = new PrintWriter(fileWriter);
        
        for (int i = 0; i < listaPromedios.size(); i++) {
            Integer j = i+1;
            float indicador = listaPromedios.get(i) * listaEscolaridades.get(i) * listaVelocidades.get(i);
            listaIndicadorEscolar.add(indicador);
            printWriter.println(j.toString() + ";" + indicador);
        }
        
        printWriter.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
    
    return listaIndicadorEscolar;
}
    
    
     public void obtenerNumeroDeInscripcion() {
         
        this.calcularIndicadorEscolar(); 
        ArrayList<String> listaIndexConIndicador = new ArrayList<>();
 
        try (BufferedReader br = new BufferedReader(new FileReader("indexConIndicador.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
               
                    try {
                        String calificacion = linea;
                        listaIndexConIndicador.add(calificacion);
                    } catch (NumberFormatException e) {
                        System.err.println("Error al convertir a entero: " + e.getMessage());
                    }
                  
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
               
        ArrayList<String> listaOrdenada = ordenarLista(listaIndexConIndicador);
         for (int i = 0; i < listaOrdenada.size(); i++) {
             System.out.println("Numero de Inscripcion : " + (i+1) + ", Numero de cuenta e indicador escolar: " + listaOrdenada.get(i));
         }
    }
     
         public static ArrayList<String> ordenarLista(ArrayList<String> lista) {
        // Convertir cada cadena en una clase intermedia que almacene el índice y el valor
        ArrayList<Elemento> elementos = new ArrayList<>();
        for (String item : lista) {
            String[] partes = item.split(";");
            int indice = Integer.parseInt(partes[0]);
            double valor = Double.parseDouble(partes[1]);
            elementos.add(new Elemento(indice, valor));
        }

        // Ordenar la lista de elementos por el valor en orden descendente (de mayor a menor)
        Collections.sort(elementos, (a, b) -> Double.compare(b.getValor(), a.getValor()));

        // Reconstruir la lista ordenada en el formato original
        ArrayList<String> listaOrdenada = new ArrayList<>();
        for (Elemento elemento : elementos) {
            listaOrdenada.add(elemento.getIndice() + ";" + elemento.getValor());
        }

        return listaOrdenada;
    }
    
}


