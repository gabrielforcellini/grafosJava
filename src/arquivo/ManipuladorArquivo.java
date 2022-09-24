package arquivo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import grafos.Grafo;
import grafos.Vertice;

public class ManipuladorArquivo {

	Grafo g = new Grafo();

	public ManipuladorArquivo() {

	}

	public void leitor(String path) throws IOException {
		BufferedReader buffRead = new BufferedReader(new FileReader(path));
		String linha = "";
		int cont = 0;
		while (true) {
			if (linha != null) {
				if (linha.length() > 0) {
					if (cont == 1 || cont == 35) {
						System.out.println(linha);
					} else {
						g.addVertice(linha.substring(linha.length() - 4).replaceAll("\\s+", ""));
					}
				}
				cont++;
			} else
				break;
			linha = buffRead.readLine();
		}
		buffRead.close();
		defineArestas();
	}

	// terminar de criar o grafo, adicionando as arestas
	private void defineArestas() {
		for (Vertice v : g.getListaVertices()) {
			if (v.getNome().equals("101")) {
				g.addAresta(v, g.getListaVertices().get(1));
			} else if (v.getNome().equals("102")) {
				g.addAresta(v, g.getListaVertices().get(0));
				g.addAresta(v, g.getListaVertices().get(2));
				g.addAresta(v, g.getListaVertices().get(4));
				g.addAresta(v, g.getListaVertices().get(5));
			} else if (v.getNome().equals("103")) {
				g.addAresta(v, g.getListaVertices().get(1));
				g.addAresta(v, g.getListaVertices().get(3));
				g.addAresta(v, g.getListaVertices().get(5));
				g.addAresta(v, g.getListaVertices().get(6));
			} else if (v.getNome().equals("104")) {
				g.addAresta(v, g.getListaVertices().get(2));
				g.addAresta(v, g.getListaVertices().get(6));
				g.addAresta(v, g.getListaVertices().get(7));
			} else if (v.getNome().equals("201")) {
				g.addAresta(v, g.getListaVertices().get(1));
				g.addAresta(v, g.getListaVertices().get(5));
				g.addAresta(v, g.getListaVertices().get(8));
			} else if (v.getNome().equals("202")) {
				g.addAresta(v, g.getListaVertices().get(3));
				g.addAresta(v, g.getListaVertices().get(4));
				g.addAresta(v, g.getListaVertices().get(8));
				g.addAresta(v, g.getListaVertices().get(6));
			} else if (v.getNome().equals("203")) {
				g.addAresta(v, g.getListaVertices().get(7));
				g.addAresta(v, g.getListaVertices().get(4));
				g.addAresta(v, g.getListaVertices().get(5));
				g.addAresta(v, g.getListaVertices().get(9));
				//
			} else if (v.getNome().equals("204")) {
				g.addAresta(v, g.getListaVertices().get(8));
				g.addAresta(v, g.getListaVertices().get(4));
				g.addAresta(v, g.getListaVertices().get(13));
				g.addAresta(v, g.getListaVertices().get(10));
				//
			} else if (v.getNome().equals("301")) {
				g.addAresta(v, g.getListaVertices().get(4));
				g.addAresta(v, g.getListaVertices().get(12));
				g.addAresta(v, g.getListaVertices().get(5));
				g.addAresta(v, g.getListaVertices().get(9));
				//
			} else if (v.getNome().equals("302")) {
				g.addAresta(v, g.getListaVertices().get(5));
				g.addAresta(v, g.getListaVertices().get(4));
				g.addAresta(v, g.getListaVertices().get(13));
				g.addAresta(v, g.getListaVertices().get(6));
				g.addAresta(v, g.getListaVertices().get(12));
			} else if (v.getNome().equals("303")) {
				g.addAresta(v, g.getListaVertices().get(6));
				g.addAresta(v, g.getListaVertices().get(7));
				g.addAresta(v, g.getListaVertices().get(11));
				g.addAresta(v, g.getListaVertices().get(9));
				g.addAresta(v, g.getListaVertices().get(14));
				g.addAresta(v, g.getListaVertices().get(13));
			} else if (v.getNome().equals("304")) {
				g.addAresta(v, g.getListaVertices().get(10));
				g.addAresta(v, g.getListaVertices().get(7));
				g.addAresta(v, g.getListaVertices().get(14));
			} else if (v.getNome().equals("401")) {
				g.addAresta(v, g.getListaVertices().get(8));
				g.addAresta(v, g.getListaVertices().get(9));
				g.addAresta(v, g.getListaVertices().get(15));
				g.addAresta(v, g.getListaVertices().get(13));
				g.addAresta(v, g.getListaVertices().get(16));
			} else if (v.getNome().equals("402")) {
				g.addAresta(v, g.getListaVertices().get(9));
				g.addAresta(v, g.getListaVertices().get(12));
				g.addAresta(v, g.getListaVertices().get(16));
				g.addAresta(v, g.getListaVertices().get(14));
				g.addAresta(v, g.getListaVertices().get(15));
				g.addAresta(v, g.getListaVertices().get(10));
			} else if (v.getNome().equals("403")) {
				g.addAresta(v, g.getListaVertices().get(13));
				g.addAresta(v, g.getListaVertices().get(10));
				g.addAresta(v, g.getListaVertices().get(11));
				g.addAresta(v, g.getListaVertices().get(16));
				g.addAresta(v, g.getListaVertices().get(17));
			} else if (v.getNome().equals("501")) {
				g.addAresta(v, g.getListaVertices().get(12));
				g.addAresta(v, g.getListaVertices().get(16));
				g.addAresta(v, g.getListaVertices().get(19));
				g.addAresta(v, g.getListaVertices().get(13));
			} else if (v.getNome().equals("502")) {
				g.addAresta(v, g.getListaVertices().get(15));
				g.addAresta(v, g.getListaVertices().get(13));
				g.addAresta(v, g.getListaVertices().get(14));
				g.addAresta(v, g.getListaVertices().get(17));
				g.addAresta(v, g.getListaVertices().get(19));
				g.addAresta(v, g.getListaVertices().get(20));
			} else if (v.getNome().equals("503")) {
				g.addAresta(v, g.getListaVertices().get(16));
				g.addAresta(v, g.getListaVertices().get(18));
				g.addAresta(v, g.getListaVertices().get(14));
				g.addAresta(v, g.getListaVertices().get(20));
				g.addAresta(v, g.getListaVertices().get(21));
			} else if (v.getNome().equals("504")) {
				g.addAresta(v, g.getListaVertices().get(17));
				g.addAresta(v, g.getListaVertices().get(22));
				g.addAresta(v, g.getListaVertices().get(21));
			} else if (v.getNome().equals("601")) {
				g.addAresta(v, g.getListaVertices().get(15));
				g.addAresta(v, g.getListaVertices().get(23));
				g.addAresta(v, g.getListaVertices().get(20));
				g.addAresta(v, g.getListaVertices().get(16));
			} else if (v.getNome().equals("602")) {
				g.addAresta(v, g.getListaVertices().get(19));
				g.addAresta(v, g.getListaVertices().get(16));
				g.addAresta(v, g.getListaVertices().get(17));
				g.addAresta(v, g.getListaVertices().get(24));
				g.addAresta(v, g.getListaVertices().get(23));
				g.addAresta(v, g.getListaVertices().get(21));
			} else if (v.getNome().equals("603")) {
				g.addAresta(v, g.getListaVertices().get(20));
				g.addAresta(v, g.getListaVertices().get(22));
				g.addAresta(v, g.getListaVertices().get(17));
				g.addAresta(v, g.getListaVertices().get(18));
				g.addAresta(v, g.getListaVertices().get(24));
				g.addAresta(v, g.getListaVertices().get(25));
			} else if (v.getNome().equals("604")) {
				g.addAresta(v, g.getListaVertices().get(21));
				g.addAresta(v, g.getListaVertices().get(18));
				g.addAresta(v, g.getListaVertices().get(26));
				g.addAresta(v, g.getListaVertices().get(25));
			} else if (v.getNome().equals("701")) {
				g.addAresta(v, g.getListaVertices().get(19));
				g.addAresta(v, g.getListaVertices().get(20));
				g.addAresta(v, g.getListaVertices().get(24));
			} else if (v.getNome().equals("702")) {
				g.addAresta(v, g.getListaVertices().get(20));
				g.addAresta(v, g.getListaVertices().get(21));
				g.addAresta(v, g.getListaVertices().get(23));
				g.addAresta(v, g.getListaVertices().get(25));
			} else if (v.getNome().equals("703")) {
				g.addAresta(v, g.getListaVertices().get(24));
				g.addAresta(v, g.getListaVertices().get(21));
				g.addAresta(v, g.getListaVertices().get(22));
				g.addAresta(v, g.getListaVertices().get(26));
			} else if (v.getNome().equals("704")) {
				g.addAresta(v, g.getListaVertices().get(25));
				g.addAresta(v, g.getListaVertices().get(22));
			}
		}
	}

	public void imprimeGrafo() {
		System.out.println(g.toString());
	}

	public Grafo getGrafo() {
		return this.g;
	}

	public int getDup() {
		return this.g.getContDup();
	}

	public int getNeg() {
		return this.g.getContNeg();
	}

	public int getNos() {
		return this.g.getContNos();
	}

	public void escritor(String path) throws IOException {
		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
		buffWrite.append(g.toString() + "\n");
		buffWrite.append("\nNegativos: " + g.getContNeg());
		buffWrite.append("\nDuplicados: " + g.getContDup());
		buffWrite.append("\nCorretos: " + g.getContNos());
		buffWrite.close();
	}
}
