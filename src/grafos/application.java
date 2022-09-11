package grafos;

import java.io.IOException;
import java.util.Map;

import arquivo.ManipuladorArquivo;	

public class application {
	public static void main(String[] args) throws IOException {
		final String path = "C://Temp//configs.txt";
		
		ManipuladorArquivo arq = new ManipuladorArquivo();
		
		Map<String, Integer> nosNeg = arq.getNegativos();
		
		Map<String, Integer> nosDup = arq.getDuplicados();
		
		Map<Vertice, Integer> nos = arq.getGrafo();
		
		arq.leitor(path);
		//itera sobre o HashMap de nos negativos
		System.out.println("nós Negativos (" + arq.getQtdNeg() + "): \n");
		for (String linha : nosNeg.keySet()) {
			System.out.print(linha + " \n"); 
		}
		System.out.println("nós Duplicados(" + arq.getQtdDup() + "): \n");
		for (String linha : nosDup.keySet()) {
			System.out.print(linha + " \n"); 
		}
		System.out.println("nós certos (" + arq.getQtdNos() + "): \n");
		for (Vertice linha : nos.keySet()) {
			System.out.print(linha + " \n"); 
		}
		
		arq.escritor("C://Temp//grafos.txt");
	}
	
}
