package main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

	public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		Map<String ,Integer> votes = new LinkedHashMap<>();
		

		System.out.println("entre com o caminho do arquivo: ");
		String caminhoArquivo = sc.nextLine();

		
		
		try(BufferedReader br = new BufferedReader (new FileReader(caminhoArquivo))){
			
			String line = br.readLine();
			
			while(line != null) {
				
				String[] fields = line.split(",");
				String name = fields[0];
				int n = Integer.parseInt(fields[1]) ;
				
				if (votes.containsKey(name)) {
					int votesSoFar = votes.get(name);
					votes.put(name, n + votesSoFar);
				}
				else {
					votes.put(name, n);
				}
				
				line = br.readLine();
			}
			
			for (String key : votes.keySet()) {
				System.out.println(key + ": " + votes.get(key));
			}
				
			}catch(IOException e) {
				System.out.println("erro: " + e.getMessage());
			}
			
		
	}

}
