package TrabajoPracticoEspecial;

import java.util.Comparator;

public abstract class Ordenamiento implements Comparator<Libro> {
    protected Ordenamiento siguiente;


    @Override
    public int compare(Libro l1, Libro l2) {
        int result = this.compararLibro(l1, l2);
        if((result == 0) && (siguiente != null)) {
            return siguiente.compare(l1, l2);
        }
        return result;
    }

    public abstract int compararLibro(Libro l1, Libro l2);
}
