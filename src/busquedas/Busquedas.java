package busquedas;

import pojo.Alumno;
import pojo.Libro;
import pojo.Profesor;
import validaciones.Validar;

import java.util.ArrayList;
import java.util.Scanner;

public class Busquedas {
    Validar validar = new Validar();
    public int buscarUsuario(Scanner scanner, ArrayList<Alumno> alumnoArrayList, ArrayList<Profesor> profesorArrayList){
        int nUsuario = -1;
        while (nUsuario==-1){
            System.out.println("ingrese su numero de usuario:");
            nUsuario = validar.validarnum(scanner);
            scanner.nextLine();
        }
        int cont=0;
        for(Alumno alumno : alumnoArrayList){
            if(nUsuario==alumno.getNumeroUsuario()){
                return cont;
            }
            cont++;
        }
        if (cont>alumnoArrayList.size()){
            cont=0;
            for(Profesor profesor : profesorArrayList){
                if (nUsuario==profesor.getNumeroUsuario()){
                    return cont;
                }
                cont++;
            }
        }
        if(cont>profesorArrayList.size()){
            System.out.println("usuario no encontrado");
        }
        return -1;
    }
    public int buscarLibro(Scanner scanner, ArrayList<Libro> libroArrayList){
        System.out.println("ingrese el codigo ISBN del libro:");
        String ISBN = scanner.nextLine();
        int cont=0;
        for(Libro libro : libroArrayList){
            if(libro.getISBN().equals(ISBN)){
                return cont;
            }
            cont++;
        }
        if(cont>libroArrayList.size()){
            System.out.println("libro no encontrado");
        }
        return -1;
    }
}
