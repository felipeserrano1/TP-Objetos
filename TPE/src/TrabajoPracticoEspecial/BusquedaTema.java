package TrabajoPracticoEspecial;

import java.util.ArrayList;

public class BusquedaTema implements CriterioBusqueda {
    private String tema;

    public BusquedaTema(String tema) {
        this.tema = tema;
    }

    @Override
    public boolean cumple(Libro l){
        for(String s : l.getPalabraClaves()){
            if(s.contains(this.tema.toLowerCase()))
                return true;
        }
        return false;
    }
}
