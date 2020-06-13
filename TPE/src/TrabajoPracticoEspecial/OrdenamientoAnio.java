package TrabajoPracticoEspecial;

public class OrdenamientoAnio extends Ordenamiento {

    public OrdenamientoAnio() {
        siguiente = null;
    }

    public OrdenamientoAnio(Ordenamiento o) {
        siguiente = o;
    }

    @Override
    public int compararLibro(Libro l1, Libro l2) {
        return (l1.getAnioPublicacion() - l2.getAnioPublicacion());
    }
}
