package registrarPersona;

import pojo.Alumno;
import pojo.Profesor;
import validaciones.Validar;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuRegistro {
    RegistrarAlumno registrarAlumno = new RegistrarAlumno();
    RegistrarProfesor registrarProfesor = new RegistrarProfesor();
    Validar validar = new Validar();
    public void tipoRegristro(Scanner scanner, ArrayList<Alumno> alumnoArrayList, ArrayList<Profesor> profesorArrayList){
        int opc=0;
        while (opc!=3){
            System.out.println("------------------- Menu Registro Usuario  -----------------------");
            opc=opciones(scanner);
            switch (opc){
                case 1 -> registrarAlumno.registro(scanner,alumnoArrayList);
                case 2 -> registrarProfesor.registro(scanner,profesorArrayList);
                case 3 -> System.out.println("Regresar");
                default -> System.out.println("opcion invalida");
            }
        }
    }

    private int opciones(Scanner scanner){
        System.out.println("""
                1) Registrar Alumno
                2) Registrar Profesor
                3) Regresar""");
        int n=-1;
        while (n==-1){
            System.out.println("Selecciona una opcion");
            n = validar.validarnum(scanner);
            scanner.nextLine();
        }
        return n;
    }
}
