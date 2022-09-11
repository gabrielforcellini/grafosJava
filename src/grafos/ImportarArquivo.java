package grafos;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;


public class ImportarArquivo {
	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("C:/TeoriaDeGrafos/teste.txt");
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader buffer = new BufferedReader(isr);
			
			Grafo g = new Grafo();
			HashMap<String, Vertice> hmpColecaoVertices = new HashMap<String, Vertice>();
			
			String linha = null;
			
			while ((linha = buffer.readLine()) != null) {				
				if (linha.charAt(0) == 'n') {
					String[] arrVertices = linha.split(";");
					 for(int i = 1; i < arrVertices.length; i++) {
						 String letra = arrVertices[i];
						 hmpColecaoVertices.put(letra, g.addVertice(letra));
					 }
				} else {
					String[] arrArestas = linha.split(";");
					g.addAresta(hmpColecaoVertices.get(arrArestas[0]), hmpColecaoVertices.get(arrArestas[1]));
				}
			}
			
			System.out.println(g.toString());
			
			buffer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
