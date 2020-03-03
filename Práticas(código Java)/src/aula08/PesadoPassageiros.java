package aula08;

public class PesadoPassageiros extends Pesado {
	private int passmax;

	public PesadoPassageiros(String mat, String marca, String mod, int cc, int numquadro, int peso, int passmax) {
		super(mat, marca, mod, cc, numquadro, peso);
		this.passmax=passmax;
	}

	public int getPassmax() {
		return passmax;
	}

}
