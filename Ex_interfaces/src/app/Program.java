package app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import app.model.Contract;
import app.model.Installment;
import app.services.ContractService;
import app.services.PaypalService;

public class Program {

	public static void main(String[] args)   {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		
		
		System.out.println("Entre os dados do contrato: ");
		System.out.print("Numero: ");
		int number = sc.nextInt();
		System.out.println("Data (dd/MM/yyyy):");
		LocalDate dataInicio = LocalDate.parse(sc.next(),fmt);
		System.out.println("Valor do contrato: ");
		double valor = sc.nextDouble();
		
		Contract contract = new Contract(number, dataInicio, valor);
		
		System.out.print("Entre com o numero de parcelas: ");
		int numParcelas = sc.nextInt();
		
		ContractService contractService = new ContractService(new PaypalService());
		
		contractService.processContract(contract, numParcelas);
		
		System.out.println("Parcelas: ");
		
		for(Installment i : contract.getList()) {
			
			System.out.println(i);
		}
		sc.close();
		
		
	}

}
