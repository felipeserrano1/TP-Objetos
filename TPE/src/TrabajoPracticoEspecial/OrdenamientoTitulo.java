package TrabajoPracticoEspecial;

import java.util.Comparator;

public class OrdenamientoTitulo extends Ordenamiento {

    public OrdenamientoTitulo() {
        siguiente = null;
    }

    public OrdenamientoTitulo(Ordenamiento o) {
        siguiente = o;
    }

    @Override
    public int compararLibro(Libro l1, Libro l2) {
        return (l1.getTitulo().compareTo(l2.getTitulo()));
    }
}
