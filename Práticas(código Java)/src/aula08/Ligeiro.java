package aula08;

public class Ligeiro extends Automovel {
	private int bag; //capacidade bagageira

	public Ligeiro(String mat, String marca, String mod, int cc, int numquadro, int bag) {
		super(mat, marca, mod, cc, numquadro);
		this.bag=bag;
	}

	public int getBag() {
		return bag;
	}

}
