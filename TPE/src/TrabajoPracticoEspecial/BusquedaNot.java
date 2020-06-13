package TrabajoPracticoEspecial;

public class BusquedaNot implements CriterioBusqueda {
    private CriterioBusqueda busqueda;

    public BusquedaNot(CriterioBusqueda busqueda) {
        this.busqueda = busqueda;
    }

    @Override
    public boolean cumple(Libro l) {
        return !(this.busqueda.cumple(l));
    }
}
