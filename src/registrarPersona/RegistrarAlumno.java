package registrarPersona;

import pojo.Alumno;
import validaciones.Validar;

import java.util.ArrayList;
import java.util.Scanner;

public class RegistrarAlumno {
    Validar validar = new Validar();
    public void registro(Scanner scanner, ArrayList<Alumno> alumnoArrayList){
        System.out.println("- REGISTRO ALUMNO -");
        int num = -1;
        while (num==-1){
            System.out.println("Ingresa numero de usuario:");
            num= validar.validarnum(scanner);
            scanner.nextLine();
        }
        scanner.nextLine();
        System.out.println("Ingresa Nombre:");
        String nombre = scanner.nextLine();
        System.out.println("Ingresa Apellido:");
        String apellido = scanner.nextLine();
        int edad = -1;
        while (edad==-1){
            System.out.println("Ingresa edad:");
            edad=validar.validarnum(scanner);
            scanner.nextLine();
        }
        System.out.println("Ingresa Direccion:");
        String direccion = scanner.nextLine();
        int tel = -1;
        while (tel==-1){
            System.out.println("Ingresa telefono:");
            tel= validar.validarnum(scanner);
            scanner.nextLine();
        }
        System.out.println("Ingresa Correo:");
        String correo = scanner.nextLine();
        int semestre = -1;
        while (semestre==-1){
            System.out.println("Ingresa Semestre:");
            semestre=validar.validarnum(scanner);
            scanner.nextLine();
        }
        scanner.nextLine();
        System.out.println("Ingresa Matricula:");
        String matricula = scanner.nextLine();
        System.out.println("Ingresa carrera:");
        String carrera = scanner.nextLine();
        alumnoArrayList.add(new Alumno(num,nombre,apellido,edad,direccion,tel,correo,semestre,matricula,carrera));
    }
}
