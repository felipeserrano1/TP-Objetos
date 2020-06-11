package TrabajoPracticoEspecial;

public class BusquedaTitulo implements CriterioBusqueda {
    private String titulo;

    public BusquedaTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public boolean cumple(Biblioteca b) {
        return (this.titulo == b.getTitulo());
    }


}
