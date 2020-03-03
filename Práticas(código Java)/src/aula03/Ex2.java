package aula03;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N;
		double D;
		
		do {
			System.out.println("Insira um numero natural");
			D = sc.nextDouble();
			N = (int) D;
			
		} while(N < 0);
		
		sc.close();
		
		for(int i = N; i>=0 ; i--) {
			System.out.println(i);
		}
	
	}

}
