package operaciones;

import pojo.Alumno;
import pojo.Libro;
import pojo.Profesor;
import registrarPersona.MenuRegistro;
import validaciones.Validar;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuOperaciones {
    Operaciones operaciones = new Operaciones();
    Validar validar = new Validar();
    public void menu(Scanner scanner,ArrayList<Alumno> alumnoArrayList, ArrayList<Profesor> profesorArrayList, ArrayList<Libro> libroArrayList, MenuRegistro menuRegistro){
        int opc=0;
        while (opc!=3){
            System.out.println("---------------  Menu Operaciones ------------------");
            opc=opciones(scanner);
            switch (opc){
                case 1 -> menuUsuarios(scanner,alumnoArrayList,profesorArrayList,libroArrayList,menuRegistro);
                case 2 -> menuBiblioteca(scanner,alumnoArrayList,profesorArrayList,libroArrayList,menuRegistro);
                case 3 -> System.out.println("Regresar");
                default -> System.out.println("opcion invalida");
            }
        }
    }
    private void menuUsuarios(Scanner scanner,ArrayList<Alumno> alumnoArrayList, ArrayList<Profesor> profesorArrayList, ArrayList<Libro> libroArrayList, MenuRegistro menuRegistro) {
        int opc=0;
        while (opc!=5){
            System.out.println("---------------  Menu Operaciones Usuarios ------------------");
            opc=opcionesUsuario(scanner);
            switch (opc){
                case 1 -> operaciones.SolicitarPrestamo(scanner,alumnoArrayList,profesorArrayList,libroArrayList,menuRegistro);
                case 2 -> operaciones.regresarLibro(scanner,alumnoArrayList,profesorArrayList,libroArrayList,menuRegistro);
                case 3 -> operaciones.pagarMulta(scanner,alumnoArrayList,profesorArrayList,menuRegistro);
                case 4 -> operaciones.mostrarLibros(libroArrayList);
                case 5 -> System.out.println("Regresar");
                default -> System.out.println("opcion invalida");
            }
        }
    }
    private void menuBiblioteca(Scanner scanner, ArrayList<Alumno> alumnoArrayList, ArrayList<Profesor> profesorArrayList, ArrayList<Libro> libroArrayList, MenuRegistro menuRegistro) {
        int opc=0;
        while (opc!=4){
            System.out.println("---------------  Menu Operaciones Biblioteca ------------------");
            opc=opcionesBiblioteca(scanner);
            switch (opc){
                case 1 -> operaciones.SolicitarPrestamo(scanner,alumnoArrayList,profesorArrayList,libroArrayList,menuRegistro);
                case 2 -> operaciones.pagarMulta(scanner,alumnoArrayList,profesorArrayList,menuRegistro);
                case 3 -> operaciones.registrarLibro(libroArrayList,scanner);
                case 4 -> System.out.println("Regresar");
                default -> System.out.println("opcion invalida");
            }
        }
    }

    private int opciones(Scanner scanner){
        System.out.println("""
                1) Operaciones Usuario
                2) Operaciones Bilioteca
                3) Regresar""");
        System.out.println("Selecciona una opcion");
        int n=-1;
        while (n==-1){
            n = validar.validarnum(scanner);
            scanner.nextLine();
        }
        return n;
    }
    private int opcionesUsuario(Scanner scanner){
        System.out.println("""
                1) Solicitar Prestamo de un Libro
                2) Devolver libro
                3) Pagar Multa
                4) Mostrar Libros
                5) Regresar""");
        int n=-1;
        while (n==-1){
            System.out.println("Selecciona una opcion");
            n = validar.validarnum(scanner);
            scanner.nextLine();
        }
        return n;
    }
    private int opcionesBiblioteca(Scanner scanner){
        System.out.println("""
                1) Prestar Libro
                2) Cobrar Multa
                3) Registrar Libro
                4) Regresar""");
        int n=-1;
        while (n==-1){
            System.out.println("Selecciona una opcion");
            n = validar.validarnum(scanner);
            scanner.nextLine();
        }
        return n;
    }
}
