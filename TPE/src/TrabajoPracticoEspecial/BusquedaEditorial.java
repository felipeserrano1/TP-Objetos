package TrabajoPracticoEspecial;

public class BusquedaEditorial implements CriterioBusqueda{
    private String editorial;

    public BusquedaEditorial(String editorial) {
        this.editorial = editorial;
    }

    @Override
    public boolean cumple(Libro l) {
        return (l.getEditorial().equals(this.editorial.toLowerCase()));
    }
}
