package aula02;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira as cordenadas x e y do ponto 1 nesta ordem");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		System.out.println("Insira as cordenadas x e y do ponto 2 nesta ordem");
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		
		sc.close();
		
		double dist = Math.sqrt( Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2) );
		System.out.println("A distancia entre os dois pontos é: " + dist);
	}

}
