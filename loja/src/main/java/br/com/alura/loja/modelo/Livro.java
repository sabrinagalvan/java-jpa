package br.com.alura.loja.modelo;

import javax.persistence.Entity;

@Entity
public class Livro extends Produto {

	private String autor;
	private Integer nomeroDePaginas;
	
	public Livro() {
	}
	
	public Livro(String autor, Integer nomeroDePaginas) {
		this.autor = autor;
		this.nomeroDePaginas = nomeroDePaginas;
	}

	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public Integer getNomeroDePaginas() {
		return nomeroDePaginas;
	}
	public void setNomeroDePaginas(Integer nomeroDePaginas) {
		this.nomeroDePaginas = nomeroDePaginas;
	}
	
	
}
