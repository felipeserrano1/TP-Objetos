package TrabajoPracticoEspecial;

import java.util.*;

public class Libro extends Biblioteca {
	private ArrayList<String> autores;
	private int cantidadPaginas;
	private String Editorial;
	private int anioPublicacion;
	private Set<String> palabrasClaves;

	public Libro (int anioPublicacion, String Editorial, int cantidadPaginas, int id, String Titulo) {
		super(id,Titulo);
		this.anioPublicacion = anioPublicacion;
		this.cantidadPaginas = cantidadPaginas;
		this.Editorial = Editorial.toLowerCase();
		this.autores = new ArrayList<String>();
		this.palabrasClaves = new HashSet<String>();
	}

	public void addPalabrasClaves(String s) {
		this.palabrasClaves.add(s.toLowerCase());
	}

	public void addAutores(String s) {
		this.autores.add(s.toLowerCase());
	}

	public boolean comprobarPalabra(ArrayList<String> aux, ArrayList<String> nueva) {
		for(String i : nueva)
			if (aux.contains(i))
				return true;
		return false;
	}

	public int getCantidadPaginas() {
		return this.cantidadPaginas;
	}

	public String getEditorial() {
		return this.Editorial;
	}

	public int getAnioPublicacion() {
		return this.anioPublicacion;
	}

	public List<String> getAutores() {
		return Collections.unmodifiableList(this.autores);
	}

	@Override
	public Set<String> getPalabraClaves() {
		return Collections.unmodifiableSet(this.palabrasClaves);
	}

	@Override
	public int cantidadLibros() {
		return 1;
	}

	@Override
	public String toString(){
		return ("(" + this.getAnioPublicacion() + ")" + " - " + this.getTitulo() + " - " + this.getAutores().toString() + " - " + this.getEditorial());
	}

	@Override
	public ArrayList<Libro> buscar(Comparator condicion, CriterioBusqueda c) {
		ArrayList<Libro> librosBusqueda = new ArrayList<Libro>();
		if(c.cumple(this)) {
			librosBusqueda.add(this);
		}
		return librosBusqueda;
	}

	@Override
	public Biblioteca copiaRestringida(CriterioBusqueda c) {
		if(c.cumple(this)) {
			Libro librosBusqueda = new Libro(this.getAnioPublicacion(), this.getEditorial(), this.cantidadPaginas, this.getId(), this.getTitulo());
			for(String s: this.palabrasClaves)
				librosBusqueda.addPalabrasClaves(s);
			for(String s: this.autores)
				librosBusqueda.addAutores(s);
			return librosBusqueda;
		}
		return null;
	}


}
