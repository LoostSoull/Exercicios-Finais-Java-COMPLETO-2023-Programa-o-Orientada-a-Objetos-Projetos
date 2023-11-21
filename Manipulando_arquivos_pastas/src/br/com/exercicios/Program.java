package br.com.exercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import br.com.exercicios.model.entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Product> produtolist = new ArrayList<>();

		System.out.println("entre com o caminho do arquivo: ");
		String caminhoArquivo = sc.nextLine();

		File buscaArquivo = new File(caminhoArquivo);
		String caminhoAbsoluto = buscaArquivo.getParent();
		boolean sucesso = new File(caminhoAbsoluto + "\\out").mkdir();
		System.out.println("teste" + sucesso);

		String criaArquivo = caminhoAbsoluto + "\\out\\sumary.csv";

		try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
			
			String lerArquivo = br.readLine();
			
			while (lerArquivo != null) {
				
				String[] campos = lerArquivo.split(",");
				String name = campos[0];
				double price = Double.parseDouble(campos[1]);
				int quantity = Integer.parseInt(campos[2]) ;
				
				produtolist.add(new Product(name, price, quantity));
				lerArquivo = br.readLine();
			}
			try(BufferedWriter bw = new BufferedWriter( new FileWriter(criaArquivo))){
				
				for(Product item : produtolist) {
					bw.write(item.getName() + "," + String.format("%.2f", item.Total()));
					bw.newLine();
				}
				System.out.println("deu certo");
		
			}catch(IOException e){
				System.out.println("erro: " + e.getMessage());
			}
			
		} catch (IOException e) {
			System.out.println("erro: " + e.getMessage());
		}

		sc.close();

	}

}
