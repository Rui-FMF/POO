package aula02;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o cateto A");
		double A = sc.nextDouble();
		System.out.println("Insira o cateto B");
		double B = sc.nextDouble();
		
		sc.close();
		
		double C = Math.hypot(A, B);
		double ang = Math.toDegrees(Math.acos(A/C));
		
		System.out.printf("A hipotenusa é: %.2f e o ângulo entre A e C é: %.2f graus", C, ang);

	}

}
