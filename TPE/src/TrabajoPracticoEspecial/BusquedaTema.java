package TrabajoPracticoEspecial;

public class BusquedaTema implements CriterioBusqueda {
    private String tema;

    public BusquedaTema(String tema) {
        this.tema = tema;
    }

    @Override
    public boolean cumple (Biblioteca b) {
        return b.getPalabraClaves().contains(this.tema.toLowerCase());
    }
}
