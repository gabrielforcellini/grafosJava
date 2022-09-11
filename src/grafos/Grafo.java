package grafos;

import java.util.ArrayList;
import java.util.List;

public class Grafo {
	
	private List<Vertice> listaVertices;
	
	public Grafo() {
		listaVertices = new ArrayList<Vertice>();
	}
	
	public Vertice addVertice(final String nome) {
		Vertice v = new Vertice(nome);
		listaVertices.add(v);
		return v;
	}
	
	public Aresta addAresta(final Vertice origem, final Vertice destino) {
		Aresta a = new Aresta(origem, destino);
		origem.getAdj().add(a);
		return a;
	}
	
	@Override
	public String toString() {
		
		String r = "";
		for (Vertice v : listaVertices) {
			r += v.getNome() + " -> ";
			for (Aresta a : v.getAdj()) {
				v = a.getDestino();
				r += "["+v.getNome()+"] ->";
			}
			r += "[/]";
			r += "\n";
		}		
		return r;
	}

}









