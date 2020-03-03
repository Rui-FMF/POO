package aula04;

import java.util.Scanner;

public class Ex4 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static int valNumb(String prompt, int min, int max) {	//validação de um numero inteiro dentro de um intervalo
		int num;
		
		do {
			System.out.println(prompt);
			num = sc.nextInt();
		}while(num > max || num < min);
		
		return num;	
	}
	
	public static int getDias(int mes, int ano) {					//determina o numero de dias de um dado mês
		int dias;
		int[] lista = {31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};		//lista que faz corresponder o numero do mês (fevereiro tem o valor 0 pois é um caso especial)
		
		if(mes==2) {													//caso seja fevereiro determinar se tem 28 ou 29 dias
			if ((ano%4==0 && ano%100!=0) || ano%400==0) {
				dias = 29;
			} else {
				dias = 28;
			}	
		} else {					//caso não seja fevereiro usar a lista
			dias = lista[mes-1];
		}
		
		return dias;
	}
	
	public static String getName(int mes) {		//determinar o nome de um dado mês
		
		String[] lista = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
	
			String name = lista[mes-1];
		
		return name;
	}
	
	public static void printCalendar(int mes, int ano, int dia1) {
		
		int dias = getDias(mes, ano);
		String nomeMes = getName(mes);
		
		System.out.printf("%12s %-10s\n", nomeMes, ano);
		
		System.out.printf("%3s%3s%3s%3s%3s%3s%3s\n", "Su", "Mo", "Tu", "We", "Th", "Fr", "Sa");
		
		for(int l=0; l<6; l++) {		//percorrer as linhas do calendarios
			for(int c=1; c<8; c++) {	//percorrer as colunas do calendario
				
				if( (l==0 && c<dia1) || ((l*7 + (c-dia1 + 1)) > dias) ) {	//imprimir espaços em branco caso esteja na primeira linha e a coluna não corrosponda ao dia inicial
					System.out.printf("%3s", " ");							//ou o numero a imprimir seja maior que o numero de dias do mês
				}
				else {
					System.out.printf("%3d", (l*7 + (c-dia1 + 1)));		//impresão do numero do dia
				}
			}
			System.out.println();		//mudança de linha após percorrer cada linha
		}
		
	}
	
	public static void main(String[] args) {
		
		//Obtenção de valores
		
		int mes = valNumb("month?", 1, 12);
		int ano = valNumb("year?", 0, 9999);
		int diaInicial = valNumb("First Day of the month? (1 = Su, 2 = Mo, 3 = Tu, 4 = We, 5 = Th, 6 = Fr, 7 = Sa)", 1, 7);
		
		//Impressão de calendário
		
		printCalendar(mes, ano, diaInicial);
		
		sc.close();
	}

}
