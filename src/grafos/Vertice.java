package grafos;

import java.util.ArrayList;
import java.util.List;

public class Vertice implements Comparable<Vertice>{
	
	/**
	 * Nome representativdo do nó.
	 */
	private String nome;
	
	/**
	 * Lista de adjacencia.
	 */
	private List<Aresta> adj;
	
	/**
	 * Construtor do vertice.
	 * @param nome
	 */
	public Vertice(final String nome) {
		this.nome = nome;
		adj = new ArrayList<Aresta>();
	}
	
	public String getNome() {
		return nome;
	}
	
	public List<Aresta> getAdj() {
		return adj;
	}

	@Override
	public int compareTo(Vertice o) {
		if (Integer.parseInt(this.nome) > Integer.parseInt(o.nome)) {
			return 1;
		} else if (Integer.parseInt(this.nome) < Integer.parseInt(o.nome)) {
			return -1;
		} else {			
			return 0;
		}
	}
	
	

}
