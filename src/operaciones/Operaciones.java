package operaciones;

import busquedas.Busquedas;
import pojo.Alumno;
import pojo.Libro;
import pojo.Profesor;
import registrarPersona.MenuRegistro;
import validaciones.Validar;

import java.util.ArrayList;
import java.util.Scanner;

public class Operaciones {
    Busquedas busquedas = new Busquedas();
    Validar validar = new Validar();
    public void SolicitarPrestamo(Scanner scanner, ArrayList<Alumno> alumnoArrayList, ArrayList<Profesor> profesorArrayList, ArrayList<Libro> libroArrayList, MenuRegistro menuRegistro){
        int indexUsuario = busquedas.buscarUsuario(scanner,alumnoArrayList,profesorArrayList);
        if(indexUsuario!=-1){
            int librosPrestados = alumnoArrayList.get(indexUsuario).getLibrosPrestrados();
            if (librosPrestados < 3) {
                int indexLibro = busquedas.buscarLibro(scanner,libroArrayList);
                if(indexLibro!=-1){
                    int ejemplares = libroArrayList.get(indexLibro).getEjemplares();
                    if(ejemplares>0){
                        alumnoArrayList.get(indexUsuario).setLibrosPrestrados((librosPrestados+1));
                        libroArrayList.get(indexLibro).setEjemplares((ejemplares-1));
                        System.out.println("Libro Prestado");
                    }else System.out.println("Ejemplares no disponibles");
                }
            }else System.out.println("primero regresa un libro, mas de 3 prestados");
        }else{
            System.out.println("No registrado en el sistema, por favor registrate");
            menuRegistro.tipoRegristro(scanner,alumnoArrayList,profesorArrayList);
        }
    }
    public void regresarLibro(Scanner scanner, ArrayList<Alumno> alumnoArrayList, ArrayList<Profesor> profesorArrayList, ArrayList<Libro> libroArrayList, MenuRegistro menuRegistro){
        int indexUsuario = busquedas.buscarUsuario(scanner,alumnoArrayList,profesorArrayList);
        if(indexUsuario!=-1){
            if(alumnoArrayList.get(indexUsuario).getLibrosPrestrados()!=0){
                int indexLibro = busquedas.buscarLibro(scanner,libroArrayList);
                if(indexLibro!=-1){
                    int librosPrestados = alumnoArrayList.get(indexUsuario).getLibrosPrestrados();
                    alumnoArrayList.get(indexUsuario).setLibrosPrestrados((librosPrestados-1));
                    int ejemplares = libroArrayList.get(indexLibro).getEjemplares();
                    libroArrayList.get(indexLibro).setEjemplares((ejemplares+1));
                    System.out.println("Libro regresado");
                }
            }else System.out.println("no tienes libros en prestamo");
        }else{
            System.out.println("No registrado en el sistema, por favor registrate");
            menuRegistro.tipoRegristro(scanner,alumnoArrayList,profesorArrayList);
        }
    }
    public void pagarMulta(Scanner scanner, ArrayList<Alumno> alumnoArrayList, ArrayList<Profesor> profesorArrayList, MenuRegistro menuRegistro){
        int indexUsuario = busquedas.buscarUsuario(scanner,alumnoArrayList,profesorArrayList);
        if(indexUsuario!=-1){
            if(alumnoArrayList.get(indexUsuario).getLibrosPrestrados()!=0){
                int dias=-1;
                while(dias==-1){
                    System.out.println("ingresa el numero de dias que has tenido el Libro");
                    dias= validar.validarnum(scanner);
                    scanner.nextLine();
                }
                if(dias>3){
                    dias=dias-3;
                    int pago=dias*10;
                    System.out.println("El total de la multa a pagar por " + dias + " dias de retraso es de $" + pago);
                }else System.out.println("No has excedido los dias perimitidos, no pagas multa");
            }else System.out.println("no tienes libros en prestamo");
        }else{
            System.out.println("No registrado en el sistema, por favor registrate");
            menuRegistro.tipoRegristro(scanner,alumnoArrayList,profesorArrayList);
        }
    }
    public void registrarLibro(ArrayList<Libro> libroArrayList,Scanner scanner){
        System.out.println("Ingresa Codigo ISBN del libro: ");
        String isbn = scanner.nextLine();
        System.out.println("Ingresa Titulo del libro: ");
        String titulo = scanner.nextLine();
        System.out.println("Ingresa Autor del libro: ");
        String autor = scanner.nextLine();
        int noEjemplares = -1;
        while (noEjemplares==-1){
            System.out.println("ingresa numero de ejemplares del libro:");
            noEjemplares= validar.validarnum(scanner);
        }
        libroArrayList.add(new Libro(isbn,titulo,autor,noEjemplares));
    }
    public void mostrarLibros(ArrayList<Libro> libroArrayList){
        if(libroArrayList.isEmpty()){
            System.out.println("No hay Libros Registrados");
        }else{
            System.out.println("------LIBROS-----------");
            for (Libro libro : libroArrayList){
                System.out.println(libro);
            }
        }
    }
}
