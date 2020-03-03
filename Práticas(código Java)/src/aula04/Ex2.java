package aula04;

import java.util.Scanner;

public class Ex2 {

	
	public static int countDigits(String s){
		
		int cont = 0;							//variavel que conta o numero de digitos na string
		char c;
		
		for(int i=0; i < s.length(); i++) {
			c = s.charAt(i);
			if(Character.isDigit(c)) {
				cont++;
			}
		}
		return cont;
	}
	
	public static int countSpaces(String s){
		
		int cont = 0;							//variavel que conta o numero de espaços na string
		char c;
		
		for(int i=0; i < s.length(); i++) {
			c = s.charAt(i);
			if(Character.isWhitespace(c)) {
				cont++;
			}
		}
		return cont;
	}
	
	public static boolean isLower(String s){
		
		boolean val = true;	
		char c;
		
		for(int i=0; i < s.length(); i++) {
			c = s.charAt(i);
			
			if(Character.isUpperCase(c)) {
				val = false;
				break;
			}
		}
		return val;
	}
	
	public static String shortSpaces(String s) {
		String ns;
		
		ns = s.replaceAll("\\s{2,}", " ");
		
		return ns;
	}
	
	public static boolean isPalindrome(String s){
		
		boolean val = true;	
		char c;
		char lc;
		
		for(int i=0; i < s.length(); i++) {
			c = s.charAt(i);
			lc = s.charAt(s.length() - 1 - i);
			
			if(c!=lc) {
				val = false;
				break;
			}
		}
		return val;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		
		System.out.println("Insira uma string");
		str = sc.nextLine();
		
		System.out.println("A string tem " + countDigits(str) + " digitos");
		System.out.println("A string tem " + countSpaces(str) + " espaços");
		
		if(isLower(str)) {
			System.out.println("A string contem apenas caracteres minusculos");
		} else {
			System.out.println("A string não contem apenas caracteres minusculos");
		}
		
		System.out.println("Redução dos espaços: " + shortSpaces(str));
		
		if(isPalindrome(str)) {
			System.out.println("A string é um palindromo");
		} else {
			System.out.println("A string não é um palindromo");
		}
		
		
		sc.close();
	}

}
