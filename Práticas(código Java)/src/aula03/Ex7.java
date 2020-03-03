package aula03;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		int rnd;
		int num;
		int tnt;
		String res;
		Scanner sc = new Scanner(System.in);
		
		do {
			tnt = 0;
			rnd = (int) Math.round(Math.random() * 100);
			do {
				
				System.out.println("Insira um numero entre 1 e 100");
				num = sc.nextInt();
				tnt++;
				
				if(num > rnd) {
					System.out.println("Inseriu um numero maior");
				} else if(num<rnd) {
					System.out.println("Inseriu um numero menor");
				}
				
			}while(num!=rnd); 
			
			System.out.println("Acertou no numero! usou " + tnt + " tentativas\n");
			System.out.println("Pretende continuar? Prima (S)im");
			res = sc.next();
			
		}while(res.equals("S") || res.equals("Sim"));
		
		sc.close();
		System.out.println("Jogo terminado");
	}
		
}
