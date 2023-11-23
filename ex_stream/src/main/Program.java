package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import main.entities.Employees;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employees> employess = new ArrayList<>();

		System.out.println("Enter full file Path: ");
		String path = sc.next();

		System.out.println("enter the salary: ");
		double salary = sc.nextDouble();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();

			while (line != null) {

				String[] fields = line.split(",");
				employess.add(new Employees(fields[0], fields[1], Double.parseDouble(fields[2])));
				line = br.readLine();

			}
			List<String> emailSalary = employess.stream().filter(e -> e.getSalary() > salary).map(e -> e.getEmail())
					.collect(Collectors.toList());

			emailSalary.forEach(System.out::println);

		}

		catch (IOException e) {
			System.out.println("erro: " + e.getMessage());
		}

		sc.close();
		
	}

}
