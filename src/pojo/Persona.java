package pojo;

public class Persona {
    private int numeroUsuario;
    private String nombre;
    private String apellido;
    private int edad;
    private String direccion;
    private int telefono;
    private String correo;
    private int librosPrestrados=0;

    public Persona(int numeroUsuario, String nombre, String apellido, int edad, String direccion, int telefono, String correo) {
        this.numeroUsuario = numeroUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
    }

    public int getNumeroUsuario() {
        return numeroUsuario;
    }

    public int getLibrosPrestrados() {
        return librosPrestrados;
    }

    public void setLibrosPrestrados(int librosPrestrados) {
        this.librosPrestrados = librosPrestrados;
    }

    @Override
    public String toString() {
        return "Numero de Usuario: " + numeroUsuario + "\nNombre Usuario: " + nombre + "\nApellido Usuario" + apellido
                + "\nEdad Usuario: " + edad + "\nDireccion Usuario: " + direccion + "\nTelefono Usuario: " + telefono
                + "\nCorreo Usuario: " + correo;
    }
}
