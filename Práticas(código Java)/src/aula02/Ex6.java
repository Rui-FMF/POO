package aula02;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o tempo total em segundos");
		int seg_t = sc.nextInt();
		
		sc.close();
		
		int segs = seg_t%60;
		int mins = (seg_t/60)%60;
		int horas = (seg_t)/3600;
		
		System.out.println("O tempo formatado é:");
		System.out.printf("%02d : %02d : %02d", horas, mins, segs);
	}

}
