package aula02;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira a velocidade na 1ª metade do percurso");
		double v1 = sc.nextDouble();
		System.out.println("Insira a velocidade na 2ª metade do percurso");
		double v2 = sc.nextDouble();
		
		sc.close();
		
		double vf = (2*v1*v2)/(v1+v2);
		
		System.out.println("A velocidade média total no percurso foi de: " + vf);
		
	}

}
