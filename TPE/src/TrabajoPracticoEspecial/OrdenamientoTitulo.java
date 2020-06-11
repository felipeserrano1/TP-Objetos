package TrabajoPracticoEspecial;

import java.util.Comparator;

public class OrdenamientoTitulo implements Comparator<Libro> {
    @Override
    public int compare(Libro libro, Libro t1) {
        return (libro.getTitulo().compareTo(t1.getTitulo()));
    }
}
