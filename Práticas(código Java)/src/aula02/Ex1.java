package aula02;

import java.util.Scanner;

public class Ex1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira distância em quilómetros");
		double km = sc.nextDouble();
		double miles = km/1.609;
		System.out.println(km + " quilómetros = " + miles + " milhas");
		
		sc.close();
	}

}
