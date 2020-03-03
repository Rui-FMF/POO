package aula10;

import java.util.TreeMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Map<String, HashSet<String>> mapa = new TreeMap<>();
		
		String MENU = "(1) Adicionar termo\n"
				+ "(2) Adicionar defenição\n"
				+ "(3) Imprimir termos e defenições\n"
				+ "(4) Imprimir defenição \n"
				+ "(5) Terminar ";
		Scanner sc = new Scanner(System.in);
		int op = 0;
		
		while(op!=5) {
			System.out.println(MENU);
			op = Integer.parseInt(sc.nextLine());
			
			switch(op) {
			
			case 1:
				System.out.println("Insira um termo.");
				String novotermo = sc.nextLine();
				if(mapa.containsKey(novotermo)) {
					System.out.println("termo já existe!");
				} else {
					mapa.put(novotermo, new HashSet<String>());
				}
				break;
			case 2:
				System.out.println("A que termo quer adicionar um defenição?");
				String termo = sc.nextLine();
				if(mapa.containsKey(termo)) {
					System.out.println("Qual a defenição deste termo?");
					String def = sc.nextLine();
					mapa.get(termo).add(def);
				} else {
					System.out.println("termo não existe!");
				}
				break;
			case 3:
				System.out.println(mapa.entrySet());
				break;
			case 4:
				System.out.println("Quer a defenição de que termo?");
				String gettermo = sc.nextLine();
				if(mapa.containsKey(gettermo)) {
					System.out.println(getRandom(mapa.get(gettermo)));
				} else {
					System.out.println("termo não existe!");
				}
				break;
			case 5:
				System.out.println("Programa terminado");
				break;
			default:
				System.out.println("Insira uma opção válida");
				
			}
			
		}
		sc.close();
		
		
	}
	
	public static String getRandom(HashSet<String> set) {
		int item = new Random().nextInt(set.size());
		int i = 0;
		for(String str : set){
		    if (i == item)
		        return str;
		    i++;
		}
		return "Sem defenições disponiveis";
	}

}
