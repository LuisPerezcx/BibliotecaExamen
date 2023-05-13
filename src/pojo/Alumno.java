package pojo;

public class Alumno extends Persona {
    private int semeste;
    private String matricula;
    private String carrera;

    public Alumno(int numeroUsuario, String nombre, String apellido, int edad, String direccion, int telefono,
                  String correo, int semeste, String matricula, String carrera) {
        super(numeroUsuario, nombre, apellido, edad, direccion, telefono, correo);
        this.semeste=semeste;
        this.matricula=matricula;
        this.carrera=carrera;
    }
    @Override
    public String toString(){
        return super.toString() + "\nSemestre Usuario: " + semeste + "\nMatricula Usuario: " + matricula + "\nCarrera Usuario: " + carrera;
    }
}
