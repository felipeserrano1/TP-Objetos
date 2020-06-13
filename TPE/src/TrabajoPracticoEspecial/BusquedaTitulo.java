package TrabajoPracticoEspecial;

import java.util.ArrayList;

public class BusquedaTitulo implements CriterioBusqueda {
    private String titulo;

    public BusquedaTitulo(String titulo) {
        this.titulo = titulo.toLowerCase();
    }

    @Override
    public boolean cumple(Libro l) {
        return (l.getTitulo().contains(this.titulo));
    }

}
