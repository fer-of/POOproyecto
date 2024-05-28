package pooproyect;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class POOproyect {
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
                    List<Alumno> alumnos = crud.leerAlumnos();
                    for (Alumno alumno : alumnos) {
                        System.out.println(alumno);
                    }
                    break;

                case 3:
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
                    System.out.println("Ingresar el numero de cuenta que se desea eliminar:");
                    int eliminarNumCuenta = scanner.nextInt();
                    crud.eliminarAlumno(eliminarNumCuenta);
                    break;

                case 5:
                    System.out.println("Salir");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Esa opción no existe. Elije una opcion del menu valida");
            }
        }
    }
}

