package aula03;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		double notaP;
		double notaT;
		Scanner sc = new Scanner(System.in);
		
		do { 
			System.out.println("Insira a sua nota da componente prática");
			notaP = sc.nextDouble();
			notaP = (double) (Math.round(notaP*10))/10;
		} while ( (notaP > 20) || (notaP < 0) );
		
		do { 
			System.out.println("Insira a sua nota da componente teórica");
			notaT = sc.nextDouble();
			notaT = (double) (Math.round(notaT*10))/10;
		} while ( (notaT > 20) || (notaT < 0) );
		
		sc.close();
		
		double notaF = 0.4 * notaT + 0.6 * notaP;
		
		if (notaP < 7.0 || notaT < 7.0) {
			System.out.println("Aluno reprovado por nota mínima");
			System.out.println("Nota Final: 66");
		} else if (notaF < 9.5) {
			System.out.println("Aluno reprovado");
			System.out.println("Nota Final: " + Math.round(notaF));
		} else {
			System.out.println("Aluno aprovado");
			System.out.println("Nota Final: " + Math.round(notaF));
		}
	}
}
