package TrabajoPracticoEspecial;

import java.util.*;

public class ConjuntoLibro extends Biblioteca {
	private ArrayList<Biblioteca> grupos;

	public ConjuntoLibro(int id, String titulo) {
		super(id, titulo);
		grupos = new ArrayList<Biblioteca>();
	}


	public void addGrupo(Biblioteca g) {
		grupos.add(g);
	}

	public ArrayList<Biblioteca> getGrupos() {
		return this.grupos;
	}

	public Set<String> getPalabraClaves() {
		HashSet<String> aux = new HashSet<>();
		for(Biblioteca b: grupos) {
			aux.addAll(b.getPalabraClaves());
		}
		return Collections.unmodifiableSet(aux);
	}

	public int cantidadLibros() {
		int i = 0;
		for (Biblioteca b : this.grupos) {
			i += b.cantidadLibros();
		}
		return i;
	}

	@Override
	public String toString() {
		String aux = this.getTitulo() + "\n";
		for(Biblioteca b: grupos) {
			aux += b.toString() + "\n";
		}
		return aux;
	}

	public List<Libro> buscar(Comparator condicion, CriterioBusqueda c) {
		List<Libro> libroBusqueda = new ArrayList<>();
		for(Biblioteca b:this.grupos) {
				libroBusqueda.addAll(b.buscar(condicion, c));
		}
		Collections.sort(libroBusqueda, condicion);
		return Collections.unmodifiableList(libroBusqueda);
	}

	@Override
	public Biblioteca copiaRestringida(CriterioBusqueda c) {
		ConjuntoLibro aux = new ConjuntoLibro(this.getId(), this.getTitulo());
		for (Biblioteca b : grupos) {
			Biblioteca biblioteca = b.copiaRestringida(c);
			if(biblioteca != null) {
				aux.addGrupo(b.copiaRestringida(c));
			}
		}
		if(aux.cantidadLibros() > 0)
			return aux;
		else {
			return null;
		}
	}
}





