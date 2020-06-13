package TrabajoPracticoEspecial;

public class BusquedaAnio implements CriterioBusqueda {
    private int anio;

    public BusquedaAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public boolean cumple(Libro l) {
        return ((Libro)l).getAnioPublicacion() > this.anio;
    }
}
