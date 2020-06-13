package TrabajoPracticoEspecial;

public class BusquedaAutor implements CriterioBusqueda{
    private String autor;

    public BusquedaAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public boolean cumple(Libro l){
        for(String s : l.getAutores()){
            if(s.contains(this.autor.toLowerCase()))
                return true;
        }
        return false;
    }
}
