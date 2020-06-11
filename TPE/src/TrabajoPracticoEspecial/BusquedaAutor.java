package TrabajoPracticoEspecial;

public class BusquedaAutor implements CriterioBusqueda{
    private String autor;

    public BusquedaAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public boolean cumple(Biblioteca b) {
        return ((Libro)b).getAutores().contains(this.autor.toLowerCase());
    }
}
