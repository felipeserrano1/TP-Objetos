package TrabajoPracticoEspecial;

import java.util.*;

public abstract class Biblioteca {
	private int id;
	private String titulo;

	public Biblioteca(int id, String titulo) {
		this.id = id;
		this.titulo = titulo.toLowerCase();
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

	public abstract Set<String> getPalabraClaves();

	public abstract int cantidadLibros();

	public abstract List<Libro> buscar(Comparator condicion, CriterioBusqueda c);

	public abstract Biblioteca copiaRestringida(CriterioBusqueda c);

}

