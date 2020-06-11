package TrabajoPracticoEspecial;

import java.util.*;

public class ConjuntoLibro extends Biblioteca {
	private ArrayList<Biblioteca> grupos;

	public ConjuntoLibro(int id, String titulo) {
		super(id, titulo);
		grupos = new ArrayList<Biblioteca>();
	}

	private void addPalabrasClaves(Set palabrasclaves) {
		this.palabrasClaves.addAll(palabrasclaves);
	}

	public void addGrupo(Biblioteca g) {
		grupos.add(g);
		this.addPalabrasClaves(g.getPalabraClaves());
	}

	public Set<String> getPalabraClaves() {
		return Collections.unmodifiableSet(this.palabrasClaves);
	}

	public int cantidadLibros() {
		int i = 0;
		for (Biblioteca b : this.grupos) {
			i = +this.cantidadLibros();
		}
		return i;
	}

	@Override
	public String toString() {
		String aux = "";
		for(Biblioteca b: grupos) {
			aux += b.toString() + "\n";
		}
		return aux;
	}

	public ArrayList<Libro> buscar(Comparator condicion, CriterioBusqueda c) {
		ArrayList<Libro> libroBusqueda = new ArrayList<Libro>();
		for(Biblioteca b:this.grupos) {
				libroBusqueda.addAll(b.buscar(condicion, c));
		}
		Collections.sort(libroBusqueda, condicion);
		Collections.unmodifiableList(libroBusqueda);
		return libroBusqueda;
	}

	@Override
	public ArrayList<Biblioteca> copiaRestringida(CriterioBusqueda c) {
		ArrayList<Biblioteca> aux = new ArrayList<Biblioteca>();
		for (Biblioteca b : grupos) {
			if(c.cumple(b))
				aux.addAll(b.copiaRestringida(c));
		}
		Collections.unmodifiableList(aux);
		return aux;
	}
}





