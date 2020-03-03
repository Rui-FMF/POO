package aula08;

public class Pesado extends Automovel {
	private int peso;

	public Pesado(String mat, String marca, String mod, int cc, int numquadro, int peso) {
		super(mat, marca, mod, cc, numquadro);
		this.peso=peso;
	}

	public int getPeso() {
		return peso;
	}

}
