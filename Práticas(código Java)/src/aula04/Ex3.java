package aula04;

import java.util.Scanner;

public class Ex3 {

	public static String getAcronym(String s) {
		
		StringBuilder sb = new StringBuilder();
		String ns;									//nova string a retornar
		
		String[] palavras = s.split("\\s");
		
		for(String str : palavras) {
			if(str.length() > 3) {
				sb.append(Character.toUpperCase(str.charAt(0))); 	//acrescenta á nova string o primeiro caracter de qualquer palavra com mais de 3 caracteres (convertido a maiuscula)) 
			}
		}
		
		ns = sb.toString();
		
		return ns;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str;
		
		System.out.println("Insira uma string");
		str = sc.nextLine();
		
		System.out.println("Acronimo da string: " + getAcronym(str));
		sc.close();
		
	}

}
