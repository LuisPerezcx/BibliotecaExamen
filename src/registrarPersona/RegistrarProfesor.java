package registrarPersona;

import pojo.Profesor;
import validaciones.Validar;

import java.util.ArrayList;
import java.util.Scanner;

public class RegistrarProfesor {
    Validar validar = new Validar();
    public void registro(Scanner scanner, ArrayList<Profesor> profesorArrayList){
        System.out.println("- REGISTRO PROFESOR -");
        int num = -1;
        while (num==-1){
            System.out.println("Ingresa numero de usuario:");
            num= validar.validarnum(scanner);
            scanner.nextLine();
        }
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
        System.out.println("Ingrese Instituto:");
        String instituto = scanner.nextLine();
        System.out.println("Ingresa Area de Adscripcion");
        String area = scanner.nextLine();
        profesorArrayList.add(new Profesor(num,nombre,apellido,edad,direccion,tel,correo,instituto,area));
    }
}
