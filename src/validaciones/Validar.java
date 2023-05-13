package validaciones;
import java.util.Scanner;

public class Validar {
    public int validarnum(Scanner scanner){
        if(scanner.hasNextInt()){
            int numint = scanner.nextInt();
            return numint;
        }
        else {
            System.out.println("La entrada no es un número entero válido");
            return -1;
        }
    }
}
