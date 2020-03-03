package aula03;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N;
		int div = 0;
		
		do {
			System.out.println("Insira um numero natural positivo");
			N = sc.nextInt();
		} while(N <= 0);
		
		sc.close();
		
		if (N==1) {
			System.out.println("O numero 1 é a unidade");
		} else {
			
			for(int i = 1; i <= N; i++) {
				if (N%i==0) {
					div+=1;
				}
			}
			
			if(div > 2) {
				System.out.println(N + " não é um número primo");
			} else {
				System.out.println(N + " é um número primo");
			}
			
		}
		
	}

}
