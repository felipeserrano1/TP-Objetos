package TrabajoPracticoEspecial;

public class Main {
    public static void main(String[] args) {
        Libro l1 = new Libro(1998, "LaEdidtorial", 200,1,"POOa");
        l1.addAutores("Juan");
        l1.addAutores("Felipe");
        l1.addAutores("Fernando");
        l1.addPalabrasClaves("Programacion");
        l1.addPalabrasClaves("Objetos");
        l1.addPalabrasClaves("Estructuras");

        Libro l2 = new Libro(1998, "LaEdidtorial", 300,2,"Matematica");
        l2.addAutores("Francisco");
        l2.addAutores("Leon");
        l2.addAutores("Nachito");
        l2.addAutores("Juan perez");
        l2.addPalabrasClaves("Derivadas");
        l2.addPalabrasClaves("Analisis");
        l2.addPalabrasClaves("Programacion");

        Libro l3 = new Libro(2005, "LaEdidtorial", 400,3,"Metodologia");
        l3.addAutores("Carlos");
        l3.addAutores("Felipe");
        l3.addAutores("Fernando");
        l3.addPalabrasClaves("Programacion");
        l3.addPalabrasClaves("Agiles");
        l3.addPalabrasClaves("Scrum");
        l3.addPalabrasClaves("Programacion");
        l3.addPalabrasClaves("Agiles");
        l3.addPalabrasClaves("parcial");
        l3.addPalabrasClaves("Programacion");
        l3.addPalabrasClaves("Agiles");
        l3.addPalabrasClaves("casa");
        l3.addPalabrasClaves("Programacion");
        l3.addPalabrasClaves("Agiles");
        l3.addPalabrasClaves("perro");
        l3.addPalabrasClaves("Programacion");
        l3.addPalabrasClaves("Agiles");
        l3.addPalabrasClaves("pc");
        l3.addPalabrasClaves("Programacion");
        l3.addPalabrasClaves("Agiles");
        l3.addPalabrasClaves("gato");

        ConjuntoLibro c1 = new ConjuntoLibro(4, "Sistemas");
        c1.addGrupo(l1);
        c1.addGrupo(l2);

        ConjuntoLibro c2 = new ConjuntoLibro(5, "Universidad");
        c2.addGrupo(c1);
        c2.addGrupo(l3);

        //System.out.println(c2.getPalabraClaves());
        //System.out.println(c2.cantidadLibros());
        //System.out.println(c2);

        ConjuntoLibro c3 = new ConjuntoLibro(6,"Faculta");
        Libro l4 = new Libro(2008, "LaEdidtorial", 400,7,"aaaaaaaaaaaaaaaaaaaaa");

        l4.addPalabrasClaves("programacion");
        l4.addPalabrasClaves("perro");
        l4.addPalabrasClaves("gato");
        l4.addPalabrasClaves("moneda");
        l4.addPalabrasClaves("pc");
        l4.addPalabrasClaves("celular");
        l4.addPalabrasClaves("auto");
        l4.addPalabrasClaves("perro");
        l4.addPalabrasClaves("auto");
        l4.addPalabrasClaves("auto");
        l4.addPalabrasClaves("pc");
        l4.addPalabrasClaves("celular");
        l4.addPalabrasClaves("perro");
        l4.addPalabrasClaves("moneda");
        l4.addPalabrasClaves("gato");

        c3.addGrupo(l4);

        c3.addGrupo(c2);

        BusquedaTitulo crit1 = new BusquedaTitulo("a");
        BusquedaAnio crit2 = new BusquedaAnio(1995);
        BusquedaAnd critAND = new BusquedaAnd(crit1, crit2);
        BusquedaOr critOR = new BusquedaOr(crit1, crit2);
        System.out.println(c2.buscar(new OrdenamientoTitulo(), crit1));
        System.out.println(c2.buscar(new OrdenamientoAnio(new OrdenamientoTitulo()), crit2));
        System.out.println(c2.buscar(new OrdenamientoTitulo(), critOR));
        System.out.println(c3.copiaRestringida(crit1));
        BusquedaEditorial crit4 = new BusquedaEditorial("LaEdidtorial");
        System.out.println(c3.buscar(new OrdenamientoTitulo(), crit4));

        ConjuntoEspecial c4 = new ConjuntoEspecial(8, "Especial");
        c4.addGrupo(l1);
        c4.addGrupo(l2);
        c4.addGrupo(l3);
        c4.addGrupo(l4);
        c4.addGrupo(c3);
        System.out.println(c4.getPalabraClaves());

        BusquedaAutor crit3 = new BusquedaAutor("Juan");
        System.out.println(c3.buscar(new OrdenamientoTitulo(), crit3));
    }
}
