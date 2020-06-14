package TrabajoPracticoEspecial;

public class BusquedaCantidadPaginas implements CriterioBusqueda{
    private int maxPaginas;

    public BusquedaCantidadPaginas(int maxPaginas) {
        this.maxPaginas = maxPaginas;
    }

    @Override
    public boolean cumple (Libro l) {
        return l.getCantidadPaginas() < this.maxPaginas;
    }
}
