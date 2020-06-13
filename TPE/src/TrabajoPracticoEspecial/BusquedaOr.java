package TrabajoPracticoEspecial;

public class BusquedaOr implements CriterioBusqueda {
    private CriterioBusqueda busquedaA;
    private CriterioBusqueda busquedaB;

    public BusquedaOr(CriterioBusqueda busquedaA, CriterioBusqueda busquedaB) {
        this.busquedaA = busquedaA;
        this.busquedaB = busquedaB;
    }

    @Override
    public boolean cumple(Libro l) {
        return this.busquedaA.cumple(l) || this.busquedaB.cumple(l);
    }
}