package main;

import operaciones.MenuOperaciones;
import pojo.Alumno;
import pojo.Libro;
import pojo.Profesor;
import registrarPersona.MenuRegistro;
import validaciones.Validar;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuMain {
    ArrayList<Libro> libroArrayList;
    ArrayList<Alumno> alumnoArrayList;
    ArrayList<Profesor> profesorArrayList;
    MenuRegistro menuRegistro;
    MenuOperaciones menuOperaciones;
    Validar validar = new Validar();
    public MenuMain(ArrayList<Libro> libroArrayList,ArrayList<Alumno> alumnoArrayList, ArrayList<Profesor> profesorArrayList, MenuRegistro menuRegistro, MenuOperaciones menuOperaciones) {
        this.libroArrayList = libroArrayList;
        this.alumnoArrayList = alumnoArrayList;
        this.profesorArrayList = profesorArrayList;
        this.menuRegistro = menuRegistro;
        this.menuOperaciones = menuOperaciones;
    }
    public void menu(Scanner scanner){
        int opc=0;
        while (opc!=3){
            System.out.println("++++++++++++++++  Menu Principal  ++++++++++++++++++++++");
            opc=opciones(scanner);
            switch (opc){
                case 1 -> menuRegistro.tipoRegristro(scanner,alumnoArrayList,profesorArrayList);
                case 2 -> menuOperaciones.menu(scanner,alumnoArrayList,profesorArrayList,libroArrayList,menuRegistro);
                case 3 -> System.out.println("Salir");
                default -> System.out.println("opcion invalida");
            }
        }
    }
    private int opciones(Scanner scanner){
        System.out.println("""
                1) Registrar Usuario
                2) Operaciones
                3) Salir""");
        int n=-1;
        while (n==-1){
            System.out.println("Selecciona una opcion");
            n = validar.validarnum(scanner);
            scanner.nextLine();
        }
        return n;
    }
}
