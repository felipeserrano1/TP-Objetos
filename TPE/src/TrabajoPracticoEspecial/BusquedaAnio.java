package TrabajoPracticoEspecial;

public class BusquedaAnio implements CriterioBusqueda {
    private int anio;

    public BusquedaAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public boolean cumple(Biblioteca b) {
        return ((Libro)b).getAnioPublicacion() > this.anio;
    }
}
