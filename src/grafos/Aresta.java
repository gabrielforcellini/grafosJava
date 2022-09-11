package grafos;

public class Aresta {
	
	/**
	 * N� origem.
	 */
	private Vertice origem;

	/**
	 * N�s destino.
	 */
	private Vertice destino;
	
	public Aresta(final Vertice origem, final Vertice destino) {
		this.origem = origem;
		this.destino = destino;
	}

	public Vertice getOrigem() {
		return origem;
	}
	
	public Vertice getDestino() {
		return destino;
	}
	
}
