package TrabajoPracticoEspecial;

public class BusquedaAnd implements CriterioBusqueda {
    private CriterioBusqueda busquedaA;
    private CriterioBusqueda busquedaB;

    public BusquedaAnd(CriterioBusqueda busquedaA, CriterioBusqueda busquedaB) {
        this.busquedaA = busquedaA;
        this.busquedaB = busquedaB;
    }

    @Override
    public boolean cumple(Libro l) {
        return this.busquedaA.cumple(l) && this.busquedaB.cumple(l);
    }
}
