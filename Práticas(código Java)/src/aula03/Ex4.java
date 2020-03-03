package aula03;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		double N;
		double med;
		double tot = 1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira uma cadeia de números reais, acabando com o numero inicial");
		double N1 = sc.nextDouble();
		double max = N1;
		double min = N1;
		double sum = N1;
		
		do {
			N = sc.nextDouble();
			
			sum += N;
			tot += 1;
			
			if (N > max) {
				max = N;
			}
			if (N < min) {
				min = N;
			}
			
		} while(N!=N1);
		
		sc.close();
		med = sum/tot;
		
		System.out.println("Número máximo: " + max);
		System.out.println("Número mínimo: " + min);
		System.out.println("Média: " + med);
		
	}

}
