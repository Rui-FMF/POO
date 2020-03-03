package aula05;

public class Ex1 {

	public static void main(String[] args) {
		Ponto p1 = new Ponto(0,0);
		Circulo c1 = new Circulo(p1, 3);
		Ponto p2 = new Ponto(0,6);
		Circulo c2 = new Circulo(p2, 4);
		
		System.out.println(c2.intersectsWith(c1));
	}

}
