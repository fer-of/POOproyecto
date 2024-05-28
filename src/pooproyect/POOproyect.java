package pooproyect;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Esta clase representa un sistema de gestión de alumnos.
 * Permite crear, leer, actualizar y eliminar alumnos en un sistema.
 */
public class POOproyect {
    /**
     * El método principal que inicia la aplicación.
     * Permite interactuar con el usuario para realizar operaciones CRUD en alumnos.
     * @param args Argumentos de línea de comandos (no utilizado).
     */
    public static void main(String[] args) {
        AlumnoCRUD crud = new AlumnoCRUD();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Elije que deseas hacer: ");
            System.out.println("1. Crear un Alumno");
            System.out.println("2. Leer Alumnos");
            System.out.println("3. Actualizar Alumnos");
            System.out.println("4. Eliminar Alumno");
            System.out.println("5. Salir");

            int opciones = scanner.nextInt();
            scanner.nextLine(); 

            switch (opciones) {
                /**
                 *  
                 * Crear un nuevo alumno 
                 * Solicita información al usuario y crea un objeto Alumno
                 * Luego llama al método crearAlumno de la clase AlumnoCRUD
                 * para almacenar el alumno en el sistema.
                 * 
                 */
                case 1:
                    System.out.println("Ingresa el Numero de Cuenta:");
                    int numCuenta = scanner.nextInt();
                    scanner.nextLine(); // consume the newline
                    System.out.println("Ingresar Nombre/Nombres:");
                    String nombre = scanner.nextLine();
                    System.out.println("Ingresar apellido Paterno:");
                    String apellidoP = scanner.nextLine();
                    System.out.println("Ingresar apellido Materno:");
                    String apellidoM = scanner.nextLine();
                    System.out.println("Ingresar Carrera:");
                    String carrera = scanner.nextLine();
                    System.out.println("Ingresar Direccion:");
                    String direccion = scanner.nextLine();
                    System.out.println("Ingresar edad:");
                    int edad = scanner.nextInt();

                    Alumno nuevoAlumno = new Alumno(numCuenta, nombre, apellidoP, apellidoM, carrera, direccion, edad);
                    crud.crearAlumno(nuevoAlumno);
                    break;

                case 2:
                /**
                 * Leer y mostrar todos los alumnos almacenados en el sistema.
                 */
                    List<Alumno> alumnos = crud.leerAlumnos();
                    for (Alumno alumno : alumnos) {
                        System.out.println(alumno);
                    }
                    break;

                case 3:
                    /**
                     * Actualizar los datos de un alumno existente.
                     * Solicita al usuario el número de cuenta del alumno a actualizar
                     * y luego solicita la nueva información.
                     * Llama al método actualizarAlumno de la clase AlumnoCRUD
                     * para realizar la actualización.
                     */
                    System.out.println("Ingresar numero de cuenta del Alumno que se desea actualizar:");
                    int actualizarNumCuenta = scanner.nextInt();
                    scanner.nextLine(); // consume the newline

                    System.out.println("Ingresar el nuevo Nombre/Nombres:");
                    String nuevoNombre = scanner.nextLine();
                    System.out.println("Ingresar el nuevo apellido Paterno:");
                    String nuevoApellidoP = scanner.nextLine();
                    System.out.println("Ingresar el nuevo apellido Materno:");
                    String nuevoApellidoM = scanner.nextLine();
                    System.out.println("Ingresar la nueva carrera:");
                    String nuevoCarrera = scanner.nextLine();
                    System.out.println("Ingresar la nueva direccion:");
                    String nuevoDireccion = scanner.nextLine();
                    System.out.println("Ingresar la edad:");
                    int nuevoEdad = scanner.nextInt();

                    Alumno actualizarAlumno = new Alumno(actualizarNumCuenta, nuevoNombre, nuevoApellidoP, nuevoApellidoM, nuevoCarrera, nuevoDireccion, nuevoEdad);
                    crud.actualizarAlumno(actualizarNumCuenta, actualizarAlumno);
                    break;

                case 4:
                    /**
                     * Eliminar un alumno del sistema.
                     * Solicita al usuario el número de cuenta del alumno a eliminar
                     * y llama al método eliminarAlumno de la clase AlumnoCRUD
                     * para eliminar el alumno.
                     */
                    System.out.println("Ingresar el numero de cuenta que se desea eliminar:");
                    int eliminarNumCuenta = scanner.nextInt();
                    crud.eliminarAlumno(eliminarNumCuenta);
                    break;

                case 5:
                    /**
                     * Salir de la aplicación.
                     * Cierra el scanner y finaliza el programa.
                     */
                    System.out.println("Salir");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Esa opción no existe. Elije una opcion del menu valida");
            }
        }
    }
}

