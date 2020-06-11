package TrabajoPracticoEspecial;

public class BusquedaNot implements CriterioBusqueda {
    private CriterioBusqueda busqueda;

    public BusquedaNot(CriterioBusqueda busqueda) {
        this.busqueda = busqueda;
    }

    @Override
    public boolean cumple(Biblioteca b) {
        return !(this.busqueda.cumple(b));
    }
}
