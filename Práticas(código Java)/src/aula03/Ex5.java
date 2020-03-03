package aula03;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		double tx;
		double mont_i;
		Scanner sc = new Scanner(System.in);
		
		do {
			
			System.out.println("Insira o montante investido (multiplos de 1000)");
			mont_i = sc.nextDouble();
		
		}while(mont_i < 0 || mont_i%1000!=0);
		
		do {
			
			System.out.println("Insira a taxa de juro mensal (entre 0% e 5%)");
			tx = sc.nextDouble();
		
		}while(tx < 0 || tx > 5);
		
		sc.close();
		
		for(int i = 1; i <= 12; i++) {
			
			mont_i += (tx*0.01*mont_i);
			System.out.printf("Ao fim do %d º mês, o seu montante atual é: %.2f€ \n", i, mont_i);
		}
			
	}

}
