package pojo;

public class Profesor extends Persona{
    private String instituto;
    private String areaDeAdscripcion;

    public Profesor(int numeroUsuario, String nombre, String apellido, int edad, String direccion,
                    int telefono, String correo,String instituto, String areaDeAdscripcion) {
        super(numeroUsuario, nombre, apellido, edad, direccion, telefono, correo);
        this.instituto=instituto;
        this.areaDeAdscripcion=areaDeAdscripcion;
    }

    @Override
    public String toString() {
        return super.toString() + "\nInstituto del Usuario: " + instituto + "\nArea De Adscripcion del Usuario: '" + areaDeAdscripcion;
    }
}
