package TrabajoPracticoEspecial;

import java.util.Comparator;

public class OrdenamientoAnio implements Comparator<Libro> {
    private OrdenamientoTitulo ordenamiento;

    @Override
    public int compare(Libro libro, Libro t1) {
        if((libro.getAnioPublicacion() - t1.getAnioPublicacion()) == 0) {
            return ordenamiento.compare(libro, t1);
        }
        else {
            return (libro.getAnioPublicacion() - t1.getAnioPublicacion());
        }
    }
}
