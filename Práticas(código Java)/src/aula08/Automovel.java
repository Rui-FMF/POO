package aula08;

public class Automovel extends Veiculo {
	private int numquadro;

	public Automovel(String mat, String marca, String mod, int cc, int numquadro) {
		super(mat, marca, mod, cc);
		this.numquadro=numquadro;
	}

	public int getNumquadro() {
		return numquadro;
	}

}
