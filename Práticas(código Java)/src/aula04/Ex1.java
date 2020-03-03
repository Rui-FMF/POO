package aula04;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um String");
		String s = sc.nextLine();
		
		sc.close();
		
		System.out.println(s.toLowerCase());
		System.out.println(s.charAt(s.length()-1));
		System.out.println(s.charAt(0) + " " + s.charAt(1) + " " + s.charAt(2));
		System.out.println(s.substring(0, 3));
		
		char[] arr = s.toCharArray();
		System.out.println(String.valueOf(arr, 2, 6));
	}

}
