package TrabajoPracticoEspecial;

public class BusquedaOr implements CriterioBusqueda {
    private CriterioBusqueda busquedaA;
    private CriterioBusqueda busquedaB;

    public BusquedaOr(CriterioBusqueda busquedaA, CriterioBusqueda busquedaB) {
        this.busquedaA = busquedaA;
        this.busquedaB = busquedaB;
    }

    @Override
    public boolean cumple(Biblioteca b) {
        return this.busquedaA.cumple(b) || this.busquedaB.cumple(b);
    }
}