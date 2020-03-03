package aula02;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira temperatura em Cº");
		double temp_c = sc.nextDouble();
		double temp_f = 1.8 * temp_c + 32;
		System.out.println(temp_c + " Cº = " + temp_f + " Fº");
		sc.close();
	}

}
