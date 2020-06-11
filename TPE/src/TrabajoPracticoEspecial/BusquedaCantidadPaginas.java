package TrabajoPracticoEspecial;

public class BusquedaCantidadPaginas implements CriterioBusqueda{
    private int maxPalabras;

    public BusquedaCantidadPaginas(int maxPalabras) {
        this.maxPalabras = maxPalabras;
    }

    @Override
    public boolean cumple (Biblioteca b) {
        return ((Libro)b).getCantidadPaginas() < this.maxPalabras;
    }
}
