package grafos;

import java.io.IOException;

import arquivo.ManipuladorArquivo;	

public class application {
	public static void main(String[] args) throws IOException {
		final String path = "C://Temp//configs.txt";
		
		ManipuladorArquivo arq = new ManipuladorArquivo();
		
		arq.leitor(path);
		//itera sobre o HashMap de nos negativos
//		System.out.println("nós Negativos (" + arq.getNeg() + "): \n");
//		for (String linha : nosNeg.keySet()) {
//			System.out.print(linha + " \n"); 
//		}
//		System.out.println("nós Duplicados(" + arq.getDup() + "): \n");
//		for (String linha : nosDup.keySet()) {
//			System.out.print(linha + " \n"); 
//		}
//		System.out.println("nós certos (" + arq.getNos() + "): \n");
//		for (Vertice linha : nos.keySet()) {
//			System.out.print(linha + " \n"); 
//		}
		arq.imprimeGrafo();
		System.out.println("Duplicados: "+arq.getDup());
		System.out.println("Negativos: "+arq.getNeg());
		System.out.println("Corretos: "+arq.getNos());
		
		arq.escritor("C://Temp//grafos.txt");
	}
	
}
