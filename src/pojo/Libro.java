package pojo;

public class Libro {
    private String ISBN;
    private String titulo;
    private String autor;
    private int ejemplares;

    public Libro(String ISBN, String titulo, String autor, int ejemplares) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
    }

    public String getISBN() {
        return ISBN;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    @Override
    public String toString(){
        return "ISBN:" + ISBN + "\nTitulo libro: " + titulo + "\nAutor Libro: " + autor +
                "\nNo. de ejemplares disponibles: " +  ejemplares;
    }
}
