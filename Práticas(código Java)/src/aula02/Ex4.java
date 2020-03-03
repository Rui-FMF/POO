package aula02;

import java.util.Scanner;

public class Ex4 {
	
	static double calc_montante( double mont_inicial, double taxa, int meses){      //method que calcula o montante final dados o montante inicial
																					//a taxa fixa mensal, e os meses decorridos
		double mont_final = mont_inicial;
		
		for(int x=1; x<=meses; x++) {
			mont_final = mont_final + (taxa*0.01*mont_final);
		}
		
		return mont_final;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);												//declaração e inizialização de Scanner
		
		System.out.println("Insira o montante inicial a depositar");
		double mi = sc.nextDouble();
		System.out.println("Insira a taxa fixa mensal a aplicar em percentagem");			//Adquirir variaveis atraves do Scanner
		double tx = sc.nextDouble();
		System.out.println("Insira a duração (em meses) da aplicação da taxa");
		int m = sc.nextInt();
		
		sc.close();																			//Fechar Scanner
		
		double mf = calc_montante(mi, tx, m);													//Call da função calc_montante e inicialização do mf
		System.out.println("Ao fim de " + m + " meses, o seu montante final será de: " + mf);
		
		
	}

}
