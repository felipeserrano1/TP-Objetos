package TrabajoPracticoEspecial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Libro extends Biblioteca {
	private ArrayList<String> autores;
	private int cantidadPaginas;
	private String Editorial;
	private int anioPublicacion;

	public Libro (int anioPublicacion, String Editorial, int cantidadPaginas, int id, String Titulo) {
		super(id,Titulo);
		this.anioPublicacion = anioPublicacion;
		this.cantidadPaginas = cantidadPaginas;
		this.Editorial = Editorial;
		this.autores = new ArrayList<String>();
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
	public int cantidadLibros() {
		return 1;
	}

	@Override
	public String toString(){
		return ("Año" + this.getAnioPublicacion() + "- Titulo" + this.getTitulo() + "- Autores" + this.getAutores().toString() + "- Editorial" + this.getEditorial());
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
	public ArrayList<Biblioteca> copiaRestringida(CriterioBusqueda c) {
		ArrayList<Biblioteca> librosBusqueda = new ArrayList<Biblioteca>();
		if(c.cumple(this)) {
			librosBusqueda.add(this);
		}
		return librosBusqueda;
	}


}
