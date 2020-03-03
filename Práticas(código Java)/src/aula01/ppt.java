package aula01;
import java.util.Scanner;
import java.util.Random;

public class ppt {
	
	public static void main(String[] args) {
		char[] lista = {'R', 'P', 'S'};
		int score = 0;
		int aiscore = 0;
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		while (score < 3 && aiscore < 3) {
			System.out.println("(R)ock | (P)aper | (S)cissors ?");
			String op1 = sc.nextLine();
			char op = op1.charAt(0);
			int n = rand.nextInt(3);
			char aiop = lista[n];
			
			if (op == 'R' || op == 'P' || op == 'S') {
				
				System.out.println("A.I. : " + aiop);
				System.out.println("You : " + op);
				if (op == aiop) {
					
					System.out.println("DRAW");
					
				} else if ((op == 'R' && aiop == 'S') || (op == 'P' && aiop == 'R') || (op == 'S' && aiop == 'P')) {
					
					System.out.println("YOU WIN THE ROUND");
					score+=1;
					
				} else {
					
					System.out.println("A.I. WINS THE ROUND");
					aiscore+=1;
				}
				
				System.out.println("Your score: " + score);
				System.out.println("A.I.'s score: " + aiscore);
			} else {
				System.out.println("Insert valid option!");
			}
		}
		sc.close();
		if (score >= 3) {
			System.out.println("--------------------------------");
			System.out.println("YOU WIN THE GAME!");
			System.out.println("--------------------------------");
		}
		else {
			System.out.println("--------------------------------");
			System.out.println("A.I. WINS THE GAME!");
			System.out.println("--------------------------------");
		}
	}

}
