package aula02;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira a massa de água em quilos");
		double M = sc.nextDouble();
		System.out.println("Insira a temperatura inicial");
		double initialTemp = sc.nextDouble();
		System.out.println("Insira a temperatura final");
		double finalTemp = sc.nextDouble();
		sc.close();
		double Q = M * (initialTemp + finalTemp) * 4184;
		System.out.println("A energia necessária para aquecer a água é de: " + Q + " J");
		
		
	}

}
