package arquivo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.SortedSet;
import java.util.TreeSet;

import grafos.Grafo;
import grafos.Vertice;

public class ManipuladorArquivo {
	
	private HashMap<Vertice, Integer> verticesMap = new HashMap<>();

	private Map<String, Integer> negativos = new HashMap<>();
	
	private Map<String, Integer> duplicados = new HashMap<>();
	
	private int qtdNos = 0;
	
	private int qtdNeg = 0;
	
	private int qtdDup = 0;
	
	Grafo g = new Grafo();
	
	
	public ManipuladorArquivo() {
		
	}
	
	@SuppressWarnings("unlikely-arg-type")
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
						String temp[] = linha.split(":");
						if (temp[1].length() > 4) {
							negativos.put(linha.substring(linha.length() - 4).replaceAll("\\s+",""), cont);
							qtdNeg++;
						} else if (verticesMap.containsKey(linha.substring(linha.length() - 3))){
							duplicados.put(linha.substring(linha.length() - 4).replaceAll("\\s+",""), cont);
							qtdDup++;
						} else {
							verticesMap.put(g.addVertice(linha.substring(linha.length() - 3).replaceAll("\\s+","")), cont);
							qtdNos++;
						}
					}
				}
				cont++;
			} else
				break;
			linha = buffRead.readLine();
		}
		defineArestas();
		buffRead.close();
	}
	
	//terminar de criar o grafo, adicionando as arestas
	private void defineArestas() {
		SortedSet<Vertice> keys = new TreeSet<>(verticesMap.keySet());
		System.out.println("\nVertices: ");
		for (Vertice vertice : keys) {
			 //criar lógica para adicionar as arestas.
		}
	}

	public void escritor(String path) throws IOException {
		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
		buffWrite.append(g.toString() + "\n");
		buffWrite.close();
	}

	public Map<Vertice, Integer> getGrafo() {
		return verticesMap;
	}

	public void setGrafo(HashMap<Vertice, Integer> verticesMap) {
		this.verticesMap = verticesMap;
	}

	public int getQtdNos() {
		return qtdNos;
	}

	public void setQtdNos(int qtdNos) {
		this.qtdNos = qtdNos;
	}

	public Map<String, Integer> getNegativos() {
		return negativos;
	}

	public void setNegativos(Map<String, Integer> negativos) {
		this.negativos = negativos;
	}

	public Map<String, Integer> getDuplicados() {
		return duplicados;
	}

	public void setDuplicados(Map<String, Integer> duplicados) {
		this.duplicados = duplicados;
	}

	@Override
	public int hashCode() {
		return Objects.hash(duplicados, verticesMap, negativos, qtdNos);
	}

	public int getQtdNeg() {
		return qtdNeg;
	}

	public void setQtdNeg(int qtdNeg) {
		this.qtdNeg = qtdNeg;
	}

	public int getQtdDup() {
		return qtdDup;
	}

	public void setQtdDup(int qtdDup) {
		this.qtdDup = qtdDup;
	}

}
