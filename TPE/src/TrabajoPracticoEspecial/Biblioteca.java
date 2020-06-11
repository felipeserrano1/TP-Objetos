package TrabajoPracticoEspecial;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public abstract class Biblioteca {
	private int id;
	private String titulo;
	protected Set<String> palabrasClaves;

	public Biblioteca(int id, String titulo) {
		this.id = id;
		this.titulo = titulo;
		this.palabrasClaves = new HashSet<String>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void addPalabrasClaves(String s){
		palabrasClaves.add(s.toLowerCase());
	}

	public Set<String> getPalabraClaves() {
		return palabrasClaves;
	}

	public abstract int cantidadLibros();

	public abstract ArrayList<Libro> buscar(Comparator condicion, CriterioBusqueda c);

	public abstract ArrayList<Biblioteca> copiaRestringida(CriterioBusqueda c);
}
