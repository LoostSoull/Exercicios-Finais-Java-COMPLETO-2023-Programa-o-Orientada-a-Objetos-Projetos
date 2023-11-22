package main;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n;
		
		Set<Integer> a = new HashSet<>();
		Set<Integer> b = new HashSet<>();
		Set<Integer> c = new HashSet<>();
		
		
		System.out.println("How many students for course A? ");
		n = sc.nextInt();
		for(int i = 0 ; i < n ; i++) {
			int id;
			System.out.println("Enter your " + (i+1) +" student id: ");
			id = sc.nextInt();	
			a.add(id);
		}
		
		System.out.println("How many students for course B? ");
		n = sc.nextInt();
		for(int i = 0 ; i < n ; i++) {
			int id;
			System.out.println("Enter your " + (i+1) +" student id: ");
			id = sc.nextInt();	
			a.add(id);
		}
		
		System.out.println("How many students for course C? ");
		n = sc.nextInt();
		for(int i = 0 ; i < n ; i++) {
			int id;
			System.out.println("Enter your " + (i+1) +" student id: ");
			id = sc.nextInt();	
			a.add(id);
		}
		
		
		Set<Integer> total = new HashSet<>(a);
		total.addAll(b);
		total.addAll(c);
		
		System.out.println("Total Number Of Students: " + total.size());
	

	}
	
	}

